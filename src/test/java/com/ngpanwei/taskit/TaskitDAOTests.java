package com.ngpanwei.taskit;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ngpanwei.taskit.dao.TaskDAO;
import com.ngpanwei.taskit.model.Task;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskitDAOTests {
    @Autowired
    TaskDAO taskDAO ;

	@Test
	public void should_return_task() {
        taskDAO.save(new Task("assignment1","write application","not started"));
        taskDAO.save(new Task("assignment2","write spring-boot","not started"));
        List<Task> taskList ;
        taskList = taskDAO.findByName("assignment1") ;
        assert taskList.get(0) == null ;
	}
	@Test
	public void should_delete_task() {
        taskDAO.save(new Task("assignment3","write application","not started"));
        taskDAO.save(new Task("assignment4","write spring-boot","not started"));
        List<Task> taskList ;
        taskList = taskDAO.findByName("assignment3") ;
        Task task =  taskList.get(0) ;
        taskDAO.delete(task.getId());
        
        taskList = taskDAO.findByName("assignment3") ;
        assert taskList.isEmpty()  ;
		
	}
	

}
