package org.example.serivce;

import lombok.AllArgsConstructor;
import org.example.goods.Good;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@AllArgsConstructor
public class Worker {

    public Map<String, List<Good>> getGoods(Map<String, List<Good>> goods) {
        return goods;
    }

    public void breakGoods(Good good) {
        good.setBroken(true);
    }

}
