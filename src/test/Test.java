package test;

import carros.CarroBase;
import carros.Crossover;
import carros.Pickup;
import carros.Sedan;
import carros.Suv;
import motores.MotorDiesel;
import motores.MotorGasolina;

public class Test {
	
	
	

	public static void main(String[] args) {
	 	MotorGasolina motorGasolina = new MotorGasolina();    
		MotorDiesel motorDiesel = new MotorDiesel();
		
		
		CarroBase carro = new Pickup(motorDiesel);
		carro.imprimirCategoria();
		

		carro = new Sedan(motorGasolina);
		carro.imprimirCategoria();
		

        carro = new Crossover(motorGasolina);
		carro.imprimirCategoria();
		
	}
	
}
