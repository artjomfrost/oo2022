public class Tekst{
    public static void main(String[] args) {

   String tekst="See on lause mida uurimiseks on voetud";
   int stringLength=tekst.replace(" ","").length();
   System.out.println(stringLength);
   char temp;
   int totalCharacters = 0;

   for(int i=0;i<stringLength;i++){
       temp=tekst.charAt(i);
       if(temp=='o'){
           totalCharacters++;
       }
   }
   System.out.println(totalCharacters);
   
   float protsent = (float)totalCharacters / stringLength * 100;
   System.out.println(protsent);
}
}