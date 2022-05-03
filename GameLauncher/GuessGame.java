public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random * 10);
        System.out.println("IM guessing number between 0 and 9")

        while (true) {
            System.out.println("Guessed number is " + targetNumber)

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("First player mõtleb, et guessed number is" + guessp1)
            guessp2 = p2.number;
            System.out.println("Second player mõtleb, et guessed number is" + guessp2)
            guessp3 = p3.number;
            System.out.println("Third player mõtleb, et guessed number is" + guessp3)

            if(guessp1 == targetNumber) {
                p1isRight = true;
            }
            
            if(guessp2 == targetNumber) {
                p2isRight = true;
            }
            
            if(guessp3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight|| p2isRight || p3isRight) {
                System.out.println("We have a winner!!!!");
                System.out.println("Kas esimene mängija võitis? --> ", p1isRight);
                System.out.println("Kas teine mängija võitis? --> ", p2isRight);
                System.out.println("Kas kolmas mängija võitis? --> ", p3isRight);
                System.out.println("Mängu lõpp");
                break;
            } else {
                System.out.println("Mängijad peavad proovima veel kord")
            }


        }
    }

}