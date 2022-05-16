import java.util.*;
public class Keskmised3_proov{
	public static void main(String[] arg){
		Keskmised3 k=new Keskmised3();
		k.lisa(2);
		k.lisa(6);
		k.lisa(4);
		k.lisa(5);
		k.lisa(3);
		System.out.println(
		  Arrays.toString(
		    k.libisevKeskmine()));
	}
}