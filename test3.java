public class Test3{
    public static void main(String arg[]){
        int a=50, b=20;
        if(a>b){
            if(a>100){
                System.out.println("Ace");
            }
            if(b<100){
                b=50;
            }
        }
        else if(a==b){
            System.out.print("King");

        }
        else{
            System.out.print("Queen");
        }
    }
}