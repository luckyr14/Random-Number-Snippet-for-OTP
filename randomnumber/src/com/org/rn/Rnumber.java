package com.org.rn;

import java.util.Random;

public class Rnumber 
{
	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	public static void main(String[] args) 
	{
		int x = getRandomNumberInRange(1000, 9999);
		System.out.println(x);
	}

}
