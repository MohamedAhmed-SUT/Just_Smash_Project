package Just_Smash.menu;

import javax.swing.*;

public class Just_Smash_Items implements MenuItem {
    private String name;
    private double price;
    private ImageIcon icon;
    private JLabel label; // Add this line

    public Just_Smash_Items(String name, double price, String imagePath, JLabel label) {
        this.name = name;
        this.price = price;
        this.icon = createImageIcon(imagePath);
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public JLabel getLabel() {
        return label;
    }

    private ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
}
