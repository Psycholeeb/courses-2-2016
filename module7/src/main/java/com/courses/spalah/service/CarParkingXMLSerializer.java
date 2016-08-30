package com.courses.spalah.service;

import com.courses.spalah.model.Car;
import com.courses.spalah.model.CarParking;

/**
 * Created by Artem Uskov on 28.07.2016.
 */
public class CarParkingXMLSerializer implements CarParkingSerializer {

    @Override
    public String serialize(CarParking carParking) {

        StringBuilder xml = new StringBuilder();
        xml.append("<?xmlversion=\"1.0\"encoding=\"UTF-8\"?>\n");
        xml.append("   <carParking>\n");
        xml.append("      <address>" + carParking.getAddress() + "</address>\n");
        xml.append("      <parkingName>" + carParking.getParkingName() + "</parkingName>\n");
        xml.append("      <cars>\n");
        for (Car car : carParking.getCars()) {
            xml.append("         <car>\n");
            xml.append("            <manufacturer>" + car.getManufacturer() + "</manufacturer>\n");
            xml.append("            <modelName>" + car.getModelName() + "</modelName>\n");
            xml.append("            <vin>" + car.getVin() + "</vin>\n");
            xml.append("            <lengthMillimeters>" + car.getLengthMillimeters() + "</lengthMillimeters>\n");
            xml.append("            <heightMillimeters>" + car.getHeightMillimeters() + "</heightMillimeters>\n");
            xml.append("         </car>\n");
        }
        xml.append("      </cars>\n");
        xml.append("   </carParking>\n");



        System.out.println(xml);
        return xml.toString();
    }
}
