package whatNamingConventions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class App {

	static Scanner input = new Scanner(System.in);
	
	static ArrayList <String> waveHolder = new ArrayList<String>();

	static String wave0 = ">";
	static String wave1 = ">>";
	static String wave2 = ">>>";
	static String wave3 = ">>>>";
	static String wave4 = ">>>>>";
	static String wave5 = ">>>>>>";
	static String wave6 = ">>>>>>>";
	static String wave7 = ">>>>>>>>";
	static int requestedWaves;
	static int printSpeed;
	static int waveSize;

	public static void main(String[] args) throws InterruptedException {
		
		printSurfsUp();
		
		System.out.println("\nHow many waves are you lookin' to ride, dude? (1-20)");

		getRequestedWaves();

		System.out.println("\nHow fast are you looking to ride? (1-5) (1 is slower, 5 is faster)");

		getPrintSpeed();

		System.out.println("\nHow big of waves can you handle? (1-4) (1 is smaller, 4 is bigger)");

		getWaveSize();

		waveMultiplier();

		for (int numberOfWaves = 0; numberOfWaves < requestedWaves; numberOfWaves++) {

//			numberOfWaves
//			numberOfWaves

			// I (the user) want to be able to:
			// -change the speed of the waves (printSpeed)
			// -change the size of the waves (waveSize)
			// -choose how many waves happen (requestedWaves)
			// -choose the frequency of waves compared to still woter
			// -choose to make the water choppy (for this we'll probably need the waves to
			// go into an array list and be shuffled
			// -get custom messages for certain inputs (so answers should be put into an
			// array, and there should be a keymap that has
			// special messages for certain combinations

			System.out.println(wave0);
			TimeUnit.MILLISECONDS.sleep(printSpeed);
			System.out.println(wave1);
			TimeUnit.MILLISECONDS.sleep(printSpeed);
			System.out.println(wave2);
			TimeUnit.MILLISECONDS.sleep(printSpeed);
			System.out.println(wave3);
			TimeUnit.MILLISECONDS.sleep(printSpeed);
			System.out.println(wave4);
			TimeUnit.MILLISECONDS.sleep(printSpeed);
			System.out.println(wave5);
			TimeUnit.MILLISECONDS.sleep(printSpeed);
			System.out.println(wave6);
			TimeUnit.MILLISECONDS.sleep(printSpeed);
			System.out.println(wave7);
			TimeUnit.MILLISECONDS.sleep(printSpeed);
			System.out.println(wave6);
			TimeUnit.MILLISECONDS.sleep(printSpeed);
			System.out.println(wave5);
			TimeUnit.MILLISECONDS.sleep(printSpeed);
			System.out.println(wave4);
			TimeUnit.MILLISECONDS.sleep(printSpeed);
			System.out.println(wave3);
			TimeUnit.MILLISECONDS.sleep(printSpeed);
			System.out.println(wave2);
			TimeUnit.MILLISECONDS.sleep(printSpeed);
			System.out.println(wave1);

			if (numberOfWaves == requestedWaves - 1) {

				TimeUnit.MILLISECONDS.sleep(printSpeed);
				System.out.println(wave0);
				printCowabunga();
			}

		}

	}
	
	private static void printSurfsUp() {
		System.out.println(" .d8888b.  888     888 8888888b.  8888888888 d8b  .d8888b.       888     888 8888888b.  888 \r\n" + 
				"d88P  Y88b 888     888 888   Y88b 888        88P d88P  Y88b      888     888 888   Y88b 888 \r\n" + 
				"Y88b.      888     888 888    888 888        8P  Y88b.           888     888 888    888 888 \r\n" + 
				" \"Y888b.   888     888 888   d88P 8888888    \"    \"Y888b.        888     888 888   d88P 888 \r\n" + 
				"    \"Y88b. 888     888 8888888P\"  888                \"Y88b.      888     888 8888888P\"  888 \r\n" + 
				"      \"888 888     888 888 T88b   888                  \"888      888     888 888        Y8P \r\n" + 
				"Y88b  d88P Y88b. .d88P 888  T88b  888            Y88b  d88P      Y88b. .d88P 888         \"  \r\n" + 
				" \"Y8888P\"   \"Y88888P\"  888   T88b 888             \"Y8888P\"        \"Y88888P\"  888        888");
	}

	private static void getRequestedWaves() {
		requestedWaves = 666;

		while (requestedWaves < 1 || requestedWaves > 20) {

			try {
				requestedWaves = Integer.parseInt(input.nextLine());
			
				if (requestedWaves != 666 && (requestedWaves < 1 || requestedWaves > 20)) {
					System.out.println("That number is too radical.  1 through 20 dude!");
				}
			
			} catch (NumberFormatException e) {
				System.out.println("I need a digit, dude.");
			}
		}
	}

	private static void getPrintSpeed() {
		printSpeed = 666;

		while (printSpeed < 1 || printSpeed > 5)

			try {
				printSpeed = Integer.parseInt(input.nextLine());

				if (printSpeed < 1 || printSpeed > 5) {
					System.out.println("That number is too radical.  1 through 5 dude!");
				}

			} catch (NumberFormatException e) {
				System.out.println("I need a digit, dude.");
			}

		if (printSpeed == 1) {
			printSpeed = 250;
		} else if (printSpeed == 2) {
			printSpeed = 200;
		} else if (printSpeed == 3) {
			printSpeed = 150;
		} else if (printSpeed == 4) {
			printSpeed = 75;
		} else if (printSpeed == 5) {
			printSpeed = 25;
		}
	}

	private static void getWaveSize() {
		waveSize = 666;

		while (waveSize < 1 || waveSize > 4) {

			try {
				waveSize = Integer.parseInt(input.nextLine());
				
				if (waveSize != 666 && (waveSize < 1 || waveSize > 4)) {
					System.out.println("That number is too radical.  1 through 4 dude!");
				}
				
			} catch (NumberFormatException e) {
				System.out.println("I need a digit, dude.");
			}

			
		}

	}

	private static void waveMultiplier() {

		for (int waveMultiplier = waveSize; waveMultiplier > 1; waveMultiplier--) {
			wave0 += wave0;
			wave1 += wave1;
			wave2 += wave2;
			wave3 += wave3;
			wave4 += wave4;
			wave5 += wave5;
			wave6 += wave6;
			wave7 += wave7;
		}
	}
	
	private static void printCowabunga() throws InterruptedException {
		System.out.println(" .d8888b.   .d88888b.  888       888 \r\n" + 
				"d88P  Y88b d88P\" \"Y88b 888   o   888 \r\n" + 
				"888    888 888     888 888  d8b  888 \r\n" + 
				"888        888     888 888 d888b 888 \r\n" + 
				"888        888     888 888d88888b888 \r\n" + 
				"888    888 888     888 88888P Y88888 \r\n" + 
				"Y88b  d88P Y88b. .d88P 8888P   Y8888 \r\n" + 
				" \"Y8888P\"   \"Y88888P\"  888P     Y888 ");
		TimeUnit.MILLISECONDS.sleep(200);
		System.out.println("       d8888 \r\n" + 
				"      d88888 \r\n" + 
				"     d88P888 \r\n" + 
				"    d88P 888 \r\n" + 
				"   d88P  888 \r\n" + 
				"  d88P   888 \r\n" + 
				" d8888888888 \r\n" + 
				"d88P     888");
		TimeUnit.MILLISECONDS.sleep(300);
		System.out.println("888888b.   888     888 888b    888 \r\n" + 
				"888  \"88b  888     888 8888b   888 \r\n" + 
				"888  .88P  888     888 88888b  888 \r\n" + 
				"8888888K.  888     888 888Y88b 888 \r\n" + 
				"888  \"Y88b 888     888 888 Y88b888 \r\n" + 
				"888    888 888     888 888  Y88888 \r\n" + 
				"888   d88P Y88b. .d88P 888   Y8888 \r\n" + 
				"8888888P\"   \"Y88888P\"  888    Y888");
		
			TimeUnit.MILLISECONDS.sleep(300);
		
		System.out.println(" .d8888b.         d8888 888    888 888 \r\n" + 
				"d88P  Y88b       d88888 888    888 888 \r\n" + 
				"888    888      d88P888 888    888 888 \r\n" + 
				"888            d88P 888 8888888888 888 \r\n" + 
				"888  88888    d88P  888 888    888 888 \r\n" + 
				"888    888   d88P   888 888    888 Y8P \r\n" + 
				"Y88b  d88P  d8888888888 888    888  \"  \r\n" + 
				" \"Y8888P88 d88P     888 888    888 888");
		TimeUnit.MILLISECONDS.sleep(300);
	}
}
