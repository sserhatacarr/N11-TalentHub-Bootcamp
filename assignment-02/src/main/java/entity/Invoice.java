package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author Serhat Acar
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {
    private LocalDateTime invoiceDateTime;
    private BigDecimal totalPrice;
    private Order order;

    public void setTotalPrice() {
        BigDecimal total = BigDecimal.ZERO;

        for (Product p : order.getProducts()) {
            total = total.add(p.getPrice());
        }
        this.totalPrice = total;
    }
}
