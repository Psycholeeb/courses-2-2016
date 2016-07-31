package com.courses.spalah.service;

import com.courses.spalah.model.Car;
import com.courses.spalah.model.CarParking;

/**
 * Created by Татьяна on 31.07.2016.
 */
public class JSONSerializer implements CarParkingSerializer {
    @Override
    public String serialize(CarParking carParking) {
        StringBuilder builder = new StringBuilder();
        builder.append("{\n")
                .append("  \"address\": \"")
                .append(carParking.getAddress() + "\",\n")
                .append("  \"parkingName\": \"")
                .append(carParking.getParkingName() + "\",\n")
                .append("  \"cars\": [\n");

        for (Car car : carParking.getCars()) {
            builder.append("    {\n")
                    .append("     \"manufacturer\": \"")
                    .append(car.getManufacturer() + "\",\n")
                    .append("     \"modelName\": \"")
                    .append(car.getModelName() + "\",\n")
                    .append("     \"vin\": \"")
                    .append(car.getVin() + "\",\n")
                    .append("     \"lengthMillimeters\": ")
                    .append(car.getLengthMillimeters() + ",\n")
                    .append("     \"heightMillimeters\": ")
                    .append(car.getHeightMillimeters() + "\n")
                    .append("    },\n");

        }
        builder.deleteCharAt(builder.length() - 2)
                .append("  ]\n")
                .append("}");
        System.out.println(builder);
        return builder.toString();
    }
}
