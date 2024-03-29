package enigma;

public class Cipher {

	private Alfabet alfabet;
	private int key;

	String ecnrypt(String a) {

		if (a == null) {
			throw new IllegalArgumentException("Brak tekstu do szyfrowania");
		}

		if (!alfabet.isTextVaild(a)) {
			throw new IllegalArgumentException("Tekst zawiera znaki spoza alfabetu");
		}

		String in = a;
		StringBuilder out = new StringBuilder();
		for (int i = 0, len = in.length(); i < len; ++i) {

			int ch = in.charAt(i);
			int idx = alfabet.indexOf(ch);
			idx = (idx + 1) % alfabet.length();
			ch = alfabet.charAt(idx);
			out.append((char) ch);
		}
		return out.toString();
	}

	void setKey(int key) {
		this.key = key;
	}

	public void setAlfabet(Alfabet alfabet) {
		this.alfabet = alfabet;
	}

}
