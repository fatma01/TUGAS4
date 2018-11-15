
import java.util.Enumeration;

import java.util.Hashtable;

	public class Hash_Table {
		
		public static void main(String args[]) {

		// Create a hash map

		Hashtable balance = new Hashtable();

		Enumeration names;

		String str;

		double bal;



		balance.put("Ainun", new Double(150.50));

		balance.put("Fatma", new Double(450.3));

		balance.put("Liska", new Double(1560.65));

		balance.put("Alim", new Double(0.5));

		balance.put("Udin", new Double(-45.50));



		// Show all balances in hash table.

		names = balance.keys();

		while(names.hasMoreElements()) {

		str = (String) names.nextElement();

		System.out.println(str + ": " +

		balance.get(str));

		}

		System.out.println();

		// Deposit 1,000 into Zara's account

		bal = ((Double)balance.get("Ainun")).doubleValue();

		balance.put("Ainun", new Double(bal+1000));

		System.out.println("Ainun's new balance: " +

		balance.get("Ainun"));

		}
	}
