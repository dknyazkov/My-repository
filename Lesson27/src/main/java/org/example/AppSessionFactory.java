package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.cfg.Configuration;

public class AppSessionFactory {
    private static AppSessionFactory factory = new AppSessionFactory();
    private static SessionFactory sessionFactory;

    private AppSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.setProperty(AvailableSettings.DRIVER, "org.postgresql.Driver");
        configuration.setProperty(AvailableSettings.URL, "jdbc:postgresql://localhost:5432/postgres");
        configuration.setProperty(AvailableSettings.USER, "admin");
        configuration.setProperty(AvailableSettings.PASS, "admin");
        configuration.setProperty(AvailableSettings.DIALECT, "org.hibernate.dialect.PostgreSQL95Dialect");
        configuration.setProperty(AvailableSettings.HBM2DDL_AUTO,"update");
        configuration.addAnnotatedClass(Student.class);
        sessionFactory = configuration.buildSessionFactory();

    }

    public static Session getSessionFactory() {
        return sessionFactory.openSession();
    }
}
