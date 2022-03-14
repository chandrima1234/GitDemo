
public class secondclass {
	
	public void setData() {
		System.out.println("I am in second class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="   javatraining"; // String Lateral
		String ab = new String("hello my student"); //with string class
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("e"));
		System.out.println(a.substring(3,6));
		System.out.println(a.substring(5));
		System.out.println(a.concat(" Rahul teaches"));
		System.out.println(a.length());
		System.out.println(a.trim()); //whitespace removed
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		String arr[]= ab.split("my");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replace("t", "es"));

	}

}
