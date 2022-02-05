package practice;

class MethodOverriding_Bank {
	int GetRateOfInterest() {
		return 0;
	}
}

class SBI extends MethodOverriding_Bank{
	int GetRateOfInterest() {
		return 8;
	}
}

class ICICI extends MethodOverriding_Bank{
	int GetRateOfInterest() {
		return 7;
	}
}

class HDFC extends MethodOverriding_Bank{
	int GetRateOfInterest() {
		return 10;
	}
}

class Test2{

	public static void main(String[] args) {
		
		SBI s = new SBI();
		ICICI i =new ICICI();
		HDFC h = new HDFC();
		
		System.out.println("SBI Rate of Interest: "+s.GetRateOfInterest()+"%");
		System.out.println("ICICI Rate of Interest: "+i.GetRateOfInterest()+"%");
		System.out.println("HDFC Rate of Interest: "+h.GetRateOfInterest()+"%");

	}

}
