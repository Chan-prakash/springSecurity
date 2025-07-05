package com.chan.SpringSecurity.controller;


import com.chan.SpringSecurity.Model.student;
import com.chan.SpringSecurity.Repo.StudentRepo;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {


    @Autowired
    StudentRepo repo1;

    @GetMapping("/students")
    public List<student> getAllStudent(){

        return repo1.findAll();

    }

    // since we have made the REST stateless it is not use

//    @GetMapping("csrf-token")
//    public CsrfToken getToken(HttpServletRequest request){
//       return (CsrfToken) request.getAttribute("_csrf");
//    }


    @PostMapping("/add")
    public void addStudent(@RequestBody student st){

         repo1.save(st);
    }
}
