/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.test;

import org.junit.Test;
import static org.junit.Assert.*;
import vut.data.AmGamer;
import vut.data.ProGamer;

/**
 *
 * @author thato
 */
public class GamerTester {

    @Test
    public void testGenCodeAmGamer1() {
        AmGamer gamer = new AmGamer("123", "Tshepo Lekoka", 25, 1);
        assertEquals("A123-1", gamer.genCode());
    }

    @Test
    public void testGenCodeAmGamer2() {
        AmGamer gamer = new AmGamer("456", "Glad Maimele", 14, 2);
        assertEquals("A456-2", gamer.genCode());

    }

    @Test
    public void testGenCodeAmGamer3() {
        AmGamer gamer = new AmGamer("789", "Golden Similo", 21, 3);
        assertEquals("A789-3", gamer.genCode());
    }

    //test for pro gamers
    @Test
    public void testGenCodeProGamer1() {
        ProGamer gamer = new ProGamer("101", "Tumelo Lenotha", 36, 5, 15);
        assertEquals("P1536-05", gamer.genCode());
    }

    @Test
    public void testGenCodeProGamer2() {
        ProGamer gamer = new ProGamer("202", "Vishaka Chauke", 34, 18, 75);
        assertEquals("P7534-18", gamer.genCode());

    }

    @Test
    public void testCalculateDiscountProGamer1() {
        ProGamer gamer = new ProGamer("103", "Mbali Mantso", 8, 1, 20);
        assertEquals(50, gamer.calculateDiscount(1000));

    }

    @Test
    public void testcalculateDiscountProGamer1() {
        ProGamer gamer = new ProGamer("104", "Mania Mangope", 13, 1, 12);
        assertEquals(50, gamer.calculateDiscount(1000)); // Age < 16
    }

    @Test
    public void testcalculateDiscountAmGamer1() {
        AmGamer gamer = new AmGamer("123", "Latricia Fisher", 18, 2);
        assertEquals(20, gamer.calculateDiscount(1000));

    }

    @Test
    public void testcalculationDiscountAmGamer2() {
        AmGamer gamer = new AmGamer("456", "Glad Maimane", 20, 3);
        assertEquals(0, gamer.calculateDiscount(1000));

    }

    @Test
    public void testcalculationDiscountAmGamer3() {
        AmGamer gamer = new AmGamer("789", "Hlupile Tree", 17, 3);
        assertEquals(0, gamer.calculateDiscount(1000));

    }

    @Test
    public void testcalculationDiscountAmGamer4() {
        AmGamer gamer = new AmGamer("202", "Golden Similo", 21, 2);
        assertEquals(20, gamer.calculateDiscount(1000));

    }

}
