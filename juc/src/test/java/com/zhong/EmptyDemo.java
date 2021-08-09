package com.zhong;

import com.google.common.collect.Lists;
import com.zhong.entity.Man;
import com.zhong.entity.User;
import com.zhong.enums.BizEnum;
import javafx.util.Pair;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zzh
 * @version 1.0
 * @date 2021/8/5 16:44
 */
public class EmptyDemo {

	@Test
	public void test(){
		User user = User.builder().name("biden").build();
		System.out.println(user);
		int age = user.getAge();
		System.out.println(age);
		String name = user.getName();
		System.out.println(name);

	}



	@Test
	public void empty(){
		Man man = Man.builder().id(100).build();
		System.out.println(man.getId());
		System.out.println(man.getSex());
		Pair<BizEnum,BizEnum> pair = new Pair<>(BizEnum.female,man.getSex());

		System.out.println(pair);
	}

	@Test
	public void pair(){
	 	List<Pair<Integer,Integer>> list = Lists.newArrayList();
	 	list.add(new Pair<>(1,2));
		System.out.println(list);
		System.out.println(new Pair<>(1,2));
	}
}
