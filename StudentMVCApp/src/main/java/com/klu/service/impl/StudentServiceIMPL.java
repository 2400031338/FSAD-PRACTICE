package com.klu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.klu.model.Student;
import com.klu.service.StudentService;

@Service
public abstract class StudentServiceIMPL implements StudentService
{
	private List<Student> StudentList=new ArrayList();
	
    @Override
    public String getWelcomeMessage() 
    {
        return "Hello from Spring MVC CRUD APPLICATION";
    }
  
    @Override
    public Student createStudent(Student student)
    {
	   StudentList.add(student);
	   return student;
    }
 
    @Override
    public Student getStudentById(int id) {
        for(Student s: StudentList)
        {
        	  if(s.getId()==id)
        	  {
        		  return s;
        	  }
        }
        return null;
    }
    
    @Override
    public List<Student> getAllStudents()
    {
    	   return StudentList;
    }
    
    @Override
    public Student updateStudent(int id,Student student)
    {
    	   for(int i=0;i<StudentList.size();i++)
    	   {
    		   if(StudentList.get(i).getId()==id)
    		   {
    			   student.setId(id);
    			   StudentList.set(i, student);
    			   return student;
    		   }
    	   }
    	   return null;
    }
    
    @Override
    public String deleteStudent(int id)
    {
    	   for(Student s:StudentList)
    	   {
    		   if(s.getId()==id)
    		   {
    			   StudentList.remove(s);
    			   return "Student record deleted";
    		   }
    	   }
    	   return "no student record found";
    }
    
    @Override
    public List<Student> searchStudent(String name,String course)
    {
    	   List<Student> result=new ArrayList<>();
    	   for(Student s:StudentList)
    	   {
    		   if(s.getName().equalsIgnoreCase(name) && s.getCourse()==course)
    		   {
    			   result.add(s);
    		   }
    	   }
    	   return result;
    }

    
}