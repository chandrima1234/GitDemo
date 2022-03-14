
public class AustralianTraffic implements CentralTraffic, ContinentalTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic a = new AustralianTraffic(); 
		AustralianTraffic ab = new AustralianTraffic();
		ContinentalTraffic ct = new AustralianTraffic();
		a.redStop();
		a.greenGo();
		a.FlashYellow();
		ab.walkSymbol();
		ct.trainsymbol();
		
		
		
		
		

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Greenstop implemntation");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Redstop implemntation");
	}

	@Override
	public void FlashYellow() {
		// TODO Auto-generated method stub
		System.out.println("Flashyellow implemntation");
	}
    public void walkSymbol() {
    	System.out.println("Walking symbol");
    }

	@Override
	public void trainsymbol() {
		// TODO Auto-generated method stub
		System.out.println("Train Symbol");
	}
}
