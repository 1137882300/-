package com.zhong;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.zhong.entity.Card;
import com.zhong.entity.InteractiveTaskCard;
import org.junit.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author zzh
 * @version 1.0
 * @date 2021/6/10 10:55
 */
public class MapDemo {


	public static void main(String[] args) {

		Map<Integer,String> map = new HashMap<>();
		map.put(1,"biden");
		map.put(2,"trump");
		map.put(3,"xi");
		map.put(4,"mao");

		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();// entryset获得的是键值对的集合
		System.out.println(entrySet);//  [1=biden, 2=trump, 3=xi, 4=mao]

		Set<Integer> keySet = map.keySet();// keySet获得的只是key值的集合
		System.out.println(keySet); // [1, 2, 3, 4]

		Collection<String> values = map.values();//	values获得的是value集合
		System.out.println(values);//[biden, trump, xi, mao]

	}
	@Test
	public void LinkedHashMap(){
		LinkedHashMap<Integer,String> map = Maps.newLinkedHashMap();
		map.put(1,"biden");
		map.put(2,"trump");
		map.put(3,"xi");
		map.put(4,"mao");

		System.out.println(map);
	}


	@Test
	public void identity(){
		Stream<String> stream = Stream.of("you","are","very","good");
		Map<String, Integer> map = stream.collect(Collectors.toMap(Function.identity(), String::length));
		System.out.println(map);//{very=4, are=3, good=4, you=3}
	}

	@Test
	public void identity2(){
		Stream<String> stream = Stream.of("you","are","very","good");
		Map<String, Integer> map = stream.collect(Collectors.toMap(q->q, String::length));
		System.out.println(map);//{very=4, are=3, good=4, you=3}
	}

	@Test
	public void twoMap(){
		HashMap<String, String> btn1 = Maps.newHashMap();
		btn1.put("key","yes");
		btn1.put("name","通过");
		btn1.put("color","blue");
		HashMap<String, String> btn2 = Maps.newHashMap();
		btn2.put("key","no");
		btn2.put("name","拒绝");
		btn2.put("color","blue");

		InteractiveTaskCard interactiveTaskCard = new InteractiveTaskCard();
		interactiveTaskCard.setTaskId(123L);
		interactiveTaskCard.setBtn(Lists.newArrayList(btn1,btn2));
		interactiveTaskCard.setTitle("title");
		interactiveTaskCard.setUrl("url");
		interactiveTaskCard.setDescription("description");

		Card card = Card.builder()
						.agentId("agentid").touser(Lists.newArrayList("user1","user2"))
						.msgtype("mstype")
						.interactiveTaskCard(interactiveTaskCard)
						.build();

		System.out.println(JSON.toJSON(card));

	}


}
