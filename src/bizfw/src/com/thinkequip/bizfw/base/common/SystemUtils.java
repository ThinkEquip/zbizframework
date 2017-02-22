package com.thinkequip.bizfw.base.common;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SystemUtils {
	
	public static void main(String[] args) {
		String a = encryptMD5("aa");
		System.out.println(a);
	}

	public static String encryptMD5(String password) {
		char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		try {
			MessageDigest mdInst = MessageDigest.getInstance("MD5");
			byte[] passwordInput = password.getBytes();
			mdInst.update(passwordInput);
			byte[] md = mdInst.digest();
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(str);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return null;
	}
}
