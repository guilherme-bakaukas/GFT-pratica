package ex3;

public class Caminhao extends Transporte{

	public Caminhao(Carga carga) {
		super(carga);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaFrete(int distancia) {
		// TODO Auto-generated method stub
		
		double frete = (carga.getPeso() * 0.02) + (carga.getValor()*0.03) + (2*distancia); 
		
		if (carga.getValor()>40000) {
			frete *= 0.75;
		}
		
		return frete;
	}

}
