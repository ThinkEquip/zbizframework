package com.thinkequip.bizfw.base.common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public static String getDateStr() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(new Date());
	}
}
