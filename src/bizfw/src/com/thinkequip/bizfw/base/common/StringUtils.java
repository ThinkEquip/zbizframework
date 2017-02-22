package com.thinkequip.bizfw.base.common;

public class StringUtils {

	public static boolean isNotEmpty(String str) {
		if (str == null || "".equals(str)) {
			return false;
		}
		return true;
	}
}
