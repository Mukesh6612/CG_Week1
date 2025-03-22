import java.util.*;
class NumberChecker2{
    public static int CountDigit(int number){
        int count=0;
        while(number>0){
            number/=10;
            count++;
        }
        return count;
    }
    public static int[] StoreInArray(int number,int cnt){
        int[] arr=new int[cnt];
        for(int i=0;i<cnt;i++ ){
            arr[i]=number%10;
            number/=10;
        }
        return arr;
    }
    public static boolean DuckNumber(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                return false;
            }
        }
        return true;
    }

    public static boolean ArmStrong(int number){
        int num=number;
        int res=0;
        while(num>0){
            int digit=num%10;
            res+=digit*digit*digit;
            num/=10;
        }
        if(res!=number){
            return false;
        }
        return true;
    }
    public static int[] largestSecondLargest(int[] arr){
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
        }
        return new int[]{largest,secondLargest};
    }
    public static int[] smallSecondSmall(int[] arr){
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                secondSmallest=smallest;
                smallest=arr[i];
            }
            if(arr[i]<secondSmallest && arr[i]!=smallest){
                secondSmallest=arr[i];
            }
        }
        return new int[]{smallest,secondSmallest};
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=input.nextInt();
        int cnt=CountDigit(number);
        System.out.println("Digits in given number :"+cnt);
        int[] arr=StoreInArray(number, cnt);
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
        boolean duckNumber=DuckNumber(arr);
        System.out.println(duckNumber);
        boolean armStrong=ArmStrong(number);
        System.out.println(armStrong);
        int[] res1=largestSecondLargest(arr);
        System.out.println("Largest number in array is "+res1[0]);
        System.out.println("SecondLargest number in array is "+res1[1]);
        int[] res2=smallSecondSmall(arr);
        System.out.println("Smallest number in array is "+res2[0]);
        System.out.println("SecondSmallestnumber in array is "+res2[1]);
    }
}
