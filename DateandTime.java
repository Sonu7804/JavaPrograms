import java.sql.Date;

public class DateandTime {
  public static void main(String[] args) {
    

    java.util.Date dt=new java.util.Date();
    System.out.println(dt);
    

    long timeInms=dt.getTime();
    java.sql.Date dt1=new java.sql.Date(0);
  }  
}
