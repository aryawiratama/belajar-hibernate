/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate.annotation;

import hibernate.hibernateutil.HibernateUtil;
import java.util.Date;
import java.util.GregorianCalendar;
import org.hibernate.Session;

/**
 *
 * @author bandeng
 */
public class MainAnnotation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Annonations annonations = new Annonations();
        session.beginTransaction();
        annonations.setNim("07410100133");
        annonations.setNama("I Gede Arya Wiratama");
        annonations.setAlamat("Baruk Barat VB no 26");
        annonations.setJurusan("Sistem Informasi");
        annonations.setAktif(true);
        annonations.setPassword("397374");
        annonations.setTglmasuk(new GregorianCalendar(2007,12,9));
        annonations.setTglLogin(new Date ());
        session.save(annonations);
        session.getTransaction().commit();
    }

}
