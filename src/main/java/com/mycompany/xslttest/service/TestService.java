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
        /**
         * 測試用:取得1~maxAge的隨機數
         * @param maxAge 隨機數範圍上限
         * @return 1~maxAge範圍內的隨機數
         */
	Integer getRandomAge(int maxAge);
        
        /**
         * 取得範圍內的字數所組成的字串
         * @param min 範圍下限
         * @param max 範圍上限
         * @return 範圍內的字數所組成的字串
         */
	String getPrimeNumber(int min, int max);
        
        /**
         * 檢測number是否為質數
         * @param number 待檢測數字
         * @return 是否為質數
         */
	boolean isPrimeNumber(Integer number);
}
