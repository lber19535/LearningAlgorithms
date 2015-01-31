package com.bill.chapter.one;

import com.bill.std.utils.StdDraw;
import com.bill.std.utils.StdOut;

/**
 * 这里包含了第一章的导言（介绍了一个求最大公约数的递归方法） 和第一节基础编程模型
 * 
 * 
 * @author Bill Lv
 *
 */
public class BasicModel {

	public static void main(String[] args) {

		//StdOut.println(Math.abs(-2147483648));// int 溢出

		//StdOut.println(1 / 0); // 抛出被除数不能为0的异常
		//StdOut.println(1 / 0.0); // Infinity

		//fib(10);

		//StdOut.printf("%.5f\n", sqrt(8)); //2.82847
	}

	/*
	 * 最大公约数，欧几里得算法
	 */
	public static int gdc(int p, int q) {
		if (q == 0) {
			return p;
		} else {
			int r = p % q;
			return gdc(q, r);
		}

	}

	/*
	 * Ex 1.1.6
	 * 斐波那契数列
	 */
	public static void fib(int length) {
		int f = 0;
		int g = 1;
		for (int i = 0; i < length; i++) {
			StdOut.println(f);
			f = f + g;
			g = f - g;
		}

	}

	/*
	 * Ex 1.1.7 a
	 * 牛顿导出法开方
	 * 
	 * 由于
	 */
	public static double sqrt(double n) {
		StdDraw.setPenRadius(.01);
		StdDraw.setXscale(0, 10);
		StdDraw.setYscale(0, 10);
		double t = n;
		int i = 0;
		while (Math.abs(t - n / t) > .0001) { // 0.0001 精度  有些时候 精度要求越高 循环次数越多
			StdDraw.point(i++, t);
			t = (n / t + t) / 2.0; // 开2次方
		}
		return t;
	}

}
