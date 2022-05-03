import java.io.*;

public class FailiLogija implements Logija{
    String fail;
    public FailiLogija(String fail){
        this.fail = fail;
    }
    public void logi(String text){
        try{
            PrintWriter pw = new PrintWriter(new FileWriter(fail, true));
            pw.println(new java.util.Date()+ " " + text);
            pw.close();
        } catch (Exception e){
            System.out.println("Viga logimisel " + text);
        }
    }
}