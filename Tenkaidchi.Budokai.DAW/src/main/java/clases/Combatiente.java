package clases;

public class Combatiente {
	private String nombre;
	private byte vida;
	private Arma arma;
	private ObjetoDefensivo objetoDefensivo;
	
	public Combatiente(String nombre, byte vida, Arma arma, ObjetoDefensivo objetoDefensivo) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.arma = arma;
		this.objetoDefensivo = objetoDefensivo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte getVida() {
		return vida;
	}

	public void setVida(byte vida) {
		this.vida = vida;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public ObjetoDefensivo getObjetoDefensivo() {
		return objetoDefensivo;
	}

	public void setObjetoDefensivo(ObjetoDefensivo objetoDefensivo) {
		this.objetoDefensivo = objetoDefensivo;
	}

	@Override
	public String toString() {
		return this.nombre+" ("+this.vida+")\n\t"+
				this.arma+"\n\t"+this.objetoDefensivo;
	}
	
	
	
	
}
