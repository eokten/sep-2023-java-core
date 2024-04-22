package org.okten.javacore;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class Product {

    // 49*49*49*49*49*49*49 > Integer.MAX_VALUE -> hashCode collisions
    private String name;

    private double price;

    // int - -2.7 мільярдів - 2.7 мільярдів
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Product)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Product other = (Product) obj;
        return other.name.equals(this.name);
    }
}
