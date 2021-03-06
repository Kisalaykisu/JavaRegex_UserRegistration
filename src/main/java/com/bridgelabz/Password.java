// Regular Expressions or Regex (in short) in Java is an API for defining String patterns that can be used for searching,
// manipulating, and editing a string in Java.
package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    /**
     * Method to check if the password is valid or not
     *
     * @param passcode takes in the passcode string as a parameter
     * @return returns boolean true if the password matches the requirement
     */
    public boolean password(String passcode) {

        Pattern pattern = Pattern.compile("^(?=.*[A-Z])[a-zA-Z0-9 !@#$%^&*(){}'.,+-_]{8,}");  //
        Matcher matcher = pattern.matcher(passcode);
        return matcher.matches();
    }

    public static void main(String[] args) {

        Password obj = new Password();
        System.out.println(obj.password("kisalay@97"));

    }
}