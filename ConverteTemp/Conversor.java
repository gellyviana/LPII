public class Conversor  {
	public static final double valorAbsoluto = -459.67;
	private double tmp;

	public Conversor(){
	}
	public void setTemp(double tmp){
		this.tmp = tmp;
	}
	public double getTemp(){
		return this.tmp;
	}
	public double converte(double t) throws FahException{
		double tmp;
		if (t <= valorAbsoluto ) {
			throw new FahException ("Erro	");
		}
		tmp = (5*(t - 32))/9;
		return tmp;
	}
	/*public String toString(){
		String frase1 = "O valor em Fahrenheit";
		String frase2 = "em Celsius ";
		return frase1 + this.getTemp() + frase2 + this.converte();
	}*/
}