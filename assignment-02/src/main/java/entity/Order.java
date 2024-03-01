package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Serhat Acar
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Customer customer;
    private List<Product> products;
}
