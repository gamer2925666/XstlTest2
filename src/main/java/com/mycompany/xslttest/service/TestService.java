/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.xslttest.service;


/*測試Service在Spring mvc 與Spring boot 的差別
 *
 * @author COSH
 */
public interface TestService {
	Integer getRandomAge(int maxAge);
	String getPrimeNumber(int min, int max);
	boolean testPrimeNumber(int number);
}
