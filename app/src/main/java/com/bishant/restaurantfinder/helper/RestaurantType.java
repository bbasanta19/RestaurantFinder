package com.bishant.restaurantfinder.helper;

public class RestaurantType {

    public static <T> T getType(Object type, Class<T> classes) {
        try {
            return classes.cast(type);
        } catch (ClassCastException ex) {
            return null;
        }
    }
}