package com.zhong;

import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.HashMap;

/**
 * @author zzh
 * @version 1.0
 * @date 2021/8/10 14:22
 */
public class LongDemo {

	@Test
	public void long2Integer(){
		HashMap<Object, Object> map = Maps.newHashMap();

		map.put(1,12L);
		map.put(2,22L);
		map.put(3,32L);

		System.out.println(map);
		map.forEach((k,v) -> {
			System.out.println(v instanceof Long);
			System.out.println(v instanceof Integer);

		});


	}

}
