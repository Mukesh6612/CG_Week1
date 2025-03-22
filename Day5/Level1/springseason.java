import java.util.*;
class springseason{
    public static String season(int month,int day){
        if((month==3 && day >= 20) || 
        (month>3 && month < 7)||(month==6 && day<=20)){
            return "Spring Season";
        }
        else{
            return "Not a Spring Season";
        }
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int month = ip.nextInt();
        int day = ip.nextInt();
        String result= season(month, day);
        System.out.println(result);

    }
}