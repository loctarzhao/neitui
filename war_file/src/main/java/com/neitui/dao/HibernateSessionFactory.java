package com.neitui.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: loctar
 * Date: 14-8-9
 * Time: 下午3:39
 * To change this template use File | Settings | File Templates.
 */
public class HibernateSessionFactory {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {

            sessionFactory = new Configuration().configure().buildSessionFactory();
        }
        return sessionFactory;
    }
}
