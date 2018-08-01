package com.zhbr.spring_boot_hello.c.jpa.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.zhbr.spring_boot_hello.c.jpa.bean.Cat;
import com.zhbr.spring_boot_hello.c.jpa.repository.CatRepository;

@Service
public class CatService {

	@Resource
	private CatRepository catRepository;
	
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
	public void delete(Integer id) {
		catRepository.delete(id);
	}
	
	/**
	 * 查询数据
	 */
	public Iterable<Cat> getAll() {
		return catRepository.findAll();
	}
}
