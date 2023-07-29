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
    public void testValidation() {
        assertEquals("Olá imbecil".toLowerCase(), uServices.validationTest().toLowerCase());
    }

}
