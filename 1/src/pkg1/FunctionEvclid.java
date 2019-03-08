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
public class FunctionEvclid {

    double result=0;

    public double function(double a, double b) {

        while (a != 0 && b != 0) {
       
                if (a > b) {
                    a = a % b;
                } else if (a < b) {
                    b = b % a;
                }
            
        }
        result=a+b;
        System.out.println(result);
        return result;
    }
    void functionres (int a, int b,int d,int x,int y)
    {
    int s;
    if (b==0)
    {
    d=a;
    x=1;
    y=0;
    }
    else
    {
        s=y;
        y=x-(a/b)*y;
        x=s;
    }
    }
    

}
