//Andmeid sisaldava klassi eksemplari kasutamine Isikukoodi näitel


class Isikukood{
    String kood; //muutuja andmetuubiga
    String nimi;
    public Isikukood(String isikukood, String nimi){    //konstruktor atribuutidega
        this.isikukood = kood;
        this.nimi = nimi;
    }
    public void suguGender(){   //meetodid
        int firstNum = kood.charAt(0);
        if(firstNum % 2 == 0){
            System.out.println("Naine");
        } else {
            System.out.println("Mees");
        }
    }
    public void dateBirth(){

    }
    public void regionBirth(){

    }
    public static void main(String[] args) {
        Isikukood isik1 = new Isikukood("50001092840", "Nikita Kajalin");
        
        System.out.println(isik1.kood); // vaatame isikukoodi
        System.out.println(isik1.nimi); // vaatame isiku nimi
        

        isik1.suguGender(); //saame teada, milline sugu kood sisaldab
        isik1.dateBirth(); //saame teada isiku sunniaja
        isik1.regioon(); //saame teada, millises regioonis sunnis isik

    }
}