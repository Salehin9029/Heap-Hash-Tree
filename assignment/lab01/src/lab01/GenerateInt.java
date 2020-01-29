package lab01;

import java.util.concurrent.ThreadLocalRandom;
/**
 * @author saleh
 *
 */
public class GenerateInt {
	int min =1;
	int max = 100000;


static int generateNumber(){
	int randomNum = 0;
	int min = 1;
	int max = 100000;
	for (int i=0; i<100000; i++)
	{
		randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

	}
	return randomNum;
	}

}
