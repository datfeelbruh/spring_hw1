package org.example;

import org.example.config.StockConfig;
import org.example.customers.Petrovich;
import org.example.customers.Reshar;
import org.example.serivce.Stock;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StockConfig.class);
        Stock stock = context.getBean(Stock.class);
        Business business = new Business(context);

        business.shipmentGoods();
        System.out.println(stock.getGoods());

        business.brokeGoods();
        System.out.println(stock.getGoods());

        business.sellGoods();

        System.out.println(stock.getGoods());

        System.out.println(context.getBean(Petrovich.class));
        System.out.println(context.getBean(Reshar.class));
    }
}