/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gov.utah.dhs.dspd.service.calculator;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author wsaeed
 */
@WebService
public interface ICalculator {
    @WebMethod
    public int add(@WebParam(name = "value1") int value1,
                   @WebParam(name = "value2") int value2);
    public int substract(@WebParam(name = "value1") int value1,
                   @WebParam(name = "value2") int value2);
     public double mutliply(@WebParam(name = "value1") double value1,
                   @WebParam(name = "value2") double value2);
     public double divide(@WebParam(name = "value1") double value1,
                             @WebParam(name = "value2") double value2);
    
}
