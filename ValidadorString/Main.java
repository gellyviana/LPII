import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner lido = new Scanner(System.in);
		String word = lido.next();
		Validador v = new Validador();

		try{
			v.validaString(word);
		}catch(NotLetterException e){
			e.printExcNot();
		}catch(UpperCaseException e){
			e.printExcUpper();
		}

	}
	
}