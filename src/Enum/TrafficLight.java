package Enum;

import java.sql.SQLOutput;

public enum TrafficLight {
    RED, YELLOW , GREEN;
}
  class TrafficExample {
    public static void main(String[] args) {
        TrafficLight signal = TrafficLight.GREEN;
        switch (signal){
            case RED :
                System.out.println("Stop");
                break;
            case YELLOW :
                System.out.println("Ready");
                break;
            case GREEN :
                System.out.println("GO");
                break;

        }

    }
}
