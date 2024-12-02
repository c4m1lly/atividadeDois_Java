package atividadeDois;

import java.util.Scanner;

public class atividadeDois {

	public static void main(String[] args) {
		
		float notaUm = 10.0f;
		float notaDois = 8.0f;
		float notaTres = 7.0f;
		float notaQuatro =  7.5f;
		float calcularMedia = (notaUm + notaDois + notaTres + notaQuatro) /4;
        Scanner ler= new Scanner(System.in);
		
        
		System.out.printf ("A média final é: %.1f ",calcularMedia);
			calcularMedia = ler.nextFloat();
		



	}

}
