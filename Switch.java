package insa;

public class Switch {

    public static void main(String[] args) {
        int age = 10;
        switch (age) {
            case 5:
                System.out.println("l'enfant est un mineur");
                break;
            case 10:
                System.out.println("l'enfant est moyen");
                break;
            case 18:

                System.out.println("l'enfant est devenu majeur");
                break;

            default:
                System.out.println("majeur teh xamoul touss");
                break;
        }
    }
}