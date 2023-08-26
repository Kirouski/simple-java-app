package org.example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class AppTest {

    @BeforeClass
    public static void initTest() {
        System.out.println("init");
    }

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue( true );
    }

    @Test
    public void shouldAnswerWithFalse() {
        assertFalse( false );
    }

    @Test
    public void shouldAnswerWithFalse2() {
        assertFalse( false );
    }


    @AfterClass
    public static void tearDown() {
        System.out.println("tests is executed");
    }
}
