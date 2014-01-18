package mpr.lect.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.commons.lang3.StringUtils;

public class Main {

	static Logger log = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		log.info("No to obliczamy:");
		String s = bjutifaj("AQQ");
		System.out.println(s);
	}

	private static String bjutifaj(String s) {
		String res = StringUtils.repeat("*", s.length() + 4) + "\n";
		return res + "* " + s + " *\n" + res;
	}
}