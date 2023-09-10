package org.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public abstract class AbstractSession<T> {
    T save(T entity){
        Session session = AppSessionFactory_.getSessionFactory();
        Transaction transaction = session.beginTransaction();
        T saved= (T)session.save(entity);
      transaction.commit();
      session.close();
      return saved;
    }

    public T findDB(Integer id,Class<T> clazz)
    {
        Session session = AppSessionFactory_.getSessionFactory();
        Transaction transaction = session.beginTransaction();
        T saved=(T)session.find(clazz,id);
        transaction.commit();
        session.close();
        return saved;
    }

}
