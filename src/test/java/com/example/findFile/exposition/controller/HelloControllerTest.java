package com.example.findFile.exposition.controller;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@DisplayNameGeneration(value = DisplayNameGenerator.ReplaceUnderscores.class)
@WebMvcTest(controllers = HelloController.class)
class HelloControllerTest {

    @Auto   wired
    MockMvc mockMvc;

    @Test
    void test_controller() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello")).andExpect(MockMvcResultMatchers.content().bytes("world".getBytes()));
    }

}