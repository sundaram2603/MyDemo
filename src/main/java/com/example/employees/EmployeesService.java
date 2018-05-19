package com.example.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeesService {

    @Autowired
    private EmployeesRepository topicRepository;

    public List<Employee> getAllTopics() {
        List<Employee> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public List<Employee> getTopic(String name) {
        return topicRepository.findByName(name);
    }

    public void addTopic(Employee topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(Employee topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String name) {
        topicRepository.deleteByName(name);
    }
}
