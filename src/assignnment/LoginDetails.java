/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignnment;

/**
 *
 * @author RC_Student_lab
 */
public class LoginDetails {
    private String registeredUsername;
    private String registeredPassword;
    private String registeredPhone;

    public String getRegisteredUsername() {
        return registeredUsername;
    }

    public void setRegisteredUsername(String registeredUsername) {
        this.registeredUsername = registeredUsername;
    }

    public String getRegisteredPassword() {
        return registeredPassword;
    }

    public void setRegisteredPassword(String registeredPassword) {
        this.registeredPassword = registeredPassword;
    }

    public String getRegisteredPhone() {
        return registeredPhone;
    }

    public void setRegisteredPhone(String registeredPhone) {
        this.registeredPhone = registeredPhone;
    }

    public boolean checkName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    public boolean checkPasswordComplexity(String password) {
       return password.length()>= 8 &&   password.length()<= 25&& password.matches(".[A-Z].") &&password.matches(".[a-z].") && password.matches(".[0-9].") && password.matches(".[!@#$%^&().]*");
    }

    public boolean checkCellPhoneNumber(String phone) {
        return phone.startsWith("+27") && phone.length() <= 13;
    }

    public String registerUser(String username, String password) {
        if (checkName(username)   && checkPasswordComplexity(password)) {
            return "The two above conditions have been met and the user has been registered successfully.";
        }
        else if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        } else{
            return "Username is not correctly formatted";
        }
    
    }
    public boolean loginUser(String username, String password) {
        return username.equals(registeredUsername) && password.equals(registeredPassword);
    }

    public String returnLoginStatus(boolean loginStatus, String firstName, String lastName) {
        if (loginStatus) {
            return "Welcome " + firstName + " " + lastName + ", it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
    
}
