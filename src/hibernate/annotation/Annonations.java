/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate.annotation;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author bandeng
 */
@Entity
@Table(name ="Annotations",schema="latihan")
public class Annonations implements Serializable {
private String nim;
private String nama;
private String password;
private String jurusan;
private String Alamat;
private boolean aktif;
private Calendar tglmasuk;
private Date tglLogin;
    @Column(name="Alamat")
    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
    @Basic
    public boolean isAktif() {
        return aktif;
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }
    @Column(name="jurusan",nullable=false,length=20)
    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    @Transient
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getTglLogin() {
        return tglLogin;
    }

    public void setTglLogin(Date tglLogin) {
        this.tglLogin = tglLogin;
    }

    @Temporal(TemporalType.DATE)
    public Calendar getTglmasuk() {
        return tglmasuk;
    }

    public void setTglmasuk(Calendar tglmasuk) {
        this.tglmasuk = tglmasuk;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    @Id
    @Column(name="NIM")
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

}
