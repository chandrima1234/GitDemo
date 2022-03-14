
public class childEmirates extends ParentAirCraft{
	public static void main(String[] args) {
		childEmirates ce = new childEmirates();
		ce.bodyColor();
		ce.engine();
		ce.safetyGuidelines();
		
		
	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Red color on the body");
	}
	
}
