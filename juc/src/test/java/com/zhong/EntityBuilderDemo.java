package com.zhong;

import com.zhong.entity.User;
import org.junit.Test;

/**
 * @author zzh
 * @version 1.0
 * @date 2021/6/24 10:26
 */
public class EntityBuilderDemo {


	@Test
	public void Builder(){

		User user = User.builder()
						.age(11)
						.id(2)
						.name("biden")
						.build();
		System.out.println(user);

		//@Builder(toBuilder = true) 等于ture时才能这样操作
		user = user.toBuilder().name("trump").build();

		System.out.println(user);
	}

}
