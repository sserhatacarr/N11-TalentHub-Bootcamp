package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author Serhat Acar
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String productName;
    private BigDecimal price;

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
