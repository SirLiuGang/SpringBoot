package com.zhbr.spring_boot_hello.c.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.zhbr.spring_boot_hello.c.jpa.bean.Cat;

/**
 * Repository是接口，不是Class
 * 	Repository是Spring Data 的一个核心接口，它不提供任何方法，开发者需要在自己定义的接口中声明需要的方法。
 * 		1.Repository是一个空接口
 * 		2.如果我们定义的接口继承了Repository，则该接口会被IOC容器识别为一个Repository Bean纳入到IOC容器中，进而可以在该即可中定义满足一定规范的方法
 * 		3.实际上也可以通过@RepositoryDefinition 注解来替代继承Repository接口。
 * 		4.查询方法以find|read|get开头
 * 		5.设计查询条件时，条件的属性用条件关键字连接，要注意的是条件属性以首字母大写。
 * 		6.使用@Query注解可以自定义JPQL语句实现更灵活的查询。
 * 
 * 其他接口：
 * 		PagingAndSortingRepository	： 提供排序及分页
 * 		JpaRepository	： 查找所有实体，排序、查找所有实体，执行缓存与数据库同步
 * 		JpaSpecificationExecutor	： 不属于Repository体系，实现一组JPA Criteria查询相关方法，封装JPA Critical查询条件。通常使用匿名内部类的方式来创建该接口的对象
 * 		自定义Repository		： 可以自己定义一个MyRepository接口。
 * 
 *
 */
public interface CatRepository extends CrudRepository<Cat, Integer>{

}

























