import java.util.*;
class L2p9{
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int side1=input.nextInt();
    int side2=input.nextInt();
    int side3=input.nextInt();
    int perimeter=side1+side2+side3; 
    float km=perimeter/1000f; if(km<1){
		System.out.println("Zero round");
     }else{
		 System.out.println(" The total number of rounds the athlete will run is to complete 5 km "+ (int)(5/km));
		 }
	}
}