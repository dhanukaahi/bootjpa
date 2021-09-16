package com.telusko.demo.controller;


import com.telusko.demo.dao.AdminRepo;
import com.telusko.demo.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AdminController {

    @Autowired
    AdminRepo repo;

    @PostMapping("/admin")
    public Admin addAdmin(@RequestBody Admin admin)
    {
        repo.save(admin);
        return admin;
    }

    @PutMapping("/admin")
    public Admin UpdateAdmin(@RequestBody Admin admin)
    {
        repo.save(admin);
        return admin;
    }

    @DeleteMapping("/admin/{id}")
    public String deleteAdmin(@PathVariable int id){

        Admin admin = repo.getOne(id);
        repo.delete(admin);

        return "Deleted Sucsess";
    }

    @GetMapping("/admins")
    public List<Admin> getAdmin()
    {

        return repo.findAll();


    }
    @RequestMapping("/admin/{id}")
    public Optional<Admin> getAdmin(@PathVariable("id")int id)
    {
        return repo.findById(id);

    }
}