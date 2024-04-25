package org.sursan;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.sursan.entity.College;
import org.sursan.entity.Product;
import org.sursan.entity.Student;

public class Main {
    public static void main(String[] args) throws Exception, HibernateException {

        Product prod=new Product(5,"Moto",1000);
        try {
            SessionFactory sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(College.class)
                    .addAnnotatedClass(Student.class)
                    .buildSessionFactory();

        Session session = sessionFactory.openSession();


        session.beginTransaction();

        College c1 = session.get(College.class, 1); //transient state because product entity is not yet mapped to session
        session.save(c1); //persistent state
        System.out.println(session.contains(c1));
        //System.out.println("method executed");
        //System.out.println(product.getName());

        session.getTransaction().commit();
        session.close(); //moved to detached state
        //System.out.println(session.contains(c1)); //throws illegal state exception
    }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}