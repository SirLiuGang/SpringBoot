package com.zhbr.spring_boot_hello.c.jpa.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.zhbr.spring_boot_hello.c.jpa.bean.Cat;

public interface Cat2Repository extends PagingAndSortingRepository<Cat, Integer> {

	/**
	 * 1.查询方法以 get|find|read 开头
	 * 2.条件的属性用关键字连接
	 */
	
	/**
	 * 根据catName进行查询
	 */
	public Cat findByCatName(String catName);
	
	/**
	 * 如何编写JPQL语句
	 * 	与HQL语句是类似的
	 * 
	 * 以下两种皆可
	 */
	@Query("from Cat where catName = :cn")
	public Cat findMyCatName(@Param("cn")String catName);
//	@Query("from Cat where catName = :catName")
//	public Cat findMyCatName(String catName);
	
}




















