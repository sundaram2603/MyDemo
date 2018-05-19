package com.example.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{name}")
    @ResponseStatus(HttpStatus.OK)
    public List<Topic> getTopic(@PathVariable String name) {
        return topicService.getTopic(name);
    }

    @RequestMapping(value = "/topics", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @RequestMapping(value = "/topics", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void updateTopic(@RequestBody Topic topic) {
        topicService.updateTopic(topic);
    }

    @RequestMapping(value = "/topics/{name}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteTopic(@PathVariable String name) {
        topicService.deleteTopic(name);
    }
}
