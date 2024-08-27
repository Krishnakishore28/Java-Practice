package com.wipro.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.JdbcTemplate.Entity.Student;
import com.wipro.JdbcTemplate.Service.StudentHelper;
import com.wipro.JdbcTemplate.Service.Test;
import com.wipro.JdbcTemplate.Service.TestInterface;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
    	
//    	StudentHelper helper=(StudentHelper) context.getBean("studenthelper");
//    	helper.insertStudents();
        TestInterface test=(Test) context.getBean("test");
//        List<Student> records=test.selectStudents();
//        System.out.println(" no of records inserted are  "+records);
//        System.out.println("fetching by roll no");
//      Student student=test.fetchByRollNo(2);
//      System.out.println(student );
//      boolean deleted=test.deleteByRollNo(2);
//      System.out.println(deleted);
//      test.truncate();
//      test.deleteNameAndCity("sumanth", "blr");
//        System.out.println("student result set extractor");
//        test.getByName("siraj");
//       test.getByCityNames();
        Student student=new Student();
        student.setRollNo(1);
        student.setAddress("bh");
        test.updateStudent(student);
        Student student1=new Student();
        student1.setRollNo(2);
        student1.setAddress("nidadavole dsjhusijuhd veoirhgsfd vsefgnsdf vfsihvnskd fvseifhgkdfsnvs fo bsfinbksfgn");
        
        Student student2=new Student();
        student2.setRollNo(3);
        student2.setAddress("velivennu");
        List<Student> students=new ArrayList<Student>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        test.BatchUpdate(students);
        
    }
}
