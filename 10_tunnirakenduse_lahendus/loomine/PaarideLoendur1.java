import java.util.*;
public class PaarideLoendur1<T extends Comparable<T> >{
    Map<SamaTyypPaar<T>, Integer> loendur = new TreeMap<>();
    T eelmine = null;
    void lisa(T element){
        if(eelmine!= null){
            SamaTyypPaar<T> uus = new SamaTyypPaar<>();
            uus.esimene = eelmine;
            uus.teine = element;
            if(loendur.containsKey(uus)){
                 loendur.put(uus, loendur.get(uus)+ 1);
            } else {loendur.put(uus, 1);}
        }
        eelmine = element;
    }
    List<Map.Entry<SamaTyypPaar<T>, Integer>> jarjestatud(){
        List<Map.Entry<SamaTyypPaar<T>, Integer> > abi = new ArrayList<>(loendur.entrySet());
        Collections.sort(abi, new Comparator<Map.Entry<SamaTyypPaar<T>, Integer> >(){
            public int compare(Map.Entry<SamaTyypPaar<T>, Integer> vorraldav1, 
                                Map.Entry<SamaTyypPaar<T>, Integer> vorraldav2 ){
                                    return vorraldav2.getValue()-vorraldav1.getValue();
                                }
        });
        return abi;
    }
}