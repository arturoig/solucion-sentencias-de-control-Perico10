package es.unileon.prg.tema6;

public class Ecuacion2Grado {
	private int _a;
	private int _b;
	private int _c;
	
	
	public Ecuacion2Grado(int a, int b, int c){
		_a=a;
		_b=b;
		_c=c;
	}
	
	public int geta()
	{
		return _a;
	}
	
	public int getb()
	{
		return _b;
	}
	
	public int getc()
	{
		return _b;
	}
	
	private double discriminante()
	{
		return Math.pow(_b,2) - (4*_a*_c);
		
	}
	
	public int numeroSoluciones()
	{
		double discriminante=discriminante();
		int numeroSoluciones;
		
		if (discriminante<0)
			numeroSoluciones=0;
		else
			numeroSoluciones=2;
			
		return numeroSoluciones;
	}
	
	public String toString()
	{
		StringBuffer salida = new StringBuffer();
		double solucion1=0;
		double solucion2=0;
		double discriminante=discriminante();
		
		salida.append("Coeficientes:a="+_a+" b="+_b+" c="+_c);
		
		salida.append("\nNumero de soluciones reales:"+numeroSoluciones());
		if (discriminante==0){
			solucion1=(-1*_b)/(2*_a);
			solucion2=(-1*_b)/(2*_a);
			salida.append("\nDos soluciones reales iguales:"+solucion1);
		}	
		else if (discriminante>0){
			salida.append("\nDos soluciones reales distintas:");
			solucion1=((-1*_b)+Math.sqrt(discriminante))/(2*_a);
			salida.append("\nLa solucion 1 es:"+solucion1);
			solucion2=((-1*_b)-Math.sqrt(discriminante))/(2*_a);
			salida.append("\nLa solucion 2 es:"+solucion2);
			
		}
				
		return salida.toString();
		
	}

}
