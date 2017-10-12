package com.eaststartgroup.www;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) throws Exception {
	/* write your code here */
        List<Product> groceryStore;
        groceryStore = new LinkedList<Product>(
                Arrays.asList(
                        new Product(0, "Tomato", "Fruit", 1.75f),
                        new Product(1, "Avocado", "Fruit", 5f),
                        new Product(2, "Lemon", "Fruit", 0.5f),
                        new Product(3, "Onion", "Vegetable", 1.50f),
                        new Product(4, "Carrot", "Vegetable", 1.25f),
                        new Product(5, "Broccoli", "Vegetable", 2f),
                        new Product(6, "Shrimp", "Seafood", 10.99f),
                        new Product(7, "Chicken", "Meat", 7.35f),
                        new Product(8, "Roast Beef", "Meat", 8.35f)
                )
        );

        System.out.println("Original List: ");
        groceryStore.forEach(
                product -> System.out.println(product)
        );

        Predicate<Product> meatRemover =
                (Product product) -> "Meat".equals(product.categories);


        groceryStore.removeIf(meatRemover);
        System.out.println("\n\nWithout Meat List: ");
        groceryStore.forEach(product -> System.out.println(product));
    }
}
