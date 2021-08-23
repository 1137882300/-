package com.zhong.test;

/**
 * @author zzh
 * @version 1.0
 * @date 2021/8/23 11:26
 */
public class HasStatic {

	private static  int x = 100;

	public static void main(String[] args) {
		HasStatic hs1 = new HasStatic();
		hs1.x++;
		HasStatic hs2 = new HasStatic();
		hs2.x++;
		hs1 = new HasStatic();
		hs1.x++;
		HasStatic.x--;
		System.out.println(x);

	}


}
