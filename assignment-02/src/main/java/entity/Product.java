package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author Serhat Acar
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String productName;
    private BigDecimal price;
}
