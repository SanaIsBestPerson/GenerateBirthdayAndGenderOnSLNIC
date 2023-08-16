import java.util.*;

public class GenerateBirthdayAndGender{

    static String src,year,month,day,sex,nic;
    static int len,days;
    static String lastchr;

    public static void main (String [] args){

        Scanner src = new Scanner(System.in);
        System.out.print("Enter your NIC: ");
        nic = src.nextLine();
        System.out.println("NIC is: " + nic);
        src.close();

        if( nic.matches("^[0-9]{9}[vV|xX]$")){ 
    
            year=nic.substring(0,2);
            day=nic.substring(2,5);
            Gender.getGender();
            MonthDay.getMonthDay();
            System.out.println("Your Birthday is 19"+year+"-"+month+"-"+days);
            System.out.println("your gender is "+sex);
        
        }else if (nic.matches("^[0-9]{12}$")){ 
        
            year=nic.substring(0,4);
            day=nic.substring(4,7);
            Gender.getGender();
            MonthDay.getMonthDay();
            System.out.println("Your Birthday is "+year+"-"+month+"-"+days);
            System.out.println("your gender is "+sex);
           
        }else{
            System.out.println("Invalide NIC");
        }
    }

    public static class MonthDay {
        
        public static void getMonthDay() {
            int CountMounth = 0;
            int y = 0;

            int[] MonthNum = {0,31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335, 366};
            String[] Month = {"","January","February","March","April","May","June","July","August","September","October","November","December"};
 
            for( ; y<12 ; y++){
                if (MonthNum[y]<len){
                    CountMounth = CountMounth+1;
                }   
            }
            
            month = Month[CountMounth];
            days=len-MonthNum[CountMounth-1];
            
        }   
    }

    public static class Gender {

        public static void getGender(){
            len = Integer.parseInt(day);

            if (len>500){
                sex="female";
                len=len-500;
            }else{
                sex="male";
            }
        }
    }
}