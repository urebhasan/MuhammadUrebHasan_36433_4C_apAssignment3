package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import file.Upload;
import utils.HibernateUtil;


public class UploadDao {

	public void addUpload(Upload newUpload) {
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		try {
	        trns = session.beginTransaction();
	        session.save(newUpload);
	        session.getTransaction().commit();
	    } catch (RuntimeException e) {
	        if (trns != null) {
	            trns.rollback();
	        }
	        e.printStackTrace();
	    } finally {
	        session.flush();
	        //session.close();
	    }
	}	
}