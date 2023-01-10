package org.methods5.methods;

public class AccessModifier {


	private final String privateName;

	protected String protectedName;
	public String publictry;

	String defaultName;

	public AccessModifier(String rotedtedNmee, String mame, String defaultName) {
		this.privateName = mame;
		this.defaultName = defaultName;
	}

	public static void main(String[] args) {
		var temp = new AccessModifier("protedtted", "dq", "default name");
		System.err.println(temp.privateName);
	}
}


class Deneme {


	public static void main(String[] args) {
		var temp = new AccessModifier("dq", "qwqw", "wedqw");
		System.err.println(temp.defaultName);
	}


}