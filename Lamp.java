import java.util.Scanner;

public class Lamp extends Base 
{
	Scanner input = new Scanner(System.in);
	private int intensity;
	private int response;
	public Lamp()
	{
		super();
		intensity = 1;
	}
	public Lamp(String device)
	{
		super.setDevice(device);
		intensity = 1;
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
		System.out.println("Intensity is currently at " + intensity + ".\nDo you want to change the intensity? [0:YES/NO:1]: ");
		response = input.nextInt();
		while (response != 0 && response != 1)
		{
			System.out.println("Invalid response.Please enter another response");
			response = input.nextInt();
		}
		if (response ==0)
		{
			changeIntensity();
		}
		else if (response == 1)
		{
			option();
			getResponse();
		}
	}
	public void changeIntensity()
	{
		System.out.println("Please enter the intensity [1-4]: ");
		intensity = input.nextInt();
		while (intensity != 1 && intensity != 2 && intensity != 3 && intensity != 4 )
		{
			System.out.println("Invalid intensity.Please enter another intensity");
			intensity = input.nextInt();
		}
		System.out.println("Intensity is set to " + intensity + ".");
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
