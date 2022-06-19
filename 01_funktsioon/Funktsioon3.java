public class Funktsioon3{

    public static double[] reaalarvudeks(String[] sd){
		double[] g=new double[sd.length];
		for(int i=0; i<sd.length; i++){
			g[i]=Double.parseDouble(sd[i]);
			}
		return g;
		}
	public static void main(String[] arg){
		double[] radius=reaalarvudeks(arg);
		double pindala=0;
		if(arg.length == 1){
        pindala = radius[0] * radius[0] * Math.PI;
        System.out.println(pindala);
		} if (arg.length == 2){
			for(int i=0; i>3; i++){
				pindala = radius[i] * radius [i] * Math.PI;
				System.out.println(pindala);
			}
		}
}
}