package com.xworkz.crud_exceptions.boot;

import java.time.LocalDateTime;

import com.xworkz.crud_exceptions.dto.IplDTO;
import com.xworkz.crud_exceptions.repositories.IplRepository;
import com.xworkz.crud_exceptions.repositories.IplRepositoryImpli;

public class IplRunner {

	public static void main(String[] args) {
		IplRepository iplRepository = new IplRepositoryImpli();

		IplDTO team1 = new IplDTO();
		team1.setTeamName("RCB");
		team1.setCaptainName("Faf Duplessis");
		team1.setOwnerName("NA");
		team1.setNoOfDefeats(113);
		team1.setNoOfTrophies(0);
		team1.setNoOfWins(107);
		team1.setPurse(100);
		team1.setCreatedBy("SYSTEM");
		team1.setCreateDate(LocalDateTime.of(2022, 12, 12, 4, 0));
		team1.setUpdatedBy("SYSTEM");
		team1.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 4, 15));
		iplRepository.makeTeam(team1);
		System.out.println(iplRepository.total());

		System.out.println("~~~~~~~~~~~~~~~~IPL Team 2~~~~~~~~~~~~~~~~~~~~");
		IplDTO team2 = new IplDTO();
		team2.setTeamName("CSK");
		team2.setCaptainName("M S DHONI");
		team2.setOwnerName("SRINIVASAN");
		team2.setNoOfDefeats(86);
		team2.setNoOfTrophies(4);
		team2.setNoOfWins(121);
		team2.setPurse(100);
		team2.setCreatedBy("SYSTEM");
		team2.setCreateDate(LocalDateTime.of(2022, 12, 12, 4, 20));
		team2.setUpdatedBy("SYSTEM");
		team2.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 4, 25));
		iplRepository.makeTeam(team2);
		System.out.println(iplRepository.total());

		System.out.println("~~~~~~~~~~~~~~~~IPL Team 3~~~~~~~~~~~~~~~~~~~~");
		IplDTO team3 = new IplDTO();
		team3.setTeamName("SRH");
		team3.setCaptainName("no one");
		team3.setOwnerName("SUN network");
		team3.setNoOfDefeats(74);
		team3.setNoOfTrophies(2);
		team3.setNoOfWins(74);
		team3.setPurse(100);
		team3.setCreatedBy("SYSTEM");
		team3.setCreateDate(LocalDateTime.of(2022, 12, 12, 4, 22));
		team3.setUpdatedBy("SYSTEM");
		team3.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 4, 27));
		iplRepository.makeTeam(team3);
		System.out.println(iplRepository.total());

		System.out.println("~~~~~~~~~~~~~~~~IPL Team 4~~~~~~~~~~~~~~~~~~~~");
		IplDTO team4 = new IplDTO();
		team4.setTeamName("MI");
		team4.setCaptainName("Rohit Sharma");
		team4.setOwnerName("AMBANI");
		team4.setNoOfDefeats(98);
		team4.setNoOfTrophies(5);
		team4.setNoOfWins(129);
		team4.setPurse(100);
		team4.setCreatedBy("SYSTEM");
		team4.setCreateDate(LocalDateTime.of(2022, 12, 12, 4, 26));
		team4.setUpdatedBy("SYSTEM");
		team4.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 4, 30));
		iplRepository.makeTeam(team4);
		System.out.println(iplRepository.total());

		System.out.println("~~~~~~~~~~~~~~~~IPL Team 5~~~~~~~~~~~~~~~~~~~~");
		IplDTO team5 = new IplDTO();
		team5.setTeamName("LSG");
		team5.setCaptainName("Rahul");
		team5.setOwnerName("NA");
		team5.setNoOfDefeats(6);
		team5.setNoOfTrophies(0);
		team5.setNoOfWins(9);
		team5.setPurse(100);
		team5.setCreatedBy("SYSTEM");
		team5.setCreateDate(LocalDateTime.of(2022, 12, 12, 4, 29));
		team5.setUpdatedBy("SYSTEM");
		team5.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 4, 33));
		iplRepository.makeTeam(team5);
		System.out.println(iplRepository.total());

		System.out.println("~~~~~~~~~~~~~~~~IPL Team 6~~~~~~~~~~~~~~~~~~~~");
		IplDTO team6 = new IplDTO();
		team6.setTeamName("GT");
		team6.setCaptainName("Panday");
		team6.setOwnerName("NA");
		team6.setNoOfDefeats(4);
		team6.setNoOfTrophies(1);
		team6.setNoOfWins(12);
		team6.setPurse(100);
		team6.setCreatedBy("SYSTEM");
		team6.setCreateDate(LocalDateTime.of(2022, 12, 12, 4, 38));
		team6.setUpdatedBy("SYSTEM");
		team6.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 4, 40));
		iplRepository.makeTeam(team6);
		System.out.println(iplRepository.total());

		System.out.println("~~~~~~~~~~~~~~~~IPL Team 7~~~~~~~~~~~~~~~~~~~~");
		IplDTO team7 = new IplDTO();
		team7.setTeamName("Delhi");
		team7.setCaptainName("pant");
		team7.setOwnerName("NA");
		team7.setNoOfDefeats(118);
		team7.setNoOfTrophies(0);
		team7.setNoOfWins(100);
		team7.setPurse(100);
		team7.setCreatedBy("SYSTEM");
		team7.setCreateDate(LocalDateTime.of(2022, 12, 12, 4, 40));
		team7.setUpdatedBy("SYSTEM");
		team7.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 4, 42));
		iplRepository.makeTeam(team7);
		System.out.println(iplRepository.total());

		System.out.println("~~~~~~~~~~~~~~~~IPL Team 8~~~~~~~~~~~~~~~~~~~~");
		IplDTO team8 = new IplDTO();
		team8.setTeamName("KKR");
		team8.setCaptainName("Iyer");
		team8.setOwnerName("NA");
		team8.setNoOfDefeats(106);
		team8.setNoOfTrophies(3);
		team8.setNoOfWins(113);
		team8.setPurse(100);
		team8.setCreatedBy("SYSTEM");
		team8.setCreateDate(LocalDateTime.of(2022, 12, 12, 4, 41));
		team8.setUpdatedBy("SYSTEM");
		team8.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 4, 43));
		iplRepository.makeTeam(team8);
		System.out.println(iplRepository.total());

		System.out.println("~~~~~~~~~~~~~~~~IPL Team 9~~~~~~~~~~~~~~~~~~~~");
		IplDTO team9 = new IplDTO();
		team9.setTeamName("PK");
		team9.setCaptainName("changed");
		team9.setOwnerName("NA");
		team9.setNoOfDefeats(98);
		team9.setNoOfTrophies(0);
		team9.setNoOfWins(116);
		team9.setPurse(100);
		team9.setCreatedBy("SYSTEM");
		team9.setCreateDate(LocalDateTime.of(2022, 12, 12, 4, 45));
		team9.setUpdatedBy("SYSTEM");
		team9.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 4, 46));
		iplRepository.makeTeam(team9);
		System.out.println(iplRepository.total());
		
		System.out.println("~~~~~~~~~~~~~~~~IPL Team 10~~~~~~~~~~~~~~~~~~~~");
		IplDTO team10 = new IplDTO();
		team10.setTeamName("RR");
		team10.setCaptainName("samson");
		team10.setOwnerName("NA");
		team10.setNoOfDefeats(93);
		team10.setNoOfTrophies(2);
		team10.setNoOfWins(94);
		team10.setPurse(100);
		team10.setCreatedBy("SYSTEM");
		team10.setCreateDate(LocalDateTime.of(2022, 12, 12, 4, 45));
		team10.setUpdatedBy("SYSTEM");
		team10.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 4, 46));
		iplRepository.makeTeam(team10);
		System.out.println(iplRepository.total());


	}

}
