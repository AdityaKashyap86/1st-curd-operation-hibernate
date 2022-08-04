package com.sunglowsys.test;

import com.sunglowsys.domain.Books;
import com.sunglowsys.domain.Student;
import com.sunglowsys.repository.StudentRepository;
import com.sunglowsys.repository.StudentRepositoryImpl;
//import com.sunglowsys.service.BooksService;
import com.sunglowsys.service.StudentService;
import com.sunglowsys.service.StudentServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class CreateStudent {
    public static void main(String[] args) {
        List<Books> list = new ArrayList<> ();

        Books books = new Books ("Manoher","The English speaking");
        Books books1 = new Books ("Manoher1","The English speaking1");
        list.add (books);
        list.add (books1);

    Student student = new Student ("sd","sd","878745440","mirehchi","878787n@gmail.com",list);
         StudentService studentService = (StudentService) new StudentServiceImpl ().save (student);
            // System.out.println ("saved program"+student);
    }

}
