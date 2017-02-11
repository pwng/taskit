package com.ngpanwei.taskit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    @ResponseBody
    public Task createTask(
            @RequestParam(value="name",required=false) String name) {
        return new Task(name,"","");
    }

    @RequestMapping(value="/group/{name}",method=RequestMethod.GET)
    public Task createTask2(@PathVariable String name) {
        return new Task(name,"","");
    }

    @RequestMapping(value="/user/create",method=RequestMethod.POST)
    public ResponseEntity<String> createTask2(String name, String sex, String age) {
        if (name == null || sex ==null || age == null){
            return new ResponseEntity<>("fail", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("success", HttpStatus.OK);
    }
}
