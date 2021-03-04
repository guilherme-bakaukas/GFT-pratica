package ex3;

public abstract class Transporte {
	
	Carga carga;
	
	public Transporte(Carga carga) {
		this.carga = carga;
	}
	public abstract double calculaFrete(int distancia);
}
