import java.util.Random;

public class Pilandrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length=9 ,characters=3;
		boolean even=false;
		String s="";
		String newStrimgFront= "";
		String newStrimgBack= "";
		String Result= "";
		Random r = new Random();
		StringBuilder input1 = new StringBuilder();
		
		for(int i=0;i<characters;i++) {
			
			char c = (char)(r.nextInt(26) + 'a');
			s=s+c;
		}
		for(int i=0;i<length/2;i++) {
			int index = r.nextInt(s.length());
			newStrimgFront=newStrimgFront+s.charAt(index);
			
		}
		input1.append(newStrimgFront);
		
		if (length%2==0) {
			newStrimgBack= input1.reverse().toString();
			
		}
		else {
			newStrimgBack=""+s.charAt(r.nextInt(s.length()));
			newStrimgBack+= input1.reverse().toString();
			
		}
		
		Result=newStrimgFront+newStrimgBack;
		System.out.println(Result);

	}

}
