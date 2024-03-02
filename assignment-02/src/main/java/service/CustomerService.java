package service;

import java.util.Scanner;

/**
 * @author Serhat Acar
 */

public interface CustomerService {
    void findAll();
    void save(Scanner scanner);
    void filterIfNameIncludesC();
}
