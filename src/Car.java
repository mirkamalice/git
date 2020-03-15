public class Car {
    int weight;
    String color;
    String name;

    Car(){
        weight = 500;
        color = "White";
        name = "Fride";
    }
    Car(String name){
        weight = 500;
        color = "White";
        this.name = name;
    }
    Car(String name,String color){
        weight = 500;
        this.name = name;
        this.color = color;
    }
}
