package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");
        Ceiling ceiling = new Ceiling(10, PaintColor.WHITE);
        Bed bed = new Bed("King", 4, 20, 2, 1);
        Lamp lamp = new Lamp(LampType.NORMAL, true, 5);
        Wardrobe wardrobe = new Wardrobe(100, 200, 50.5);
        Carpet carpet = new Carpet(150, 200, PaintColor.GREEN);

        Bedroom bedroom = new Bedroom("Master Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet);

        // Test metodları
        bedroom.getLamp().turnOn();
        System.out.println("Lamp Style: " + bedroom.getLamp().getStyle());
        System.out.println("Battery Status: " + bedroom.getLamp().isBattery());
        System.out.println("Global Rating: " + bedroom.getLamp().getGlobalRating());

        bedroom.getBed().make();
        System.out.println("Pillows: " + bedroom.getBed().getPillows());
        System.out.println("Height: " + bedroom.getBed().getHeight());

        bedroom.getWardrobe().add();
        System.out.println("Wardrobe Width: " + bedroom.getWardrobe().getWidth());
        System.out.println("Wardrobe Height: " + bedroom.getWardrobe().getHeight());

        bedroom.getCarpet().lying();
        System.out.println("Carpet Width: " + bedroom.getCarpet().getWidth());
        System.out.println("Carpet Color: " + bedroom.getCarpet().getColor());

        bedroom.getCeiling().create();
        System.out.println("Ceiling Height: " + bedroom.getCeiling().getHeight());
        System.out.println("Ceiling Color: " + bedroom.getCeiling().getColor());

        bedroom.getWall1().create();
        System.out.println("Wall 1 Direction: " + bedroom.getWall1().getDirection());
    }
    }
