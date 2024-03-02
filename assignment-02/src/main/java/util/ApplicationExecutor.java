package util;

import service.impl.CustomerServiceImpl;
import service.impl.InvoiceServiceImpl;

import java.util.Scanner;

public final class ApplicationExecutor {

    private ApplicationExecutor() {
    }

    public static void run(){
        Scanner keyboard1 = new Scanner(System.in);
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        InvoiceServiceImpl invoiceService = new InvoiceServiceImpl();
        boolean flag = true;

        while (flag) {
            printMenu();
            int number = keyboard1.nextInt();
            switch (number) {
                case 1 -> customerService.save(keyboard1);
                case 2 -> customerService.findAll();
                case 3 -> customerService.filterIfNameIncludesC();
                case 4 -> invoiceService.calculateTotalInvoiceForJuneRegistrations();
                case 5 -> invoiceService.findAll();
                case 6 -> invoiceService.filterInvoicesByTotalAmount();
                case 7 -> invoiceService.averageOfInvoicesOverAmount();
                case 8 -> invoiceService.listOfCustomersHasBelowAmount();
                case 9 -> invoiceService.listOfSectorNamesInvoiceAmountBelow();
                case 0 -> flag = false;
                default -> System.out.println("Invalid menu operation!");
            }
        }
    }

    private static void printMenu(){
        System.out.println("|----------------------------------------------------------------------------|");
        System.out.println("|----------------------------------- Menu------------------------------------|");
        System.out.println("|----------------------------------------------------------------------------|");
        System.out.printf("| %-1s | %-70s |%n", "1", "Add new customer into system");
        System.out.printf("| %-1s | %-70s |%n", "2", "List all customers in the system");
        System.out.printf("| %-1s | %-70s |%n", "3", "List all customers which has letter 'c' in their name");
        System.out.printf("| %-1s | %-70s |%n", "4", "List the total amount of invoices of customers who registered in June");
        System.out.printf("| %-1s | %-70s |%n", "5", "List all invoices in the system");
        System.out.printf("| %-1s | %-70s |%n", "6", "List invoices over 1500TL in the system");
        System.out.printf("| %-1s | %-70s |%n", "7", "Calculate the average of invoices over 1500TL in the system");
        System.out.printf("| %-1s | %-70s |%n", "8", "List the names of customers with invoices under 500TL in the system");
        System.out.printf("| %-1s | %-70s |%n", "9", "Sectors of companies whose average invoices in June were below 750");
        System.out.printf("| %-1s | %-70s |%n", "0", "EXIT");
        System.out.println("|----------------------------------------------------------------------------|");
        System.out.print("Please enter operation number: ");
    }

}