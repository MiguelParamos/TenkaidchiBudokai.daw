package clases;

import java.util.Random;

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
	
	public Combatiente(String nombre, Arma arma, ObjetoDefensivo objetoDefensivo) {
		this.nombre = nombre;
		this.vida = 100;
		this.arma = arma;
		this.objetoDefensivo = objetoDefensivo;
	}
	
	public Combatiente(String nombre) {
		this.nombre=nombre;
		this.vida=100;
		this.arma=new Arma("Puños",(byte)5);
		this.objetoDefensivo=
				new ObjetoDefensivo("pesho descubierto",(byte)5);
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
				(this.arma==null?"Desarmado":this.arma)
				+"\n\t"+
				(this.objetoDefensivo==null?
				"Sin defensa":this.objetoDefensivo);
	}
	
	public byte atacar() {
		Random r=new Random();
		byte puntosHechos=(byte)r.nextInt(this.arma.getPuntosAtaque());
		System.out.println(this.nombre+" ("+this.vida+") ataca con su "
				+this.arma.getNombre()+
				" y hace "+puntosHechos+" de daño");
		return puntosHechos;
	}
	
	public void defender(byte puntosAtaqueRecibidos) {
		Random r=new Random();
		byte puntosDefensaSacados=
				(byte)r.nextInt(this.objetoDefensivo.getPuntosDefensa());
		System.out.print(this.nombre+" ("+this.vida+") defiende con su "+
				this.getObjetoDefensivo().getNombre()+" ");
		if(puntosAtaqueRecibidos>puntosDefensaSacados) {
			this.vida-=puntosAtaqueRecibidos-puntosDefensaSacados;
			if(this.vida<0) {
				this.vida=0; 
				System.out.println("y se ha morido");
			}else {
				System.out.println("y recibe "+
						(puntosAtaqueRecibidos-puntosDefensaSacados)
								+" puntos de daño");
			}
		}else {
			System.out.println("pero no recibe daño");
		}
	}
	
	
	
}
