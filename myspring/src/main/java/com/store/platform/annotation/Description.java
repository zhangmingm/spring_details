package com.store.platform.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Package com.store.platform.annotation
 * @ClassName: com.store.platform.annotation.Description  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月17日 上午11:14:52
 * @Description:
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Description { //使用@interface关键字定义注解  
//	成员以无参数无异常的方式声明
	public String desc();
	/* String desc(int a); 
     * String desc() throws Exception; 
     * 都是错误的声明方式 
     */  

	public String auth();
	
	
//  public  String author() default ""; 合法的声明  
	
	public int age() default 18;
	
	
	/* 
     * 如果声明：Map map(); 则会报错： 
     * Invalid type Map for the annotation attribute Description.map;  
     * only primitive type, String, Class, annotation, enumeration  
     * are permitted or 1-dimensional arrays thereof 
     *  
     * 只有原始类型和String, Class, annotation, enumeration才可以 
     */  
	
	
	/**
	 * 1.使用@interface关键字定义注解，注意关键字的位置
	 * 2.成员以无参数无异常的方式声明，注意区别一般类成员变量的声明
	 * 3.可以使用default为成员指定一个默认值，如上所示
	 * 4.成员类型是受限的，合法的类型包括原始类型以及String、Class、Annotation、Enumeration （JAVA的基本数据类型有8种：byte(字节)、short(短整型)、int(整数型)、long(长整型)、float(单精度浮点数类型)、double(双精度浮点数类型)、char(字符类型)、boolean(布尔类型）
	 * 5.注解类可以没有成员，没有成员的注解称为标识注解，例如JDK注解中的@Override、@Deprecation
	 * 6.如果注解只有一个成员，并且把成员取名为value()，则在使用时可以忽略成员名和赋值号“=” ,例如JDK注解的@SuppviseWarnings ；如果成员名不为value，则使用时需指明成员名和赋值号"="，例子代码如下：
	 */
	
	
	
	
	
	
	
}
