/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate.compoundpk;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author bandeng
 */
@Embeddable()
public class PrimaryKey implements Serializable{
    private int userId;
    private int accountID;

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

}
