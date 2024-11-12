public class Human {

    //public and private keyword are for "encapsulation" principle
    //overloading and overriding are for "polymorphism" principle
    //Attributes
    private String name;
    private int age;
    private float weight;
    private boolean adult;
     //Constructor
    public Human(){

    }
    public Human(String n){
        this.name = n;

    }
    public Human(String n, int age){
        this.name = n;
        this.age = age;

    }
    public Human(String n, int age, float w){
        this.weight = w;
        this.name = n;
        this.age = age;
    }


    public void setWeight(float w){
        this.weight = w;
    }

    public float getWeight(){
        return this.weight;
    }


    //Methods - functions
    public void eat(String type){
        System.out.println("I'M eating now" + type);
    }

    public void listen(){
        System.out.println("I'M listening now");
    }

    public int calcAge(int x, int y){
        int z = y - x;
        return z;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String language(String nationality){
        if(nationality == "Egypt"){
            return "Arabic";
        }
        else if(nationality == "Japan"){
            return "japanese";
        }
        else{
            return "unknown";
        }
    }

    //overloading is to change the parameter type or the number
    // of the parameter of the same name function
    public String language(String nationality, String name){
        if(nationality == "Egypt" && name == "Omar"){
            return "fluent Arabic";
        }
        else if(nationality == "Japan" && name == "Takashi"){
            return "fluent japanese";
        }
        else{
            return "unknown";
        }
    }

}
