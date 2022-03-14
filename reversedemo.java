
public class reversedemo {

	public static void main(String[] args) {
		
	   String s= "Chandrima";
	   String pd ="madam";
	   String t="";
	   for(int i=pd.length()-1;i>=0;i--) {
		   t= t+ pd.charAt(i);
	    
	   }
	   System.out.println(t);
	   if(pd.equals(t)) {
		   System.out.println("they are palindrome");
	  
       }  
	 
	   for(int i=s.length()-1;i>=0;i--) {
		   System.out.println(s.charAt(i));
	   }


	}
}
