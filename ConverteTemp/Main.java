public class Main{
	public static void main(String[] args) {
		Conversor c = new Conversor();
		try{
			System.out.println(c.converte(200.67));
		}catch(FahException e){
			System.out.println("Deu erro no valor absoluto.");
		}
	}
	
}