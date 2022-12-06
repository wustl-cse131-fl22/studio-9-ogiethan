package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<String, Double> mapHeight = new HashMap<String, Double>();
		System.out.println("Which group member?");
		String name = in.next();
		if(name.equals("Quit")) {
			System.out.println("Ok");
		}
		while(!name.equals("Quit")){

			if (name.equals("Ogi")) {
				mapHeight.put("Ogi", 6.04);
				System.out.println("Ogi" + mapHeight.get("Ogi"));
				name = in.next();
			}
			else if (name.equals("Ethan")) {
				mapHeight.put("Ethan",6.13 );
				System.out.println("Ethan" + mapHeight.get("Ethan"));
				name = in.next();
			}else {
				System.out.println("Please enter a group member's name");
				name = in.next();
			}

		}

	}
}
