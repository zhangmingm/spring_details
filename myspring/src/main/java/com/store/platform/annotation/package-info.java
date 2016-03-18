/**
 * @Package com.store.platform.annotation
 * @ClassName: com.store.platform.annotation.package-info  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月16日 下午5:43:36
 * @Description:
 */
package com.store.platform.annotation;


/**
该包下放的是关于注解 annotation的内容。

何为元注解？就是注解的注解，就是给你自己定义的注解添加注解，你自己定义了一个注解，但你想要你的注解有什么样的功能，此时就需要用元注解对你的注解进行说明了。
        元注解有4个，如下代码的上面部分：
        @Target({ElementType.METHOD,ElementType.TYPE})
		@Retention(RetentionPolicy.RUNTIME)
		@Inherited
		@Documented

@Target 即注解的作用域，用于说明注解的使用范围（即注解可以用在什么地方，比如类的注解，方法注解，成员变量注解等等）
取值：
          ElemenetType.CONSTRUCTOR----------------------------构造器声明 
          ElemenetType.FIELD --------------------------------------域声明（包括 enum 实例） 
          ElemenetType.LOCAL_VARIABLE------------------------- 局部变量声明 
          ElemenetType.METHOD ----------------------------------方法声明 
          ElemenetType.PACKAGE --------------------------------- 包声明 
          ElemenetType.PARAMETER ------------------------------参数声明 
          ElemenetType.TYPE--------------------------------------- 类，接口（包括注解类型）或enum声明
          
@Retention   描述的注解在什么范围内有效。         
          
          RetentionPolicy.SOURCE--------------------------只在源码显示，编译时会丢失
          RetentionPolicy.CLASS-----------------------------编译时会记录到class中，运行时忽略 
          RetentionPolicy.RUNTIME------------------------- 运行时存在，可以通过反射读取
          
@Inherited
1. 是一个标记注解，没有成员，表示允许子类继承该注解，也就是说如果一个使用了@Inherited修饰的注解被用于一个class时，则这个注解将被该class的子类继承拥有
2. 使用了@Inherited修饰的注解只能被子类所继承，并不可以从它所实现的接口继承
3. 子类继承父类的注解时，并不能从它所重载的方法继承注解          
          
@Documented          
@Documented是一个标记注解，没有成员。用于描述其它类型的annotation应该被作为被标注的程序成员的公共API，
因此可以被例如javadoc此类的工具文档化。         
          
          
          
          
          
          
          
          
          
*/
































