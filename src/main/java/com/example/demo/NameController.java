package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import java.util.ArrayList;

@EnableAutoConfiguration
@RestController
public class NameController {
    ArrayList<Student> list = new ArrayList<>();

    @RequestMapping(value = "/names/students/add", method = RequestMethod.PUT)
    public Student putStudent(@RequestBody Student student){
        list.add(student);
        System.out.println("Добавлен студент " + student.name);
        return student;
    }

    @RequestMapping("/names/students/list")
    public ArrayList<Student> getStudents(){
        return list;
    }

}
