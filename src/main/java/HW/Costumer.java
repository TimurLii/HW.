package HW;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Costumer {
    private String fullName;
    private int age;
    private String phoneNumber;
    private Gender gender;

}
