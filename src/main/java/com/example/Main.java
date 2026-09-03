package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookingSystem booking = new BookingSystem();

        System.out.print("Enter number of bookings to process: ");
        int totalBookings = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= totalBookings; i++) {
            System.out.println("\n--- Booking " + i + " ---");
            
            System.out.print("Customer Name: ");
            String name = scanner.nextLine();

            System.out.print("Category (Regular/Premium/VIP): ");
            String category = scanner.nextLine();

            System.out.print("Number of Tickets: ");
            int tickets = Integer.parseInt(scanner.nextLine());

            try {
                double total = booking.calculateTotalCost(category, tickets);
                System.out.println("Booking Summary for: " + name);
                System.out.println("Category: " + category + " | Quantity: " + tickets);
                System.out.printf("Final Cost (with discounts if applicable): Rs. %.2f%n", total);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
