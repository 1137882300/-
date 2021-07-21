package com.zhong;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.google.common.collect.Lists;
import com.zhong.entity.User;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


/**
 * @author zzh
 * @version 1.0
 * @date 2021/6/16 16:28
 */
public class LambdaDemo {

	User user = new User();

	@Before
	public void init(){
		User u1 = new User(11, 1, "mao",true, Lists.newArrayList());
		User u2 = new User(44, 4, "gou",true, Lists.newArrayList());
		User u3 = new User(33, 3, "ji",true, Lists.newArrayList());
		User u8 = new User(55, 8, "haha",true, Lists.newArrayList());
		User u4 = new User(55, 5, "niao",true, Lists.newArrayList());
		User u5 = new User(22, 2, "chong",true, Lists.newArrayList());
		User u6 = new User(66, 6, "yu",true, Lists.newArrayList());
		User u7 = new User(66, 7, "yu",true, Lists.newArrayList());

		List<User> list = Arrays.asList(u1,u2,u3,u4,u5,u6,u7,u8);
	}

	@Test
	public void emptyList(){ //不用报错
		List<User> list = Lists.newArrayList();
		System.out.println(list);
		List<Integer> collect = list.stream().map(User::getId).collect(Collectors.toList());
		System.out.println(collect);

		User user = new User();
		user.setUserList(list);
		System.out.println(user);

	}

	@Test
	public void sort(){
		User u1 = new User(11, 1, "mao",true, Lists.newArrayList());
		User u2 = new User(44, 4, "gou",true, Lists.newArrayList());
		User u3 = new User(33, 3, "ji",true, Lists.newArrayList());
		User u8 = new User(55, 8, "haha",true, Lists.newArrayList());
		User u4 = new User(55, 5, "niao",true, Lists.newArrayList());
		User u5 = new User(22, 2, "chong",true, Lists.newArrayList());
		User u6 = new User(66, 6, "yu",true, Lists.newArrayList());
		User u7 = new User(66, 7, "yu",true, Lists.newArrayList());

		List<User> list = Arrays.asList(u1,u2,u3,u4,u5,u6,u7,u8);

		List<Integer> collect = list.stream()
						.sorted(Comparator.comparing(User::getAge).reversed())
						.map(User::getId)
						.distinct()
						.collect(Collectors.toList());
		System.out.println(collect);

//-----------------------------------

		List<User> users = list.stream()
						.collect(Collectors.collectingAndThen(Collectors.toCollection(()-> new TreeSet<> (Comparator.comparing(User::getId))), ArrayList::new));
		users.stream().forEach(System.out::println);

		System.out.println("--------------------------");

		//排序+去重+集合
		List<User> userList = list.stream().sorted((h1, h2) -> h2.getAge() - h1.getAge())
						.filter(distinctById(User::getId))
						.collect(Collectors.toList());
	 	userList.stream().forEach(System.out::println);

	}
	//自定义去重
	public static <T> Predicate<T> distinctById(Function<? super T, ?> keyExtractor) {
		Set<Object> seen = ConcurrentHashMap.newKeySet();
		return t -> seen.add(keyExtractor.apply(t));
	}


	@Test
	public void distinct(){
		List<Long> list = Lists.newArrayList(1410564459263741954L,						1410564459263741958L,						1410564459263741955L,						1410564459263741957L,						1410564459263741956L,						1410564458944974850L,						1410564459263741959L,			1410564459263741960L,						1410564459263741961L,						1410562700940201986L,						1410562700940201990L,						1410562700940201987L,						1410562700940201989L,						1410562700940201988L,						1410562700499800066L,						1410562700940201991L,						1410562700940201992L,						1410562700940201993L,						1410510238514466817L,						1410510238841622529L,						1410510238837428226L,						1410510238837428228L,						1410510238837428227L,						1410510238841622533L,						1410510238841622530L,						1410532767081746433L,						1410510238841622531L,						1410510238841622532L,						1410532896346001410L,						1410532896346001409L,						1410532896245338114L,						1410494321319530498L,						1410494321776709637L,						1410494321776709634L,					1410494321776709636L,						1410494321776709635L,				1410494321776709641L,						1410494321776709638L,						1410494321776709639L,						1410494321776709640L,						1410442130683633665L,						1410442130994012164L,						1410442130994012161L,						1410442130994012163L,						1410442130994012162L,						1410442130994012168L,						1410442130994012165L,						1410442130994012166L,						1410442130994012167L,					1410437935754682369L,						1410437935754682373L,						1410437935754682370L,					1410437935754682372L,					1410437935754682371L,					1410437935444303874L,						1410437935754682374L,						1410437935754682375L,												1397401560874487809L,												1397401560874487810L,						1397401560874487813L,						1397401560874487812L,											1410430905354592266L,						1397401560526360578L,						1399931766099451914L,						1410430903026753547L,						1405445104236208130L,						1395289634482860038L,						1395289474512105481L,						1395293322714722311L,						1395289472385593353L,						1391674994425839617L,						1395293324237254663L,						1410430905354592265L,						1397435334244962315L,						1399931766099451913L,						1410430903026753546L);
		List<Long> collect = list.stream().distinct().collect(Collectors.toList());
		System.out.println(collect.size());
	}

	@Test
	public void tst(){
		User u1 = new User(11, 1, "mao",true, Lists.newArrayList());
		User u2 = new User(44, 4, "gou",true, Lists.newArrayList());
		User u3 = new User(33, 3, "ji",true, Lists.newArrayList());
		User u8 = new User(55, 8, "haha",true, Lists.newArrayList());
		User u4 = new User(55, 5, "niao",true, Lists.newArrayList());
		User u5 = new User(22, 2, "chong",true, Lists.newArrayList());
		User u6 = new User(66, 6, "yu",true, Lists.newArrayList());
		User u7 = new User(66, 7, "yu",true, Lists.newArrayList());

		List<User> list = Arrays.asList(u1,u2,u3,u4,u5,u6,u7,u8);


		list.forEach(s ->{
			s.setAge(1111111);
		});
		System.out.println(list);
	}


	@Test
	public void empty(){
		List<User> userList = null;
		if (CollectionUtils.isNotEmpty(userList)){
			userList.forEach(s ->{
				s.setName("111");
			});
			System.out.println(userList);
		}
	 	List<Integer> ids = Lists.newArrayList(1, 2, 3, 4, 6, 7, 9);
		Integer id = null;
		List<Integer> collect = ids.stream().filter(s -> !s.equals(id)).collect(Collectors.toList());
		System.out.println(collect);

	}



}
