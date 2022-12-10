package com.xworkz.crud_exceptions.repositories;

public interface GmailRepository {
	boolean create(String gmail);

	default int totalGmails() {
		return 10;

	}
}
