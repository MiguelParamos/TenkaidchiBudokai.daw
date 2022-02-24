package clases;

import java.util.ArrayList;
import java.util.Random;

public class Ronda {
	private String nombre;
	private ArrayList<Pelea> peleas;
	
	/**
	 * Contrusctor de ronda a partir de su nombre y los combatientes
	 * que participarán en ella
	 * @param nombre nombre de la ronda
	 * @param combatientes contiene a todos los combatientes que 
	 * participarán en la ronda. Tiene que ser un número par.
	 */
	public Ronda(String nombre,ArrayList<Combatiente> combatientesPosibles) {
		super();
		this.nombre = nombre;
		this.peleas=new ArrayList<Pelea>();
		Random r=new Random();
		while(combatientesPosibles.size()>0) {
			//Escogemos al primer combatiente
			Combatiente c1=combatientesPosibles.get(r.nextInt(combatientesPosibles.size()));
			//Lo sacamos del arraylist para que no se repita
			combatientesPosibles.remove(c1);
			//Escogemos al segundo combatiente
			Combatiente c2=combatientesPosibles.get(r.nextInt(combatientesPosibles.size()));
			//Lo sacamos del arraylist para que no se repita
			combatientesPosibles.remove(c2);
			Pelea p=new Pelea(c1,c2);
			peleas.add(p);
		}
	}
	
	/**
	 * Con una ronda con emparejamientos ya creados
	 * me hace todas las peleas de la ronda, y me devuelve un arrayList
	 * con los que han ganado los combates
	 * @return ArrayList con los combatientes que han ganado.
	 */
	public ArrayList<Combatiente> jugarRonda() {
		ArrayList<Combatiente> ganadores=new ArrayList<Combatiente>();
		for(byte i=0;i<this.peleas.size();i++) {
			this.peleas.get(i).pelear();
			ganadores.add(this.peleas.get(i).getGanador());
		}
		return ganadores;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public ArrayList<Pelea> getPeleas() {
		return peleas;
	}


	public void setPeleas(ArrayList<Pelea> peleas) {
		this.peleas = peleas;
	}
	
	
	
	
}
