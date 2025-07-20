// class test {
    
//     void print(int a ,int b){
//         int sum = a+b;
//         System.err.println("The sum of "+a+" and "+b+" = "+sum);
//     }
    
// }


class student{

    String name ;

    student(String a){

    this.name = a;
        System.out.println("The constructor is called !");
        System.err.println(name);
    }


    class ram{
        ram(){
            System.err.println("This is Ram !");
        }
    }
}







public class P2 {
   static void varArg(int...args){
        for(int a:args){
            System.err.println(a);
        }
            
        } 

    public static void main(String[] args) {

        // test nt = new test();
        // nt.print(20,40);


        // Accessing command line argumant 

        // for (String string : args) {
        //     System.err.print(string+" ");
            
        // }

        // int[] a = {3,2,4,6,7,3,4,5};

        // for(int i:a){
        //     System.err.println(i);
        // }

        student s = new student("Rajendra Chimala");

        // student.ram r = s.new ram();

    //    varArg(1,2,3,4,5,6,7,7,8);


       System.gc();
        
    }
    
}
