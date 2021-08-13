import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) 
	{
		System.out.println("\n\n");
		System.out.println("========================================================");
		System.out.println("|                   GROUP DETAILS                      |");
		System.out.println("========================================================");
		System.out.println("| COURSE : BACHELOR IN COMPUTER SCIENCE                |");
		System.out.println("--------------------------------------------------------");
		System.out.println("|NO.|                NAME                     |   ID   |");
		System.out.println("--------------------------------------------------------");
		System.out.println("| 1 |MUHAMMAD ZAHIRUL IMAN BIN MOHAMAD SHAHRUL|19001218|");
		System.out.println("--------------------------------------------------------");
		System.out.println("| 2 |IMAN NUR AINA BINTI ROSLAN               |19001241|");
		System.out.println("--------------------------------------------------------");
		System.out.println("\n\n");
		int choice;
		int response = 0;
		Scanner input = new Scanner(System.in);
		Base[] device = new Base[5];
		device[0] = new TV("LG TV");
		device[1] = new TV("Samsung TV");
		device[2] = new Fan("Philip Fan");
		device[3] = new Lamp("Panasonic Lamp");
		device[4] = new Aircond("York Aircond");
		
		int size = device.length;
		System.out.println("====================================================");
		System.out.println("\t\tUNIVERSAL REMOTE");
		
		
		while (response == 0)
		{
			System.out.println("====================================================");
			System.out.println("Devices Available: ");
			System.out.println("====================================================");
			for (int i = 0 ; i < size ; i++)
			{
				System.out.println("\t\t[" + (i+1) + "]" + device[i]);
			}
			System.out.println("====================================================");
			System.out.println("Please choose a device that you want to control:  ");
			choice = input.nextInt();
			while (choice < 1 || choice > 5)
			{
				System.out.println("Invalid input.Please enter another input");
				choice = input.nextInt();
			}
			if (choice == 1)
			{
				device[0].on();
			}
			else if (choice == 2)
			{
				device[1].on();
			}
			else if (choice == 3)
			{
				device[2].on();
			}
			else if (choice == 4)
			{
				device[3].on();
			}
			else if (choice == 5)
			{
				device[4].on();
			}
			System.out.println("Do you want to control another device? [0:YES/NO:1]: ");
			response = input.nextInt();
		}
		System.out.println("====================================================");
		System.out.println("Thank you for using the Universal Remote!");
		System.out.println("====================================================");
		
	}

}
