public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.age = 5;
        lion.family = "cats";
        System.out.println(lion.name);
        Animal dog = new Animal("canine","snoopy",5,true);
        System.out.println(dog.name);
        Zoo myZoo= new Zoo("wildlife","Ariana",25);
        Zoo urZoo= new Zoo("jungle","america",20);

        System.out.println(myZoo);
       /* Zoo.displayZoo();


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
        System.out.println(Zoo.isZooFull(myZoo));


    }
}