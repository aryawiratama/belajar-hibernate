/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate.manytomany;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Version;

/**
 *
 * @author bandeng
 */
@Entity
public class Dosen implements Serializable {
    private int id;
    private String nama;
    private List<MataKuliah> kuliah = new ArrayList<MataKuliah>();
    @ManyToMany
    @JoinTable(name="Mengajar",joinColumns={@JoinColumn(name="id")},inverseJoinColumns={@JoinColumn(name="mid")})
    public List<MataKuliah> getKuliah() {
        return kuliah;
    }

    public void setKuliah(List<MataKuliah> kuliah) {
        this.kuliah = kuliah;
    }
    @Id
    @Version
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Lob()
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
