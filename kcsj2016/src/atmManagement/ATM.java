package atmManagement;

import java.io.*;
import java.util.Scanner;

public class ATM {
	private Account acc;
	private File dataFile;
	private FileWriter fw;
	private BufferedWriter bw;
	private String filePath = "./data.txt";
	int c=1;
	
	public ATM() {
		this.acc = new Account();
		try {
			this.dataFile = new File(this.filePath);
			if (!this.dataFile.exists()) {
				this.dataFile.createNewFile(); 
				}
			this.fw = new FileWriter(this.filePath);
			this.bw = new BufferedWriter(this.fw);
			} 
		catch (IOException io) {
			System.out.println("Cannot open file");
			io.printStackTrace(); 
			} 
		catch (Exception e) {
			e.printStackTrace(); 
			}
		}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new ATM().interact();
	}
	public void interact() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Account #: ");
		String temp = br.readLine();
	    System.out.println("Password: ");
		String temp2 = br.readLine();
		
		if (!this.acc.isValid(Long.parseLong(temp.trim()), temp2.trim())) {
			System.out.println("Wrong password");
			return; 
			}
		
		
		
		while (c != 0) {
			 /*String str = br.readLine();
		    try {
		    	int c = Integer.parseInt(str.trim());
		    	} 
		    catch (NumberFormatException nfe) {
		    	System.out.println("Invalid choice");
		    	continue;
		    	}*/
			System.out.println("1. Account Inquery.");
		    System.out.println("2. Withdraw");
		    System.out.println("3. Deposit.");
			System.out.println("4. Change Password.");
			System.out.println("5. Export to File.");
			System.out.println("0. Exit.");
			System.out.print("Your choice is: "); 
			
		    Scanner scan=new Scanner(System.in);
		    c = scan.nextInt();
		    

		    switch (c) {
		    case 0:
		    	System.out.println("Thank you");
		    	break;
		    case 1:
		        System.out.println("Balance: " + this.acc.balanceInquery());
		        break;
		    case 2:
		        System.out.println("How much? ");
		        String temp3 = br.readLine();
		        try {
		        	long ammount = Long.parseLong(temp3.trim());
		            this.acc.withdraw(ammount);
		            break;
		            } 
		        catch (NumberFormatException nfe) {
		        	System.out.println("Invalid amount");
		            continue;
		            }
		    case 3:
		         System.out.println("How much? ");
		         String temp4= br.readLine();
		         try {
		        	 long ammount = Long.parseLong(temp4.trim());
		             this.acc.deposit(ammount);
		              break;
		              } 
		         catch (NumberFormatException nfe) {
		        	 System.out.println("Invalid amount");
		             continue;
		             }
		     case 4:
		    	 System.out.println("Old password: ");
		         String temp5 = br.readLine();
		         System.out.println("New password: ");
		         String temp6 = br.readLine();
		         this.acc.changePassword(temp5, temp6);
		         break;
		     case 5:
		    	 this.bw.write(this.acc.toString());
		    	 bw.flush();
		         break;
		     default:
		    	 System.out.println("Invalid choice!");
		         break;
		         }
		    if(c != 0){
		    	System.out.println("Do you want to continue(press 1) OR over(press 0)");
		    	c = scan.nextInt();
		    	System.out.println("\n\n\n\n");
		    }
		}
		System.out.println("OVER");
	}
}

