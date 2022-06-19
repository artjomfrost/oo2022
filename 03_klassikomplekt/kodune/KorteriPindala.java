public class KorteriPindala {
    public static void main (String[] args){
        Koridor k = new Koridor (1.5, 5.0);
        SuurTuba st = new SuurTuba (6.0, 10.0);
        MagamisTuba mt = new MagamisTuba (4.0, 6.0);

        double pindala = (k.koridoriPindala() + st.suureToaPindala() + mt.magamistoaPindala());
        System.out.println("Korteri üldpindala on " + pindala + " ruutmeetrit.");

    }
    
}
