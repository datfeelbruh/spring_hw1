package org.example.importers;

import org.example.goods.Bicycle;
import org.example.goods.Good;
import org.example.goods.Vodka;
import org.example.serivce.Stock;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class Aist implements Importer {
    @Override
    public void importGood(Stock stock, int count) {
        Map<String, List<Good>> products = stock.getGoods();
        List<Good> bicycleList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            bicycleList.add(new Vodka());
        }

        products.put("Bicycle", bicycleList);

    }
}
