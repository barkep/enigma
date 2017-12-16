package enigma;

public class Alfabet {

	public String charset;
	public static final String ALPHA_UP_WITH_SPACE = "ABCDEFGHIJKLMNOPRSTUWVXYZ ";
	public static final String ALPHA_WITH_SPACE = "123456789 ";
	public static final String DIGITS = "abcdefghijklmnoprstuwvxyz";
	public static final String ALL = ALPHA_UP_WITH_SPACE + ALPHA_WITH_SPACE + DIGITS;
	private int length;

	public Alfabet() {
		throw new IllegalArgumentException("Brak alfabetu");
	}

	public Alfabet(String charset) {
		if(charset==null || charset.isEmpty()) {
			throw new IllegalArgumentException("Brak alfabetu");
		}
		this.charset = charset;
		this.length = charset.length();
	}

	boolean isTextVaild(String text) {
		return text.matches("^[" + charset + "]+$");
	}

	public String getCharset() {
		return charset;
	}

	int indexOf(int ch) {
		int i = charset.indexOf(ch);
		if (i==-1) {
			throw new IllegalArgumentException("Znak spoza alfabetu");
		}
		return i; 
	}

	int length() {
		return length;
	}

	int charAt(int ch) {
		if (ch < 0) {
			return charset.charAt((length + ch % length) % length());
		}
		return charset.charAt(ch % charset.length());
	}
}
