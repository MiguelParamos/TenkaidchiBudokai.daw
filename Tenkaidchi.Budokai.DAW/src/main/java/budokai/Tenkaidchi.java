package budokai;

import java.util.ArrayList;

import clases.Arma;
import clases.Combatiente;
import clases.ObjetoDefensivo;
import clases.Pelea;

public class Tenkaidchi {

	public static void main(String[] args) {
		
		Arma espada=new Arma("Espada",(byte)16);
		ObjetoDefensivo escudo=new ObjetoDefensivo("Escudo",(byte)12);
		
		Combatiente frodo=
		new Combatiente("Frodo",espada,escudo);
		Combatiente wally= 
		new Combatiente("Wally");
		
		Pelea pelea=new Pelea(frodo,wally);
		pelea.pelear();
	}

}
