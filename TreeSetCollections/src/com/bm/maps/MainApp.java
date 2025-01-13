package com.bm.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainApp {

	public static void main(String[] args) {

		Map<String, String> movie = new HashMap();

		movie.put("movieName", "Shawshank Redumption");
		movie.put("director", "Frank");
		movie.put("lead", "Shawshank Redumption");
		movie.put("supporing", "Morgan");
		movie.put("rating", "4.8");
//		movie.put("movieName", "Mysic River");

		System.out.println(movie.get("movieName"));

		movie.keySet();
	
	}

}
