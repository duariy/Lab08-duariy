package com.example.lab08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist

        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();

        City calgary = new City("Calgary", "AB");
        City toronto = new City("Toronto", "ON");

        list.addCity(calgary);
        list.addCity(toronto);


        list.deleteCity(calgary);

        assertFalse(list.hasCity(calgary));
        assertTrue(list.hasCity(toronto));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();

        assertEquals(0, list.countCities());

        list.addCity(new City("Calgary", "AB"));
        list.addCity(new City("Toronto", "ON"));

        assertEquals(2, list.countCities());
    }

}