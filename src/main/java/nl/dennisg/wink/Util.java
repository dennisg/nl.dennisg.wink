package nl.dennisg.wink;


import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.google.gson.Gson;

public class Util {

	private Util() {}
	
	public static final ThreadLocal<Gson> gson = new ThreadLocal<Gson>() {
		protected Gson initialValue() { return new Gson(); };
	};
	

	public static final ThreadLocal<DateFormat> df = new ThreadLocal<DateFormat>() {
		protected DateFormat initialValue() { return new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSZ"); };
	};

}
