package com.example.demo.controller;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org



@RestController
@RequestMapping("/student")
public class Studct1{
    @Autowired
    private Studservice ser;
    @PostMapping("/add")
    public Studentity addStudent(@RequestBody Studentity st){
        return ser.saveData(st);

    }
    @GetMapping("/getall")
    public Collection<Studentity> getAllStudents(){
        return ser.getAll();

    }
    @getMapping("/get/{id}");
    public Studentity getStudentById(@PathVariable int id){
        return ser.getById(id);

    }
    @PutMapping("/update/{id}")
    public Studentity updateStudent(@PathVariable int id,@RequestBody Studentity st){
        return ser.update(id,st);

    }
    
}