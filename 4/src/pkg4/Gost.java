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
public class Gost extends BasicFunctions {

    public void function(int q, int p, int a, int x, int h, int k) {
        int m = h;
        int i = (int) FastPowFunc(a, 1, p);
        int r = (int) FastPowFunc(i, 1, q);
        System.out.println("r:" + a + "mod" + p + "mod" + q + "=" + r);
        int s1 = ((k * h) + (x * r));
        int s = (int) FastPowFunc(s1, 1, q);
        System.out.println("s:(" + k + "*" + h + "+" + x + "*" + r + ")mod " + q + "=" + s);

    }

    void checkGost(int q, int p, int a, int y, int u, int r, int s) {
        int c1 = (int) FastPowFunc(u, -1, q);
        int c2 = (int) FastPowFunc(s, 1, q);
        int u1 = (int) FastPowFunc((c1 * c2), 1, q);
        System.out.println("u1: "+u+"pow -1*"+s+" mod "+q+"=" + u1);
        c1 = (int) FastPowFunc(-r, 1, q);
        c2 = (int) FastPowFunc(u, -1, q);
        int u2 = (int) FastPowFunc((c1 * c2), 1, q);
        System.out.println("u2: "+-r+"*"+u+"pow -1 mod "+q+"=" + u2);
        c1 = (int) FastPowFunc(a, u1, p);
        c2 = (int) FastPowFunc(y, u2, p);
        int c3=(int) FastPowFunc((c1 * c2), 1, p);
        int v=(int) FastPowFunc(c3, 1, q);
        System.out.println("v: ("+a+" pow "+u1+"*"+y+" pow "+u2+" mod "+p+")"+"mod "+q+"="+v);
    }
}
