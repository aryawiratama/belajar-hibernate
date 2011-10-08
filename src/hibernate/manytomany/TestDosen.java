/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate.manytomany;

import hibernate.hibernateutil.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author bandeng
 */
public class TestDosen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen();
        dosen1.setNama("Rangsang Purnama xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
                + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
                + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
                + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
                + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        Dosen dosen2 = new Dosen();
        dosen2.setNama("Antok");

        MataKuliah kuliah1 = new MataKuliah();
        kuliah1.setNama("PBO");

        MataKuliah kuliah2 = new MataKuliah();
        kuliah2.setNama("ASI");

        MataKuliah kuliah3 = new MataKuliah();
        kuliah3.setNama("MOBILE");

        dosen1.getKuliah().add(kuliah1);
        dosen1.getKuliah().add(kuliah3);
        dosen2.getKuliah().add(kuliah2);
        dosen2.getKuliah().add(kuliah3);
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(kuliah1);
        session.save(kuliah2);
        session.save(kuliah3);
        session.save(dosen1);
        session.save(dosen2);
        session.getTransaction().commit();
    }

}
