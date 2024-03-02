package util;

/**
 * @author Serhat Acar
 */


import entity.Customer;
import entity.Invoice;
import entity.Order;
import entity.Product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public final class LoadTestData {

    private static final List<Customer> CUSTOMER_LIST = new ArrayList<>();
    private static final List<Invoice> INVOICE_LIST = new ArrayList<>();

    static {
        loadTestData();
    }

    private LoadTestData() {
    }

    public static List<Customer> getCustomerList() {
        return CUSTOMER_LIST;
    }

    public static List<Invoice> getInvoiceList() {
        return INVOICE_LIST;
    }

    private static void loadTestData() {
        Customer alice = new Customer("Alice", "Smith", "alice@mail.com", "03121232238", "finance", new ArrayList<>(), LocalDate.of(2023, 6, 10));
        Customer bob = new Customer("Bob", "Johnson", "bob@mail.com", "03121232239", "healthcare", new ArrayList<>(), LocalDate.now());
        Customer charlie = new Customer("Charlie", "Brown", "charlie@mail.com", "03121232240", "education", new ArrayList<>(), LocalDate.now());
        Customer david = new Customer("David", "Williams", "david@mail.com", "03121232241", "it", new ArrayList<>(), LocalDate.now());
        Customer emily = new Customer("Emily", "Jones", "emily@mail.com", "03121232242", "food", new ArrayList<>(), LocalDate.now());

        Product shoes = new Product("shoes", BigDecimal.valueOf(2000));
        Product sunglasses = new Product("sunglasses",  BigDecimal.valueOf(100));
        Product magazine = new Product("magazine", BigDecimal.valueOf(15));
        Product diary = new Product("diary", BigDecimal.valueOf(40));
        Product pencil = new Product("pencil", BigDecimal.valueOf(5));

        Order aliceOrder = new Order(alice, List.of(shoes, sunglasses));
        Order bobOrder = new Order(bob, List.of(magazine, sunglasses));
        Order charlieOrder = new Order(charlie, List.of(diary, pencil));
        Order davidOrder = new Order(david, List.of(shoes, sunglasses, sunglasses, pencil));
        Order emilyOrder = new Order(emily, List.of(magazine, diary, pencil, sunglasses));

        alice.getOrders().add(aliceOrder);
        bob.getOrders().add(bobOrder);
        charlie.getOrders().add(charlieOrder);
        david.getOrders().add(davidOrder);
        emily.getOrders().add(emilyOrder);

        Invoice aliceInvoice = new Invoice(LocalDateTime.now(), aliceOrder);
        Invoice bobInvoice = new Invoice(LocalDateTime.now(), bobOrder);
        Invoice charlieInvoice = new Invoice(LocalDateTime.now(), charlieOrder);
        Invoice davidInvoice = new Invoice(LocalDateTime.now(), davidOrder);
        Invoice emilyInvoice = new Invoice(LocalDateTime.now(), emilyOrder);

        CUSTOMER_LIST.add(alice);
        CUSTOMER_LIST.add(bob);
        CUSTOMER_LIST.add(charlie);
        CUSTOMER_LIST.add(david);
        CUSTOMER_LIST.add(emily);

        INVOICE_LIST.add(aliceInvoice);
        INVOICE_LIST.add(bobInvoice);
        INVOICE_LIST.add(charlieInvoice);
        INVOICE_LIST.add(davidInvoice);
        INVOICE_LIST.add(emilyInvoice);
    }
}

