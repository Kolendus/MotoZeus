package model;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Model {

    private static ArrayList<Motorcycle> bikes = new ArrayList<>();

    public void createMotorcycle(Image photo, int productionYear, String engine, int capacity, int fuelCapacity, int mass, int horsePower, String name, int price) {
        Motorcycle newMoto = new Motorcycle(photo, productionYear, engine, capacity, fuelCapacity, mass, horsePower, name, price);
        bikes.add(newMoto);
    }

    public void sendMail(String to, String order) {
        SendMail send = new SendMail();
        send.sendEmailWithAttachments(to, order);
    }

    public String createPDF(User username, Motorcycle motor) {
        CreatePDF createOrder = new CreatePDF(motor, username);
        return createOrder.createPDF();

    }

    public ArrayList<String> techData(String name) {
        Motorcycle found = findMotorcycle(name);
        ArrayList<String> data = new ArrayList<>();
        if (found == null) {
            return null;
        }
        double roundOff = Math.round((double) found.getHorsePower() * 0.7353 * 100.0) / 100.0;

        int watPower = (int) (found.getHorsePower() * 0.7353);
        data.add(found.getName());
        data.add(String.valueOf(found.getProductionYear()));
        data.add(String.valueOf(found.getFuelCapacity()));
        data.add(String.valueOf(found.getMass()));
        data.add(String.valueOf(found.getHorsePower()));
        data.add(String.valueOf(roundOff));
        data.add(String.valueOf(found.getCapacity()));
        data.add(found.getEngine());

        return data;

    }

    public Motorcycle findMotorcycle(String name) {
        Motorcycle found = findMotoName(name);
        try {
            if (found != null) {
                return found;
            }
        } catch (NullPointerException e) {
            System.out.println("There aren't any motorcycles models in our database with name: " + name);
        }
        return null;
    }

    private Motorcycle findMotoName(String name) {
        Motorcycle lookedFor = null;
        for (int i = 0; i < bikes.size(); i++) {
            if (name == bikes.get(i).getName()) {
                lookedFor = bikes.get(i);
            }
        }
        return lookedFor;
    }

    public int bikesNumber() {
        return bikes.size();
    }

    public Image loadImage(String name) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(name));
        } catch (IOException e) {
            System.out.println("There aren't any photos with given name : " + name + " in our program");
        }
        return img;
    }

    public ImageIcon scaleIcon(Motorcycle motorcycle) {
        Image beforeImage = motorcycle.getMotoPhoto();
        Image newIcon = beforeImage.getScaledInstance(441 + 20, 344, java.awt.Image.SCALE_DEFAULT);
        ImageIcon icon = new ImageIcon(newIcon);
        return icon;
    }

}
