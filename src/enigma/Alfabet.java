package enigma;

public class Alfabet {

	public String charset;
	public static final String ALPHA_UP_WITH_SPACE="ABCDEFGHIJKLMNOPRSTUWVXYZ ";
	public static final String ALPHA_WITH_SPACE="123456789 ";
	public static final String DIGITS="abcdefghijklmnoprstuwvxyz";
	public static final String ALL=ALPHA_UP_WITH_SPACE+ALPHA_WITH_SPACE+DIGITS;
	
	public Alfabet() {
		throw new IllegalArgumentException("Brak alfabetu");
	}

	public Alfabet(String charset) {
		this.charset = charset;
	}

	boolean isTextVaild(String text) {
		return text.matches("^[" + charset + "]+$");
	}

	public String getCharset() {
		return charset;
	}

	int indexOf(int ch) {
		return charset.indexOf(ch);
	}

	int length() {
		return charset.length();
	}

	int charAt(int ch) {
		return charset.charAt(ch);
	}
}
