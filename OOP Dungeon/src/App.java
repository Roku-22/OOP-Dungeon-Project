import java.util.Scanner;

public class App {
    Scanner scanner = new Scanner(System.in);
    
    abstract class Characters {

        private String name;
        private String type;
        private int hp;
        private int damage;

        abstract String setName();
        abstract void attack();    
        
    }

    public class Player{
        
    }


    public static void main(String[] args) throws Exception {
        
    }
}
