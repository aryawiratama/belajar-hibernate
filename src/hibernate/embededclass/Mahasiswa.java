/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate.embededclass;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author bandeng
 */
@Entity
@Table(name="MHSEMBEDED")
public class Mahasiswa {
    private String nim;
    private String nama;
    private String password;
    private MahasiswaDetail mhsDetail;
    @Embedded
    public MahasiswaDetail getMhsDetail() {
        return mhsDetail;
    }

    public void setMhsDetail(MahasiswaDetail mhsDetail) {
        this.mhsDetail = mhsDetail;
    }

    @Column(name="Nama",length=30)
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    @Id
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    @Transient
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
