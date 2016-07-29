package com.courses.spalah;

/**
 * Created by Rita on 25.07.2016.
 */
public class Vehicle {
    private int highSpeed = 11230;

    public int getHighSpeed() {

        return highSpeed;
    }

    class Truck extends Vehicle {
        private int numberOfAxles;

        public int getNumberOfAxles() {

            return numberOfAxles;
        }
    }

    class Motorcycle extends Vehicle {
        private int fuelConsumption;

            public int getFuelConsumption() {

            return fuelConsumption;
        }
    }

    class Tricycle extends Motorcycle {
        boolean hasSidecar;

        public boolean getHasSidecar() {

            return hasSidecar;
        }
    }

    class SportBike extends Motorcycle {
        private int engineVolume;

        public int getEngineVolume() {

            return engineVolume;
        }

        public void setEngineVolume(int engineVolume) {

            this.engineVolume = engineVolume;
        }
    }

    class Quadracycle extends Motorcycle {
        private String typeSuspension;

        public String getTypeSuspension() {

            return typeSuspension;
        }
    }

    class MunicipalTransport extends Vehicle {
        private int capacity;

        public int getCapacity() {

            return capacity;
        }
    }

    class ElectricVehicle extends MunicipalTransport {
        private String type;
    }

    class Tram extends ElectricVehicle {
        private String fare;

        public String getFare() {

            return fare;
        }
    }

    class Trolleybus extends ElectricVehicle {
    }

    class RailwayTransport extends MunicipalTransport {
        private int speedMovement;

        public int getSpeedMovement() {

            return speedMovement;
        }
    }

    class Train extends RailwayTransport {
        private String destination;

        public String getDestination() {

            return destination;
        }
    }

    class AirTransport extends Vehicle {
        private String use;

        public String getUse() {

            return use;
        }
    }

    class Plane extends AirTransport {
        private int numberEngines;

        public int getNumberEngines() {

            return numberEngines;
        }
    }

    class Helicopter extends AirTransport {
        private int numberScrews;

        public int getNumberScrews() {

            return numberScrews;
        }
    }
}


