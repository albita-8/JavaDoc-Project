/**
 * La clase Car representa un modelo de coche con atributos básicos como
 * marca, modelo, año y precio.
 * <p>
 * Proporciona métodos para acceder y modificar sus propiedades, así como
 * un método para obtener una descripción textual del coche.
 * </p>
 *
 * @author Alba Agüera Cuadra
 * @version 1.0
 * @since 2026
 */
public class Car {

    private String make;
    private String model;
    private int year;
    private double price;

    /**
     * Constructor que crea un nuevo objeto Car con los valores indicados.
     *
     * @param make  la marca del coche
     * @param model el modelo del coche
     * @param year  el año de fabricación
     * @param price el precio del coche
     */
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    /**
     * Devuelve la marca del coche.
     *
     * @return la marca del coche
     */
    public String getMake() {
        return make;
    }

    /**
     * Establece la marca del coche.
     *
     * @param make la nueva marca del coche
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Devuelve el modelo del coche.
     *
     * @return el modelo del coche
     */
    public String getModel() {
        return model;
    }

    /**
     * Establece el modelo del coche.
     *
     * @param model el nuevo modelo del coche
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Devuelve el año de fabricación del coche.
     *
     * @return el año de fabricación
     */
    public int getYear() {
        return year;
    }

    /**
     * Establece el año de fabricación del coche.
     *
     * @param year el nuevo año de fabricación
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Devuelve el precio del coche.
     *
     * @return el precio del coche en dólares
     */
    public double getPrice() {
        return price;
    }

    /**
     * Establece el precio del coche.
     *
     * @param price el nuevo precio del coche en dólares
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Devuelve una descripción textual del coche.
     * <p>
     * Ejemplo de salida:
     * "El coche es un Toyota Corolla del año 2025 con un precio de $26800.0"
     * </p>
     *
     * @return una cadena con la descripción del coche
     */
    public String carDescription() {
        return "El coche es un " + make + " " + model + " del año " + year + " con un precio de $" + price;
    }

    /**
     * Devuelve una representación en forma de cadena del objeto Car.
     *
     * @return una cadena descriptiva del coche
     */
    @Override
    public String toString() {
        return carDescription();
    }

    /**
     * Método principal utilizado para demostrar el funcionamiento de la clase Car.
     *
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2025, 26800);
        System.out.println(car);
    }
}