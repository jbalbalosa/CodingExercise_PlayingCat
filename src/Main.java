public class Main {
    public static void main(String[] args) {
        System.out.println("Udemy: Java Programming Masterclass");
        System.out.println("Coding Exercise: Equality Printer");
        System.out.println("");


        System.out.println( isCatPlaying(true, 10));
        System.out.println( isCatPlaying(false, 36));
        System.out.println( isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        if (summer == true && (temperature >=25 && temperature <=45)) {
            return  true;
        } else {
            if (temperature >= 25 && temperature <= 35) {
                return true;
            } else {
                return false;
            }
        }
    }
}