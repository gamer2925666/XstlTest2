/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.xslttest.service.impl;

import com.mycompany.xslttest.service.TestService;
import org.springframework.stereotype.Service;

/**
 *
 * @author COSH
 */
@Service
public class TestServiceImpl implements TestService{
	@Override
	public Integer getRandomAge(int maxAge){
//		double random = Math.random();
//		Long age = Math.round(random*maxAge); //盡可能不要強制轉型
		Double randomAge = new Double(Math.random()*maxAge);
		return randomAge.intValue()+1;
	}

	@Override
	public String getPrimeNumber(int min, int max) {
		StringBuilder numbersStringBuilder = new StringBuilder();
		for (int i = min; i <= max; i++) {
			if (testPrimeNumber(i)) {
				numbersStringBuilder.append(i+"  ");
			}
		}
		return numbersStringBuilder.toString();
	}
	
	@Override
	public boolean testPrimeNumber(int number) {
                if(number==1){
                        return false;
                }
		boolean isPrimeNumber = true;
		for (int j = 1; j < number *0.7; j++) {
			if (number % j == 0 && j != 1) {
				isPrimeNumber = false;
				break;
			}
		}
		return isPrimeNumber;
	}
	
	
	
	
}
