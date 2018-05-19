package com.example.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class EmployeeController {

    @Autowired
    private EmployeesService employeesService;

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public List<Employee> getAllTopics() {
        return employeesService.getAllTopics();
    }

    @RequestMapping("/employees/{name}")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getTopic(@PathVariable String name) {
        return employeesService.getTopic(name);
    }

    @RequestMapping(value = "/employees", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void addTopic(@RequestBody Employee employee) {
        employeesService.addTopic(employee);
    }

    @RequestMapping(value = "/employees", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void updateTopic(@RequestBody Employee topic) {
        employeesService.updateTopic(topic);
    }

    @RequestMapping(value = "/employees/{name}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteTopic(@PathVariable String name) {
        employeesService.deleteTopic(name);
    }
}
