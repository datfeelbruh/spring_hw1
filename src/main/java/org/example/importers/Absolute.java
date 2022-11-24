package org.example.importers;

import org.example.goods.Good;
import org.example.goods.Vodka;
import org.example.serivce.Stock;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class Absolute implements Importer{
    @Override
    public void importGood(Stock stock, int count) {
        Map<String, List<Good>> products = stock.getGoods();
        List<Good> vodkaList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            vodkaList.add(new Vodka());
        }

        products.put("Vodka", vodkaList);
    }
}
