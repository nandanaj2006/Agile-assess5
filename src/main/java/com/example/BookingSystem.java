package com.example;

public class BookingSystem {

    public double calculateTotalCost(String category, int numberOfTickets) {
        if (numberOfTickets <= 0) {
            throw new IllegalArgumentException("Ticket count must be greater than 0");
        }

        double ratePerTicket = 0.0;

        switch (category.toLowerCase()) {
            case "regular":
                ratePerTicket = 500.0;
                break;
            case "premium":
                ratePerTicket = 1200.0;
                break;
            case "vip":
                ratePerTicket = 2500.0;
                break;
            default:
                throw new IllegalArgumentException("Unknown ticket category: " + category);
        }

        double subtotal = ratePerTicket * numberOfTickets;

        // Apply a 10% discount if booking exceeds 5 tickets
        if (numberOfTickets > 5) {
            subtotal *= 0.90;
        }

        return subtotal;
    }
}
