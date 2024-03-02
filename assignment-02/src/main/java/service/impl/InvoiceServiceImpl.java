package service.impl;

import entity.Invoice;
import service.InvoiceService;
import util.LoadTestData;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Serhat Acar
 */

public class InvoiceServiceImpl implements InvoiceService {

    private final List<Invoice> invoices = LoadTestData.getInvoiceList();

    @Override
    public void calculateTotalInvoiceForJuneRegistrations() {
        BigDecimal totalInvoice = new BigDecimal(0);
        for (Invoice invoice : invoices) {
            if (invoice.getOrder().getCustomer().getCreatedAt().getMonthValue() == 6) {
                totalInvoice = totalInvoice.add(invoice.getTotalPrice());
            }
        }
        System.out.println("Total invoice amount for customers registered in June: " + totalInvoice);

    }

    @Override
    public void findAll() {
        invoices.forEach(System.out::println);

    }

    @Override
    public void filterInvoicesByTotalAmount() {
        invoices.stream().filter(invoice -> invoice.getTotalPrice().compareTo(new BigDecimal(1500)) > 0).forEach(System.out::println);

    }

    @Override
    public void averageOfInvoicesOverAmount() {
        BigDecimal totalInvoice = new BigDecimal(0);
        int count = 0;
        for (Invoice invoice : invoices) {
            if (invoice.getTotalPrice().compareTo(new BigDecimal(1500)) > 0) {
                totalInvoice = totalInvoice.add(invoice.getTotalPrice());
                count++;
            }
        }
        System.out.println("Average of invoices over 1500: " + totalInvoice.divide(new BigDecimal(count)));

    }


    @Override
    public void listOfCustomersHasBelowAmount() {
        invoices.stream().filter(invoice -> invoice.getTotalPrice().compareTo(new BigDecimal(1500)) < 0)
                .map(invoice -> invoice.getOrder().getCustomer()).distinct().forEach(System.out::println);

    }

    @Override
    public void listOfSectorNamesInvoiceAmountBelow() {
        invoices.stream().filter(invoice -> invoice.getTotalPrice().compareTo(new BigDecimal(750)) < 0)
                .map(invoice -> invoice.getOrder().getCustomer().getSector()).distinct().forEach(System.out::println);

    }
}
