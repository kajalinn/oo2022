import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Harmooniline_kiirus {

    private static final DecimalFormat df = new DecimalFormat("0.0");   //loome soovituslik format



    static int[] convertToInt(String data) //teisendame faili sisaldis
    {
        String[] splitArray = data.split(",");
        int[] array = new int[splitArray.length];
        for (int i = 0; i < splitArray.length; i++) {
            array[i] = Integer.parseInt(splitArray[i]);
        }
        return array;
    }



    static int[] teisendaKeskmiks() {      //põhifunkstioon kus leiame keskmisi
        ArrayList<Integer> keskmine = new ArrayList<Integer>();
        try {
            File speed_Obj = new File("antud_kiirus.txt");
            Scanner Speed_reader = new Scanner(speed_Obj);
            while (Speed_reader.hasNextLine()) {
                String data = Speed_reader.nextLine();
                int[] parts = convertToInt(data);
                keskmine.add((parts[0] + parts[1]) / 2);
            }
            Speed_reader.close();
            System.out.println("Lõikade keskmised: " + keskmine);
            valueOfHarmonic(keskmine);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");e.printStackTrace();}
        return null;
    }



    public static String valueOfHarmonic(ArrayList<Integer> data)
    {
        double sum = 0.0;
        for (int i = 0; i < data.size(); i++) {
            sum += 1.0 / data.get(i);
        }
        System.out.println("Üldkeskmine " + df.format(data.size() / sum) + " km/h");
        writeToFile(df.format(data.size() / sum));
        return df.format(data.size() / sum);
    }



    public static void writeToFile(String valueOfHarmonic) {
        try {
            FileWriter filew = new FileWriter("kiiruse_kogum.txt");
            filew.write(valueOfHarmonic);filew.write(System.lineSeparator());filew.close();
        } catch (IOException e) {System.out.println("Error...");e.printStackTrace();
        }
    };

    public static void main(String[] args) {
        teisendaKeskmiks();
    }
}