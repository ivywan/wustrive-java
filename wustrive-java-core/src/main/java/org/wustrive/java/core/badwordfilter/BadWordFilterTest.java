package org.wustrive.java.core.badwordfilter;

public class BadWordFilterTest {
	public static void main(String[] args) {
		BadWordFilterService service = new BadWordFilterService();
		String str = service.replaceSensitiveWord("fdfd麻醉迷幻极品es哈沙河", 1, "*");
		System.out.println(str);
	}
}
