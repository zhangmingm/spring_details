package com.store.platform.utils;

import com.store.platform.annotation.Description;


/**
 * @Package com.store.platform.utils
 * @ClassName: com.store.platform.utils.Test  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月16日 下午5:40:27
 * @Description:
 */
@Description(desc="这是一个测试的描述信息", auth = "张明明",age=12)
public class Test {

	private String field="自定义注解";
	
	@Description(desc="这是方法上的描述信息", auth = "张明明",age=12)
	public void showMessage(){
		System.out.println("呵呵呵，早晨好啊！");
	}
}
