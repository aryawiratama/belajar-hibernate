/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate.compoundpk;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author bandeng
 */
@Entity
public class CompoundPK {
    private int accountBalance;
    private PrimaryKey pk;

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }
    @Id
    public PrimaryKey getPk() {
        return pk;
    }

    public void setPk(PrimaryKey pk) {
        this.pk = pk;
    }
}
