package com.courses.spalah.service;

import com.courses.spalah.model.Car;
import com.courses.spalah.model.CarParking;

import java.util.ArrayList;

/**
 * Created by Татьяна on 31.07.2016.
 */
public class JSONDeserializer implements CarParkingDeserializer {

    @Override
    public CarParking deserialize(String serializedCarParking) {
        CarParking carParking = new CarParking();
        String[] strings = serializedCarParking.replaceAll(":", "")
                .replaceAll("\\{", "")
                .replaceAll("\\}", "")
                .replaceAll("\\[", "")
                .replaceAll("\\]", "")
                .replaceAll(",", "")
                .split("\"");

        for (int i = 0; i < strings.length; i++) {

            System.out.println(strings[i]);
        }

        ArrayList<Car> cars = new ArrayList<>();


        for (int i = 0; i < strings.length; i++) {
            if ("address".equals(strings[i])) {
                carParking.setAddress(strings[i + 2]);
            }
            if ("parkingName".equals(strings[i])) {
                carParking.setParkingName(strings[i + 2]);
            }
            if ("manufacturer".equals(strings[i])) {
                Car car = new Car();
                car.setManufacturer(strings[i + 2]);
                car.setModelName(strings[i + 6]);
                car.setVin(strings[i + 10]);
                car.setLengthMillimeters(Integer.valueOf(strings[i + 13].trim()));
                car.setHeightMillimeters(Integer.valueOf(strings[i + 15].trim()));
                cars.add(car);
            }
            carParking.setCars(cars.toArray(new Car[cars.size()]));
        }
        System.out.println(carParking.toString());

        return carParking;
    }
}
