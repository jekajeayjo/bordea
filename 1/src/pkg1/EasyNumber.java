/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

import static java.lang.Math.sqrt;

/**
 *
 * @author User
 */
public class EasyNumber {
    boolean easynumber;
    boolean function (int number )
    {
         easynumber= true;
    for (int i=2;i<=sqrt(number);i++)
    
    if (number%i==0)
      easynumber=false;
    

   
    
    return easynumber;
    }
    public void pros(int x)
    {
   
double sqrt = Math.sqrt(x);
int currentValue = x;
int multiplier = 2;
while (currentValue > 1 && multiplier <= sqrt)
{
    if (currentValue % multiplier == 0)
    {
        System.out.print(multiplier + " ");
        currentValue /= multiplier;
    }
    else if (multiplier == 2)
    {
        multiplier++;
    }
    else
    {
        multiplier += 2;
    }
}
if (currentValue != 1)
{
    System.out.print(currentValue);
}
    }
}
