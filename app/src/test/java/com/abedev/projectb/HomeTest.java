package com.abedev.projectb;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Abed on 28/10/2017.
 */
public class HomeTest {
    @Test
    public void onCreate() throws Exception {
        Home home = new Home();
        int expected=12;
        int n;
//        for (int i = 0; i < 10; i++) {
            n =  home.generateRandomNumber();
            System.out.println("value : " + n);
        assertEquals(expected,n);
//        }
    }

}