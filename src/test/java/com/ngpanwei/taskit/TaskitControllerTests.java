package com.ngpanwei.taskit;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.ngpanwei.taskit.controller.TaskController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class TaskitControllerTests {
	@Autowired
	private MockMvc mockMvc;

	@Before
	public void init(){
		mockMvc = MockMvcBuilders.standaloneSetup(new TaskController()).build();
	}

	@Test
	public void should_invoke_request() throws Exception {
		//mockMvc.perform(get("/")).andExpect(content().encoding("UTF-8"));
	}

	@Test
	public void should_create_task() throws Exception {
		//throw new Exception("not implemented");
	}

	@Test
	public void should_list_task() throws Exception {
//		mockMvc.perform(get("/tasks")).andExpect(content().encoding("UTF-8"));
//		throw new Exception("not implemented");
	}

	@Test
	public void should_given_route_path_and_params_when_use_post_function_return_httpstatus_200() throws Exception {
		mockMvc.perform((post("/user/create")
				.param("name","gongbo")
				.param("sex","male")
				.param("age","18")))
				.andExpect(status().isOk())
				.andDo(print());
	}

	@Test
	public void should_given_route_path_and_less_params_when_use_post_function_return_httpstatus_400() throws Exception {
		mockMvc.perform((post("/user/create")
					.param("name", "gongbo")
					.param("age","18")))
				.andExpect(status().isBadRequest())
				.andDo(print());
	}

}
