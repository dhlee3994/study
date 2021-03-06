package me.dhlee.springboot2.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import me.dhlee.springboot2.controller.exam.SampleController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(SampleController.class)
class SampleControllerTest {
    @Autowired
    MockMvc mock;

    @Test
    public void testHello() throws Exception {
        mock.perform(get("/hello")).andExpect(content().string("Hello World"));

        MvcResult result = mock.perform(get("/hello")).andExpect(status().isOk()).andExpect(content().string("Hello World")).andReturn();
        System.out.println(result.getResponse().getContentAsString());
    }
}