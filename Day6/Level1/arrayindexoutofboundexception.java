import java.util.Scanner;
class arrayindexoutofboundexception{
    public static void exception(String[] names,int index){
        System.out.println(names[index]);
    }
    public static void handleexcpetion(String[] names, int index){
        try {
            System.out.println(names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }catch(RuntimeException e){
            System.out.println("Runtime exception occurred");
        }
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String[] names = {"dog","mahesh","ram","cat"};
        int index = ip.nextInt();
        try{
            exception(names, index);
        }catch(Exception e){
            System.out.println("Exception caught in main");
        }
        handleexcpetion(names, index);
    }
}