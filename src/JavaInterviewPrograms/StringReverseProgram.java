package JavaInterviewPrograms;

public class StringReverseProgram {

	public static void main(String[] args) {

		String s= "Anilteja";
		String rev=" ";
		
	int len =s.length();
	
	        for(int i=len-1;i>=0;i--) {
	        	rev=rev+s.charAt(i);
	        }
	        System.out.println("Reversed string is :"+rev);
	
	
	//another method
	String str = "hello";
	StringBuffer a = new StringBuffer(str);
	System.out.println(a.reverse());
	}

}
