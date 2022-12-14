package myproject;

import java.util.Scanner;
//3nd change

public class newproject {

	public static void main(String[] args) {
	    Scanner reader = new Scanner(System.in);	    
	    String input;	    
	    Car car1 = new Car("Toyota", "RAV4", 40);   
	    
	    while(true){
	        System.out.println("a=accelerate b=break x=exit");
	        input = reader.nextLine();
	    
	        if(input.equals("a")){
	            car1.accelerate();
	        }
	        else if(input.equals("b")){
	            car1.brake();
	        }
	        else if(input.equals("x")){
	            break;
	        }
	    }
	 
    }
}

class Car {
    private String brand;
    private String model;
    private int amountOfFuel;
    
    
    public Car(){
        brand = "";
        model = "";
        amountOfFuel = 0;
    }
    
    public Car(String brand1, String model1, int amountOfFuel1){
        brand = brand1;
        model = model1;
        amountOfFuel = amountOfFuel1;
        
        printData();
    }
    
    public void accelerate(){
        if(amountOfFuel > 0){
            System.out.println("Car is accelerating");
            amountOfFuel--;
        }
    }
    
    
    public void brake(){
        System.out.println("Car is breaking");
    }
    
    private void printData(){
        System.out.println("Brand: "+ brand);
        System.out.println("Model: "+ model);
        System.out.println("Fuel: "+ amountOfFuel);
    }
    
    
}    