public class Fibonacci {
    public static void main(String[] args) {  
        int f0 = 0, f1 = 1;  
        System.out.println("Fibonacci Series till 10 terms: \n");  
        System.out.println(f0 + " " + f1);
        
        for (int i = 1; i <= 10; ++i) {  
            int f = f0 + f1;  
            System.out.print(f0 + ", ");  

            f0 = f1;  
            f1 = f;  
        }  
    }  
}