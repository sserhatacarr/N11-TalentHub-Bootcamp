package service.impl;

import entity.Customer;
import service.CustomerService;
import util.LoadTestData;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Serhat Acar
 */

public class CustomerServiceImpl implements CustomerService {

    private final List<Customer> customers = LoadTestData.getCustomerList();
    @Override
    public void findAll() {
        customers.forEach(System.out::println);

    }

    @Override
    public void save(Scanner scanner) {
        System.out.print("Please enter a name: ");
        String name = scanner.next();
        System.out.print("Please enter a surname: ");
        String surname = scanner.next();
        System.out.print("Please enter a email: ");
        String email = scanner.next();
        System.out.print("Please enter a phoneNumber: ");
        String phoneNumber = scanner.next();
        System.out.print("Please enter a sector: ");
        String sector = scanner.next();

        Customer customer = new Customer(name, surname, email,phoneNumber, sector,new ArrayList<>(), LocalDate.now());
        customers.add(customer);

    }

    @Override
    public void filterIfNameIncludesC() {
        List<Customer> list = customers.stream().filter(customer -> customer.getName().contains("C") ||customer.getName().contains("c"))
                .toList();
        list.forEach(System.out::println);

    }
}
