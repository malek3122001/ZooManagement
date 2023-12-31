package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int NBR_GAGES=25;

    private int animalCount=0;





    public int getNBR_GAGES() {
        return NBR_GAGES;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isBlank())
        this.name = name;
        else System.out.println("le nom ne doit pas etre vide ");
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }




    public Zoo(String name, String city, int NBR_GAGES ){
        this.name=name;
        this.city=city;
        this.animals=new Animal[NBR_GAGES];

    }
   /* public void displayZoo() {
        System.out.println("Nom du zoo: " + name);
        System.out.println("Ville: " + city);
        System.out.println("Nombre de cages: " + nbrCages);
    }
    */

   @Override
   public String toString() {
        return "tn.esprit.gestionzoo.entities.Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + NBR_GAGES+
                '}';
    }
    public boolean addAnimal(Animal animal) {
        if (isZooFull(this) ) {
            animals[animalCount] = animal;
            animalCount++;
            return true;
        } else {
            return false;
        }
    }


        /*public void displayAnimals(){
            for (int i = 0; i < animals.length; i++) {
                System.out.println(animals[i]);
            }
        }*/

        public int searchAnimal(Animal animal) {
            for (int j = 0; j < animals.length; j++) {
                if (animals[j]==animal) {
                    return j;
                }
            }
                return -1;
            }

    public boolean removeAnimal(Animal animal) {
        animalCount=animals.length;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i]==animal) {
                for (int j = i; j < animals.length - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[animalCount- 1] = null;
                animalCount=animalCount-1 ;
                return true;
            }
        }
        return false;
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2){

        if (z1.NBR_GAGES>z2.NBR_GAGES){
            return z1;
        }
        else return z2;

        }


    public boolean isZooFull(Zoo zoo){
            if (animals.length == zoo.NBR_GAGES){
                return true;
            }
            return false;
    }




}
