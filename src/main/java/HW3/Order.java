package HW3;

import HW.Costumer;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {
    Costumer costumer;
    Goods goods;
    private int count;
}

