package com.CodeWallah.StudentMgmt;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController // must annotation to write
// RestController is telling the spring that we have written student API here
public class StudentAPI {

    // Make the database

    HashMap<Integer, Student> studentDB = new HashMap<>(); // Define StudentDB

    @GetMapping("get_students")
    public List<Student> getAllStudent() {

        List<Student> listOfStudents = new ArrayList<>();

        for (Map.Entry<Integer, Student> entry : studentDB.entrySet()) {
            listOfStudents.add(entry.getValue());
        }

        return listOfStudents;
    }

    @GetMapping("get_by_admNo")
    public Student getStudentByAdmissionNo(@RequestParam("admNo") int admNo) {

//        Student student =  studentDB.get(admNo);
        return studentDB.get(admNo);
    }

    @PostMapping("add_student")
    public void addStudent(@RequestParam("admNo") int admNo, @RequestParam("name") String name, @RequestParam("age") int age, @RequestParam("standard") int standard) {
        Student student = new Student(admNo,name,age,standard);
        studentDB.put(admNo,student);
    }
}
