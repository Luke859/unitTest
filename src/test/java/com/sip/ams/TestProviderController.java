package com.sip.ams;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@WebMvcTest
public class TestProviderController {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void Test_list_providers() throws Exception {
		this.mockMvc.perform(get("/listProviders")).andExpect(status().isOk())
				.andExpect(content().string(containsString("Samsung")))
				.andExpect(content().string(containsString("Orange")))
				.andExpect(content().string(containsString("HP")));
	}
}
