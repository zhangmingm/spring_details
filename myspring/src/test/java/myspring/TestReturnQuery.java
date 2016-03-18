package myspring;

import org.junit.Test;

import com.store.platform.annotation.ReturnQuery;
import com.store.platform.annotation.User;

/**
 * @Package myspring
 * @ClassName: myspring.TestReturnQuery  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月18日 下午3:12:38
 * @Description:
 */
public class TestReturnQuery {

	@Test
	public void test(){
		User u1=new User();
		u1.setId(9);
		User u2=new User();
		u2.setUserName("张三");
		u2.setAge(21);
		u2.setEmail("123@163.com,123@qq.com");
		System.out.println(ReturnQuery.query(u1));
		System.out.println(ReturnQuery.query(u2));
	}

}
