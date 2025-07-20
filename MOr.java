class Animal{
    void sound(){

        System.out.println("Animal make Sound !");

    }
}

class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Dog make Sound !");
    }
}


public class MOr {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        

        
    }
    
}
