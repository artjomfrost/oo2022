public class Magamistuba {
    private double laius;
    private double pikkus;

    public Magamistuba(double uusLaius, double uusPikkus){
        laius = uusLaius;
        pikkus = uusPikkus;
    }

    public double magamistoaPindala(){
        return (laius * pikkus);
    }

}
