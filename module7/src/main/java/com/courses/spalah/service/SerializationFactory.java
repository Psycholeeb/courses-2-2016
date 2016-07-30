package com.courses.spalah.service;

import com.courses.spalah.common.Format;
import com.courses.spalah.model.CarParking;

/**
 * Фабрика для создания сериализатора и десериализатора для конкретного типа файла
 *
 * @author Ievgen Tararaka
 */
public class SerializationFactory {
    /**
     * Необходимо реализовать логику возвращения
     * десериализатора для конкретного формата файла.
     * </p>Например вернуть реализацию CarParkingDeserializer для JSON формата
     *
     * @param format формат файла
     * @return имплементацию десериализатора
     */
    public static CarParkingDeserializer getDeserializer(Format format) {
        // TODO - здесь будет ваша логика. Необходимо вернуть реализацию интерфейса
        if (format == Format.JSON)
            return new CarParkingJSONDesializer();
        if (format == Format.XML)
            return new CarParkingXMLDesializer();
        return null;
    }

    /**
     * Необходимо реализовать логику возвращения
     * сериализатора для конкретного формата файла.
     * </p>Например вернуть реализацию CarParkingSerializer для JSON формата
     *
     * @param format формат файла
     * @return имплементацию сериализатора
     */
    public static CarParkingSerializer getSerializer(Format format) {
        // TODO - здесь будет ваша логика. Необходимо вернуть реализацию интерфейса
<<<<<<< HEAD


=======
        if (format == Format.JSON)
            return new CarParkingJSONSerializer();
        if (format == Format.XML)
            return new CarParkingXMLSerializer();
>>>>>>> d4303098ec9c1227efa572b9e1240a4a102b1c1f
        return  null;
    }

    String serialize(CarParking carParking){
        return "";
    }
}
