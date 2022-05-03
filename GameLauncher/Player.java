public class Player {
    int number = 0;
    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("Mõtlen, et see arv on " + number)
    }
}