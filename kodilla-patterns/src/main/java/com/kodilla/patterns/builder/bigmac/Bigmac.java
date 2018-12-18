package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private String bun;
    private int burgers;
    private String sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder {
        public static final int MAX_VALUE = 3;
        public static final int MIN_VALUE = 0;
        public static final String BUN_WITH_SESAME = "bun with sesame seeds";
        public static final String BUN_WITHOUT_SESAME = "bun without sesame seeds";
        public static final String KETCHUP = "ketchup";
        public static final String MAYONNAISE = "mayonnaise";
        public static final String TOMATO = "tomato";
        public static final String ONION = "onion";
        public static final String SALAD = "salad";
        public static final String CHEESE = "cheese";

        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            if (burgers < MAX_VALUE && burgers > MIN_VALUE) {
                this.burgers = burgers;
            }else {
              System.out.println("number of burgers must be greater than -1 and les than 3");
              this.burgers = 1;
            }
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            this.ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    private Bigmac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public int getBurgers() {
        return burgers;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
