package org.example.ConstructorOverLoading;

public class Car {

   public   String model;
    public int year;
    public String color;
        public Car(String model) {
            this.model = model;
            this.year = 2021;
            this.color = "White";
        }


        public Car(String model, int year) {
            this.model = model;
            this.year = year;
            this.color = "White";
        }
        public Car(String model, int year, String color) {
            this.model = model;
            this.year = year;
            this.color = color;
        }
    }


