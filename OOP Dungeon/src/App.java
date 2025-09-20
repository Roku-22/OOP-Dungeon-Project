public class App {

    abstract class Character {
        private String name;
        private String type;
        private int hp;
        private int damage;
        private int mana;

        abstract void setName(name);
    }

    class Player extends Character {
        String playerName;
        void setName(){
            
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
