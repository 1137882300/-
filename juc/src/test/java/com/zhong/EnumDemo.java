package com.zhong;

import com.zhong.enums.SortTypeEnum;
import org.junit.Test;

/**
 * @author zzh
 * @version 1.0
 * @date 2021/6/19 11:40
 */
public class EnumDemo {

	@Test
	public void test(){
		SortTypeEnum[] values = SortTypeEnum.values();
		System.out.println(values);

		SortTypeEnum asc = SortTypeEnum.fromOrder("DESC");
		System.out.println(asc);
	}

	@Test
	public void test2(){
		System.out.println(SortTypeEnum.SORT_DESC.getOrder());

		System.out.println(SortTypeEnum.values());//有注解
		// [Lcom.zhong.SortTypeEnum;@45fe3ee3
		// [Lcom.zhong.SortTypeEnum;@45fe3ee3


	}

}
