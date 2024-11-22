package Lb4;

public class makeFancy {
	public static String makeFancyString(String s) {
		/** A fancy string is a string where no three consecutive characters are
		equal.
		* Given a string s, delete the minimum possible number of characters from
		s to make it fancy.
		* Return the final string after the deletion. It can be shown that the
		answer will always be unique.
		*/
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char thisChar = s.charAt(i);
			if (i == 0) {
				sb.append(thisChar);
			} else {
				char lastChar = sb.charAt(sb.length() - 1);
				char lastLastChar = sb.length() >= 2 ? sb.charAt(sb.length() - 2) : ' ';
				if (lastChar != thisChar && lastLastChar != thisChar) {
					sb.append(thisChar);
				}
			}
		}
		return sb.toString();
	}
	
	public static String mut1(String s) {
		StringBuilder sb = new StringBuilder("a");
		for (int i = 0; i < s.length(); i++) {
			char thisChar = s.charAt(i);
			if (i == 0) {
				sb.append(thisChar);
			} else {
				char lastChar = sb.charAt(sb.length() - 1);
				char lastLastChar = sb.length() >= 2 ? sb.charAt(sb.length() - 2) : ' ';
				if (lastChar != thisChar && lastLastChar != thisChar) {
					sb.append(thisChar);
				}
			}
		}
		return sb.toString();
	}
	
	public static String mut2(String s) {
		StringBuilder sb = new StringBuilder();
        for (int i = 0; /******/i < 1/******/; i++) {
			char thisChar = s.charAt(i);
			if (i == 0) {
				sb.append(thisChar);
			} else {
				char lastChar = sb.charAt(sb.length() - 1);
				char lastLastChar = sb.length() >= 2 ? sb.charAt(sb.length() - 2) : ' ';
				if (lastChar != thisChar && lastLastChar != thisChar) {
					sb.append(thisChar);
				}
			}
		}
		return sb.toString();
	}
	
	public static String mut3(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
	/******/char thisChar = s.charAt(i+1);/******/
			if (i == 0) {
				sb.append(thisChar);
			} else {
				char lastChar = sb.charAt(sb.length() - 1);
				char lastLastChar = sb.length() >= 2 ? sb.charAt(sb.length() - 2) : ' ';
				if (lastChar != thisChar && lastLastChar != thisChar) {
					sb.append(thisChar);
				}
			}
		}
		return sb.toString();
	}
	
	public static String mut4(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char thisChar = s.charAt(i);
	/******/if (i != 0) {/******/
				sb.append(thisChar);
			} else {
				char lastChar = sb.charAt(sb.length() - 1);
				char lastLastChar = sb.length() >= 2 ? sb.charAt(sb.length() - 2) : ' ';
				if (lastChar != thisChar && lastLastChar != thisChar) {
					sb.append(thisChar);
				}
			}
		}
		return sb.toString();
	}
	
	public static String mut5(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char thisChar = s.charAt(i);
			if (i == 0) {
		/******/sb.append(s.charAt(i+1));/******/
			} else {
				char lastChar = sb.charAt(sb.length() - 1);
				char lastLastChar = sb.length() >= 2 ? sb.charAt(sb.length() - 2) : ' ';
				if (lastChar != thisChar && lastLastChar != thisChar) {
					sb.append(thisChar);
				}
			}
		}
		return sb.toString();
	}
	
	public static String mut6(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char thisChar = s.charAt(i);
			if (i == 0) {
				sb.append(thisChar);
			} /******/else if(i == 1){/******/
				char lastChar = sb.charAt(sb.length() - 1);
				char lastLastChar = sb.length() >= 2 ? sb.charAt(sb.length() - 2) : ' ';
				if (lastChar != thisChar && lastLastChar != thisChar) {
					sb.append(thisChar);
				}
			}
		}
		return sb.toString();
	}
	
	public static String mut7(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char thisChar = s.charAt(i);
			if (i == 0) {
				sb.append(thisChar);
			} else {
		/******/char lastChar = sb.charAt(sb.length());/******/
				char lastLastChar = sb.length() >= 2 ? sb.charAt(sb.length() - 2) : ' ';
				if (lastChar != thisChar && lastLastChar != thisChar) {
					sb.append(thisChar);
				}
			}
		}
		return sb.toString();
	}
	
	public static String mut8(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char thisChar = s.charAt(i);
			if (i == 0) {
				sb.append(thisChar);
			} else {
				char lastChar = sb.charAt(sb.length() - 1);
		/******/char lastLastChar = sb.length() <= 2 ? sb.charAt(sb.length() - 2) : ' ';/******/
				if (lastChar != thisChar && lastLastChar != thisChar) {
					sb.append(thisChar);
				}
			}
		}
		return sb.toString();
	}
	
	//The golden child mutant
	public static String mut9(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char thisChar = s.charAt(i);
			if (i == 0) {
				sb.append(thisChar);
			} else {
				char lastChar = sb.charAt(sb.length() - 1);
				char lastLastChar = sb.length() >= 2 ? sb.charAt(sb.length() - 2) : ' ';
		/******/if (lastChar != thisChar || lastLastChar != thisChar) {/******/
					sb.append(thisChar);
				}
			}
		}
		return sb.toString();
	}
	
	public static String mut10(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char thisChar = s.charAt(i);
			if (i == 0) {
				sb.append(thisChar);
			} else {
				char lastChar = sb.charAt(sb.length() - 1);
				char lastLastChar = sb.length() >= 2 ? sb.charAt(sb.length() - 2) : ' ';
				if (lastChar != thisChar && lastLastChar != thisChar) {
				/******/sb.append(lastChar);/******/
				}
			}
		}
		return sb.toString();
	}
	
	public static String mut11(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char thisChar = s.charAt(i);
			if (i == 0) {
				sb.append(thisChar);
			} else {
				char lastChar = sb.charAt(sb.length() - 1);
				char lastLastChar = sb.length() >= 2 ? sb.charAt(sb.length() - 2) : ' ';
				if (lastChar != thisChar && lastLastChar != thisChar) {
					sb.append(thisChar);
				}
			}
		}
/******/return "";/******/
	}
}


