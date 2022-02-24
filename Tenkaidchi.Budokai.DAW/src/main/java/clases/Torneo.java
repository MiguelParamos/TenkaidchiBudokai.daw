package clases;

import java.util.ArrayList;

public class Torneo {
	private ArrayList<Ronda> rondas;
	
	public Torneo(ArrayList<Combatiente> combatientesIniciales) {
		//Crea un torneo con una ronda inicial que no se juega todav�a
		this.rondas=new ArrayList<Ronda>();
		this.rondas.add(new Ronda("Ronda 1",combatientesIniciales));
	}
	
	public void jugarTorneo() {
		byte contadorRonda=1;
		//Mientras que la �ltima ronda que haya tenga m�s de una pelea
		while(this.rondas.get(this.rondas.size()-1).getPeleas().size()>1) {
			//Juego la �ltima ronda que hay en el torneo
			ArrayList<Combatiente> ganadoresRonda=
				this.rondas.get(this.rondas.size()-1).jugarRonda();
			//Inserto una nueva ronda con los ganadores de la anterior
			contadorRonda++;
			this.rondas.add(new Ronda("Ronda "+contadorRonda,ganadoresRonda));
		}
		//Aqu� nos quedamos con solo una pelea, que es la gran final
		System.out.println("!!!!!!!!!!!!!!!!!!LA GRAN FINAL!!!!!!!!!!!!!!!!!!");
		ArrayList<Combatiente> ganadorTorneo=this.rondas.get(
				this.rondas.size()-1).jugarRonda();
		System.out.println("\nGANADOR/A DEL TORNEO: "+
				ganadorTorneo.get(0).getNombre());
	}
}
