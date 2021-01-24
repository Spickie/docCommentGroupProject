package gameConsoles;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author vicar
 *
 */

public class ConsoleList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<GameConsoles> consoles = new ArrayList<>();
		consoles.add(new GameConsoles("New", "Microsoft", "Xbox One"));
		consoles.add(new GameConsoles("New", "Sony", "PlayStation 5"));
		consoles.add(new GameConsoles("Used", "Nintendo", "Switch"));
		consoles.add(new GameConsoles("New", "Nintendo", "Switch"));
		
		listAllconsoles(consoles);
		findConsole(consoles, input);
		listAllConsoles(consoles);
		removeConsole(s)
		listAllconsoles(consoles);
		addConsole(consoles, input);
		
		
	
		
	
		
	}

	private static void findConsole(ArrayList<GameConsoles> consoles, Scanner input) {
		System.out.print("Console ID: ");
		int id = input.nextInt();
		System.out.println();
		
		boolean found = false;
        for (int i = 0; i< consoles.size(); i++) {
        	GameConsoles g = consoles.get(i);
            if( g.getId() == id); {
                System.out.println(g);
                found = true;
                break;
			}
		}
        if(!found)
        	System.out.println("no console with id " + id + "could be found");
        System.out.println();
       
	}

	private static void addConsole(ArrayList<GameConsoles> consoles, Scanner input) {
		System.out.println("Console Quality: ");
		String quality = input.nextLine();
		System.out.println("Company: ");
		String company = input.nextLine();
		System.out.println("Model: ");
		String model = input.nextLine();
		System.out.println();
		GameConsoles newGameConsoles = new GameConsoles(quality, company, model);
		consoles.add(newGameConsoles);
	
		
		
	
		
	}

	private static void listAllconsoles(ArrayList<GameConsoles> consoles) {
		for(GameConsoles d : consoles) {
			System.out.println(d);
		}
		System.out.println();
	}
	

}
