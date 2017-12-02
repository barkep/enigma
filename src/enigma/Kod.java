package enigma;

public class Kod {

	public static void main(String[] args) {

		long now1=System.currentTimeMillis();
		String alfabet2="ABCDEFGHIJKLMNOPRSTUWVXYZ";
		String in1 = "ABC";
		for(int i=1;i<10;i++) {
			in1=in1+"A";
		}
		char[] out1 = in1.toCharArray();
		char[] alfabet1=alfabet2.toCharArray();

		for (int i = 0; i < out1.length; i++) {
			for (int x = 0; i < alfabet1.length; x++) {
				if(out1[i]==alfabet1[x]) {
					out1[i]=alfabet1[x+1]; 
				}
			}
		}
		System.out.println("czas wykonania: "+(System.currentTimeMillis()-now1));
		System.out.println("------------------------------------------");

		long now=System.currentTimeMillis();
		
		String alfabet="ABCDEFGHIJKLMNOPRSTUWVXYZ";
		String in2 = "ZBC";
		for(int i=1;i<5000;i++) {
			in2=in2+"A";
		}
		StringBuilder out2 = new StringBuilder();
		for (int i = 1, len = in2.length(); i < len; i++) {
			
			int ch = in2.charAt(i);
			int idx=alfabet.indexOf(ch);
			idx=(idx+1)%alfabet.length();
			ch=alfabet.charAt(idx);
			out2.append((char)ch);
		}
		System.out.println("czas wykonania: "+(System.currentTimeMillis()-now));
	}

}
