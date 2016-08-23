package spalah;

/**
 * Вам необходимо понять, что не хватаем этому классу, чтобы он имел возможность
 * учавствовать в коллекциях (правильно)
 *
 * @author Ievgen Tararaka
 */
public class Car {
    private int priceInDollars;
    private String modelName;

    public Car(int priceInDollars, String modelName) {
        this.priceInDollars = priceInDollars;
        this.modelName = modelName;
    }

    public int getPriceInDollars() {
        return priceInDollars;
    }

    public void setPriceInDollars(int priceInDollars) {
        this.priceInDollars = priceInDollars;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "Car{" +
                "priceInDollars=" + priceInDollars +
                ", modelName='" + modelName + '\'' +
                '}';
    }

    public boolean equals(Object object) {
        Car car = (Car) object;
        String carModel = car.getModelName();
        int carPrice = car.getPriceInDollars();
        if (carModel.equals(modelName) && (carPrice == priceInDollars)) {
            return true;
        }
        return false;
    }
}
