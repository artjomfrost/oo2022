public class Veekann {
    double temperature;
    double veekanniMaht = 1000.0;
    double valatudMaht = 100.0;
    double voimsus = 1200.0;
    double kuluvEnergia = 4.19;
    double mahtKraadiVorra = voimsus / kuluvEnergia;
    double terveMahtKraadiVorra = valatudMaht / mahtKraadiVorra;

    public Veekann() {

    }

    public String temperatuur(){
        if(this.temperature >= 80){
            return "Vee temperatuur ületab 80 kraadi, hetkel on: " + temperature +"kraadi";
        } else{
            return "Vee temperatuur on alla 80 kraadi, hetkel on: "  + temperature +"kraadi";
        }
    }

    public void veekannToole(double sek, double esialgneTemp){
        if((sek /terveMahtKraadiVorra) + esialgneTemp > 100.0){
            this.temperature = 100.0;
        } else{
            this.temperature = (sek /terveMahtKraadiVorra) + esialgneTemp;
        }
    }
    public void veeLisamine(double lisaVett, double lisatudVeeTemp){
        if(lisaVett <= (veekanniMaht-valatudMaht)){
            this.temperature =  (valatudMaht*this.temperature + lisaVett*lisatudVeeTemp)/(valatudMaht+lisaVett);
        } else {
            System.out.println("Vesi läks üle ääre");
        }
    }
}