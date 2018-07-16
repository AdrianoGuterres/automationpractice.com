package guterres.adriano.ressources;

import java.util.Random;

public class AutomaticEmailGeneratorTool {

	public static String gerarEmail() {

		String letters = "abcdefghijklmnopqrstuvxzwykabcdefghijklmnopqrstuvxzwyk";

		Random random = new Random();

		String user = "";
		String provider = "";
		
		int providerIndex = 0;
		int userIndex     = 0;
		
		for( int i = 0; i < 12; i++ ) {
			userIndex     = random.nextInt( letters.length() -1);
			providerIndex = random.nextInt( letters.length() -1);
			
			user     = user + letters.substring( userIndex, userIndex + 1 );
			provider = provider + letters.substring( providerIndex, providerIndex + 1 );			
		}

		return user+"@"+ provider+".com";
	}

}
