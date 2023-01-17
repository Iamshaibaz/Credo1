package polymorphism;


class WhatsappOriginal
{
	void OnlyMessage(String message)
	{
		System.out.println("sending Only message "+message );
	}
	
}
class WhatsappUpdated extends WhatsappOriginal
{
	void OnlyMessage(String message)
	{
		System.out.println("Sending message with stickers "+ message);
	}
}



public class WhatsApp {
	public static void main(String[] args)
	{
		WhatsappUpdated w = new WhatsappUpdated();
		w.OnlyMessage("hi ");
	}

	
}
