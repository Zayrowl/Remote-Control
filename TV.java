import java.util.Scanner;
public class TV extends Base
{
	Scanner input = new Scanner(System.in);
	private int choice;
	private int volume;
	private int response;
	public TV()
	{
		super();
	}
	public TV(String device)
	{
		super.setDevice(device);
	}
	public void on()
	{
		System.out.println(super.getDevice() + " is turned on!");
		option();
	}
	public void option()
	{
		System.out.println("====================================================");
		System.out.println("\t\t"+ super.getDevice());
		System.out.println("====================================================");
		System.out.println("\t\t[1]CHANGE CHANNEL");
		System.out.println("\t\t[2]ADJUST VOLUME");
		System.out.println("====================================================");
		System.out.println("Please choose your option: ");
		choice = input.nextInt();
		while (choice != 1 && choice != 2)
		{
			System.out.println("Invalid input.Please enter another input");
			choice = input.nextInt();
		}
		if (choice == 1)
		{
			changeChannel();
		}
		else if (choice == 2)
		{
			adjustVolume();
		}
	}
	public void changeChannel()
	{
		System.out.println("====================================================");
		System.out.println("Channels Available: ");
		System.out.println("\t\t[1]HBO");
		System.out.println("\t\t[2]Cinemax");
		System.out.println("\t\t[3]Fox Movies");
		System.out.println("====================================================");
		System.out.println("Please enter your choice: ");
		choice = input.nextInt();
		while (choice != 1 && choice != 2 && choice != 3)
		{
			System.out.println("Invalid input.Please enter another input");
			choice = input.nextInt();
		}
		if (choice == 1)
		{
			System.out.println("You are now viewing HBO Channel");
		}
		else if (choice == 2)
		{
			System.out.println("You are now viewing Cinemax Channel");
		}
		else if (choice == 3)
		{
			System.out.println("You are now viewing Fox Movies Channel");
		}
		getResponse();
	}
	
	public void adjustVolume()
	{
		System.out.println("Please enter the volume [1-100]: ");
		volume = input.nextInt();
		while (volume < 0 || volume > 100)
		{
			System.out.println("Invalid volume.Please enter another volume");
			volume = input.nextInt();
		}
		System.out.println("Volume is set to " + volume);
		getResponse();
	}
	
	public void getResponse()
	{
		System.out.println("Do you want to turn off?  [0:YES/NO:1]: ");
		response = input.nextInt();
		while (response != 0 && response != 1)
		{
			System.out.println("Invalid response.Please enter another response");
			response = input.nextInt();
		}
		if (response ==0)
		{
			System.out.println(off());
		}
		else if (response == 1)
		{
			option();
		}
	}
	
	public String off()
	{
		return super.getDevice() + super.off();
	}
	
}
