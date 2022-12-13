package com.xworkz.crud_exceptions.repositories;

import java.time.LocalDateTime;

import com.xworkz.crud_exceptions.dto.WarDTO;

public interface WarRepository {

	boolean fightWar(WarDTO warDTO);

	boolean fightWar(WarDTO[] warDTO);

	default int total() {
		return 0;
	}

	default WarDTO findByStartedBy(String startedBy) {
		return null;
	}

	default WarDTO findByStartedByAndStartedWith(String startedBy, String startedWith) {
		return null;
	}

	default WarDTO findStartedDateGreaterThanOrEqualTo(LocalDateTime startedIn) {
		return null;
	}

	default WarDTO findStartedDateLesserThanOrEqualTo(LocalDateTime startedIn) {
		return null;
	}

	default WarDTO findByStartDateAndEndDate(LocalDateTime startedIn, LocalDateTime endedIn) {
		return null;

	}
}
