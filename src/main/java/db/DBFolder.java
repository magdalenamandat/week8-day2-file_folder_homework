package db;

import models.Folder;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBFolder {

    private static Session session;

    public static List<Folder> getFilesInFolder(Folder folder){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Folder> results = null;

        try{
            Criteria cr = session.createCriteria(Folder.class);
            cr.add(Restrictions.eq("folder", folder));
            results = cr.list();
        }
        catch(HibernateException ex) {
            ex.printStackTrace();
        }
        finally {
            session.close();
        }

        return results;
    }
}
