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
public class TaskitApplicationTests {
    @Autowired
    TaskDAO taskDAO ;

	@Test
	public void should_return_task() {
        taskDAO.save(new Task("assignment1","write application","not started"));
        List<Task> taskList ;
        taskList = taskDAO.findByName("assignment1") ;
        assert taskList.get(0) != null ;
	}

}
