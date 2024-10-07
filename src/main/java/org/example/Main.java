package org.example;

import java.net.SocketOption;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(shouldWakeup (true,1));
        System.out.println(shouldWakeup (false,2));
        System.out.println(shouldWakeup (false,8));
        System.out.println(shouldWakeup (false,-1));

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter width of rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("enter height of rectangle: ");
        double height = scanner.nextDouble();
        System.out.println("enter color of rectangle: " + area(width,height));

        System.out.println("enter color of circle: ");
        double radius = scanner.nextDouble();
        System.out.println("area of circle: " + area(radius));
    }

    public static boolean shouldWakeup(boolean isBarking, int clock){
        if (clock < 0 || clock > 23 || !isBarking) {
            return false;
        }
        return clock >= 20 || clock < 8;
    }
    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge){
        return (firstAge > 13 && firstAge <= 19) || (secondAge > 13 && secondAge <= 19) || (thirdAge > 13 && thirdAge <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp){
        int lowestTemp = 25;
        int highestTemp = isSummer ? 45: 35;

        return temp < highestTemp && temp > lowestTemp;
    }
    public static double area(double width, double height){
        if(width<0 || height<0){
            System.out.println("width veya height sıfırdan küçük olamaz!! Width: " + width + ", Height: " + height );
            return -1;
        }
        return width * height;
    }
    public static double area(double radius){
        if(radius < 0){
            System.out.println("radius cannot be less than zero!!! Radius: " + radius );
            return -1;
        }
        return Math.PI * Math.pow(radius, 2);
    }
}
