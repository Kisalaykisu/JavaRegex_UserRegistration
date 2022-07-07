// Regular Expressions or Regex (in short) in Java is an API for defining String patterns that can be used for searching,
// manipulating, and editing a string in Java.
package com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastName {
    /**
     * This method takes Last Name which starts with Capital letter and has minimum of 3 characters
     *
     * @param Lastname is used for comparing with regex
     */
    public boolean isLastName(String Lastname) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher = pattern.matcher(Lastname);
        return matcher.matches();
    }

    public static void main(String[] args) {
        LastName obj = new LastName();
        obj.isLastName("KisaLAy");
        obj.isLastName("kisalay");
    }
}