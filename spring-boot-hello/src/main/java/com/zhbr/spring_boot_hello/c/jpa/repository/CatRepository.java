package com.zhbr.spring_boot_hello.c.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.zhbr.spring_boot_hello.c.jpa.bean.Cat;

public interface CatRepository extends CrudRepository<Cat, Integer>{

}
