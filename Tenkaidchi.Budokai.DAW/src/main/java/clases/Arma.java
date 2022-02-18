package clases;

public class Arma {
	private String nombre;
	private byte puntosAtaque;
	
	public Arma(String nom,byte puntosAtaque) {
		this.nombre=nom;
		this.setPuntosAtaque(puntosAtaque);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public byte getPuntosAtaque() {
		return this.puntosAtaque;
	}
	
	public void setNombre(String n) {
		this.nombre=n;
	}
	
	public void setPuntosAtaque(byte pA) {
		if(pA>20||pA<5) {
			System.out.println(
					"Puntos no válidos. "
					+ "Mejoramos esto en el tema 7");
		}else {
			this.puntosAtaque=pA;
		}
	}
	
	public String toString() {
		return this.nombre+
		" (ataque: "+this.puntosAtaque+")";
	}
	
	
}
