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
}
