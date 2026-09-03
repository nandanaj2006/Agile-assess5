package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class BookingSystemTest {

    @Test
    public void testRegularNoDiscount() {
        BookingSystem booking = new BookingSystem();
        assertEquals(1500.0, booking.calculateTotalCost("Regular", 3), 0.001);
    }

    @Test
    public void testPremiumWithDiscount() {
        BookingSystem booking = new BookingSystem();
        // 6 tickets * 1200 = 7200 -> 10% off = 6480.0
        assertEquals(6480.0, booking.calculateTotalCost("Premium", 6), 0.001);
    }

    @Test
    public void testVipNoDiscount() {
        BookingSystem booking = new BookingSystem();
        assertEquals(5000.0, booking.calculateTotalCost("VIP", 2), 0.001);
    }

    @Test
    public void testVipWithDiscount() {
        BookingSystem booking = new BookingSystem();
        // 10 tickets * 2500 = 25000 -> 10% off = 22500.0
        assertEquals(22500.0, booking.calculateTotalCost("VIP", 10), 0.001);
    }
}
