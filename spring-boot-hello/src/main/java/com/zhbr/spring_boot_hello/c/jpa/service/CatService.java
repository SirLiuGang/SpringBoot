package com.zhbr.spring_boot_hello.c.jpa.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.zhbr.spring_boot_hello.c.jpa.bean.Cat;
import com.zhbr.spring_boot_hello.c.jpa.repository.Cat2Repository;
import com.zhbr.spring_boot_hello.c.jpa.repository.CatRepository;
import com.zhbr.spring_boot_hello.d.jdbctemplate.CatDao;

@Service
public class CatService {

	@Resource
	private CatRepository catRepository;
	
	@Resource
	private Cat2Repository cat2Repository;
	
	@Resource
	private CatDao catDao;
	
	/**
	 * save,update,delete 方法需要绑定事务
	 * 
	 * 使用@Transactional进行事务的绑定
	 */
	
	/**
	 * 保存数据
	 */
	@Transactional
	public void save(Cat cat) {
		catRepository.save(cat);
	}
	
	/**
	 * 删除数据
	 */
	@Transactional
	public void delete(Integer id) {
		catRepository.delete(id);
	}
	
	/**
	 * 查询数据
	 */
	public Iterable<Cat> getAll() {
		return catRepository.findAll();
	}
	
	//-----------------------
	
	/**
	 * 根据catName进行查询
	 */
	public Cat findByCatName(String catName) {
		return cat2Repository.findByCatName(catName);
	}
	
	/**
	 * 根据catName进行查询，通过自定义的JPQL语句
	 */
	public Cat findMyCatName(String catName) {
		return cat2Repository.findMyCatName(catName);
	}
	
	/**
	 * 调用JdbcTemplate的中的方法
	 */
	public Cat selectByCatName(String catName) {
		return catDao.selectByCatName(catName);
	}
	
	
}
















