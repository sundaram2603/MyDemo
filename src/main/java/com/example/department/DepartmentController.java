package com.example.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/departments")
    public List<Department> getAllTopics() {
        return departmentService.getAllDepartments();
    }

    @RequestMapping("/departments/{name}")
    @ResponseStatus(HttpStatus.OK)
    public List<Department> getTopic(@PathVariable String name) {
        return departmentService.getDepartment(name);
    }

    @RequestMapping(value = "/departments", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void addTopic(@RequestBody Department department) {
        departmentService.addDepartment(department);
    }

    @RequestMapping(value = "/departments", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void updateTopic(@RequestBody Department department) {
        departmentService.updateDepartment(department);
    }

    @RequestMapping(value = "/departments/{name}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteTopic(@PathVariable String name) {
        departmentService.deleteDepartment(name);
    }
}
