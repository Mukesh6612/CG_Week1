class gratest{
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        int c = 6;
        if(a>b){
            if(a>c){
                System.out.println("a");
            }
        }
        if(b>a){
            if(b>c){
                System.out.println("b");
            }
        }
        else{
            System.out.println("c");
        }
    }
}