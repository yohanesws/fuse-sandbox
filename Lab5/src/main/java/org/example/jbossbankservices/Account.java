
package org.example.jbossbankservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Account complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Account"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="accountBalance" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account", propOrder = {
    "accountID",
    "accountType",
    "customerID",
    "accountBalance"
})
public class Account {

    protected int accountID;
    protected int accountType;
    protected int customerID;
    protected double accountBalance;

    /**
     * Gets the value of the accountID property.
     * 
     */
    public int getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     */
    public void setAccountID(int value) {
        this.accountID = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     */
    public int getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     */
    public void setAccountType(int value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the customerID property.
     * 
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     */
    public void setCustomerID(int value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the accountBalance property.
     * 
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * Sets the value of the accountBalance property.
     * 
     */
    public void setAccountBalance(double value) {
        this.accountBalance = value;
    }

}
