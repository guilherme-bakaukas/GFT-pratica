package ex3;

public abstract class Transporte {
	
	Carga carga;
	
	public Transporte(Carga carga) {
		this.carga = carga;
	}
	
	//método abstrato que será implementado nas classes herdeiras
	public abstract double calculaFrete(int distancia);
}
