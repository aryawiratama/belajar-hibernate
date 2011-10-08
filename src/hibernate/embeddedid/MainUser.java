/*
 * IF THERE ANY QUESTION.
 * PLEASE CONTACT ME AT.
 * "stop.drunk@gmail.com"
 */

package hibernate.embeddedid;

import hibernate.hibernateutil.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author bandeng
 */
public class MainUser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        User user = new User();
        user.setAge(3);
        UserId id = new UserId();
        id.setFirstname("I Gede Arya");
        id.setLastname("Wiratama");
        user.setId(id);
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
    }

}
