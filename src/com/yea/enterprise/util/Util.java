package com.yea.enterprise.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.xml.datatype.XMLGregorianCalendar;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.util.StringUtils;

public final class Util {
	public static <T> boolean isListEmpty(List<T> list) {
		boolean isEmpty=false;
		if(list==null||list.isEmpty()) {
			isEmpty= true;
		}
		return isEmpty;
	}
	public static <T> boolean isListEmpty(Object[] list) {
		boolean isEmpty=false;
		if(list==null||list.length == 0) {
			isEmpty= true;
		}
		return isEmpty;
	}
	public static <T> boolean isListEmpty(Set<T> list) {
		boolean isEmpty=false;
		if(list==null||list.isEmpty()) {
			isEmpty= true;
		}
		return isEmpty;
	}
	public static BigDecimal scale2(String input) {
		if (input == null) {
			return null;
		}
		try {
			return scale2(new BigDecimal(input.replace(',', '.')));
		} catch (Exception e) {
			return scale2(new BigDecimal(input.replace('.', ',')));
		}
	}

	public static BigDecimal scale2(BigDecimal input) {
		if (input == null) {
			return null;
		}
		return input.setScale(2, BigDecimal.ROUND_HALF_EVEN);
	}

	public static Long convertToLong(String input) {
		Long number = null;
		if (input != null) {
			number = Long.parseLong(input);
		}
		return number;

	}
	public static Date convertToDate(String dateStr, String format) {
		Date date = null;
		if (dateStr != null) {
			DateTimeFormatter formatter = DateTimeFormat.forPattern(format);
			DateTime dt = formatter.parseDateTime(dateStr);
			date = dt.toDate();
		}
		return date;
	}

	public static String convertToString(Date date, String format) {
		String dateStr = null;
		if (date != null) {
			DateTime dateTime = new DateTime(date);
			dateStr = dateTime.toString(format);
		}
		return dateStr;
	}

	public static Date addDay(Date date, int day) {
		if (date != null) {
			DateTime dateTime = new DateTime(date);
			dateTime = dateTime.plusDays(day);
			return dateTime.toDate();
		}
		return date;
	}

	public static Date subMonth(Date date, int months) {
		if (date != null) {
			DateTime dateTime = new DateTime(date);
			dateTime = dateTime.minusMonths(months);
			return dateTime.toDate();
		}
		return date;
	}

	public static String convertDateObjectToString(Object date, String format) {
		return convertToString((Date) date, format);
	}

	public static Date convertToDate(XMLGregorianCalendar calendar) {
		Date date = null;
		if (calendar != null) {
			date = calendar.toGregorianCalendar().getTime();
		}
		return date;
	}

	public static boolean isSameDay(Date date1, Date date2) {
		if (date1 == null || date2 == null) {
			throw new IllegalArgumentException("The date must not be null");
		}
		String dateStr1 = convertToString(date1, "ddMMyyy");
		String dateStr2 = convertToString(date2, "ddMMyyy");
		return dateStr1.equals(dateStr2);

	}
	public static String convertDecimalToString(BigDecimal value, String format) {
		if (value != null) {
			NumberFormat formatter = new DecimalFormat(format);
			String result = formatter.format(value);
			return result;
		}
		return null;
	}
}
