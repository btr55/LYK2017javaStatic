package tr.org.linux.kamp.staticEx;

public class StaticEx {
	
	public static String myStaticString=("BU BİR STATİK STRİNG");
	public static String myStaticStringMethod() {
		
		return "BU BİR STATİK metod";
	
	}

	static {
		System.out.println("Bu bir static blok");
	}
	
	static {
		
		System.out.println("bu da bir static blok");
	}
	
	static {
		System.out.println("bu da üçüncü static blok");
	}
}
