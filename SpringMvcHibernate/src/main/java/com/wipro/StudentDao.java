package com.wipro;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class StudentDao {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	HibernateTemplate hibernateTemplate;
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public boolean insertStudent(Student student) {
		System.out.println(student);
		/*Session s=sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		*/
		hibernateTemplate.persist(student);
//		t.commit();
//		s.close();
		return true;
		
	}
	public List<Student> getRecords() {
		List<Student> students=(List<Student>) hibernateTemplate.find("from Student");
		System.out.println(students);
	    return students;
	}
	
	

}
