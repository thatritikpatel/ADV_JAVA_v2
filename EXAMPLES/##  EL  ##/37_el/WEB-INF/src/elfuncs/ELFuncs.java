package elfuncs;

import java.util.Random;

public class ELFuncs{
	public static int diceRoller(){
		Random random = new Random();
				
		return random.nextInt(6);
	}
}