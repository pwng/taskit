package com.ngpanwei.taskit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ngpanwei.taskit.dao.TaskDAO;
import com.ngpanwei.taskit.model.Task;

@SpringBootApplication
public class TaskitApplication implements CommandLineRunner {

	@Autowired
	private TaskDAO taskDAO;
	
	public static void main(String[] args) {
		SpringApplication.run(TaskitApplication.class, args);
	}

	@Override
	public void run(String... args) {
        taskDAO.save(new Task("Task1","do nothing","not started"));
        taskDAO.save(new Task("Task2","write spring-boot","not started"));
	}
}
