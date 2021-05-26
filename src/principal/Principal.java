package principal;

import java.util.Arrays;
import java.util.List;

import entities.Persona;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona ronny = new Persona("Ronny", "Chamba",25, false);
		Persona rene = new Persona("Rene", "Chamba",23, false);
		Persona santos = new Persona("Santos", "Chamba",55, true);
		Persona maria = new Persona("Maria", "Chamba",19, false);
		Persona mayra = new Persona("Mayra", "Chamba",33, true);
		Persona jandry = new Persona("Jnadry", "Chamba",13, false);
		Persona javier = new Persona("Javier", "Chamba",30, true);
		Persona sebas = new Persona("Sebas", "Chamba",8, false);
		
		
		// Lista personas
		List<Persona> personas = Arrays.asList(ronny, rene, santos, maria, mayra, jandry, javier, sebas);
		
		// Mostrar
		personas.forEach(x -> System.out.println(x));

	}

}
