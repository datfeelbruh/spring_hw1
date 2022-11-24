package org.example.importers;

import org.example.goods.Good;
import org.example.goods.Vodka;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Absolute implements Importer{
    @Override
    public Map<String, List<Good>> importGood(int count) {
        Map<String, List<Good>> goods = new HashMap<>();
        List<Good> vodkaList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            vodkaList.add(new Vodka());
        }

        goods.put("Vodka", vodkaList);

        return goods;
    }
}
