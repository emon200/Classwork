package chatbotProject;

public class Chatbot {
	
	private String userName;
	private Topic amanat;
	private boolean chatting
	
	
	public Chatbot() {
		amanat = new ChatbotAmanat();
		userName = "unknown user";
		chatting = true;
	}
	
	public void startTalking() {
		ChatbotMain.print("Welcome to our chatbot! What is your name?");
		userName = ChatbotMain.getInput();
		while(chatting) {
			ChatbotMain.print("What do you want to talk about?");
			String response = ChatbotMain.getInput();
			if(amanat.isTriggered(response)) {
				chatting = false;
				amanat.startChatting();
			}
			else {
				ChatbotMain.print("I'm sorry I don't understand.");
			}
		}
	}
	
}
