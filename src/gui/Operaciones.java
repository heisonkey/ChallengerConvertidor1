package gui;

public class Operaciones {

	private double valor;
	private int divisa1, divisa2;
	private double resultado;
	
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getDivisa1() {
		return divisa1;
	}
	public void setDivisa1(int divisa1) {
		this.divisa1 = divisa1;
	}
	public int getDivisa2() {
		return divisa2;
	}
	public void setDivisa2(int divisa2) {
		this.divisa2 = divisa2;
	}
	
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	//Constructor
	public Operaciones() {}
	
	
	public double convertir() {
		
		
	if(divisa1 == 0) {
	
		if(divisa2 == 0) {
			resultado = valor;	
		}
		
		else if(divisa2 == 1 ) {
			resultado = valor * 0.91;
			
		}
		
		else if(divisa2 == 2) {
			resultado = valor * 17.09;	
		}
		
		else if(divisa2 == 3) {
			resultado = valor * 4197.60;	
		}
		
		else if(divisa2 == 4) {
			resultado = valor * 29.64;	
		}
		
		else if(divisa2 == 5) {
			resultado = valor * 0.78 ;	
		}
		
		else if(divisa2 == 6) {
			resultado = valor * 142.22;	
		}
		
		else if(divisa2 == 7) {
			resultado = valor * 1296.68;	
		}
		
	}
	else if(divisa1 == 1) {
		
		if(divisa2 == 0) {
			resultado = valor * 1.10;
		}
		else if(divisa2 == 1) {
			resultado = valor;
		}
		else if(divisa2 == 2) {
			resultado = valor * 18.73;
		}
		else if(divisa2 == 3) {
			resultado = valor * 4600.72;
		}
		else if(divisa2 == 4) {
			resultado = valor * 31.03;
		}
		else if(divisa2 == 5) {
			resultado = valor * 0.85;
		}
		else if(divisa2 == 6) {
			resultado = valor * 155.95;
		}
		else if(divisa2 == 7) {
			resultado = valor * 1422.89;
		}
		
	}else if(divisa1 == 2) {
		
		if(divisa2 == 0) {
			resultado = valor * 0.059;
		}
		else if(divisa2 == 1) {
			resultado = valor * 0.053;
		}
		else if(divisa2 == 2) {
			resultado = valor;
		}
		else if(divisa2 == 3) {
			resultado = valor * 245.68;
		}
		else if(divisa2 == 4) {
			resultado = valor * 1.66;
		}
		else if(divisa2 == 5) {
			resultado = valor * 0.046;
		}
		else if(divisa2 == 6) {
			resultado = valor * 8.32;
		}
		else if(divisa2 == 7) {
			resultado = valor * 75.95;
		}
		
	}else if(divisa1 == 3) {
		
		if(divisa2 == 0) {
		resultado = valor * 0.00024;
		}
		else if(divisa2 == 1) {
			resultado = valor * 0.00022;
		}
		else if(divisa2 == 2) {
			resultado = valor * 0.0041;
		}
		else if(divisa2 == 3) {
			resultado = valor;
		}
		else if(divisa2 == 4) {
			resultado = valor * 0.0067;
		}
		else if(divisa2 == 5) {
			resultado = valor * 0.00019;
		}
		else if(divisa2 == 6) {
			resultado = valor * 0.034;
		}
		else if(divisa2 == 7) {
			resultado = valor * 0.31;
		}
		
	}else if(divisa1 == 4) {
		if(divisa2 == 0) {
			resultado = valor * 0.035;
		}
		else if(divisa2 == 1) {
			resultado = valor * 0.032;
		}
		else if(divisa2 == 2) {
			resultado = valor * 0.60;
		}
		else if(divisa2 == 3) {
			resultado = valor * 148.39;
		}
		else if(divisa2 == 4) {
			resultado = valor;
		}
		else if(divisa2 == 5) {
			resultado = valor * 0.028;
		}
		else if(divisa2 == 6) {
			resultado = valor * 5.03;
		}
		else if(divisa2 == 7) {
			resultado = valor * 45.85;
		}
	}else if (divisa1 == 5) {
		if(divisa2 == 0) {
			resultado = valor * 1.28;
		}
		else if (divisa2 == 1) {
			resultado = valor * 1.17;
		}
		else if (divisa2 == 2) {
			resultado = valor * 29.31;
		}
		else if (divisa2 == 3) {
			resultado = valor * 5388.34;
		}
		else if (divisa2 == 4) {
			resultado = valor * 36.32;
		}
		else if (divisa2 == 5) {
			resultado = valor;
		}
		else if (divisa2 == 6) {
			resultado = valor * 182.53;
		}
		else if (divisa2 == 7) {
			resultado = valor * 1666.37;
		}
		
	}else if(divisa1 == 6) {
	
		if(divisa2 == 0) {
			resultado = valor * 0.0070;
		}
		else if(divisa2 == 1) {
			resultado = valor * 0.0064;
		}
		else if(divisa2 == 2) {
			resultado = valor * 0.12;
		}
		else if(divisa2 == 3) {
			resultado = valor * 29.53;
		}
		else if(divisa2 == 4) {
			resultado = valor * 0.20;
		}
		else if(divisa2 == 5) {
			resultado = valor * 0.0055;
		}
		else if(divisa2 == 6) {
			resultado = valor;
		}
		else if(divisa2 == 7) {
			resultado = valor * 9.13;
		}
		
		
	}else if(divisa1 == 7) {
		if(divisa2 == 0) {
			resultado = valor * 0.00077;
		}
		else if(divisa2 == 1) {
			resultado = valor * 0.00070;
		}
		else if(divisa2 == 2) {
			resultado = valor * 0.013;
		}
		else if(divisa2 == 3) {
			resultado = valor * 3.24;
		}
		else if(divisa2 == 4) {
			resultado = valor * 0.022;
		}
		else if(divisa2 == 5) {
			resultado = valor * 0.00060;
		}
		else if(divisa2 == 6) {
			resultado = valor * 0.11;
		}
		else if(divisa2 == 7) {
			resultado = valor;
		}
		
		
	}
	
		
		return resultado;
	}
		
		
		
		
	
}
