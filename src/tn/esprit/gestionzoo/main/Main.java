package tn.esprit.gestionzoo.main;


import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Animal;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setAge(5);
        lion.setFamily("cats");
        System.out.println(lion.getName());
        Animal dog = new Animal("canine","snoopy",5,true);
        System.out.println(dog.getName());
        Zoo myZoo= new Zoo("wildlife","Ariana",25);
        Zoo urZoo= new Zoo("jungle","america",20);

        System.out.println(myZoo);
       /* tn.esprit.gestionzoo.entities.Zoo.displayZoo();


        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        */
        System.out.println(dog);
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));
        System.out.println(myZoo.searchAnimal(dog));

        Animal chat = new Animal("chat", "chat", 6, true);
        System.out.println(myZoo.searchAnimal(dog));
        boolean removed = myZoo.removeAnimal(lion);
        System.out.println(removed);
        System.out.println(Zoo.comparerZoo(myZoo,urZoo));
        System.out.println(myZoo.isZooFull(myZoo));


    }
}