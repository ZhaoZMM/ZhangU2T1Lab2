public class ChatBotRunner {
    public static void main(String[] args){
        ChatBot chatbot1 = new ChatBot("debbie",2);
        chatbot1.greeting("Zhao");
        chatbot1.weather();
        chatbot1.invitation();
        chatbot1.favoriteNumber(32);
        System.out.println("There are "+chatbot1.convertFeetToMeters(6)+" meters in 6 feet");
        System.out.println("1+2+3 is equal to "+chatbot1.addNumbers(1,2,3));
        System.out.println("1x2x3 is equal to "+chatbot1.multNumbers(1,2,3));
        System.out.println(chatbot1.goodbye());
    }
}
