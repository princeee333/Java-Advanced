package SetsAndMapsAdvanced.lab;

import java.util.*;
import java.util.stream.Collectors;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, LinkedHashMap<String,Double>> shops =new TreeMap<>();

        while (!input.equals("Revision")) {
            String[] tokens = input.split(", ");
            String shop = tokens[0];
            String product = tokens[1];
            Double price = Double.parseDouble(tokens[2]);

            shops.putIfAbsent(shop, new LinkedHashMap<>());
            shops.get(shop).put(product, price);

            input = scanner.nextLine();
        }
        System.out.println(shops.entrySet()
                .stream()
                .map(shop ->
                        String.format("%s->%n%s", shop.getKey(),
                                shop.getValue()
                                        .entrySet()
                                        .stream()
                                        .map(product ->
                                                String.format("Product: %s, Price: %.1f",
                                                        product.getKey(),
                                                        product.getValue()))
                                        .collect(Collectors.joining(System.lineSeparator()))
                        )
                )
                .collect(Collectors.joining(System.lineSeparator())));
    }
}

