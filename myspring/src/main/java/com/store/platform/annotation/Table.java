package com.store.platform.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Package com.store.platform.annotation
 * @ClassName: com.store.platform.annotation.Table  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月16日 下午5:56:28
 * @Description:
 * ①有一张用户表，字段包括：用户ID、用户名、昵称、年龄、性别、所在城市、邮箱、手机号； 
 * ②使用java注解来对用户表的每个字段或字段的组合条件进行动态生成SQL查询语句。
 */

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {
	String value();
}
