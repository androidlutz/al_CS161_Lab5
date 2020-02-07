//HEADER
//Program Name: Lab 5 Activity
//Author: Andrew Lutz
//Class: CS161 Winter 2020
//Date: 02/06/2020
//Description: Create a Person class and call it to the main method



public class Main{

     public static void main(String[] args) {
       
        

    Person p = new Person("Jim", "Bob" , 25);
    
        System.out.println(p.getName());
        System.out.println(p.getInfo());
        p.changeInformation("James", "Robert", 30);
        System.out.println(p.getInfo());

     }

}



/*
Footer
Jim Bob
Jim Bob 25
James Robert 30

*/