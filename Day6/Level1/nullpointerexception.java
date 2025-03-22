class nullpointerexception{

    public static void exception(){
        String text = null;
        System.out.println(text.length());
    }
    public static void handleexception(){
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("null pointer exception");
        }
    }
    public static void main(String[] args) {
        handleexception();
    }
}