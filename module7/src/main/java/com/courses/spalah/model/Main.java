package com.courses.spalah.model;

import com.courses.spalah.service.JsonDeserializer;
import com.courses.spalah.service.JsonSerializer;

/**
 * Created by Rita on 07.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        CarParking carpa = new CarParking();
        Car[] cars = new Car[3];
        cars[0] = new Car();
        cars[1] = new Car();
        cars[2] = new Car();
        cars[0].setManufacturer("BMW");
        cars[0].setModelName("M5");
        cars[0].setVin("GH152489");
        cars[0].setLengthMillimeters(1236);
        cars[0].setHeightMillimeters(852);
        cars[1].setManufacturer("Volvo");
        cars[1].setModelName("V40");
        cars[1].setVin("BF4521HJ45");
        cars[1].setLengthMillimeters(1258);
        cars[1].setHeightMillimeters(885);
        cars[2].setManufacturer("Volvo");
        cars[2].setModelName("V50");
        cars[2].setVin("BF4521HJvgjvj5");
        cars[2].setLengthMillimeters(1254);
        cars[2].setHeightMillimeters(815);
        carpa.setAddress("St.Pauls avenue 333");
        carpa.setParkingName("Calipso");
        carpa.setCars(cars);
        JsonSerializer serializer = new JsonSerializer();
       // System.out.println(serializer.serialize(carpa));
        JsonDeserializer jsonDeserializer = new JsonDeserializer();
      System.out.println(jsonDeserializer.deserialize(serializer.serialize(carpa)));
    }
}
