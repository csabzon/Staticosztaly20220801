public class Osztaly {


    public static void main(String[] args) {

        Statikus.maci = 12;
        System.out.println(Statikus.maci);
        Statikus stat1 = new Statikus(13);
        System.out.println(stat1);
        stat1.setLaci(17);
        System.out.println(stat1);
        Statikus.maci=30;
        System.out.println(Statikus.maci);


    }
}
