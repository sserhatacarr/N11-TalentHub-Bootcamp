package entity;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Serhat Acar
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private String sector;
    private List<Order> orders;
    private LocalDate createdAt;


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
