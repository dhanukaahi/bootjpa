package com.telusko.demo.dao;

import com.telusko.demo.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin,Integer>
{

}
