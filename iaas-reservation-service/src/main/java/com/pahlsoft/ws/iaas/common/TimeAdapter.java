package com.pahlsoft.ws.iaas.common;

import java.util.Calendar;
import java.sql.Time;
import java.util.GregorianCalendar;

import javax.xml.bind.DatatypeConverter;

public class TimeAdapter {
	public static Time parseTime(String s) {
		return (Time) DatatypeConverter.parseTime(s).getTime();
	  }
	  public static String printTime(Time time) {
	    Calendar cal = new GregorianCalendar();
	    cal.setTime(time);
	    return DatatypeConverter.printTime(cal);
	  }
}
