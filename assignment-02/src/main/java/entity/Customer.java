package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Serhat Acar
 */
@Data
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


}
