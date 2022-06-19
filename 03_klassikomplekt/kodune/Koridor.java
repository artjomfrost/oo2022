public class Koridor {

    private double laius;
    private double pikkus;

    public Koridor(double uusLaius, double uusPikkus){
        laius = uusLaius;
        pikkus = uusPikkus;
    }

    public double koridoriPindala(){
        return (laius * pikkus);
    }
    
}
