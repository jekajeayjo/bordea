/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class BasicFunctions {
     int checkarray (int array1[],int array2[])
    {
     int result=0 ;
    int count=0;
    if (array1.length>1||array2.length>1)
    {
    for (int i=0;i<array1.length;i++)
    {
    for (int j=0;j<array2.length;j++)
    {
    if (array1[i]==array2[j])
    {
    count++;
    }
    }
    }
        System.out.println("count "+count);
    if (count>1&&array1.length>array2.length)
    result=1;
    else if (count>1&&array2.length>=array1.length)
        result=2;
    }
    else if (count==1)
    result=0;
        return result;
    }
    
    List array=new ArrayList();
    
    public ArrayList easyNumber(int x) {

        double sqrt = Math.sqrt(x);
        int currentValue = x;
        int multiplier = 2;
        while (currentValue > 1 && multiplier <= sqrt) {
            if (currentValue % multiplier == 0) {
                
               // System.out.print(multiplier + " ");
                currentValue /= multiplier;
                array.add(multiplier);
            
            } else if (multiplier == 2) {
                multiplier++;
            } else {
                multiplier += 2;
            }
        }
        if (currentValue != 1) {
                array.add(currentValue);
            //System.out.print(currentValue);
        }
        return (ArrayList) array;
    }
    

    long result = 0;

    long functionAiler(long number) {
        result = number;
        for (int i = 2; i * i <= number; ++i) {
            if (number % i == 0) {
                while (number % i == 0) {
                    number /= i;
                }
                result -= result / i;
            }
        }
        if (number > 1) {
            result -= result / number;
        }
        //  System.out.println(result);
        return result;
    }

    static long FastPowFunc(long Number, long Pow, long Mod) {
        long Result = 1;
        long Bit = Number % Mod;

        while (Pow > 0) {
            if ((Pow & 1) == 1) {
                Result *= Bit;
                Result %= Mod;
            }
            Bit *= Bit;
            Bit %= Mod;
            Pow >>= 1;
        }
        if (Pow < 0) {
            //System.out.println("зашел");
            long i = 1;

            long mod = 0;
            // System.out.println("("+i+"*"+Mod+"+1)/"+Number);
            for (;;) {
                //  System.out.println("("+i+"*"+Mod+"+1)/"+Number);
                Result = (i * Mod + 1) / Number;
                mod = (i * Mod + 1) % Number;
                i++;
                if (mod == 0 & Result > 0) {
                    //  System.out.println("Ответ="+Result);
                    break;

                }
            }
            //  System.out.println("ответ "+n);
        }
        //   System.out.println(Result);
        return Result;
    }
    
    
     public int[] newarray(int x,int k) {

        double sqrt = Math.sqrt(x);
        int currentValue = x;
        int multiplier = 2;
        while (currentValue > 1 && multiplier <= sqrt) {
            if (currentValue % multiplier == 0) {
                
               // System.out.print(multiplier + " ");
                currentValue /= multiplier;
                array.add(multiplier);
            
            } else if (multiplier == 2) {
                multiplier++;
            } else {
                multiplier += 2;
            }
        }
        if (currentValue != 1) {
                array.add(currentValue);
                array.add(k);
            //System.out.print(currentValue);
        }
        int answer[]=new int [array.size()];
        for (int i=0;i<answer.length;i++)
        {
        answer[i]=(int) array.get(i);
        }
        array.clear();
        return answer;
    }
     
     
        public int[] easyNumber1(int x) {

        double sqrt = Math.sqrt(x);
        int currentValue = x;
        int multiplier = 2;
        while (currentValue > 1 && multiplier <= sqrt) {
            if (currentValue % multiplier == 0) {
                
               // System.out.print(multiplier + " ");
                currentValue /= multiplier;
                array.add(multiplier);
            
            } else if (multiplier == 2) {
                multiplier++;
            } else {
                multiplier += 2;
            }
        }
        if (currentValue != 1) {
                array.add(currentValue);
            //System.out.print(currentValue);
        }
        int answer[]=new int [array.size()];
        for (int i=0;i<answer.length;i++)
        {
        answer[i]=(int) array.get(i);
        }
        array.clear();
        return answer;
    }
}
