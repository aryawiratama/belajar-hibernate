/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate.inheritancemapping;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author bandeng
 */
@Entity
@Table(name="modul")
public class Module extends Project{
    private String moduleName;

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

}
