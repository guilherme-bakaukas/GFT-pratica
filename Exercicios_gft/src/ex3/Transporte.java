package ex3;

public abstract class Transporte {
	
	Carga carga;
	
	public Transporte(Carga carga) {
		this.carga = carga;
	}
	
	//m�todo abstrato que ser� implementado nas classes herdeiras
	public abstract double calculaFrete(int distancia);
}
