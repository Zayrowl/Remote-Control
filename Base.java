
public class Base implements ControlCenter
{
	private String device;
	public Base()
	{
		device = "";
	}
	public Base(String device)
	{
		setDevice(device);
	}
	public void setDevice(String b)
	{
		this.device = b;
	}
	public String getDevice()
	{
		return this.device;
	}
	public void on()
	{
		System.out.println(getDevice() + "is turned on!");
	}
	public String off()
	{
		String offMessage = " is turned off!";
		return offMessage;
	}
	public String toString()
	{
		return device;
	}
}
