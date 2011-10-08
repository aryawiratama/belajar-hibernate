/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate.inheritancemapping;

import hibernate.hibernateutil.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author bandeng
 */
public class TestProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        Project project = new Project();
        project.setProjectName("Pengadaan Barang");

        Module module = new Module();
        module.setProjectName("Pembelian");
        module.setModuleName("PO");

        Task task = new Task();

        task.setProjectName("Penjualan");
        task.setModuleName("Sales Order");
        task.setTaskName("Insert");
        session.save(project);
        session.save(module);
        session.save(task);
        session.getTransaction().commit();
    }

}
