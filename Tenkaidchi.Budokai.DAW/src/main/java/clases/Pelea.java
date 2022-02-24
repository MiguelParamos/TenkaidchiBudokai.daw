package clases;

import java.util.Random;

public class Pelea {
	private Combatiente combatiente1;
	private Combatiente combatiente2;
	private short turno;
	private Combatiente ganador;
	
	public Pelea(Combatiente c1,Combatiente c2) {
		this.combatiente1=c1;
		this.combatiente2=c2;
		this.turno=1;
		this.ganador=null;
	}

	public Combatiente getCombatiente1() {
		return combatiente1;
	}

	public void setCombatiente1(Combatiente combatiente1) {
		this.combatiente1 = combatiente1;
	}

	public Combatiente getCombatiente2() {
		return combatiente2;
	}

	public void setCombatiente2(Combatiente combatiente2) {
		this.combatiente2 = combatiente2;
	}

	public Combatiente getGanador() {
		return ganador;
	}
	
	public void pelear() {
		Combatiente[] combatientes= {combatiente1,combatiente2};
		Random r=new Random();
		byte combatienteActual=(byte)r.nextInt(combatientes.length);
		do {
			System.out.println("Turno "+turno);
			byte puntosAtaque=combatientes[combatienteActual].atacar();
			combatientes[(combatienteActual+1)%2].defender(puntosAtaque);
			combatienteActual=(byte)((combatienteActual+1)%2);
			System.out.println();
			this.turno++;
			try {
				Thread.sleep(350);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}while(this.combatiente1.getVida()>0&&this.combatiente2.getVida()>0);
		if(this.combatiente1.getVida()>0) {
			this.ganador=combatiente1;
		}else {
			this.ganador=combatiente2;
		}
	}
	
	public String toString() {
		return this.combatiente1.getNombre()+" vs "+
				this.combatiente2.getNombre();
	}
	
	
	
}
