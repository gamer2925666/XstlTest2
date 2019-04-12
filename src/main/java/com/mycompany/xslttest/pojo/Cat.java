/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.xslttest.pojo;

/**
 *
 * @author COSH
 */
public class Cat {

	public Cat() {
	}

	public Cat(Long id, String name, String color, Integer age) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.age = age;
	}
	
	private Long id;
	private String name;
	private String color;
	private Integer age;

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
}
