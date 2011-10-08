/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate.compoundpk;

import hibernate.hibernateutil.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author bandeng
 */
public class MainPK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        CompoundPK compoundPK = new CompoundPK();
        PrimaryKey key  = new PrimaryKey();
        key.setAccountID(100);
        key.setUserId(2001);
        compoundPK.setAccountBalance(2000);
        compoundPK.setPk(key);
        session.beginTransaction();
        session.save(compoundPK);
        session.getTransaction().commit();
    }

}
