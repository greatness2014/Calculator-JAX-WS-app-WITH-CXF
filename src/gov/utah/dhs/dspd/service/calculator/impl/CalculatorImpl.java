/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gov.utah.dhs.dspd.service.calculator.impl;

import gov.utah.dhs.dspd.service.calculator.ICalculator;
import javax.jws.WebService;

/**
 *
 * @author wsaeed
 */
@WebService(endpointInterface="gov.utah.dhs.dspd.service.calculator.ICalculator")
public class CalculatorImpl implements ICalculator{
    
    @Override
    public int add(int value1, int value2) {
        return (value1 + value1);
    }

    @Override
    public int substract(int value1, int value2) {
        return (value1 - value2);
    }

    @Override
    public double mutliply(double value1, double value2) {
        return (value1 * value2);
    }

    @Override
    public double divide(double value1, double value2) {
        return (value1 / value2);
    }
    
    
}
