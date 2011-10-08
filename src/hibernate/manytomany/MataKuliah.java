/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate.manytomany;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author bandeng
 */
@Entity
public class MataKuliah {
    private int Mid;
    private String nama;
    private List<Dosen> dosen = new ArrayList<Dosen>();
    @ManyToMany
    @JoinTable(name="Mengajar",joinColumns={@JoinColumn(name="Mid")},inverseJoinColumns={@JoinColumn(name="id")})
    public List<Dosen> getDosen() {
        return dosen;
    }

    public void setDosen(List<Dosen> dosen) {
        this.dosen = dosen;
    }
  
    public String getNama() {
        return nama;
    }
    @Id
    @GeneratedValue

    public int getMid() {
        return Mid;
    }

    public void setMid(int Mid) {
        this.Mid = Mid;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
