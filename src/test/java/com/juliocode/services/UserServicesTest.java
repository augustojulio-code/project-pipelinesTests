package com.juliocode.services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserServicesTest {
    UserServices uServices = new UserServices();

    @Test
    public void testCalc() {
        assertEquals(true, uServices.calc());
    }

    @Test
    public void testGetNumber() {

        uServices.getNumber();

    }

    @Test
    public void testGetName() {
        uServices.getName();
    }

    @Test
    public void testUserData() {
        uServices.userData();
    }
}
