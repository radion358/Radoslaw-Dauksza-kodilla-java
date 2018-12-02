package com.kodilla.good.patterns.challenges.food2door;

import java.util.Objects;

public class Product {
    private String Name;
    private double pricePerUnit;

    public Product(String Name, double pricePerUnit) {
        this.Name = Name;
        this.pricePerUnit = pricePerUnit;
    }

    public String getName() {
        return Name;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }
    
    public double getPrice(double quantity) {
        return pricePerUnit * quantity;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.Name);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.pricePerUnit) ^ (Double.doubleToLongBits(this.pricePerUnit) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (Double.doubleToLongBits(this.pricePerUnit) != Double.doubleToLongBits(other.pricePerUnit)) {
            return false;
        }
        if (!Objects.equals(this.Name, other.Name)) {
            return false;
        }
        return true;
    }
    
}
