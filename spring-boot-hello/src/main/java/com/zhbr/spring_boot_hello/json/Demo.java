package com.zhbr.spring_boot_hello.json;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 这是一个测试实体类
 */
public class Demo {

	private int id;
	private String name;
	@JSONField(format="yyyy-MM-dd")
	private Date createTime; // 创建时间
	
	/*
	 * 需求：不想返回remarks
	 * deserialize：是否需要序列化
	 */
	@JSONField(serialize=false)
	private String remarks; // 备注信息
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
