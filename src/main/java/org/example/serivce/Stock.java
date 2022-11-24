package org.example.serivce;

import lombok.Getter;
import lombok.Setter;
import org.example.goods.Good;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Getter
@Setter
public class Stock {
    Map<String, List<Good>> goods;
    private Worker mishka;

    private Worker zelya;

    @Autowired
    public Stock(Worker mishka, Worker zelya) {
        this.mishka = mishka;
        this.zelya = zelya;
        this.goods = new HashMap<>();
    }
}
