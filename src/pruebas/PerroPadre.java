package pruebas;

public class PerroPadre {
	private static int v=0;
	
	public void ladrarPadre() {
		
		
		System.out.println("GUARRRR PADRE");
	}

	public static int getV() {
		return v;
	}

	public static void setV(int v) {
		PerroPadre.v = v;
	}

}
