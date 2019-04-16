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
public class TestServiceImpl implements TestService {

        @Override
        public Integer getRandomAge(int maxAge) {
//		double random = Math.random();
//		Long age = Math.round(random*maxAge); //盡可能不要強制轉型
                Double randomAge = Math.random() * maxAge;
                return randomAge.intValue() + 1;
        }

        @Override
        public String getPrimeNumber(int min, int max) {
                StringBuilder numbersStringBuilder = new StringBuilder();
                for (int i = min; i <= max; i++) {
                        if (isPrimeNumber(i)) {
                                numbersStringBuilder.append(i).append("  ");
                        }
                }
                return numbersStringBuilder.toString();
        }

        @Override
        public boolean isPrimeNumber(Integer number) {
                if (number <= 1) {
                        return false;
                }
                //一個數的其中一個因數，不會大於開根號，檢測至開根號即可
                Double numberSqrt = Math.sqrt(number.doubleValue());
                boolean isPrimeNumber = true;
                for (int j = 2; j <= numberSqrt.intValue(); j++) {
                        if (number % j == 0) {
                                isPrimeNumber = false;
                                break;
                        }
                }
                return isPrimeNumber;
        }

}
