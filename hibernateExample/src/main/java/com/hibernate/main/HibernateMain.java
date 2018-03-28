package com.hibernate.main;
import org.hibernate.Session;
import com.hibernate.model.User;
import com.hibernate.model.userTable;
import com.hibernate.util.HibernateUtil;
import org.hibernate.SessionFactory;

public class HibernateMain {
    public static void main(String args[]){
        User user = new User();
        userTable user1= new userTable();
        user.setFirstName("Purushotham");
        user.setLastName("Puram");
        user.setAge(20);
        user1.setFirstName("puram");
        user1.setLastName("Subramanyam");
        user1.setAge(55);
        userTable user2 = new userTable();
        user2.setFirstName("puram");
        user2.setLastName("Chandrakala");
        user2.setAge(50);
        System.out.println("XML Session Factory");
        xmlSessionFactory(user);
        System.out.println("Annotation Session Factory");
        annotationSessionFactory(user1);
        System.out.println("Java Session Factory");
        javaSessionFactory(user2);
    }
    public static void  xmlSessionFactory(User user){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        System.out.println("User Id "+user.getId());
        sessionFactory.close();
    }
    public static void annotationSessionFactory(userTable user){
        SessionFactory sessionFactory = HibernateUtil.getSessionAnnotationFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        System.out.println("User Id "+user.getId());
        sessionFactory.close();
    }
    public static void javaSessionFactory(userTable user){
        SessionFactory sessionFactory = HibernateUtil.getSessionJavaConfigFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        System.out.println("User Id "+user.getId());
        sessionFactory.close();
}
}
