package inheritance;

public class BankMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChequingAccount chqAccount = new ChequingAccount();
		chqAccount.depositMoney(1000);
		
		System.out.println("Authorization for Checking account:" + chqAccount.authorization(1234, "Chequing"));

		SavingAccount svngAccount = new SavingAccount();
		System.out.println("Authorization for Savings account:" + svngAccount.authorization(1234,"Saving"));

		TFSA tfsa = new TFSA();
		System.out.println("Authorization for TFSA account:" + tfsa.authorization(1234,"TFSA"));

		tfsa.depositMoney(5000);

		System.out.println("Balance in chequing : " + chqAccount.balance);

		System.out.println("Balance in Saving : " + svngAccount.balance);

		System.out.println("Balance in TFSA : " + tfsa.balance);
	}

}