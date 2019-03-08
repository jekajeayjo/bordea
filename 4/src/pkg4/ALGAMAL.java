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
public class ALGAMAL extends BasicFunctions {

    public void function(int p, int g, int x, int k, int m) {
        int h = m;
        int y = (int) FastPowFunc(g, x, p);
        System.out.println("y:" + g + " pow " + x + "mod " + p + "=" + y);
        int r = (int) FastPowFunc(g, k, p);
        System.out.println("r:" + g + "pow " + k + "mod " + p + "=" + r);
        int a = h - (x * r);
        // System.out.println("a"+a);
        int u = (int) FastPowFunc(a, 1, (p - 1));
        System.out.println("u:" + h + "-" + x + "*" + r + "mod " + (p - 1) + "= " + u);
        int s1 = (int) FastPowFunc(k, -1, (p - 1));
        int s2 = (int) FastPowFunc(h, 1, (p - 1));
        int s = s1 * s2;

        s = (int) FastPowFunc(s, 1, (p - 1));
        System.out.println("s:" + k + "pow -1 *" + h + "mod" + (p - 1) + "=" + s);
        System.out.println("<" + u + "," + r + "," + s + ">");
        checkalgamal(p, g, y, u, r, s);

    }

    public void checkalgamal(int p, int g, int y, int u, int r, int s) {
        int c = (int) FastPowFunc(y, r, p);
        int t = (int) FastPowFunc(r, s, p);
        int e = (int) FastPowFunc((c * t), 1, p);
        //System.out.println(e);
        int e1 = (int) FastPowFunc(g, u, 23);
        //System.out.println(e1);
        System.out.println(y + "pow" + r + "*" + r + "pow" + s + "=" + s + "pow" + u + "mod" + p);
        System.out.println(e + "=" + e1);
        if (e1 == e) {
            System.out.println("Cовпадает");
        } else {
            System.out.println("Не совпадает");
        }

    }
}
