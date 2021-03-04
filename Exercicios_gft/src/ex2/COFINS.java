package ex2;

public class COFINS implements Imposto {

	@Override
	public double calculaImposto(double valor) {
		// TODO Auto-generated method stub
		
		if(valor>12000) {
			return (valor*0.04);
		}else {
			return 0;
		}
		
	}

}
