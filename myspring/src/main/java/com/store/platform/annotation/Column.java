package com.store.platform.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Package com.store.platform.annotation
 * @ClassName: com.store.platform.annotation.Column  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月17日 下午5:45:05
 * @Description: 列对象的注解
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {

	public String value();
}
