package pruebas;

public class Hijo  implements Padre{

	
	public void hablar() {
		
		
		System.out.println("guar");
	}

	@Override
	public void alcanzar() {
		System.out.println("desde el jijo por interface");
		
	}

	@Override
	public void caminar() {
		// TODO Auto-generated method stub
		
	}


}
