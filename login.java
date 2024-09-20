
import java.util.Scanner;

public class login {
   public login() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = 0;
      boolean var3 = false;

      while(var2 < 3 && !var3) {
         System.out.println("Enter user ID: ");
         String var4 = var1.nextLine();
         System.out.println("Enter password: ");
         String var5 = var1.nextLine();
         if (var4.equals("arunabh") && var5.equals("3333")) {
            var3 = true;
            System.out.println("Login successful!");
         } else {
            ++var2;
            System.out.println("Invalid user ID or password. Attempts remaining: " + (3 - var2));
         }
      }

      if (!var3) {
         System.out.println("Login failed. Maximum attempts reached.");
      }

   }
}