package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.DatabaseConnection;
import com.example.demo.service.DatabaseConnectionService;

@RestController
public class MysqlTestDemoController {
	
	@Autowired
	private DatabaseConnectionService connectService;
	
	@GetMapping(value="/test")
	public String test() {
		return "Success Of controller";
	}
	
	@GetMapping(value="/all",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<DatabaseConnection> getAll() {
		return connectService.getDataIntoDemoApplication();
	}
	
	@PostMapping(value="/save",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public boolean save(@RequestBody DatabaseConnection connection) {
		return connectService.saveDataIntoDemoApplication(connection);
	}

}
