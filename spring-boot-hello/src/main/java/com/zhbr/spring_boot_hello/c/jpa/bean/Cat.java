package com.zhbr.spring_boot_hello.c.jpa.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 创建的一个实体类
 * 
 * 1.持久化的方法：使用注解@Entity，当JPA检测到实体类中有该注解时，会在数据库中生成对于的表结构信息
 * 
 * 2.指定主键及主键的生成策略：使用@Id指定主键，使用@GeneratedValue指定生成策略，默认自增长
 */
@Entity
public class Cat {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String catName;
	private int catAge;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public int getCatAge() {
		return catAge;
	}
	public void setCatAge(int catAge) {
		this.catAge = catAge;
	}
	
}
