/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.cphbusiness.dependency_maven;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import dk.cphbusiness.naked_maven_pojo.DependencyEnd;

/**
 *
 * @author rhp
 */
@WebService(serviceName = "ShowMessage")
public class ShowMessage {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "greetings")
    public String greetings(@WebParam(name = "name") String txt) {
        DependencyEnd depEnd = new DependencyEnd();
        String txt1 = depEnd.getDependencyEnd();
        return "From Start to " + txt1 + " !";
    }
}
