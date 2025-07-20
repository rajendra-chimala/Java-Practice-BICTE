public class P1{
    public static void main(String[] args) {
        
        // System.out.println("Hello World !");

        // Integer Type Data
        int age = 133;
        System.err.println(age);

        char alphabet ='B';
        System.err.println(alphabet);

        float pi = 3.14f;
        System.err.println(pi);

        String name = "Rajendra Chimala";
        System.err.println(name);

        int[] arr = {1,2,3,4,5,6};
        System.err.println("Arrays Elemtnts");
        for(int i=0; i< arr.length; i++){
            System.err.print(arr[i] +" ");
        }

        boolean isAdult = true;
        if(isAdult) System.err.println("He is adult now");


        // Literals in Java
        int oct = 012;  
        System.err.println(oct);

        // Charecter Literals
        System.out.println("Line1\nLine2");  // \n = new line


        // String Literals 
        String message = "Hello, \"Java\"!";
        System.err.println(message);


        // Constant 

        final float pi_val = 3.14f;
        System.err.println(pi_val);


    }
}