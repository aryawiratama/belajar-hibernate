/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate.onetomany;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author bandeng
 */
@Entity
public class Kategori {
    private int id;
    private String nama;
    private List<Barang> barang;
    @OneToMany(targetEntity=Barang.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="kategori")
    public List<Barang> getBarang() {
        return barang;
    }

    public void setBarang(List<Barang> barang) {
        this.barang = barang;
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
