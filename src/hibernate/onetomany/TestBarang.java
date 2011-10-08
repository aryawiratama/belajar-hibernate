/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate.onetomany;

import hibernate.hibernateutil.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author bandeng
 */
public class TestBarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Kategori kategori1 = new Kategori();
        kategori1.setNama("Laptop");

        Kategori kategori2 = new Kategori();
        kategori2.setNama("Televisi");

        Barang barang1= new Barang();
        barang1.setNama("ASUS");
        barang1.setKategori(kategori1);
        Barang barang2 = new Barang();
        barang2.setNama("ACER");
        barang2.setKategori(kategori1);
        Barang barang3= new Barang();
        barang3.setNama("TOSHIBA");
        barang3.setKategori(kategori2);
        Barang barang4= new Barang();
        barang4.setNama("SONY");
        barang4.setKategori(kategori2);
        session.save(kategori1);
        session.save(kategori2);
        session.save(barang1);
        session.save(barang2);
        session.save(barang3);
        session.save(barang4);
        session.getTransaction().commit();
    }

}
