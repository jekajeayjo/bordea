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
public class FunctionAiler {

    int result = 0;

    int function(int number) {
result =number;
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
       // System.out.println(result);
        return result;
    }
}
