package com.serverless.mstar.domain;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SubjectCodes {

	private SubjectCodes() {
	}

	private static Set<String> validCodes = new HashSet<>();

	static {
		validCodes.addAll(Arrays.asList(new String[] { "NGDPD", "NGDPDPC", "BCA" }));

	}

	public static boolean isValidCode(String code) {
		return validCodes.contains(code);

	}

}
