package calculadora;

public class CalculadoraBase {
	/**
	 * Está classe é uma super ckasse 
	 * Será utlizada como base para estudo de polimorfismo.  
	 * 
	 * */ 
	
	
	// Sobrecarga de método para somar dois inteiros
	public int somar(int a, int b) {
		return a + b; 
	}
	
	//Sobrecarga de método para somar três inteiros. 
	public int somar(int a, int b, int c) {
		return a + b + c; 
	}
	
	//Sobrercarga de método para somar dois números flutuantes
	public double somar(double a, double b) {
		return a + b; 
	}
}
