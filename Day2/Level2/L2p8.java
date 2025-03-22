import java.util.*;
class L2p8{
   public static void main(String[] args) {
	   Scanner input=new Scanner(System.in);
	   String name,fromCity,viaCity,toCity;
	   double fromToVia,viaToFinalCity;
	   int timeFromtoVia,timeViatoFinal;
	   name=input.nextLine();
	   fromCity=input.nextLine();
	   viaCity=input.nextLine();
	   toCity=input.nextLine();
	   fromToVia=input.nextDouble();
	   viaToFinalCity=input.nextDouble();
	   timeFromtoVia=4*60+4;
	   timeViatoFinal=4*60+25;
	   double totalDistance=fromToVia+viaToFinalCity;
	   int totalTime=timeFromtoVia+timeViatoFinal;
	   int hours=totalTime/60;
	   int mins=totalTime%60;
	   System.out.print("Hey ,"+name+".The total distance is "+totalDistance+" and total time is "+hours+"hrs and "+mins+" mins");
   }
}