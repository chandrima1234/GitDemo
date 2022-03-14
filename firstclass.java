
public class firstclass {
	int a =5;
	public int GetData() //execute block of code in a page
	{
		
		System.out.println("I am in method");
		return 2;
	}
	public static void main(String[] args)
		{
		     firstclass  fn= new firstclass(); //object of the class
			System.out.println("I am in main block");
			fn.GetData();
			System.out.println(fn.a);
			secondclass sn = new secondclass();
			sn.setData();
		}
	
}
