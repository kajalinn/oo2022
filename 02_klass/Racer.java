public class Racer {
    int point = 0;
    int points = 0;
    public void point_per_stage(){
        point = (int) (Math.random() * 10);
        points += point;
    }
}
