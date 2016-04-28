package vehicle;

public class Vehicle {

    public static void main(String[] args) {
        Automobile Cabbie = new Automobile("yellow",4,4,5);
        Cabbie.SetName("Cabbie");
        System.out.println(Cabbie.About());
        
        Automobile Sporty = new Automobile("red",2,8,7);
        Sporty.SetName("Sporty");
        System.out.println(Sporty.About());
        
        Automobile Vany = new Automobile("green",4,5,6);
        Vany.SetName("Vany");
        System.out.println(Vany.About());
        
    }
    
}
