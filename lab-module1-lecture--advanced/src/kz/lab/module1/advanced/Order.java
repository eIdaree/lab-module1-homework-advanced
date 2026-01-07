package kz.lab.module1.advanced;

import java.time.LocalDateTime;
import java.util.Set;

public record Order(long id, double price, LocalDateTime orderDate, Set<String> items ) {
    public Order{
        if (id <= 0) {
            throw new IllegalArgumentException("id must be positive");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("price must be positive");
        }
        if (orderDate == null) {
            throw new IllegalArgumentException("orderDate must not be null");
        }
        if (items == null) {
            throw new IllegalArgumentException("items must not be null");
        }
        if (items.isEmpty()) {
            throw new IllegalArgumentException("items must not be empty");
        }
        if(!orderDate.isBefore(LocalDateTime.now())){
            throw new IllegalArgumentException("orderDate must be before now");
        }
        items = Set.copyOf(items);
    }
}
