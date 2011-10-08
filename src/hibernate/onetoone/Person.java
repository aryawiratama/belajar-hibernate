/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author bandeng
 */
@Entity
public class Person {
    private int id ;
    private String nama;
    private PersonDetail pDetail;
    @OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name="Person_FK")
    public PersonDetail getpDetail() {
        return pDetail;
    }

    public void setpDetail(PersonDetail pDetail) {
        this.pDetail = pDetail;
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

}
