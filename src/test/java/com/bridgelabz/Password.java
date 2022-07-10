package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Password{

    Password obj = new Password();

    @Test
    public void happyFirstName() {
        Assertions.assertTrue(obj.isFirstName("Kisalay"));
    }

    @Test
    public void sadFirstName2() {
        Assertions.assertFalse(obj.isFirstName("Kisalay kisalay"));
    }

    @Test
    public void happyLastName() {
        Assertions.assertTrue(obj.isLastName("kisalay"));
    }

    @Test
    public void sadLastName() {
        Assertions.assertFalse(obj.isLastName("kisalaY"));
    }

    @Test
    public void happyNumber() {
        Assertions.assertTrue(obj.isNumber("91 9341561823"));
    }

    @Test
    public void sadNumber() {
        Assertions.assertFalse(obj.isNumber("91 9341561823551"));
    }

    @Test
    public void happyPassword() {
        Assertions.assertTrue(obj.password("^&^%$#$jdnHkj8"));
    }

    @Test
    public void sadPassword() {
        Assertions.assertFalse(obj.password("^&^%$#$jdnkj8"));
    }
}