package com.ngpanwei.taskit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ngpanwei.taskit.dao.TaskDAO;
import com.ngpanwei.taskit.model.Task;

public class TaskController {
    @Autowired
    private TaskDAO taskDAO ;

    @RequestMapping()
    public String home() {
        return "<h1>Hello World</h1>" ;
    }
    @RequestMapping(path="/createGroup",method= RequestMethod.GET)
    public @ResponseBody Task createTask(
            @RequestParam(value="name",required=false) String name) {
        return new Task(name,"","");
    }
    @RequestMapping(value="/group/{name}",method=RequestMethod.GET)
    public Task createTask2(
            @PathVariable String name) {
        return new Task(name,"","");
    }
}
