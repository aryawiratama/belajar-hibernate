/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate.tablegenerator;

import hibernate.hibernateutil.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author bandeng
 */
public class MainTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TableGenerator generator1 = new TableGenerator();
        generator1.setEmpName("Arya");

        TableGenerator generator2 = new TableGenerator();
        generator2.setEmpName("Bandenk");

        TableGenerator generator3 = new TableGenerator();
        generator3.setEmpName("Arya Wiratama");

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(generator1);
        session.save(generator2);
        session.save(generator3);
        session.getTransaction().commit();
    }

}
