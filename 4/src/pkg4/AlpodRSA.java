/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4;

import static pkg4.BasicFunctions.*;

/**
 *
 * @author User
 */
public class AlpodRSA extends BasicFunctions {

    public void createRSA(int p, int q, int c, int m) {
        int c1 = 0;
        long n, f;
        int m1;
        n = p * q;
        long d = 2;
        // int i = 1;
        f = (p - 1) * (q - 1);
        System.out.println("n=p*q:" + p + "*" + q + "=" + n);
        System.out.println("f=(p-1)*(q-1):" + (p - 1) + "*" + (q - 1) + "=" + f);
        for (;;) {
            if (nod(d, f) == 1) {
                break;
            }
            d++;
        }
        System.out.println("d= " + d);
        c1 = (int) FastPowFunc(d, -1, f);

        System.out.println("c=" + d + " pow " + "-1 mod " + f + "=" + c);

        int S = (int) FastPowFunc(m, c, n);
        System.out.println("S=" + S);
        int W = (int) FastPowFunc(S, d, n);
        System.out.println("W=" + W);
        if (W == m) {
            System.out.println("смс совпадают");
        } else {
            System.out.println("смс не совпадают");
        }

    }

    public void checkRSA(int n, int d, int S, int W) {
     int W1=(int) FastPowFunc(W, d, n);
     if (S==W1)
            System.out.println("подпись подлинная");
     else
            System.out.println("подпись не подлинная");
    }

}
