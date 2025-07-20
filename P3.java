// class parents{
//     int money = 2000;


// }

// class child extends parents{
//     int cmoney = money+300; 
//     void cf(){
//         System.out.println(money);
       
//     }
// }

// // class gchild extends child{


// // void gc(){
// //     System.out.println(cmoney);
// // }
// // }


// class gchild extends parents{


// void gc(){
//     System.out.println(money);
// }
// }


// super keyword


class parents {
     parents(){
        System.out.println("Task of paresnts !");
    }

}

class child extends parents{
    child(){
        super();
    }
}



public class P3 {
    public static void main(String[] args) {
        

        // child c = new child();
        // c.cf();

        // gchild gc = new gchild();
        // gc.gc();

        // child c = new child();
        // c.cf();

        child c = new child();





    }
    
}
