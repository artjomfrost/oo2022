
public class Proov1{
    public static void main(String[] arg){
        Isikukood johannes=new Isikukood("39706132768");
        Isikukood liisbeth=new Isikukood("49711223241");
        Isikukood ardo=new Isikukood("14711223241");
        Isikukood veiko=new Isikukood("60711223241");
        System.out.println(johannes.synniaasta());
        System.out.println(liisbeth.synniaasta());
        System.out.println(ardo.synniaasta());
        System.out.println(veiko.synniaasta());
    }
}