import java.util.Scanner;
public class Aircond extends Base
{
	Scanner input = new Scanner(System.in);
	private int temperature;
	private int response;
	private int choice;
	public Aircond()
	{
		super();
		temperature = 16;
	}
	public Aircond(String device)
	{
		super.setDevice(device);
		temperature = 16;
	}
	public void on()
	{
		System.out.println(super.getDevice() + " is turned on!");
		option();
	}
	public void option()
	{
		System.out.println("====================================================");
		System.out.println("\t\t"+super.getDevice());
		System.out.println("====================================================");
		System.out.println("\t\t[1]CHANGE TEMPERATURE");
		System.out.println("\t\t[2]CHANGE MODE");
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
			changeTemperature();
		}
		else if (choice == 2)
		{
			changeMode();
		}
	}
	
	
	public void changeTemperature()
	{
		System.out.println("Temperature is currently at " + temperature);
		System.out.println("Please enter the new temperature [16 - 30]: ");
		temperature = input.nextInt();
		while (temperature < 16 || temperature > 30 )
		{
			System.out.println("Invalid temperature.Please enter another temperature");
			temperature = input.nextInt();
		}
		System.out.println("Temperature is set to " + temperature + " Celsius.");
		getResponse();
	}
	public void changeMode()
	{
		System.out.println("====================================================");
		System.out.println("\t\t[1]DRY\n\t\t[2]COOL\n\t\t[3]FAN");
		System.out.println("====================================================");
		System.out.println("Please choose your option: ");
		choice = input.nextInt();
		while (choice != 1 && choice != 2 && choice != 3)
		{
			System.out.println("Invalid input.Please enter another input");
			choice = input.nextInt();
		}
		if (choice == 1)
		{
			System.out.println("Mode is change to Dry");
		}
		else if (choice == 2)
		{
			System.out.println("Mode is change to Cool");
		}
		else if (choice == 3)
		{
			System.out.println("Mode is change to Fan");
		}
		getResponse();
	}
	
	
	public void getResponse()
	{
		System.out.println("Do you want to turn off? [0:YES/NO:1]: ");
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
