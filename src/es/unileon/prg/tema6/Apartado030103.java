package es.unileon.prg.tema6;
/**
 * Clase con los ejercicios correspondientes a sentencias condicionales:
 * sentencias con la instruccion "switch".
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030103 extends Apartado {

	protected String obtenerPractica(){
		return "P-CTL";
	}

	protected String obtenerBloque() {
		return "Instruccion <<switch>>";
	}

	/**
	 * Instruccion <<switch>> - Ejercicio1.
	 *
	 * Modificar el metodo  para que al introducir un calificacion numerica  por teclado(1-10) se muestre 
	 * la calificacion de forma textual (1-4 -> Insuficiente , 5 -> Suficiente, 6 -> Bien, 
	 * 7-8 -> Notable, 9 -> Sobresaliente, 10 -> Matricula)
	 *
	 */
	public void ejercicio01() {
		cabecera("01","");

		// Inicio modificacion
		int calificacion;
		
		System.out.println("Introduce una calificacion:");
		calificacion=Teclado.readInteger();
		switch(calificacion)
		{
			case 1:
			case 2:
			case 3:
			case 4: System.out.println("Insuficiente");
					break;
			case 5: System.out.println("Sufiente");
					break;
			case 6: System.out.println("Bien");
					break;
			case 7:
			case 8: System.out.println("Notable");
					break;
			case 9: System.out.println("Sobresaliente");
					break;
			case 10: System.out.println("Matricula");
					 break;
			default: System.out.println("Nota no valida");				
				
		}
		
		
        // Fin modificacion
	}

	/**
	 * Instruccion <<switch>> - Ejercicio2.
	 *
	 * Modificar el metodo  para que retorne el numero de anillos que tiene el ultimo digito de un numero entero 
	 * introducido por el teclado. Se definen los anillos de un digito como el "numero de circulos 
	 * que tiene un digito". Ej.: 0 > 1 anillo, 2 -> 0 anillos, 8 -> 2 anillos, etc.).
	 *
	 */
	public void ejercicio02() {
		cabecera("02", "");

		// Inicio modificacion

		int anillos=0,numero;
		
		System.out.println("Introduce un numero entero:");
		numero=Teclado.readInteger();
		switch(numero % 10)
		{
			case 0:
			case 6:
			case 9:anillos=1;
				   break;
			case 1:
			case 2:
			case 3:	
			case 4:
			case 5:
			case 7:anillos=0;
			   	   break;
			case 8: anillos=2;
					break;			
		}
		
		System.out.println("El numero de anillo de :"+numero%10+" -> "+anillos);
		
		
		
		// Fin modificacion
	}

	/**
	 * Instruccion <<switch>> - Ejercicio3.
	 *
	 * Modificar el metodo ejercicio3() del Apartado030103, utilizando una sentencia switch, 
	 * para que realice la misma funcionalidad que el metodo ejercicio4() del Apartado030102.
	 *
	 */
	public void ejercicio03() {
		cabecera("03", "");

		
		// Inicio modificacion
		int n1=0, n2=0, opcion;
		int suma=0, multiplicacion=0;
				
       	System.out.println("Introduce el numero 1:");
		n1=Teclado.readInteger();

		System.out.println("Introduce el numero 2:");
		n2=Teclado.readInteger();
		
		System.out.println("1 - Sumar");
		System.out.println("2 - Multiplicar");
		System.out.println("3 - Divisores");
		
		System.out.println("Introduce una opcion:");
		opcion=Teclado.readInteger();
		
		switch(opcion)
		{
			case 1:	suma=n1+n2;
					System.out.println("Suma:"+suma);
					break;
			case 2: multiplicacion=n1+n2;
					System.out.println("Multiplicacion:"+multiplicacion);
					break;
			case 3:	if (n1 % n2 ==0 )
						System.out.println("N2 "+n2+" es divisor de N1 "+ n1);
					else if (n2 % n1 ==0 )
						System.out.println("N1 "+n1+" es divisor de N1 "+ n2);
					else
						System.out.println("Ninguno es divisor del otro");
					break;
			default: System.out.println("Opcion incorrecta");
		
		}
		
		
		// Fin modificacion
	}

	/**
	 * Instruccion <<switch>> - Ejercicio4.
	 *
	 * Modificar el metodo ejercicio4() del Apartado030103  para que al introducir una cadena de caracteres 
	 * por teclado  se indique si el primer caracter de la cadena es una vocal escrita en minusculas, 
	 * si es una vocal escrita en mayusculas o si es otro tipo de caracter.
	 * 
	 */
	public void ejercicio04() {
		cabecera("04", "");

		// Inicio modificacion
		String cadena;
		
		System.out.println("Introduce una cadena:");
		cadena=Teclado.readString();
		switch(cadena.charAt(0))
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':System.out.println(cadena.charAt(0)+ "es una vocal en minuscula:");
					 break;
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':System.out.println(cadena.charAt(0)+" es una vocal en mayuscula:");
					 break;
			default: System.out.println(cadena.charAt(0)+ "no es una vocal");
		}
		
				
		// Fin modificacion
	}
}
