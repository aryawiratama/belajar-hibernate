/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate.inheritancemapping;

import javax.persistence.Entity;

/**
 *
 * @author bandeng
 */
@Entity
public class Task extends Module{
    private String taskName;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

}
