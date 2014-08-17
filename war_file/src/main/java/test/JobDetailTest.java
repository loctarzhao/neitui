package test;

import com.neitui.dao.impl.JobDetailDaoImpl;
import com.neitui.entity.JobDetail;
import com.neitui.entity.KeyWord;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: loctar
 * Date: 14-8-9
 * Time: 下午4:07
 * To change this template use File | Settings | File Templates.
 */
public class JobDetailTest {
    public static void main(String[] args) {
        Configuration cfg  =new Configuration().configure();
        Session session = cfg.buildSessionFactory().openSession();
        Transaction tx = session.beginTransaction();


//        JobDetail job = new JobDetail();
//        job.setJobName("java developer");
//        job.setKeyWords(null);
//        session.save(job);
        KeyWord k = new KeyWord();
        k.setKeyPattern("java");
        session.save(k);
        tx.commit();


        session.close();
    }
}
