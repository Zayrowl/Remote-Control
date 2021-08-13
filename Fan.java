import java.util.Scanner;

public class Fan extends Base
{
	Scanner input = new Scanner(System.in);
	private int speed;
	private int response;
	public Fan()
	{
		super();
		speed = 1;
	}
	public Fan(String device)
	{
		super.setDevice(device);
		speed = 1;
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
		System.out.println("Speed is currently at " + speed + ".\nDo you want to change the speed? [0:YES/NO:1]: ");
		response = input.nextInt();
		while (response != 0 && response != 1)
		{
			System.out.println("Invalid response.Please enter another response");
			response = input.nextInt();
		}
		if (response == 0)
		{
			changeSpeed();
		}
		else if (response == 1)
		{
			getResponse();
		}
	}
	public void changeSpeed()
	{
		System.out.println("Please enter the speed [1-4]: ");
		speed = input.nextInt();
		while (speed != 1 && speed != 2 && speed != 3 && speed != 4 )
		{
			System.out.println("Invalid speed.Please enter another speed");
			speed = input.nextInt();
		}
		System.out.println("Speed is set to " + speed + ".");
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
