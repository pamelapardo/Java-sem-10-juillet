package numAleatoire;
import java.util.Random;

public class NombreAleatoire {

	public static void main(String[] args) {
		// On defini la premiere boucle
		int attemps = 0;
		Random random = new Random();  
		int num1 , num2, num3;


		
		 while (true) {
			 num1= random.nextInt(1001);
			 num2 = random.nextInt(1001);
			 num3 = random.nextInt(1001);
			 attemps += 1;
		  if (num1 % 2 == 0 && num2 % 2 == 0 && num3 != 0) {
			 System.out.println("Premier nombre pair: " + num1);
			 System.out.println("Deuxieme nombre chiffre pair: " + num2);
			 System.out.println("Premier nombre impair: " + num3);
			 break;
		  }
			  
		 }
		 
		 System.out.println("N. de boucles pour trouver le resul: " + attemps);
		 
	}

}
