package com.chan.SpringSecurity.Repo;


import com.chan.SpringSecurity.Model.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface StudentRepo  extends  JpaRepository<student,Integer> {

}
