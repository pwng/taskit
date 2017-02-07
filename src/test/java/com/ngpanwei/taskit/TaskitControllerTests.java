package com.ngpanwei.taskit;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@AutoConfigureMockMvc
//public class TaskitControllerTests {
//	@Autowired
//	private MockMvc mockMvc;
//
//	@Test
//	public void should_invoke_request() throws Exception {
//		mockMvc.perform(get("/")).andExpect(content().encoding("UTF-8"));
//	}
//
//	@Test
//	public void should_create_task() throws Exception {
//		throw new Exception("not implemented");
//	}
//
//	@Test
//	public void should_list_task() throws Exception {
//		mockMvc.perform(get("/tasks")).andExpect(content().encoding("UTF-8"));
//		throw new Exception("not implemented");
//	}
//
//}
