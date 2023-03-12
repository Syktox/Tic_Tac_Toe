import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Playground playground = new Playground();
        playground.clear();
        playground.printall();
        Player p1 = new Player('$');
        Player p2 = new Player('#');
        int count = 0;
        Scanner input = new Scanner(System.in);

        while (true) {

            if (count % 2 == 0) {
                System.out.println("\nPlayer1 ist am Zug: Gib einen Wert ein.");

                int x = input.nextInt();
                int y = input.nextInt();

                if (x < 3 && y < 3) {
                    if (playground.validInput(x, y)) {
                        playground.drawPoint(x, y, p1);
                        count++;
                    }
                } else {
                    System.out.println("Invalid Input");
                }

            } else {

                System.out.println("\nPlayer2 ist am Zug: Gib einen Wert ein.");

                int x = input.nextInt();
                int y = input.nextInt();

                if (x < 3 && y < 3) {
                    if (playground.validInput(x, y)) {
                        playground.drawPoint(x, y, p2);
                        count++;
                    }


                } else {
                    System.out.println("Invalid Input");
                }
            }


                playground.printall();

                if (playground.checklines()) {
                    playground.won();
                    break;
                }



        }
    }
}

