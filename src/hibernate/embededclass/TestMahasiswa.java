/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate.embededclass;

import hibernate.hibernateutil.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author bandeng
 */
public class TestMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MahasiswaDetail mhsDetail = new MahasiswaDetail();
        mhsDetail.setAktif(true);
        mhsDetail.setAngkatan("2007");
        mhsDetail.setJurusan("Sistem Informasi");
        mhsDetail.setProgram("S1");

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("07410100133");
        mahasiswa.setNama("I Gede Arya Wiratama");
        mahasiswa.setPassword("345374");
        mahasiswa.setMhsDetail(mhsDetail);
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(mahasiswa);
        session.getTransaction().commit();
    }

}
