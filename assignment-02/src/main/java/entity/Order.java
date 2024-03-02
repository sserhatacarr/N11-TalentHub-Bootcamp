package entity;

import lombok.*;

import java.util.List;

/**
 * @author Serhat Acar
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Customer customer;
    private List<Product> products;

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", products=" + products +
                '}';
    }
}
