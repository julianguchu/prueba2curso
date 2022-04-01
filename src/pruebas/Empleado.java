package pruebas;

public class Empleado  extends Persona implements Comparable<Empleado> {

	
	private  Integer id;
	private String nombre;
	public Integer getId() {
		return id;
	}
	


	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Empleado() {
		
	}
	public Empleado(Integer id, String nombre) {
	
		this.id = id;
		this.nombre = nombre;
	}
	@Override
	public int compareTo(Empleado o) {
		if(this.id==o.getId()) {return this.getNombre().compareTo(o.getNombre());}
		else if (o.getId()<id) 
		{return 1;}
		else {return -1;}
		
	}
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
}
