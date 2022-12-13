package com.xworkz.crud_exceptions.repositories;

import java.time.LocalDateTime;

import com.xworkz.crud_exceptions.customExceptions.WarSIzeExeededException;
import com.xworkz.crud_exceptions.dto.WarDTO;

public class WarRepositoryImpli implements WarRepository {
	private WarDTO[] wars = new WarDTO[8];
	private int warIndex = 0;

	@Override
	public boolean fightWar(WarDTO warDTO) {
		System.out.println("running the fighting war");
		if (this.warIndex >= wars.length) {
			throw new WarSIzeExeededException();
		}
		System.out.println("saved to" + warDTO + "at index" + warIndex);
		this.wars[warIndex] = warDTO;
		warIndex++;
		return true;
	}

	@Override
	public boolean fightWar(WarDTO[] warDTO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public WarDTO findByStartedBy(String startedBy) {
		System.out.println("running the findByStartedBy" + startedBy);
		for (WarDTO dto : wars) {
			if (dto != null && dto.getStartedBy().equalsIgnoreCase(startedBy)) {
				System.out.println("war dto is present" + startedBy);
			}
		}
		System.out.println("dto is not found or null");
		return WarRepository.super.findByStartedBy(startedBy);
	}

	@Override
	public WarDTO findByStartedByAndStartedWith(String startedBy, String startedWith) {
		System.out.println("running findByStartedByAndStartedWith " + startedBy + startedWith);
		for (WarDTO dto : wars) {
			if (dto != null && dto.getStartedBy().equalsIgnoreCase(startedBy)
					&& dto.getStartedWith().equalsIgnoreCase(startedWith)) {
				System.out.println("war dto in find is exist" + startedBy + startedWith);

			}
		}
		System.out.println("dto is not found");
		return WarRepository.super.findByStartedByAndStartedWith(startedBy, startedWith);
	}

	@Override
	public WarDTO findStartedDateGreaterThanOrEqualTo(LocalDateTime startedIn) {
		System.out.println("running the findStartedDateGreaterThanOrEqualTo" + startedIn);
		for (WarDTO dto : wars) {
			if (dto != null && dto.getStartedIn().isAfter(startedIn)) {
				System.out.println("dto is found" + startedIn);
			}
		}
		System.out.println("dto is not found and it is greater/lesser than given date");
		return WarRepository.super.findStartedDateGreaterThanOrEqualTo(startedIn);
	}

	@Override
	public WarDTO findStartedDateLesserThanOrEqualTo(LocalDateTime startedIn) {
		System.out.println("running the findStartedDateGreaterThanOrEqualTo" + startedIn);
		for (WarDTO dto : wars) {
			if (dto != null && dto.getStartedIn().isBefore(startedIn)) {
				System.out.println("dto is found" + startedIn);
			}
		}
		System.out.println("dto is not found and it is greater/lesser than given date");
		return WarRepository.super.findStartedDateGreaterThanOrEqualTo(startedIn);
	}

	@Override
	public WarDTO findByStartDateAndEndDate(LocalDateTime startedIn, LocalDateTime endedIn) {
		System.out.println("running the findByStartDateAndEndDate " + startedIn + endedIn);
		for (WarDTO dto : wars) {
			if (dto != null) {
				System.out.println("dto is found" + startedIn + endedIn);
			}

		}
		System.out.println("dto is not found");
		return WarRepository.super.findByStartDateAndEndDate(startedIn, endedIn);
	}

	@Override
	public int total() {
		System.out.println("running the total");
		return this.warIndex;
	}
}
