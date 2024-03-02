package service;

/**
 * @author Serhat Acar
 */

public interface InvoiceService {

    void calculateTotalInvoiceForJuneRegistrations();

    void findAll();

    void filterInvoicesByTotalAmount();

    void averageOfInvoicesOverAmount();

    void listOfCustomersHasBelowAmount();

    void listOfSectorNamesInvoiceAmountBelow();


}
