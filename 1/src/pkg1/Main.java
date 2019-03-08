/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FunctionAiler ailerFunction=new FunctionAiler();
       EasyNumber numberEasy=new EasyNumber();
       FunctionEvclid evclidFunction=new FunctionEvclid();
       Mod mod =new Mod();
//        int b=ailerFunction.function();
//        System.out.println(b);
//        boolean d=numberEasy.function(108);
//        System.out.println(d);
////        double c=evclidFunction.function(30, 18);
////         System.out.println(c)
//numberEasy.pros(187);
Mod.FastPowFunc(48,1 , 53);
//-number
//evclidFunction.function(33, 16);

        
    }
    public void dislayfunctions (int number)
    {
    System.out.println("функция простоты числа");
    
    }
    
}
