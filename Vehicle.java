package vehicle;

public class Vehicle {

    public static void main(String[] args) {
        Automobile Cabbie = new Automobile(4,4);
        Cabbie.SetTransmission(5);
        Cabbie.SetColor("Yellow");
        Cabbie.SetName("Cabbie");
        System.out.println(Cabbie.About());
        
        Automobile Sporty = new Automobile(2,8,7);
        Sporty.SetColor("Red");
        Sporty.SetName("Sporty");
        System.out.println(Sporty.About());
        
        Automobile Vany = new Automobile("green",4,5,6);
        Vany.SetName("Vany");
        System.out.println(Vany.About());
        
    }
    
}
