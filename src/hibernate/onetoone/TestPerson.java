/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate.onetoone;

import hibernate.hibernateutil.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author bandeng
 */
public class TestPerson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Foreign Key Menjadi Kosong
        Person person = new Person();
        person.setNama("I Gede Arya Wiratama");
        PersonDetail pdetail = new PersonDetail();
        pdetail.setAlamat("Baruk Barat");
        pdetail.setTelp("081931030707");
        pdetail.setPerson(person);
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(pdetail);
        session.getTransaction().commit();
    }

}
