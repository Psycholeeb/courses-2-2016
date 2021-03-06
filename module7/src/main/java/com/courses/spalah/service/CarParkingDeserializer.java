package com.courses.spalah.service;

import com.courses.spalah.model.CarParking;

import javax.xml.bind.JAXBException;

/**
 * Интерфейс десериализатора класса {@link com.rxn1d.courses.model.CarParking}
 * TODO необходимо создать реализацию этого интерфейса
 *
 * @author Ievgen Tararaka
 */
public interface CarParkingDeserializer {
    CarParking deserialize(String serializedCarParking) throws JAXBException;
}
