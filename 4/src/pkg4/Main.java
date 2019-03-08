/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4;

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
        AlpodRSA a=new AlpodRSA();
//        a.createRSA(5,11, 27, 13);
        System.out.println("");
      //  a.checkRSA(55, 3, 16, 36);
      ALGAMAL b=new ALGAMAL();
    // b.function(23,5, 11, 3, 15);
     // b.checkalgamal(23, 5, 22, 15, 19, 3);
     Gost g=new Gost();
     g.checkGost(11, 67, 25, 14, 10, 3,8);
    }
    
}
