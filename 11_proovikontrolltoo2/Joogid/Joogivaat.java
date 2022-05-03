public class Joogivaat{
    Double ruumala;
    Double kogusL;

    public Joogivaat(Double ruumala, Double kogusL){
        this.ruumala = ruumala;
        this.kogusL = kogusL;
    }


    public void pudeliTaitmine(Joogipudel joogipudel){
        this.kogusL -= joogipudel.maht;
        System.out.println("Pudel on taidetud! On jaanud " + kogusL + " liitrit");
    }
}