package com.zhong;

import com.google.common.collect.*;
import org.junit.Test;

import java.util.*;

/**
 * @author zzh
 * @version 1.0
 * @date 2021/7/20 18:14
 */
public class GuavaDemo {


	@Test
	public void reverse(){
//		List<String> list = Lists.newArrayList();
		List<Integer> list = Lists.newArrayList(1, 2, 3);
		// 反转list
		List<Integer> reverse = Lists.reverse(list);
		System.out.println(reverse); // 输出 [3, 2, 1]
		// list集合元素太多，可以分成若干个集合，每个集合10个元素
		List<List<Integer>> partition = Lists.partition(list, 1);
		System.out.println(partition);

		Map<String, String> map = Maps.newHashMap();
		Set<Map.Entry<String, String>> entries = map.entrySet();

		Set<String> set = Sets.newHashSet();
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		Iterator<String> iterator = set.stream().iterator();
		System.out.println(iterator.next());
		Spliterator<String> spliterator = set.stream().spliterator();
		System.out.println(spliterator.estimateSize());
	}


	/**
	 * 	Multimap 一个key可以映射多个value的HashMap
	 */
	@Test
	public void Multimap(){
		Multimap<String, Integer> map = ArrayListMultimap.create();
		map.put("key", 1);
		map.put("key", 2);
		Collection<Integer> values = map.get("key");
		System.out.println(map); // 输出 {"key":[1,2]}
// 还能返回你以前使用的臃肿的Map
		Map<String, Collection<Integer>> collectionMap = map.asMap();
		System.out.println(collectionMap);
	}

	/**
	 * BiMap 一种连value也不能重复的HashMap
	 * 这其实是双向映射，在某些场景还是很实用的。
	 */
	@Test
	public void BiMap(){
		BiMap<String, String> biMap = HashBiMap.create();
// 如果value重复，put方法会抛异常，除非用forcePut方法
		biMap.put("key","value");
		System.out.println(biMap); // 输出 {"key":"value"}
// 既然value不能重复，何不实现个翻转key/value的方法，已经有了
		BiMap<String, String> inverse = biMap.inverse();
		System.out.println(inverse); // 输出 {"value":"key"}
	}

	/**
	 *  Table 一种有两个key的HashMap
	 */
	@Test
	public void Table(){
// 一批用户，同时按年龄和性别分组
		Table<Integer, String, String> table = HashBasedTable.create();
		table.put(18, "男", "yideng");
		table.put(18, "女", "Lily");
		System.out.println(table.get(18, "男")); // 输出 yideng
// 这其实是一个二维的Map，可以查看行数据
		Map<String, String> row = table.row(18);
		System.out.println(row); // 输出 {"男":"yideng","女":"Lily"}
// 查看列数据
		Map<Integer, String> column = table.column("男");
		System.out.println(column); // 输出 {18:"yideng"}
	}

	/**
	 * Multiset 一种用来计数的Set
	 */
	@Test
	public void Multiset(){
		Multiset<String> multiset = HashMultiset.create();
		multiset.add("apple");
		multiset.add("apple");
		multiset.add("orange");
		System.out.println(multiset.count("apple")); // 输出 2
// 查看去重的元素
		Set<String> set = multiset.elementSet();
		System.out.println(set); // 输出 ["orange","apple"]
// 还能查看没有去重的元素
		Iterator<String> iterator = multiset.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
// 还能手动设置某个元素出现的次数
		multiset.setCount("apple", 5);
		System.out.println(multiset);
		
	}


}
