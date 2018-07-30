package model;

public class Controller {

    private Model theModel;

    public Controller() {
        theModel = new Model();
    }

    public Motorcycle findMotorcycle(String name) {
        Motorcycle motor = theModel.findMotorcycle(name);
        return motor;
    }

}
