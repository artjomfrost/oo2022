public class Valemid {

    private double raadius;
    private double ykskolmandik = 1.0 / 3.0;
    public Valemid(double uusRaadius){
        raadius=uusRaadius;
    }
    public double ruumala(){
        return (Math.pow(raadius, 2) * Math.PI *4) * raadius * ykskolmandik;
    }
}
