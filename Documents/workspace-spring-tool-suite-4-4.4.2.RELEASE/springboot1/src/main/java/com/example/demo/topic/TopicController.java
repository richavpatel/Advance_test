package com.example.demo.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	
	@RequestMapping("/topic")
	public List<Topic> listTopics() {
		return Arrays.asList(
				new Topic(1,"richa","richa patel"),
				new Topic(1,"richa","richa patel"),
				new Topic(1,"richa","richa patel")
				);
	}

}
