package com.xworkz.crud_exceptions.boot;

import java.time.LocalDateTime;

import com.xworkz.crud_exceptions.dto.WarDTO;
import com.xworkz.crud_exceptions.repositories.WarRepository;
import com.xworkz.crud_exceptions.repositories.WarRepositoryImpli;

public class WarRunner {

	public static void main(String[] args) {
		WarRepository repository = new WarRepositoryImpli();
		WarDTO war1 = new WarDTO("Tallikote war", "nizam and allies", "aliyaRamaraya",
				LocalDateTime.of(1565, 01, 23, 10, 30), LocalDateTime.of(1565, 01, 26, 10, 30), "nizam and alies", 890);
		repository.fightWar(war1);
		System.out.println(repository.total());
		WarDTO dto = repository.findByStartedBy("nizam and allies");
		System.out.println(dto);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
		WarDTO dto1 = repository.findByStartedByAndStartedWith("nizam and allies", "aliya");
		System.out.println(dto1);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		WarDTO dto2 = repository.findStartedDateGreaterThanOrEqualTo(LocalDateTime.of(1585, 01, 26, 10, 30));
		System.out.println(dto2);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		WarDTO dto3 = repository.findStartedDateLesserThanOrEqualTo(LocalDateTime.of(1525, 01, 26, 10, 30));
		System.out.println(dto3);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		WarDTO dto4=repository.findByStartDateAndEndDate(LocalDateTime.of(1565, 01, 23, 10, 30), LocalDateTime.of(1565, 01, 26, 10, 30));
		System.out.println(dto4);
	}

}
