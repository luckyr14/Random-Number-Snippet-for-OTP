package com.org.random.no.generator;

import java.util.Map;
import java.util.Random;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Rnumber implements RequestHandler<Map<String,Object>, Number>
{
	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	 public Number handleRequest(Map<String,Object> input, Context context)
	{
		int x = getRandomNumberInRange(1000, 9999);
		return x;
	}

}
