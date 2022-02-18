package clases;

public class ObjetoDefensivo {
	private String nombre;
	private byte puntosDefensa;
	
	public ObjetoDefensivo(String nombre, byte puntosDefensa) {
		super();
		this.nombre = nombre;
		this.setPuntosDefensa(puntosDefensa);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte getPuntosDefensa() {
		return puntosDefensa;
	}

	public void setPuntosDefensa(byte puntosDefensa) {
		if(puntosDefensa<5||puntosDefensa>20) {
			System.out.println(
					"Valor de puntos de defensa no válido."
					+ " Mejoramos esto en el tema 7");
		}else {
			this.puntosDefensa = puntosDefensa;
		}
	}

	@Override
	public String toString() {
		return this.nombre+" (defensa: "+this.puntosDefensa+")";
	}
	
	
	
	
}
