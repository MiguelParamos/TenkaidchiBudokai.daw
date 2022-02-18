package budokai;

import clases.Arma;
import clases.Combatiente;
import clases.ObjetoDefensivo;

public class Tenkaidchi {

	public static void main(String[] args) {
		Arma espada=new Arma("Espada",(byte)16);
		ObjetoDefensivo escudo=new ObjetoDefensivo("Escudo",(byte)12);
		//TODO : QUITAR VIDA DEL CONSTRUCTOR Y MEJORAR EL TOSTRING 
		//DE COMBATIENTE PARA CUANDO NO TENGA ESCUDO O ESPADA
		Combatiente albertinho=
		new Combatiente("Albertinho",(byte)100,espada,escudo);
		
		System.out.println(albertinho);
	}

}
