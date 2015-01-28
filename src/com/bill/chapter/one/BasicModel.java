package com.bill.chapter.one;

/**
 * 这里包含了第一章的导言（介绍了一个求最大公约数的递归方法）
 * 和第一节基础编程模型
 * 
 * 
 * @author Bill Lv
 *
 */
public class BasicModel {
	
	public static void main(String[] args) {
		
		System.out.println(gdc(24, 32));	//8
	}
	
	/*
	 * 最大公约数，欧几里得算法
	 */
	public static int gdc(int p, int q){
		if (q == 0) {
			return p;
		}else {
			int r = p % q;
			return gdc(q, r);
		}
		
	}
}
