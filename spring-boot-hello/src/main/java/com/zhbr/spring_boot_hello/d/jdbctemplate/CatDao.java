package com.zhbr.spring_boot_hello.d.jdbctemplate;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.zhbr.spring_boot_hello.c.jpa.bean.Cat;

/**
 * 使用@Repository注解，标注这是一个持久化操作对象
 */
@Repository
public class CatDao {

	@Resource
	private JdbcTemplate jdbcTemplate;
	
	public Cat selectByCatName(String catName) {
		// 1.定义一个sql语句
		String sql = "select * from cat where cat_name = ?";
		
		// 2.定义一个RowMapper
		RowMapper<Cat> rowMapper = new BeanPropertyRowMapper<>(Cat.class);
		
		// 3.执行查询方法
		Cat cat = jdbcTemplate.queryForObject(sql, new Object[]{catName}, rowMapper);
		
		return cat;
	}
}















