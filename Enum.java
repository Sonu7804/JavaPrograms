
enum Week{
MON, TUE, WED, TUS, FRI, SAT, SUN;
}
public class Enum 
{
   enum Result
   {
    PASS, FAIL, NR;
   }
    public static void main(String[] args) {
        
       Week w=Week.MON;
       System.out.println(w);

       int index =Week.MON.ordinal();
       System.out.println(index);

       Week[]wr=Week.values();
       for(Week w1:wr)
       {
        System.out.println(w1 + " : " + w1.ordinal());
       }

    //    Result r=Result.PASS;
    //    System.out.println(r);
    }
}
