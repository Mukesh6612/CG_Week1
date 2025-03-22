import java.util.*;
class illegalargumentexception{

    public static void exception(String text, int startindex,int endindex){
        if(startindex > endindex){
            throw new IllegalArgumentException("Start index cannot be greater than end index");
        }
        String substring = text.substring(startindex,endindex);
        System.out.println(substring);
    }

    public static void handleexception(String text, int startindex,int endindex){
        try {
            if(startindex > endindex){
            throw new IllegalArgumentException("Start index cannot be greater than end index");
            }
            String substring = text.substring(startindex,endindex);
            System.out.println(substring);
        } catch (IllegalArgumentException e) {
            System.out.println("illegalargumentexception");
        }catch (RuntimeException e){
            System.out.println("runtime exception");
        }
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String text = ip.next();
        int startindex = ip.nextInt();
        int endindex = ip.nextInt();

        handleexception(text, startindex, endindex);
    }
}