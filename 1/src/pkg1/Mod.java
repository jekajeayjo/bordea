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
public class Mod {
    double result ;
    
    
    static int FastPowFunc(int Number, int Pow, int Mod)
        {
            int Result = 1;
            int Bit = Number % Mod;
if (Pow > 0){
            while (Pow > 0)
            {
                if ((Pow & 1) == 1)
                {
                    Result *= Bit;
                    Result %= Mod;
                }
                Bit *= Bit;
                Bit %= Mod;
                Pow >>= 1;
            }
}
            if (Pow <0)
        {
            System.out.println("зашел");
            int i=1;
            int n=0;
            int mod=0;
            System.out.println("("+i+"*"+Mod+"+1)/"+Number);
           for (;;)
            {
                System.out.println("("+i+"*"+Mod+"+1)/"+Number);
            Result=(i*Mod+1)/Number;
            mod=(i*Mod+1)%Number;
            i++;
          if (mod==0&Result>0)
          {
            //  System.out.println("Ответ="+Result);
          break;
          
          }
            }
          //  System.out.println("ответ "+n);
        }
            System.out.println(Result);
            return Result;
        }
}
