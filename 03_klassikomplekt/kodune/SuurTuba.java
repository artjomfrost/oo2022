public class SuurTuba {    
    private double laius;
    private double pikkus;

    public SuurTuba(double uusLaius, double uusPikkus){
        laius = uusLaius;
        pikkus = uusPikkus;
    }

    public double suureToaPindala(){
        return (laius * pikkus);
    }
    
}
