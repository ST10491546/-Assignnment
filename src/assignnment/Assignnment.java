/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignnment;

import java.util.Scanner;
public class Assignnment {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       LoginDetails login = new LoginDetails();

        System.out.println("Register a new user:");
         System.out.print("Enter firstname: ");
        String firstname = scanner.nextLine();
         System.out.print("Enter lastname: ");
        String lastname = scanner.nextLine();
        System.out.print("Enter username( username should contain _ and should not be more than five characters): ");
        String username = scanner.nextLine();
        login.setRegisteredUsername(username);
        
        if ( login.checkName(username)){
            System.out.println("Username successfully captured");   
        }else{
            System.out.println("Username is not successfully captured");
        }
        System.out.print("Enter password (password should contain special characters,Uppercase,Digit and should have a minimum of 8 character: ");
        String password = scanner.nextLine();
        login.setRegisteredPassword(password);
         
        
        if ( login.checkPasswordComplexity(password)){
            System.out.println("Password is successfully captured");
            
        }else{
            System.out.println("(Password is not successfully captured");
        }
        System.out.print("Enter SA phone number (+27...): ");
        String phone = scanner.nextLine();
        if (login.checkCellPhoneNumber(phone)){
            System.out.println("Cellphone number is successfully captured");
            
        }else{
            System.out.println("Cellphone number is not successfully captured");
        }

        String regMsg = login.registerUser(username, password);
        System.out.println(regMsg);

        System.out.println("\nNow login:");
        System.out.print("Enter username: ");
        String loginUser = scanner.nextLine();
        System.out.print("Enter password: ");
        String loginPass = scanner.nextLine();
        
          boolean isLoggedIn = login.loginUser(loginUser, loginPass);
          String welcomeMessage = login.returnLoginStatus(isLoggedIn, firstname, lastname);
        
        //System.out.println(login.returnLoginStatus(isLoggedIn, fname, lname));

        if (isLoggedIn) {
            System.out.println("login successful");
            System.out.println(welcomeMessage);
        }

        scanner.close();
    }
}


