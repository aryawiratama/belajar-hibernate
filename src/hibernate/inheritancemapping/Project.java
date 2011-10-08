/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate.inheritancemapping;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author bandeng
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Project implements Serializable {
    private int id;
    private String projectName;
    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

}
