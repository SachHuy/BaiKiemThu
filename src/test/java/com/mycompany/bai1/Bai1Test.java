/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.bai1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 605
 */
public class Bai1Test {

    @Test
    public void testEquilateralTriangle() {
        String result = Bai1.classifyTriangle(5, 5, 5);
        assertEquals("Equilateral", result);
    }

    @Test
    public void testIsoscelesTriangle() {
        String result = Bai1.classifyTriangle(5, 5, 6);
        assertEquals("Isosceles", result);
    }

    @Test
    public void testScaleneTriangle() {
        String result = Bai1.classifyTriangle(3, 4, 6);
        assertEquals("Scalene", result);
    }

    @Test
    public void testNotATriangle() {
        String result = Bai1.classifyTriangle(1, 2, 3);
        assertEquals("NotATriangle", result);
    }

    @Test
    public void testRightTriangle() {
        String result = Bai1.classifyTriangle(3, 4, 5);
        assertEquals("Right", result);
    }

    @Test
    public void testInvalidTriangle() {
        String result = Bai1.classifyTriangle(1, 1, 100);
        assertEquals("NotATriangle", result);
    }
}
