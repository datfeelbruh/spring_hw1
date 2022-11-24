package org.example.serivce;

import lombok.AllArgsConstructor;
import org.example.goods.Good;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Worker {

    public void getGoods() {};

    public void breakGoods(Good good) {
        good.setBroken(true);
    };

}
