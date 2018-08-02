package in.co.savingsaccount;

import java.util.ArrayList;
import java.util.List;

public class SavingAccountTest {

	public static void main(String[] args) {
		
		SavingAccount savingaccount1 = new SavingAccount(4521445 , 5621 , 25145, "ankit",true);
		SavingAccount savingaccount2 = new SavingAccount(565456 , 5625 , 25144, "rupesh",true);
		SavingAccount savingaccount3 = new SavingAccount(452124 , 5681 , 25045, "daniel",true);
		SavingAccount savingaccount4 = new SavingAccount(4523445 , 5631 , 27145,"pratyush",true);
		SavingAccount savingaccount5 = new SavingAccount(4521441 , 5620 , 25105, "robert",true);
		
		List<SavingAccount> saving = new ArrayList<SavingAccount>();
		saving.add(savingaccount1);
		saving.add(savingaccount2);
		saving.add(savingaccount3);
		saving.add(savingaccount4);
		saving.add(savingaccount5);
		
		for(SavingAccount savings:saving)
		{
			System.out.println(savings);
		}
		
		savingaccount1.withdraw(1000);
		savingaccount2.withdraw(2000);
		savingaccount3.withdraw(3000);
		savingaccount4.withdraw(4000);
		savingaccount5.withdraw(5000);
		
		saving.stream().forEach(System.out::println);
		
		savingaccount1.deposit(100);
		savingaccount2.deposit(200);
		savingaccount3.deposit(300);
		savingaccount4.deposit(400);
		savingaccount5.deposit(500);
		
		saving.stream().forEach(System.out::println);
		
		
	
	}

}
