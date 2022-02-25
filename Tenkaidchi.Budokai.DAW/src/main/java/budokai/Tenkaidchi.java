package budokai;

import java.util.ArrayList;
import java.util.Random;

import clases.Arma;
import clases.Combatiente;
import clases.ObjetoDefensivo;
import clases.Pelea;
import clases.Ronda;
import clases.Torneo;

public class Tenkaidchi {

	public static void main(String[] args) {
		//Declaro todas las armas que necesito para empezar el torneo
		ArrayList<Arma> armasDisponibles=new ArrayList<Arma>();
		armasDisponibles.add(new Arma("Espada",(byte)16));
		armasDisponibles.add(new Arma("Ak-47",(byte)20));
		armasDisponibles.add(new Arma("Chancla de la madre",(byte)12));
		armasDisponibles.add(new Arma("Daga",(byte)13));
		armasDisponibles.add(new Arma("Bolso de ladrillos",(byte)16));
		armasDisponibles.add(new Arma("Guantelete de Thanos",(byte)10));
		armasDisponibles.add(new Arma("Dedo amputado de ET",(byte)5));
		armasDisponibles.add(new Arma("Botijo nuclear",(byte)8));
		
		//Declaro todos los objetos defensivos que necesito para empezar el torneo
		ArrayList<ObjetoDefensivo> objetosDefensivosDisponibles=
				new ArrayList<ObjetoDefensivo>();
		objetosDefensivosDisponibles.add(
				new ObjetoDefensivo("escudo",(byte)15));
		objetosDefensivosDisponibles.add(
				new ObjetoDefensivo("capa de caperucita",(byte)6));
		objetosDefensivosDisponibles.add(
				new ObjetoDefensivo("Bolso de un gitano",(byte)5));
		objetosDefensivosDisponibles.add(
				new ObjetoDefensivo("Caparaz�n de tortuga",(byte)12));
		objetosDefensivosDisponibles.add(
				new ObjetoDefensivo("Paraguas de Mary Poppins",(byte)10));
		objetosDefensivosDisponibles.add(
				new ObjetoDefensivo("s�bana",(byte)5));
		objetosDefensivosDisponibles.add(
				new ObjetoDefensivo("antena de 5g",(byte)18));
		objetosDefensivosDisponibles.add(
				new ObjetoDefensivo("mascarilla ffp2",(byte)18));
		
		//Declaro los nombres de los combatientes
		String[] nombresDeCombatientes= 
			{"Rafa","Jose Oña","Jose Coca",
					"Julia","Berta","Juan Castilla","Emilio","Raul","Diana","Oli","Salomon",
					"Alba","Fran Jimenez","Juan Ruiz","Pablo","Porras","Lorenzo","Carlos",
					"David Toledo","Victor","Javi","Edu","Fran Miguel","Alejandra","Ayoub",
					"Putin","Trump","Miguel Páramos","Luisa","Natalia","Alejandra Profe","Jorge" 
					};
		
		Random r=new Random();
		ArrayList<Combatiente> combatientesIniciales=
				new ArrayList<Combatiente>();
		
		for(byte i=0;i<nombresDeCombatientes.length;i++) {
			//Cojo un arma y un objeto defensivo aleatoriamente de los arrays
			Arma armaEscogida=armasDisponibles.get(
					r.nextInt(armasDisponibles.size()));
			ObjetoDefensivo odEscogido=objetosDefensivosDisponibles.get(
					r.nextInt(objetosDefensivosDisponibles.size())
				);
			
			//Saco de las disponibles el arma y objeto defensivo escogidos
			//para que no se repitan
			//armasDisponibles.remove(armaEscogida);
			//objetosDefensivosDisponibles.remove(odEscogido);
			
			combatientesIniciales.add(
					new Combatiente(nombresDeCombatientes[i],
							armaEscogida,odEscogido)
			);
			
			/*System.out.println("Entra al torneo "+nombresDeCombatientes[i]+
					"\n\tEscoge : "+armaEscogida+ "\n\ty "+odEscogido);*/
			System.out.println("Entra al torneo "+
			combatientesIniciales.get(i)+"\n");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		Torneo torneo=new Torneo(combatientesIniciales);
		torneo.jugarTorneo();
		
	}

}
