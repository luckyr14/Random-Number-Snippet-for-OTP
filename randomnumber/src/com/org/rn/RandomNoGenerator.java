package com.org.rn;

import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class RandomNoGenerator implements RequestHandler<Map<String,Object>, String>
{
	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	public String handleRequest(Map<String,Object> input, Context context)
	{
		System.out.println("Input by user " + input.get(context));
//		String abc = (String)input.get(context);
//		String xyz = input.toString();
		
		Set<String> setCodes = input.keySet();
		Iterator<String> iterator = setCodes.iterator();
		String username = iterator.next();
	    String password = (String)input.get(username);
		
	    if(password.equalsIgnoreCase("singh") && username.equalsIgnoreCase("lakshman"))
	    {
	    	return "Success";
	    }
	    else
	    	return "Error";
//		int x = getRandomNumberInRange(1, 10);
//		return code + " " + country;
	}
}
