package com.neitui.dao.impl;

import com.neitui.dao.HibernateSessionFactory;
import com.neitui.dao.JobDetailDao;
import com.neitui.entity.JobDetail;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created with IntelliJ IDEA.
 * User: loctar
 * Date: 14-8-9
 * Time: 下午3:45
 * To change this template use File | Settings | File Templates.
 */
public class JobDetailDaoImpl implements JobDetailDao {
    @Override
    public void save(JobDetail job) throws Exception {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(job);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            throw e;
        } finally {
            session.close();
        }

    }
}
