public class Main {
    public static void main(String[] args) {

        //initialization
        Human person1 = new Human("mohamed", 20);
        person1.setWeight(75.0f);

        System.out.println(person1.getWeight());

        System.out.println(person1.language("Japan", "Takashi"));

    }
}


