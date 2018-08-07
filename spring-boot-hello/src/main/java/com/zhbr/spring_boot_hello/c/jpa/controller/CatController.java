package com.zhbr.spring_boot_hello.c.jpa.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhbr.spring_boot_hello.c.jpa.bean.Cat;
import com.zhbr.spring_boot_hello.c.jpa.service.CatService;

@RestController
@RequestMapping("/cat")
public class CatController {

	@Resource
	private CatService catService;
	
	@RequestMapping("/save")
	public String save() {
		Cat cat = new Cat();
		cat.setCatName("jack");
		cat.setCatAge(3);
		catService.save(cat);
		return "save ok";
	}
	
	@RequestMapping("/delete")
	public String delete() {
		catService.delete(1);
		return "delete ok";
	}
	
	@RequestMapping("/getAll")
	public Iterable<Cat> getAll() {
		return catService.getAll();
	}
	
	//----------------
	
	@RequestMapping("/findByCatName")
	public Cat findByCatName(String catName) {
		return catService.findByCatName(catName);
	}
	
	@RequestMapping("/findMyCatName")
	public Cat findMyCatName(String catName) {
		return catService.findMyCatName(catName);
	}
	
}
