package com.bridgelabz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    UserRegistration obj = new UserRegistration();

    @Test
    public void happyFirstName() {
        Assert.assertTrue(obj.isFirstName("Kisalay"));
    }

    @Test
    public void sadFirstName2() {
        Assert.assertFalse(obj.isFirstName("kisalay Srivastav"));
    }

    @Test
    public void happyLastName() {
        Assert.assertTrue(obj.isLastName("Srivastav"));
    }

    @Test
    public void sadLastName() {
        Assert.assertFalse(obj.isLastName("srivastaV"));
    }

    @Test
    public void happyNumber() {
        Assert.assertTrue(obj.isNumber("91 9341561823"));
    }

    @Test
    public void sadNumber() {
        Assert.assertFalse(obj.isNumber("91 9341561823551"));
    }

    @Test
    public void happyPassword() {
        Assert.assertTrue(obj.isPassword("^&^%$#$jdnHkj8"));
    }

    @Test
    public void sadPassword() {
        Assert.assertFalse(obj.isPassword("^&^%$#$jdnkj8"));
    }
}
