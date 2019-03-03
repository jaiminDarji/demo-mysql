package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.DatabaseConnection;
	
public interface DatabaseConnectionService {

	public boolean saveDataIntoDemoApplication(DatabaseConnection databaseConnection);

	public List<DatabaseConnection> getDataIntoDemoApplication();
}
