/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate.embededclass;

import javax.persistence.Embeddable;

/**
 *
 * @author bandeng
 */
@Embeddable
public class MahasiswaDetail {
    private String program;
    private String jurusan;
    private String angkatan;
    private boolean aktif;

    public boolean isAktif() {
        return aktif;
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }

    public String getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

}
