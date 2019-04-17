/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.xslttest.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author COSH
 */
public class Cat {

	public Cat() {
	}

	public Cat(Long id, String name, String color, Integer age, Date time) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.age = age;
                this.time = time;
	}
        public Cat(Long id, String name, String color, Integer age) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.age = age;
                this.time = Calendar.getInstance().getTime();
	}
	
	private Long id;
	private String name;
	private String color;
	private Integer age;
        @JsonFormat(timezone = "GMT+8",pattern = "yyyy/MM/dd HH:mm:ss")
        private Date time;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

        public Date getTime() {
                return time;
        }

        public void setTime(Date time) {
                this.time = time;
        }
        
        
}
