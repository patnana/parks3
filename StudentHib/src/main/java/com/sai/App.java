package com.sai;

import java.util.List;

import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App 
{
	@SuppressWarnings("unchecked")
    public static void main( String[] args )
    {
        Student student = new Student("Krishna","Sai","JEE");
        Address address = new Address("1260 Highfield Ct","PA","USA");
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(student);
        address.setId(student.getId());
        student.setAddress(address);
        session.save(student);
        session.getTransaction().commit();
        
        List<Student> students = session.createQuery("from Student").list();
        students .forEach(System.out::println);
        session.close();
        
    }
}
