package com.zhong;

import com.google.common.collect.Lists;
import com.zhong.entity.User;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author zzh
 * @version 1.0
 * @date 2021/6/2 15:57
 */
public class ToMapDemo {

	public static void main(String[] args) {

		User u1 = new User(10, 12, "mao",true, Lists.newArrayList());
		User u2 = new User(20, 20, "gou",true, Lists.newArrayList());
		User u3 = new User(30, 35, "ji",true, Lists.newArrayList());
		User u4 = new User(40, 68, "niao",true, Lists.newArrayList());
		User u5 = new User(10, 5, "chong",true, Lists.newArrayList());
		User u6 = new User(60, 25, "yu",true, Lists.newArrayList());
		User u7 = new User(10, 20, "hu",true, Lists.newArrayList());

		List<User> list = Arrays.asList(u1,u2,u3,u4,u5,u6,u7);


		Map<Integer, User> userMap = list.stream()
						.collect(Collectors.toMap(User::getId,q -> q, (k1, k2) -> k2)); //(k1, k2) -> k1 表示有冲突的key，就用第一个或者最后一个
		System.out.println(userMap);    ///q 表示每一个user对象


		Map<Integer, User> userMap2 = list.stream()
						.collect(Collectors.toMap(User::getId, Function.identity(), (k1, k2) -> k1)); //(k1, k2) -> k1 表示有冲突的key，就用第一个或者最后一个
		System.out.println(userMap2);    ///q 表示每一个user对象
		/**
		 * {
			 * 20=User(id=20, age=20, name=gou),
			 * 40=User(id=40, age=68, name=niao),
			 * 10=User(id=10, age=5, name=chong),
			 * 60=User(id=60, age=25, name=yu),
			 * 30=User(id=30, age=35, name=ji)
		 * }
		 */


		/**
		 * {
			 * 20=User(id=20, age=20, name=gou),
			 * 40=User(id=40, age=68, name=niao),
			 * 10=User(id=10, age=12, name=mao),
			 * 60=User(id=60, age=25, name=yu),
			 * 30=User(id=30, age=35, name=ji)
		 * }
		 */


		/**
		 * {
			 * 20=User(id=20, age=20, name=gou),
			 * 5 =User(id=5,  age=5,  name=chong),
			 * 40=User(id=40, age=68, name=niao),
			 * 10=User(id=10, age=12, name=mao),
			 * 60=User(id=60, age=25, name=yu),
			 * 30=User(id=30, age=35, name=ji)
		 * }
		 */

	}
}
