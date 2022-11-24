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
public class Reshar implements Customer {

    List<Good> resharGoods = new ArrayList<>();


    @Override
    public void getGood(Good good) {
        resharGoods.add(good);
    }
}
