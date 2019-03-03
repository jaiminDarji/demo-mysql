package com.example.demo.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.DatabaseConnection;
import com.example.demo.repository.DatabaseConnectionRepository;
import com.example.demo.service.DatabaseConnectionService;

@Service
@Transactional
public class DatabaseConnectionServiceImpl implements DatabaseConnectionService{

	@Autowired
	private DatabaseConnectionRepository databaseConnectRepo;
	
	@Override
	public boolean saveDataIntoDemoApplication(DatabaseConnection databaseConnection) {
		databaseConnectRepo.save(databaseConnection);
		return true;
	}
	
	@Override
	public List<DatabaseConnection> getDataIntoDemoApplication() {
		return databaseConnectRepo.findAll();
	}
}
