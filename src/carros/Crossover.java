package carros;

import motores.Motor;

public class Crossover extends CarroBase{
	
	public Crossover(Motor motor) {
		super(motor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirCategoria() {
		System.out.println("Soy Crossover");
		imprimirMotor();
	}
}








