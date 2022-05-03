package day2.assignment;

public class Mobile1 {
	public void sendMessages() 
	{
		System.out.println("Send messages");
	}
	public void shareDocument() 
	{
		System.out.println("Share Document");
	}
	public void call() 
	{
		System.out.println("Call");
	}
	public static void main(String[] args) {
		Mobile1 mob1 = new Mobile1();
		mob1.sendMessages();
		mob1.shareDocument();
		mob1.call();
	}

}
