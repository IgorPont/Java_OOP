// Спроектировать абстрактный класс «Car», у которого должны быть свойства:
// марка, модель, цвет, тип кузова, число колёс, тип топлива, тип коробки передач, объём двигателя;
// методы: движение, обслуживание, переключение передач, включение фар, включение дворников.
// Создать конкретный автомобиль путём наследования класса «Car».
// Расширить абстрактный класс «Car», добавить метод: подметать улицу.
// Создать конкретный автомобиль путём наследования класса «Car».
// Провести проверку принципа SRP.
// Расширить абстрактный класс «Car», добавить метод: включение противотуманных фар, перевозка груза.
// Провести проверку принципа OCP.
// Создать конкретный автомобиль путём наследования класса «Car», определить число колёс = 3. Провести проверку принципа LSP.

abstract public class Car {
    protected String brand;
    protected String model;
    protected String color;
    protected String cabin;
    protected int wheelCount;
    protected String fuel;
    protected String gearBox;
    protected double engineVolume;

    protected Car(String brand, String model,
                  String color, String cabin,
                  int wheelCount, String fuel,
                  String gearBox, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.cabin = cabin;
        this.wheelCount = wheelCount;
        this.fuel = fuel;
        this.gearBox = gearBox;
        this.engineVolume = engineVolume;
    }

    public void move() {
        System.out.println("Drive");
    }

    public void service() {
        System.out.println("Go to service");
    }

    public void changeGear() {
        System.out.println("Gear change");
    }

    public void turnLight() {
        System.out.println("Light");
    }

    public void turnWipers() {
        System.out.println("Wipers");
    }

    public void transportLoads() {
        System.out.println("Transport loads");
    }

}

// остановился на 1:55