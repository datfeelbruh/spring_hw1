package org.example;

import org.example.customers.Customer;
import org.example.customers.Petrovich;
import org.example.customers.Reshar;
import org.example.goods.Good;
import org.example.importers.Absolute;
import org.example.importers.Aist;
import org.example.serivce.Stock;
import org.example.serivce.Worker;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.*;

public class Business {
    AnnotationConfigApplicationContext ctx;
    Stock stock;


    public Business(AnnotationConfigApplicationContext ctx) {
        this.ctx = ctx;
        this.stock = ctx.getBean(Stock.class);
    }
    public void shipmentGoods() {
        Absolute absolute = ctx.getBean(Absolute.class);
        Aist aist = ctx.getBean(Aist.class);
        Worker mishka = stock.getMishka();
        Worker zelya = stock.getZelya();

        Map<String, List<Good>> shipments = new HashMap<>();

        shipments.putAll(mishka.getGoods(absolute.importGood(3)));
        shipments.putAll(zelya.getGoods(aist.importGood(3)));

        stock.setGoods(shipments);
    }

    public void brokeGoods() {
        Map<String, List<Good>> stockMap = stock.getGoods();

        Worker mishka = stock.getMishka();
        Worker zelya = stock.getZelya();

        Map<Worker, String> workerGoodMap = Map.of(mishka, "Vodka", zelya, "Bicycle");

        workerGoodMap.forEach((worker, good) -> {
            List<Good> currGoodList = stockMap.get(good);

            currGoodList.forEach((elem) -> {
                int index = currGoodList.indexOf(elem);

                if ((index + 1) % 2 == 0) {
                    worker.breakGoods(elem);
                }
            });
        });
    }

    public void sellGoods() {
        Map<String, List<Good>> stockMap = stock.getGoods();

        Petrovich petrovich = ctx.getBean(Petrovich.class);
        Reshar reshar = ctx.getBean(Reshar.class);

        Map<Customer, String> customerGoodMap = Map.of(petrovich, "Vodka", reshar, "Bicycle");

        customerGoodMap.forEach((customer, good) -> {

            List<Good> currGoodList = stockMap.get(good);
            ListIterator<Good> iterator = currGoodList.listIterator();

            while (iterator.hasNext()) {
                Good currGood = iterator.next();

                if (currGood.isBroken()) {
                    customer.getGood(currGood);
                    iterator.remove();
                }
            }
        });
    }
}
