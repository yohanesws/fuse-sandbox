
package org.example.jbossbankservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.jbossbankservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCustomerAccounts_QNAME = new QName("http://www.example.org/JBossBankServices/", "getCustomerAccounts");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.jbossbankservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAccountBalance }
     * 
     */
    public GetAccountBalance createGetAccountBalance() {
        return new GetAccountBalance();
    }

    /**
     * Create an instance of {@link GetCustomerAccountsResponse }
     * 
     */
    public GetCustomerAccountsResponse createGetCustomerAccountsResponse() {
        return new GetCustomerAccountsResponse();
    }

    /**
     * Create an instance of {@link Accounts }
     * 
     */
    public Accounts createAccounts() {
        return new Accounts();
    }

    /**
     * Create an instance of {@link GetCustomerAccounts }
     * 
     */
    public GetCustomerAccounts createGetCustomerAccounts() {
        return new GetCustomerAccounts();
    }

    /**
     * Create an instance of {@link GetAccountBalanceResponse }
     * 
     */
    public GetAccountBalanceResponse createGetAccountBalanceResponse() {
        return new GetAccountBalanceResponse();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerAccounts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/JBossBankServices/", name = "getCustomerAccounts")
    public JAXBElement<GetCustomerAccounts> createGetCustomerAccounts(GetCustomerAccounts value) {
        return new JAXBElement<GetCustomerAccounts>(_GetCustomerAccounts_QNAME, GetCustomerAccounts.class, null, value);
    }

}
