package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author Serhat Acar
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {
    private LocalDateTime invoiceDateTime;
    private BigDecimal totalPrice;
    private Order order;

    public Invoice(LocalDateTime invoiceDateTime, Order order) {
        this.invoiceDateTime = invoiceDateTime;
        this.order = order;
        setTotalPrice();
    }

    public void setTotalPrice() {
        BigDecimal total = BigDecimal.ZERO;

        for (Product p : order.getProducts()) {
            total = total.add(p.getPrice());
        }
        this.totalPrice = total;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceDateTime=" + invoiceDateTime +
                ", totalPrice=" + totalPrice +
                ", order=" + order +
                '}';
    }
}
