package com.example.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping(path = {"/topics"})
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @GetMapping(path = {"/topics/{name}"})
    @ResponseStatus(HttpStatus.OK)
    public List<Topic> getTopic(@PathVariable String name) {
        return topicService.getTopic(name);
    }

    @PostMapping(path = {"/topics"})
    @ResponseStatus(HttpStatus.CREATED)
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @PutMapping(path = {"/topics"})
    @ResponseStatus(HttpStatus.OK)
    public void updateTopic(@RequestBody Topic topic) {
        topicService.updateTopic(topic);
    }

    @DeleteMapping(path = {"/topics/{name}"})
    @ResponseStatus(HttpStatus.OK)
    public void deleteTopic(@PathVariable String name) {
        topicService.deleteTopic(name);
    }
}
