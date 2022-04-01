package pruebas;

import java.rmi.server.Operation;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Currency;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Principal {
	//comentario desde ramaprueba2curso
	static String[] myArray = { "a", "b", "c", "d", "d", "c", "b", "b" };
	static int n = 8;
	static int A[] = { 5, 2, 0, 1, 6, 4, 8, 3, 7 };
	static String mensaje[] = { "c", "d", "e", "e", "n", "e", "t", "p", "i" };
	static String decodificado[] = new String[mensaje.length];

	static boolean comprobarIp(String ip) {
		boolean bandera = false;
		String[] ipfragmentada = ip.split("\\W.");

		for (String s : ipfragmentada) {
			try {

				Integer conversion = Integer.parseInt(s);

				if (conversion >= 0 && conversion <= 255) {

					bandera = true;

				}

			}

			catch (Exception e) {

				bandera = false;
				break;
			}

		}

		return bandera;
	}

	
	public static  void prubainterfaceComoHerencia(Abuelo a ) {
		while(a.getClass().getSuperclass() != null) {
			
			System.out.println("esta es mi clase:"+ a.getClass()+ "esta es mi superclase"+ a.getClass().getSuperclass());
			
		}
		
		a.alcanzar();
		
	}	
	
	
	public static void main(String[] args) {
		List<Integer> d =Arrays.asList(1,2,4,5,66);
		
	Stream<List<Integer>> listaIntegers= Stream.of(d);  
	Stream<Integer>dddddd=d.stream();

		
		
		List<String>  numerosStringseados = Arrays.asList("1","no","3","no","5");
		
		
		numerosStringseados.stream().map( jj ->{
			
			
		try {
			return  Integer.parseInt(jj);	
		} catch (Exception e) {
			return  -1;	
		}
	
		}).forEach(System.out::println);
		
		System.out.println("--------------------------------------------------------");
		List<Integer> listanumeros=  Arrays.asList(1,2,4,5,6,7);
		Integer opcional=listanumeros.stream().peek(System.out::println).map(numero -> numero*2).peek(System.out::println).filter(num -> num==10).findFirst().get();
		
		System.out.println(PerroPadre.getV());
		
		PerroPadre perropadre= new PerroHijo();
		perropadre.ladrarPadre();
		//deberia imprimir solo uno, guarrr padre
		PerroPadre perrop = new Perrin();
		perrop.ladrarPadre();
		// solo el del padre  guarr padre
		Perrin perr= new Perrin();
		perr.ladrarHijo();
		perr.ladrarPerrin();
		perr.ladrarPadre();
		//los tres
		PerroHijo perrohijo = new Perrin();
		perrohijo.ladrarHijo();
		// 2 perropadre guarr padre  y guarr hijo
		
	
		
		
		
		
		 List<Dios> listaDisoses = new ArrayList<Dios>();
		 listaDisoses.add(new Persona());
		 listaDisoses.add(new Persona());
		 
		
		 listaDisoses.forEach(e->{
			System.out.println( e.direccion());
		 });
		 
		
		//prubainterfaceComoHerencia(new Hijo());
	
		
		Scanner  entradas = new Scanner(System.in);
		try {Integer entrada1=entradas.nextInt();
		Integer entrada2= entradas.nextInt();
		
		System.out.println(entrada1/entrada2);
			
		} catch (InputMismatchException e) {
			System.out.println((e.getClass()).toString().replace("class ", ""));
		}
		catch (ArithmeticException e) {
			System.out.println((e.getClass()).toString().replace("class ", "")+ ":"+e.getMessage());
		}
		
		
		Dios dddd= new Empleado();
		dddd.direccion();
		
		
		
		 String hhhh= new String("p");
		 String hhhhh= new String("p");
		 System.out.println(hhhh.equals(hhhhh)? true:false);
		
		List <Integer> listados =  Arrays.asList(Integer.valueOf(2), Integer.valueOf(3),Integer.valueOf(4), Integer.valueOf(21),Integer.valueOf(22));
		
		Iterator<Integer>  it=  listados.iterator();
		
		while(it.hasNext()) {
			
			Integer  numero= (Integer)  it.next();
			if(numero.equals(3)) {
				
				break;
				
			}
			
		}
		while(it.hasNext()) {
			Integer  numero1= (Integer)  it.next();
		System.out.println(numero1);
		}
		 System.out.println(NumberFormat.getCurrencyInstance().format(12323.232));
		
		
		int [] numerosPrimitivos= new  int[] {1,2,4,5,6,7};
		IntStream  s =IntStream.of(numerosPrimitivos);
		Stream<Integer> hhh =s.boxed();
		
	
		
		Empleado e1= new Empleado(1, "Pedro");
		Empleado e2= new Empleado(2, "Indira");
		Empleado e3= new Empleado(222, "Carlos");
		Empleado e4= new Empleado(111, "Juan");
		Empleado e5= new Empleado(111, "Endira");
		List<Empleado> listaEmpleado=  new ArrayList<>();
		listaEmpleado.add(e1);
		listaEmpleado.add(e2);
		listaEmpleado.add(e3);
		listaEmpleado.add(e4);
		listaEmpleado.add(e5);
		Collections.sort(listaEmpleado);
		listaEmpleado.forEach(System.out::println);
		
		Lamba l= num -> {
			boolean isPalindrom = false;
			String stringNumber = String.valueOf(num);
			String[] arraySplitNumber = stringNumber.split("");
			for (int i = 0; i < arraySplitNumber.length; i++) {
				if (i == (arraySplitNumber.length) - 1 - i) {
					if (arraySplitNumber[i].equals(arraySplitNumber[(arraySplitNumber.length) - 1 - i])) {
						isPalindrom = true;
						break;
					}

				}
				if (arraySplitNumber[i].equals(arraySplitNumber[(arraySplitNumber.length) - 1 - i])) {
					isPalindrom = true;
				} else if (!arraySplitNumber[i].equals(arraySplitNumber[(arraySplitNumber.length) - 1 - i])) {
					isPalindrom = false;
					break;

				}
				

			}
			return isPalindrom;
		};
	

	List<Integer> lista = new ArrayList<Integer>();

	Scanner lectura = new Scanner(System.in);System.out.println("ingrese cantidad:");

	int ingresDatos = lectura.nextInt();for(
	int i = 0;i<ingresDatos;i++)
	{
		System.out.println("ingrese primer elemento de la lista:");
		lista.add(lectura.nextInt());

	}System.out.println("ingrese numerode consultas:");
	int query = lectura.nextInt();
	String query1 = "";while(query>0)
	{
		System.out.println("ingrese consulta:");
		query1 = lectura.next();
		if (query1.equals("Insert")) {
			int indice = lectura.nextInt();
			int valor = lectura.nextInt();
			lista.add(indice, valor);
		}

		if (query1.equals("Delete")) {

			int indice2 = lectura.nextInt();
			lista.remove(indice2 > 0 || indice2 == lista.size() ? indice2 - 1 : indice2);
		}
		query--;
	}lista.forEach(System.out::println);

	String ip = "1233";
	String ip2 = "s12";
	String ipcorrecta = "111.198.0.256";

	System.out.println(comprobarIp(ip) + "-" + comprobarIp(ip2) + "-" + comprobarIp(ipcorrecta));

//	System.out.println(formato);

		String larga = "He is a very very good boy, isn't he?";
		;
		String[] arreglooo = (larga.replace("'", " ").replace("?", "").replace(",", "").replace("[A-Za-z !,?._'@]+",
				" ")).split(" ");
		int lll = arreglooo.length;
		System.out.println(lll);
		for (String a : arreglooo) {

			System.out.println(a);

		}
		String palabra = "welcometojava";
		List<String> palabras = new ArrayList<String>();

		int longitudPalabra = palabra.length();
		// System.out.println(palabra.substring(1, 4));

		for (int i = 0; i < longitudPalabra - 2; i++) {

			palabras.add(palabra.substring(i, 3 + i));

		}

		palabras.stream().forEach(System.out::println);
		palabras.sort((a, b) -> {
			return a.compareTo(b);
		});
		palabras.stream().forEach(System.out::println);

		int cantidadAsimetrica = 0;
		String resultado = "Symmetric";
		int longitudArreglo = myArray.length - 1;
		for (int i = 0; i <= longitudArreglo; i++) {

			if (!myArray[i].equals(myArray[longitudArreglo - i])) {

				cantidadAsimetrica += 1;
				resultado = "ASymmetric";
				break;
			}

		}

		System.out.println(resultado);

		int iteraciones = 0;
		int posicionAnterior = 0;
		while (iteraciones < A.length) {

			decodificado[iteraciones] = mensaje[posicionAnterior];
			posicionAnterior = A[posicionAnterior];

			iteraciones++;
//comentario para ramilla desde remoto
		}

		Arrays.asList(decodificado).forEach(z -> {
			System.out.print(z);
		});
//paila
	}

}
