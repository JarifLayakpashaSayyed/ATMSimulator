package com.atm;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AtmMachine 
{

	public static void main(String[] args) throws NumberFormatException, IOException 
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int main_menu_exit = 1,balance=10000, amount = 0;
		int atm_menu_exit = 1;
		int two_hundred=0,five_hundred=0,two_thousand=0;
				
		String pin = "123";
		while(main_menu_exit==1)
		{
			System.out.println("Enter Your Pin : ");
			String checkpin = br.readLine();

			if(checkpin.isEmpty() || checkpin.isBlank())
			{
				System.out.println("You need to enter pin...");
			}
			else
			{
				if(pin.equals(checkpin)) 
				{
					while(atm_menu_exit==1)
					{
						System.out.println("\t\t-------- ATM --------- ");		
						System.out.println("1. Deposit Money");
						System.out.println("2. Withdraw Money");
						System.out.println("3. Check Balance");
						System.out.println("4. Exit");
						
						System.out.println("Enter your choice : ");
						String choice = br.readLine();
						
						if(choice.isEmpty())
						{
							System.out.println("Please enter the choice...");
						}
						else
						{
							int choice1 = Integer.parseInt(choice);
							
							switch (choice1) 
							{
								case 1:
									System.out.println("Your current balance is = " + balance);
									System.out.print("Enter amount to deposit : ");
									amount = Integer.parseInt(br.readLine());
									balance += amount;
									System.out.println("After deposit Your balance is = " + balance);
									break;
								case 2:
									System.out.println("Your current balance is = " + balance);
									System.out.print("How much amount do you want to withdraw : ");
									amount = Integer.parseInt(br.readLine());
									if(amount<=balance)
									{
										if(amount%100==0)
										{
											if(amount > 2500)
											{
												if(amount%2000 == 0)
												{
													two_thousand = amount / 2000;
													amount -= (two_thousand-1) * 2000;
													System.out.println("2000 * " + (two_thousand-1));
												}
												else 
												{
													two_thousand = amount / 2000;
													amount -= two_thousand * 2000;
													System.out.println("2000 * " + two_thousand);
												}
												
												if(amount>500)
												{
													if(amount%500==0)
													{
														five_hundred = amount / 500;
														amount -= (five_hundred-1) * 500;
														System.out.println("500 * " + (five_hundred-1));
													}
													else
													{
														five_hundred = amount / 500;
														amount -= five_hundred * 500;
														System.out.println("500 * " + five_hundred);
													}
													if(amount > 200)
													{
														if(amount%200==0)
														{
															two_hundred = amount / 200;
															amount -= two_hundred * 200;
															System.out.println("200 * "+two_hundred);
														}
														else 
														{
															two_hundred = amount / 200;
															amount -= two_hundred * 200;
															System.out.println("200 * "+two_hundred);
														}
														
														System.out.println("100 * " + (amount/100));
													}
													else
													{
														System.out.println("100 * " + (amount/100));
													}
												}
												else //amt < 500
												{
													if(amount > 200)
													{
														if(amount%200==0)
														{
															two_hundred = amount / 200;
															amount -= two_hundred * 200;
															System.out.println("200 * "+two_hundred);
														}
														else 
														{
															two_hundred = amount / 200;
															amount -= two_hundred * 200;
															System.out.println("200 * "+two_hundred);
														}
														
														System.out.println("100 * " + (amount/100));
													}
													else
													{
														System.out.println("100 * " + (amount/100));
													}
												}
												
											}
											else // amt < 2500
											{
												if(amount>500)
												{
													if(amount%500==0)
													{
														five_hundred = amount / 500;
														amount -= (five_hundred-1) * 500;
														System.out.println("500 * " + (five_hundred-1));
													}
													else
													{
														five_hundred = amount / 500;
														amount -= five_hundred * 500;
														System.out.println("500 * " + five_hundred);
													}
													if(amount > 200)
													{
														if(amount%200==0)
														{
															two_hundred = amount / 200;
															amount -= two_hundred * 200;
															System.out.println("200 * "+two_hundred);
														}
														else 
														{
															two_hundred = amount / 200;
															amount -= two_hundred * 200;
															System.out.println("200 * "+two_hundred);
														}
														
														System.out.println("100 * " + (amount/100));
													}
													else
													{
														System.out.println("100 * " + (amount/100));
													}
												}
												else //amt <500
												{
													if(amount > 200)
													{
														if(amount%200==0)
														{
															two_hundred = amount / 200;
															amount -= (two_hundred-1) * 200;
															System.out.println("200 * "+ (two_hundred-1));
														}
														else 
														{
															two_hundred = amount / 200;
															amount -= two_hundred * 200;
															System.out.println("200 * "+two_hundred);
														}
														
														System.out.println("100 * " + (amount/100));
													}
													else
													{
														System.out.println("100 * " + (amount/100));
													}
												}
											}
										}
										else
										{
											System.out.println("Amount should be multiple of 100...");
										}
									}
									else
									{
										System.out.println("INSUFFICIENT BALANCE...");
									}
									break;
								case 3:
									System.out.println("Your current balance is = " + balance);
									break;
								case 4:
									System.exit(0);
								default:
									System.out.println("Wrong choice...");

							}

						}			
						
						System.out.println("\nDo u want to exit from main menu : Yes-0/No-1 ");
						atm_menu_exit = Integer.parseInt(br.readLine());
					}
				}
				else
				{
					System.out.println("Entered Pin is Wrong...Try Later...");
				}

			}
			System.out.println("\nDo u want to exit from main menu : Yes-0/No-1 ");
			main_menu_exit = Integer.parseInt(br.readLine());
		
		}

	}

}
