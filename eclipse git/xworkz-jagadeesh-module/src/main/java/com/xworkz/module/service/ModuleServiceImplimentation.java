package com.xworkz.module.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.print.attribute.standard.DateTimeAtCreation;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.xworkz.module.dto.ModuleDTO;
import com.xworkz.module.entity.ModuleEntity;
import com.xworkz.module.entity.TechnologiesEntity;
import com.xworkz.module.respository.ModuleRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ModuleServiceImplimentation implements ModuleService {

	@Autowired
	private ModuleRepository moduleRepository;

	@Autowired
	private PasswordEncoder encoder;

	String resetPassword = DefaultPasswordGenerator.generate(6);

	@Override
	public Set<ConstraintViolation<ModuleDTO>> validateAndSave(ModuleDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();

		//
		Long totalUsers = this.moduleRepository.findByUser(dto.getUserId());
		Long totalEmails = this.moduleRepository.findByEmail(dto.getEmail());
		Long totalNumbers = this.moduleRepository.findByNumber(dto.getNumber());
		log.info("total users" + totalUsers);
		log.info("total emails" + totalEmails);
		log.info("total numbers" + totalNumbers);

		Set<ConstraintViolation<ModuleDTO>> violation = validator.validate(dto);

		if (violation != null && !violation.isEmpty()) {
			log.info("there is no violation in dto");
			return violation;
		}
		if (!dto.getPassword().equals(dto.getConfirmPassword())) {
			return null;
		} else {
			System.out.println(dto);
			// to encrypt password shouldnt use BeanUtils
			ModuleEntity entity = new ModuleEntity();
			entity.setCreatedBy(dto.getUserId());
			entity.setCreatedDate(LocalDate.now());
			entity.setUserId(dto.getUserId());
			entity.setNumber(dto.getNumber());
			entity.setAgreement(dto.getAgreement());
			entity.setPassword(dto.getPassword());
			entity.setEmail(dto.getEmail());
			entity.setPasswordReset(false);
			entity.setPassTimeOut(LocalTime.of(0, 0, 0));
			// BeanUtils.copyProperties(dto, entity);
			entity.setPassword(encoder.encode(dto.getPassword()));
			boolean saved = this.moduleRepository.save(entity);
			if (saved) {
				sendMail(dto.getEmail(), "Thank you and your registeration is completed");
			}
			log.info("saved in repo" + saved);
			log.info("entity" + entity);
			return Collections.emptySet();
		}

	}

	@Override
	public List<ModuleDTO> findAll() {
		List<ModuleEntity> listDto = this.moduleRepository.findAll();
		List<ModuleDTO> mDto = new ArrayList<>();
		for (ModuleEntity entity : listDto) {
			ModuleDTO dto = new ModuleDTO();
			BeanUtils.copyProperties(entity, dto);
			mDto.add(dto);
		}

		return mDto;
	}

	@Override
	public Long findByUser(String user) {
		Long m = this.moduleRepository.findByUser(user);
		log.info("mobile in service" + m);
		return m;
	}

	@Override
	public Long findByEmail(String email) {
		Long e = moduleRepository.findByEmail(email);
		log.info("emails in service" + e);
		return e;
	}

	@Override
	public Long findByNumber(Long number) {
		Long m = this.moduleRepository.findByNumber(number);
		log.info("mails in service" + m);
		return m;
	}

	@Override
	public ModuleDTO signIn(String user, String password) {
		ModuleEntity ent = this.moduleRepository.signIn(user);
		ModuleDTO dto = new ModuleDTO();
		BeanUtils.copyProperties(ent, dto);
		log.info("password match" + encoder.matches(password, ent.getPassword()));
		if (ent.getSignInCount() >= 3) {
			return dto;
		}
		if (ent.getUserId().equals(user) && encoder.matches(password, ent.getPassword())) {
			return dto;
		} else {
			log.info("SignInCount--" + ent.getSignInCount() + 1);
			this.moduleRepository.login(ent.getUserId(), ent.getSignInCount() + 1);
			log.info("total signIn counts" + ent.getSignInCount() + 1);
			return null;
		}

	}

	@Override
	public ModuleDTO updatePass(String userId, String password, String confirmPassword) {
//		ModuleEntity entity=new ModuleEntity() ;
//		entity.setPassTimeOut(LocalTime.now().of(0, 0, 0));
		if (password.equals(confirmPassword)) {
			boolean update = this.moduleRepository.passwordUpdate(userId, encoder.encode(password), false,
					LocalTime.of(0, 0, 0));
			log.info("--" + update);
		}
		return ModuleService.super.updatePass(userId, password, confirmPassword);
	}

	@Override
	public ModuleDTO resetPass(String email) {
		ModuleEntity ent = this.moduleRepository.resetPassword(email);
		if (ent != null) {
			ent.setPassword(encoder.encode(resetPassword));
			ent.setUpdatedBy("System");
			ent.setUpdatedDate(LocalDate.now());
			ent.setSignInCount(0);
			ent.setPasswordReset(true);
			ent.setPassTimeOut(LocalTime.now().plusSeconds(60));
			boolean update = this.moduleRepository.updateUser(ent);
			if (update) {
				sendMail(ent.getEmail(),
						"your reset password is :" + resetPassword + " kindly login within 60 seconds");
			}
			log.info("updated pass" + update);
			ModuleDTO uDto = new ModuleDTO();
			BeanUtils.copyProperties(ent, uDto);
			return uDto;
		}
		return null;
	}

//	@Override
//	public boolean sendMail(String from, String to, String subject) {
//		String hostName="smtp.gmail.com";
//		String portNumber="465";
//		String  fromMail="jvallagi2834.com";
//		String password="jollygo2834";
//		
//		Properties properties=new Properties();
//		properties.put("mail.smtp.auth",true);
//		properties.put("mail.smtp.host",hostName);
//		properties.put("mail.smtp.port", portNumber);
//		properties.put("mail.debug", true);
//		properties.put("mail.smtp.starttls.enable", true);
//		properties.put("mail.transport.protocol", "smtp");
//		
//		Session session=Session.getInstance(properties,new Authenticator() {
//			protected PasswordAuthentication getPasswordAuthentication() {
//				return new PasswordAuthentication(fromMail, password);
//			}
//		});
//		return true;
//	}
	@Override
	public boolean sendMail(String email, String text) {
		String portNumber = "587";// 485,587,25
		String hostName = "smtp.office365.com";
		String fromEmail = "jagadeeshvallagi@outlook.com"; // jagadeeshvallagi@outlook.com
		String password = "Ivar@2834";
		String to = email;

		Properties prop = new Properties();
		prop.put("mail.smtp.host", hostName);
		prop.put("mail.smtp.port", portNumber);
		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.debug", "true");
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.transport.protocol", "smtp");

		Session session = Session.getInstance(prop, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		});
		MimeMessage message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(fromEmail));
			message.setSubject("Registration  Completed");
			// message.setText("Thanks for registration and your password is" +
			// resetPassword);
			message.setText(text);
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			Transport.send(message);
			log.info("mail sent sucessfully");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		return true;
	}

	public final static class DefaultPasswordGenerator {
		private static final String[] charCategories = new String[] { "abcdefghijklmnopqrstuvwxyz",
				"ABCDEFGHIJKLMNOPQRSTUVWXYZ", "0123456789" };

		public static String generate(int length) {
			StringBuilder password = new StringBuilder(length);
			Random random = new Random(System.nanoTime());

			for (int i = 0; i < length; i++) {
				String charCategory = charCategories[random.nextInt(charCategories.length)];
				int position = random.nextInt(charCategory.length());
				password.append(charCategory.charAt(position));
			}

			return new String(password);
		}
//		String password = DefaultPasswordGenerator.generate(6);[use this reference to generate the password]
	}

	@Override
	public ModuleDTO profileUpdate(String userId, String email, Long number, String path) {
		ModuleEntity ent = this.moduleRepository.resetPassword(email);
		ent.setEmail(email);
		ent.setUserId(userId);
		ent.setNumber(number);
		ent.setPicPath(path);
		boolean up = this.moduleRepository.updateUser(ent);
		log.info("updated here " + up);
		return ModuleService.super.profileUpdate(userId, email, number, path);
	}
	
	@Override
	public ModuleDTO techUpdate(String userId, TechnologiesEntity tech) {
		//ModuleDTO dto=new ModuleDTO();
		ModuleEntity ent=this.moduleRepository.signIn(userId);
		ent.setCreatedBy(userId);
		tech.setModuleEntity(ent);
		log.info("accessing entities"+ent);
		boolean saved=this.moduleRepository.techSave(tech);
		log.info("technologies saved here"+saved);
		return ModuleService.super.techUpdate(userId, tech);
	}
	@Override
	public List<TechnologiesEntity> techList(String userId) {
		ModuleEntity ent=this.moduleRepository.signIn(userId);
		List<TechnologiesEntity> techList=ent.getTech();
		log.info("getting technologies list"+techList);
		return techList;
	}

}
