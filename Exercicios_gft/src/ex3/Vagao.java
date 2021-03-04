package ex3;

public class Vagao extends Transporte {

	public Vagao(Carga carga) {
		super(carga);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaFrete(int distancia) {
		// TODO Auto-generated method stub
		
		double frete = (carga.getPeso() * 0.07) + (carga.getValor()*0.01) + (0.5*distancia); 
		
		
		if (carga.getPeso()<15000) {
			frete += 5000;
		}
		
		return frete;
	}

}
