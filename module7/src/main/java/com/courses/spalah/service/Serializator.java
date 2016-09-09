package com.courses.spalah.service;

import com.courses.spalah.model.CarParking;
import com.courses.spalah.model.Car;

/**
 * Created by Роман on 01.09.2016.
 */
public class Serializator implements CarParkingSerializer {
    @Override
    public String serialize(CarParking carParking) {
        String s = "";
        s = "{\n" +
                "  \"address\": \""+carParking.getAddress()+"\",\n" +
                "  \"parkingName\": \""+carParking.getParkingName()+"\",\n" +
                "  \"cars\": [\n";
        for(int i=0;i<carParking.getCars().length;i++) {
            s += "    {\n"+"      \"manufacturer\": \""+carParking.getCars()[i].getManufacturer()+"\"," +
                    "      \"modelName\": \""+carParking.getCars()[i].getModelName()+"\",\n" +
                    "      \"vin\": \""+carParking.getCars()[i].getVin()+"\",\n" +
                    "      \"lengthMillimeters\": "+carParking.getCars()[i].getLengthMillimeters()+",\n" +
                    "      \"heightMillimeters\": "+carParking.getCars()[i].getHeightMillimeters()+"\n" +
                    "    }";
            if(!(i == carParking.getCars().length-1))
                s += ",\n";
        }

        s += "  ]\n" +
                "}";
        return s;
    }
}
