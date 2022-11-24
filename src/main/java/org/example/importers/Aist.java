package org.example.importers;

import org.example.goods.Good;
import org.example.goods.Vodka;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Aist implements Importer {
    @Override
    public Map<String, List<Good>> importGood(int count) {
        Map<String, List<Good>> goods = new HashMap<>();
        List<Good> bicycleList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            bicycleList.add(new Vodka());
        }

        goods.put("Bicycle", bicycleList);

        return goods;
    }
}
