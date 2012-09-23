package cs151.hw2.ex4_04;

import java.util.*;

public class BankAccountTester {
	public static void main(String args[]) {
		ArrayList<BankAccount> accList = new ArrayList<BankAccount>();
		accList.add(new BankAccount("Jerry Wu", "007212361", 1000.23));
		accList.add(new BankAccount("Kang Ge", "006987789", 1234.5));
		accList.add(new BankAccount("Bing Ge", "008764536", 421.4));
		
		Collections.sort(accList);
		
		for (BankAccount a : accList) {
			System.out.println(a.getName() + " : Balance is " + a.getBalance());
		}
	}

}
