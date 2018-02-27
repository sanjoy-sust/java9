package com.flop.client;
import com.flop.coder.Welcome;

public class WelcomeClient
{
    public static void main(String[] args) {
      WelcomeClient client = new WelcomeClient();
      client.getMessage();
    }

   public String getMessage()
   {
       Welcome welcome = new Welcome();
       String message = welcome.welcome();
       System.out.println(message);
       return message;
   }
}
