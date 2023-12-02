package entidades;

public class funcoes {
	public double nota1;
	public double nota2;
	public double nota3;
	double total;
	double falta;
	
	public double soma() {
		total = nota1 + nota2+ nota3;
		return total;
	}
	
	public String diferenca() { 
		if(total >= 60) {
			return "PASS";
		} else if (total < 60) {
			return "FAILED";
		}
		return null;
	}
	public double falta() {
		falta = 60 - total;
		if (total >= 60) {
			return 0;
		} else {
			return falta;
		}
	}
}
