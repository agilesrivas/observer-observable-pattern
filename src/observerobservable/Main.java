package observerobservable;

import java.util.Observable;
import java.util.Observer;

public class Main {

	public static void main(String[] args) {
		
		Auto ford=new Auto("FORD","MOTOR","COLOR","1994","12°","18C","100");
		Mecanico mecanico=new Mecanico("pedro","err","err");
		ford.addObserver(mecanico);
		
		System.out.println("Nivel de aceite "+ford.getNivelAceite());
		System.out.println("Nivel de agua "+ford.getNivelDeAgua());
		System.out.println("Presion de neumaticos "+ford.getPresionNeumaticos());
		
		System.out.println("Viendo cambios");
		ford.setNivelAceite("100°");
		ford.setNivelDeAgua("1000°");
		ford.setPresionNeumaticos("10");
		
		
		
		
		
		

	}

}
