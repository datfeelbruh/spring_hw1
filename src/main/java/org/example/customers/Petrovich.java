package org.example.customers;

import lombok.Getter;
import lombok.ToString;
import org.example.goods.Good;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Getter
@ToString
public class Petrovich implements Customer {

    public List<Good> petrovichGoods = new ArrayList<>();

    @Override
    public void getGood(Good good) {
        petrovichGoods.add(good);
    }
}
