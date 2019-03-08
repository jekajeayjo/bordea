/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3;

import java.util.ArrayList;
import java.util.List;
import static pkg3.BasicFunctions.FastPowFunc;

/**
 *
 * @author User
 */
public class Baby {
// with my love
    
    void funtion(int u, int p, int y) {
        int m = 0,k;
        int mult=0;
        di:{
        for  (k=1;k<100;k++)
        {
        for (m=1;m<(k+10);m++)
        {
        if ((m*k)>p)
            break di;
        }
        }
        }
        
        long baby[] = new long[6];
        long man[] = new long[6];
        int findbaby = 0, findman = 0;
        int x;
        int answer;
        int m1 = m;
        int y1 = y;
        System.out.print("u " + u + ", y " + y + ", p " + p + ", m " + m + ", k " + k + "\n");
        for (int i = 0; i < 6; i++) {
            baby[i] = FastPowFunc(u, m1, p);
            m1 += m;
            
            System.out.println(i+1+": "+u+" pow "+m+" mod "+p +" answer: "+"m " + m1 + " baby " + baby[i]);
        }
        
        System.out.println("");
        for (int j = 0; j < 6; j++) {
             y1 = (int) Math.pow(u, j)*y;
            man[j] = FastPowFunc(y1, 1, p);
           
            System.out.println(j+ ": "+y1+" mod "+p+" answer: "+ man[j]);
        }
        find:
        {
            for (int i = 0; i < baby.length; i++) {
                for (int j = 0; j < man.length; j++) {
                    if (man[j] == baby[i]) {
                        findbaby = i + 1;
                        findman = j;
                        System.out.println("man or j " + findman + " baby or i " + findbaby);
                        break find;
                    }
                }
            }
        }
        x = findbaby * m - findman;
        System.out.println(findbaby+"*"+m+"-"+findman+"=x, answer X= " + x);
        
answer= (int) FastPowFunc(u,x,p);
        System.out.println(" we check the number "+u+" pow "+x+" mod "+p+" answer "+answer);
        System.out.println();
    }
}
