package org.example.jbossbankservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.5.redhat-630187
 * 2016-10-18T12:45:06.087-03:00
 * Generated source version: 3.1.5.redhat-630187
 * 
 */
@WebService(targetNamespace = "http://www.example.org/JBossBankServices/", name = "JBossBankServices")
@XmlSeeAlso({ObjectFactory.class})
public interface JBossBankServices {

    @WebMethod(action = "http://www.example.org/JBossBankServices/getCustomerAccounts")
    @RequestWrapper(localName = "getCustomerAccounts", targetNamespace = "http://www.example.org/JBossBankServices/", className = "org.example.jbossbankservices.GetCustomerAccounts")
    @ResponseWrapper(localName = "getCustomerAccountsResponse", targetNamespace = "http://www.example.org/JBossBankServices/", className = "org.example.jbossbankservices.GetCustomerAccountsResponse")
    @WebResult(name = "Accounts", targetNamespace = "")
    public org.example.jbossbankservices.Accounts getCustomerAccounts(
        @WebParam(name = "customerID", targetNamespace = "")
        int customerID
    );

    @WebMethod(action = "http://www.example.org/JBossBankServices/getAccountBalance")
    @RequestWrapper(localName = "getAccountBalance", targetNamespace = "http://www.example.org/JBossBankServices/", className = "org.example.jbossbankservices.GetAccountBalance")
    @ResponseWrapper(localName = "getAccountBalanceResponse", targetNamespace = "http://www.example.org/JBossBankServices/", className = "org.example.jbossbankservices.GetAccountBalanceResponse")
    @WebResult(name = "accountBalance", targetNamespace = "")
    public double getAccountBalance(
        @WebParam(name = "accountID", targetNamespace = "")
        int accountID
    );
}