package com.bill.chapter.one;

import com.bill.std.utils.StdDraw;

/**
 * 这里包含了第一章的导言（介绍了一个求最大公约数的递归方法） 和第一节基础编程模型
 * 
 * 
 * @author Bill Lv
 *
 */
public class BasicModel {

	public static void main(String[] args) {

		int N = 1000;
		StdDraw.setXscale(0, N);
		StdDraw.setYscale(0, N * N);
		StdDraw.setPenRadius(0.01);
		for (int i = 0; i < N; i++) {
			StdDraw.point(i, i);
			StdDraw.point(i, i * i);
			StdDraw.point(i, i * Math.log(i));
		}

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
}
