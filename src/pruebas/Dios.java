package pruebas;

public class Dios implements  Abuelo {
	
	
	public void omnipresencia() {}
	public String direccion() { System.out.println("desde abuelo");return "ss";}
	@Override
	public void alcanzar() {
		System.out.println("dsde  dios  overwritting");
		
	}
}
