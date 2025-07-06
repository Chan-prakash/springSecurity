package com.chan.SpringSecurity.Repo;

import com.chan.SpringSecurity.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

   User findBysname(String sname);
}
