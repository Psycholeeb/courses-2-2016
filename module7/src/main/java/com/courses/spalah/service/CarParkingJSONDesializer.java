package com.courses.spalah.service;

import com.courses.spalah.model.Car;
import com.courses.spalah.model.CarParking;





import java.util.Arrays;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;

/**
 * Created by Artem Uskov on 28.07.2016.
 */
public class CarParkingJSONDesializer implements CarParkingDeserializer {

    @Override
    public CarParking deserialize(String serializedParking) {
        CarParking carParking = new CarParking();
        Car[] cars = new Car[getCarsNumber(serializedParking)];
        String[] parkingString = trimString(serializedParking).split("\"");

        trimStringInArray(parkingString);
        fillCarsArray(cars);
        return parseJSONAndFillParking(parkingString, carParking, cars);
    }

    public int getCarsNumber(String serializedString) {
        int count = 0;
        String[] countCars = serializedString.split("\"");
        for (int i = 0; i < countCars.length; i++) {
            countCars[i] = countCars[i].trim();
            if (countCars[i].equals("manufacturer")) {
                count++;
            }
        }
        return count;
    }

    public String trimString(String serializedParking) {
        serializedParking = serializedParking.replaceAll("\\{","");
        serializedParking = serializedParking.replaceAll("\\}","");
        serializedParking = serializedParking.replaceAll("\\[","");
        serializedParking = serializedParking.replaceAll("\\]","");
        serializedParking = serializedParking.replaceAll(":","");
        serializedParking = serializedParking.replaceAll(",","");
        serializedParking = serializedParking.replaceAll("\r\n","");
        return serializedParking;
    }

    public void trimStringInArray(String[] parkingString) {
        for (int i = 0; i < parkingString.length; i++) {
            parkingString[i] = parkingString[i].trim();
        }
    }

    public void fillCarsArray(Car[] cars) {
        for (int i = 0; i < cars.length; i++){
            Car car = new Car();
            cars[i] = car;
        }
    }

    public CarParking parseJSONAndFillParking(String[] parkingString, CarParking carParking, Car[] cars) {
        int carsIndex = 0;
        for (int i = 0; i < parkingString.length; i++) {
            if (parkingString[i].equals("address")) {
                carParking.setAddress(parkingString[i + 2]);
            }
            if (parkingString[i].equals("parkingName")) {
                carParking.setParkingName(parkingString[i + 2]);
            }
            if (parkingString[i].equals("manufacturer")) {
                cars[carsIndex].setManufacturer(parkingString[i + 2]);
            }
            if (parkingString[i].equals("modelName")) {
                cars[carsIndex].setModelName(parkingString[i + 2]);
            }
            if (parkingString[i].equals("vin")) {
                cars[carsIndex].setVin(parkingString[i + 2]);
            }
            if (parkingString[i].equals("lengthMillimeters")) {
                cars[carsIndex].setLengthMillimeters(Integer.parseInt(parkingString[i + 1]));
            }
            if (parkingString[i].equals("heightMillimeters")) {
                cars[carsIndex].setHeightMillimeters(Integer.parseInt(parkingString[i + 1]));
                carsIndex++;
            }
        }
        carParking.setCars(cars);
        System.out.println(carParking.toString());
        return carParking;
    }
}
