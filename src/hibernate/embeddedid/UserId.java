/*
 * IF THERE ANY QUESTION.
 * PLEASE CONTACT ME AT.
 * "stop.drunk@gmail.com"
 */

package hibernate.embeddedid;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

/**
 *
 * @author bandeng
 */
@Embeddable
public class UserId implements Serializable{
    private String firstname;
    private String lastname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
