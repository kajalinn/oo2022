public class Race {
    int racing_stage = 6; // total of racing circles
    Racer r1;
    Racer r2;

    public void StartRace(){
        r1 = new Racer();
        r2 = new Racer();

        boolean r1_winner = false;
        boolean r2_winner = false;

        System.out.println("Race is starting!");
        int i = 1;
        while (i < racing_stage){
            r1.point_per_stage();
            r2.point_per_stage();
            System.out.println("After " + i + " stage : ");
            System.out.println("First racer has " + r1.points + " points ");
            System.out.println("Second racer has " + r2.points + " points ");
            i++;
        }
        if (r1.points == r2.points) {
            System.out.println("We have a draw result!");
        }
        if(r1.points > r2.points) {
            r1_winner = true;
            System.out.println("First racer R1 is a winner!");
        } else {
            r2_winner = true;
            System.out.println("Second racer R2 is a winner!");
        }
    }
}
