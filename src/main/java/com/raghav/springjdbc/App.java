package com.raghav.springjdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.raghav.springjdbc.Dao.StudentDao;
import com.raghav.springjdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "program started" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/raghav/springjdbc/config.xml");
        
 /*   this commented one is for inserting data in table
   	    Student student = new Student();
        student.setId(3);
        student.setCity("Delhi");
        student.setName("Vaibhav");
        
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
         int rowaffected = studentDao.insert(student);
         System.out.println(rowaffected +" rows affected");
   */
       
   
 /*	updating data       
        Student student = new Student(2,"Vaibhav", "Kanpur");
        
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        int rowaffected = studentDao.changeData(student);
        System.out.println(rowaffected +" rows affected");
 */   
        
/* deleting data        
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the id of user you want to delete");
        int id = scanner.nextInt();
        
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        int rowsDeleted = studentDao.deleteDataById(3);
        System.out.println(rowsDeleted +" rows deleted");
*/   
   
/* select 1 row data        
      Scanner scanner = new Scanner(System.in);
        System.out.println("enter the id of user you want to fetch");
        int id = scanner.nextInt();
        
        StudentDao studentDao2 = context.getBean("studentDao", StudentDao.class);
        Student student1 = studentDao.getUserById(id);
        System.out.println(student1);
     scanner.close();
*/
     
        /* select using where which returns list of objects          
        StudentDao studentDao2 = context.getBean("studentDao", StudentDao.class);
        List<Student> students = studentDao2.getAllStudent();
        
        for(Student s:students) {
        	System.out.println(s);
        }
*/        
        
        
   } 
}
