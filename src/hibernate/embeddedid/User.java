/*
 * IF THERE ANY QUESTION.
 * PLEASE CONTACT ME AT.
 * "stop.drunk@gmail.com"
 */

package hibernate.embeddedid;

import java.io.Serializable;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author bandeng
 */
@Entity
@Table(name="Pengguna")
public class User implements Serializable{
    
    private UserId id;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @EmbeddedId
    @AttributeOverride(name="firstname",column=@Column(name="firstname"))
    public UserId getId() {
        return id;
    }

    public void setId(UserId id) {
        this.id = id;
    }
    
}
