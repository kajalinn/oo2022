public class Proov1{
    public static void main(String[] args) {
        SamaTyypPaar<String> teienimi = new SamaTyypPaar<>();
        teienimi.esimene = "Nikita Kajalin";
        teienimi.teine = "Jaagup Kippar";
        System.out.println(teienimi.esimene);
        System.out.println(teienimi); //toString() are used by default
    }
}