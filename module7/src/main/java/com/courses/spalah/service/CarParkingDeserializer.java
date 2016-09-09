package com.courses.spalah.service;

import com.courses.spalah.model.CarParking;

/**
 * Интерфейс десериализатора класса {@link main.java.com.courses.spalah.model.CarParking}
 * TODO необходимо создать реализацию этого интерфейса
 *
 * @author Ievgen Tararaka
 */
public interface CarParkingDeserializer {
    CarParking deserialize(String serializedCarParking);
}
