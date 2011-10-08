/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate.tablegenerator;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author bandeng
 */
@Entity
@Table(name="Employee")
public class TableGenerator implements Serializable {
    private Long empId;
    private String empName;
    @Id
    //@javax.persistence.TableGenerator(name="empid",table="emppktb",pkColumnName="emppk",pkColumnValue="empvalue",allocationSize=0001)
    @SequenceGenerator(name="SEQ_GEN",allocationSize=20,sequenceName="My_Seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name="ID_Pegawai")
    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }
    @Column(name="Nama_Pegawai",length=30)
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
