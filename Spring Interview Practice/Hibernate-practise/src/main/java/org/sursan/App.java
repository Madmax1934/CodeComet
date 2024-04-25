package org.sursan;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.spi.SessionFactoryServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Person p = new Person();
        p.setPid(100);
        p.setPname("Sursan");
        p.setGender("Male");

        try {
            Configuration conf = new Configuration().configure()
                    .addAnnotatedClass(Person.class);
            SessionFactory sf = conf.buildSessionFactory();
            Session session = sf.openSession();
            Transaction tx = session.beginTransaction();
            session.save(p);
            tx.commit();
        }catch(Throwable t)
        {
            throw t;
        }
    }
}
