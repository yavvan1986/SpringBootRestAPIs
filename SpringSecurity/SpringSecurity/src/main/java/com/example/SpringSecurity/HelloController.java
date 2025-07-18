package com.example.SpringSecurity;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class HelloController {

    private List<Student> stu = new ArrayList<>(List.of(
            new Student(1, "Yavvan", "Tadepalli"),
            new Student(2, "Samskrithi", "Boda")
    ));


    @GetMapping("/")
    public Map<String, String> greet(HttpServletRequest request) {

        Map<String, String> map = new HashMap<>();
        map.put("session", request.getSession().getId());
        return map;

    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return stu;
    }

    @PostMapping("/student")
    public void  addStudent(@RequestBody Student student) {
        stu.add(student);
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {

        return (CsrfToken) request.getAttribute("_csrf");

    }


    SecurityFilterChain
}