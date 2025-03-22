import java.util.*;
public class grades{
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int maths=input.nextInt();
    int physics=input.nextInt();
    int chemistry=input.nextInt();
    int totalmarks=maths+physics+chemistry;
    int percentage=totalmarks/3;
    if(percentage<=39){
        System.out.println(" Total marks = "+totalmarks+ "Grade = R and Remarks : Remedial standards ");
    }
    else if(percentage>=70 && percentage<=79){
        System.out.println(" Total marks = "+totalmarks+ "Grade = B and Remarks : Level-3, at agency-normalized standards ");
    }
    else if(percentage>=60 && percentage<=69){
        System.out.println(" Total marks = "+totalmarks + "Grade = C and Remarks : Level-2,Below but aproaching agency-normalized standards ");
    }
    else if(percentage>=50 && percentage<=59){
        System.out.println(" Total marks = "+totalmarks + "Grade = D and Remarks : Level-1,Well below agency-normalized standards ");
    }
    else if(percentage>=40 && percentage<=49){
    System.out.println(" Total marks = "+totalmarks +"Grade = E and Remarks : Level-1,too below agency-normalized standards ");
    }
    else{
        System.out.println(" Total marks = "+totalmarks + "Grade = A and Remarks : Level-4,Above agency-normalized standards ");
    }
    }
}
