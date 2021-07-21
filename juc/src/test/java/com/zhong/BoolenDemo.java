package com.zhong;

import com.google.common.collect.Lists;
import com.zhong.entity.User;
import org.junit.Test;

/**
 * @author zzh
 * @version 1.0
 * @date 2021/6/30 18:28
 */
public class BoolenDemo {

//	deploy.getUserNum() <= allUserIdList.size() && deploy.getUserNum() != -1

	@Test
	public void test(){
		int a = -1, b = 3;
		System.out.println(a<=b && a!=-1);
		System.out.println(a<=b  );

	}

	@Test
	public void test2(){
		User user = new User();


		if (user.isFlag()){
			System.out.println("flag");
		}else {
			System.out.println("111");
		}


	}


}
