package enigma;

public class Kod {

	public static void main(String[] args) {

		Alfabet alf = new Alfabet(Alfabet.ALL);
		Cipher test = new Cipher();
		String in = "asdsadfsaf";
		test.setAlfabet(alf);
		String out = test.ecnrypt(in);
		System.out.println("Tekst szyfrowany: " + in);
		System.out.println("Tekst zaszyfrOwany: " + out);
	}

}

// * long now1=System.currentTimeMillis(); String
// * alfabet2="ABCDEFGHIJKLMNOPRSTUWVXYZ"; String in1 = "ABC"; for(int
// * i=1;i<10;i++) { in1=in1+"A"; } char[] out1 = in1.toCharArray(); char[]
// * alfabet1=alfabet2.toCharArray();
// *
// * for (int i = 0; i < out1.length; i++) { for (int x = 0; i <
// alfabet1.length;
// * x++) { if(out1[i]==alfabet1[x]) { out1[i]=alfabet1[x+1]; } } }
// * System.out.println("czas wykonania: "+(System.currentTimeMillis()-now1));
// * System.out.println("------------------------------------------");