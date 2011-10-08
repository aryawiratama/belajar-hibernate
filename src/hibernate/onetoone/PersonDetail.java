/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author bandeng
 */
@Entity
public class PersonDetail {
    private String alamat;
    private String telp;
    private int idDetail;
    Person person;
    @OneToOne(mappedBy="pDetail",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Id
    @GeneratedValue
    @Column(name="Person_Fk")
    public int getIdDetail() {
        return idDetail;
    }

    public void setIdDetail(int idDetail) {
        this.idDetail = idDetail;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }
}
