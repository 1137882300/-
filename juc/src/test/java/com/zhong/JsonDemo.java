package com.zhong;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import com.zhong.entity.People;
import com.zhong.enums.BizEnum;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

/**
 * @author zzh
 * @version 1.0
 * @date 2021/7/2 10:54
 */
public class JsonDemo {

	private People people;

	@Before
	public void setPeople(){
		people = new People();
		people.setId(IdWorker.getId());
		people.setName("biden");
		people.setHigh(180);
		people.setSex(BizEnum.female);
		people.setDate(new Date());
	}

	@Test
	public void test(){
		String jsonString = JSONObject.toJSONString(people);
		System.out.println(jsonString);

//		People people = JSONObject.toJavaObject(JSONObject.parseObject(jsonString), this.people.getClass());
		People people = JSONObject.toJavaObject(JSONObject.parseObject(jsonString), People.class);
		System.out.println(people);
	}


}
