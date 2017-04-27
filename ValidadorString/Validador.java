import java.lang.Character;

public class Validador{
	public void validaString (String word) throws NotLetterException,UpperCaseException{
		Integer i = 0, tam = word.length();
		char convert[] = word.toCharArray();

		while(i < tam){
			if (!Character.isDigit(convert[i])) {
				i++;
			}
			else{
				throw new NotLetterException();
			}
				
		}
		i = 0;
		while(i < tam ){
			if (!Character.isUpperCase(convert[i])) {
				i++;
			}
			else{
				throw new UpperCaseException();
			}
		}
		
	}
	
}