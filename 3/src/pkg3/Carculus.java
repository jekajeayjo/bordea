/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3;

import java.lang.reflect.Array;
import static pkg3.BasicFunctions.*;
import static pkg3.GaussSystem.getTriangleFormMart;
import static pkg3.GaussSystem.printRoots;
import static pkg3.GaussSystem.printSystem;

/**
 *
 * @author User
 */
public class Carculus {

    BasicFunctions b = new BasicFunctions();

    /**
     * @param args the command line arguments
     */
    int checkarray(int array1[], int array2[]) {

        int result = 0;
        int count = 0;
        if (array1.length > 1 || array2.length > 1) {
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == array2[j]) {
                        count++;
                    }
                }
            }
            // System.out.println("count " + count);
            if (count > 1 && array1.length > array2.length) {
                result = 1;
            } else if (count > 1 && array2.length >= array1.length) {
                result = 2;
            }
        } else if (count == 1) {
            result = 0;
        }
        return result;
    }

    void function(int a, int p, int y) {
        boolean status1 = false, status2 = false, status3 = false, status4 = false;
        String elements = "elements";
        int checkarrays;
        int s[] = {2, 3, 5, 7};
        int t = s.length;
        String funct = null;
        int u1, u2, u3, u4, u5, u6, u7;
        int[] array1 = null, array2 = null, array3 = null, array4 = null, array5 = null;
        int countarray = 1;
        int y1, y2, y3, y4, y5, y6;
        int findt[];
        int findk;
        int k = 1;
        int h = 0;
        while (t != 0) {
            findk = (int) FastPowFunc(a, k, p);
            funct = "k=" + k + ":" + a + " pow " + k + " mod " + p + " =" + findk;
            //System.out.println(funct);
            findt = b.easyNumber1(findk);
//             System.out.println(" array findt " + findt.length);
//            for (int i = 0; i < findt.length; i++) {
//                System.out.print(findt[i] + " ");
//            }

            for (int i = 0; i < findt.length; i++) {
//                System.out.println("\niteration n=" + (i + 1));
                for (int j = 0; j < findt.length; j++) {
                    if (findt[i] == findt[j]) {
//                        System.out.println("i=" + findt[i] + " " + "j=" + findt[j]);
                        h++;
//                        System.out.println("h=" + h);
                    }
                }
                if (h > 1) {
                    System.out.println(funct + " -");
                    h = 0;
                    break;
                } else {
                    h = 0;
                    for (int n = 0; n < findt.length; n++) {
                        for (int m = 0; m < s.length; m++) {
                            if (findt[n] == s[m]) {
                                h++;
                            }
                        }
                    }
//                    System.out.println("совпадений " + h);
                    int r = (int) (s.length * findt.length) - h;
                    int r1 = (int) (s.length * findt.length) - findt.length;

                    if (r == r1) {
                        switch (countarray) {
                            case 1: {
                                if (array1 != null) {
                                    countarray++;
                                    break;
                                } else {
                                    array1 = new int[findt.length];
                                    for (int g = 0; g < array1.length; g++) {
                                        array1[g] = findt[g];
                                    }
                                    countarray++;
                                    break;
                                }
                            }
                            case 2: {
                                if (array2 != null) {
                                    countarray++;
                                    break;
                                } else {
                                    array2 = new int[findt.length];
                                    for (int g = 0; g < array2.length; g++) {
                                        array2[g] = findt[g];
                                    }
                                    countarray++;
                                    break;
                                }
                            }
                            case 3: {
                                if (array3 != null) {
                                    countarray++;
                                    break;
                                } else {
                                    array3 = new int[findt.length];
                                    for (int g = 0; g < array3.length; g++) {
                                        array3[g] = findt[g];
                                    }
                                    countarray++;
                                    break;
                                }
                            }
                            case 4: {
                                if (array4 != null) {
                                    countarray = 1;
                                    break;
                                } else {
                                    array4 = new int[findt.length];
                                    for (int g = 0; g < array4.length; g++) {
                                        array4[g] = findt[g];
                                    }
                                    countarray = 1;
                                    break;
                                }
                            }
                            case 5: {
                                array5 = new int[findt.length];
                                for (int g = 0; g < array5.length; g++) {
                                    array5[g] = findt[g];
                                }
                                countarray = 1;
                                break;
                            }
                        }

                        //
                        if (array1 != null && status1 == false) {
                            status1 = true;
                            for (int u = 0; u < findt.length; u++) {
                                elements += " " + findt[u];
                            }
                            System.out.println(funct + " +:" + elements);
                            elements = " elements ";
                            h = 0;
                            t--;

                            countarray = 2;
                            array1 = b.newarray(findk, k);
                            break;
                        } else if (array2 != null && status2 == false) {
                            countarray = 3;
                            checkarrays = checkarray(array1, array2);
                            //  System.out.println("checkarrays " + checkarrays);
                            if (checkarrays == 1) {
                                // t++;
                                h = 0;
                                array1 = null;
                                status1 = false;
                                countarray = 1;
                                System.out.println(funct + " -");
                                break;
                            } else if (checkarrays == 2) {
                                countarray = 2;
                                // t++;
                                h = 0;
                                array2 = null;
                                status2 = false;
                                System.out.println(funct + " -");
                                break;
                            } else {
                                countarray = 3;

                                status2 = true;
                                for (int u = 0; u < findt.length; u++) {
                                    elements += " " + findt[u];
                                }
                                System.out.println(funct + " +:" + elements);
                                elements = " elements ";
                                h = 0;
                                t--;
                                array2 = b.newarray(findk, k);
                                break;
                            }

                        }
                        if (array3 != null && status3 == false) {
                            checkarrays = checkarray(array1, array3);
                            int checkarrays1 = checkarray(array2, array3);
                            // System.out.println("checkarrays " + checkarrays);
                            if (checkarrays == 1 || checkarrays1 == 1) {
                                if (checkarrays == 1) {
                                    countarray = 1;
                                    h = 0;
                                    // t++;
                                    array1 = null;
                                    status1 = false;
                                    System.out.println(funct + " -");
                                    break;
                                } else if (checkarrays1 == 1) {
                                    countarray = 2;
                                    h = 0;
                                    //t++;
                                    array2 = null;
                                    status2 = false;
                                    System.out.println(funct + " -");
                                    break;
                                }

                            } else if (checkarrays == 2 || checkarrays1 == 2) {
                                countarray = 3;
                                h = 0;
                                // t++;
                                array3 = null;
                                status3 = false;
                                System.out.println(funct + " -");
                                break;
                            } else {
                                countarray = 4;
                                for (int u = 0; u < findt.length; u++) {
                                    elements += " " + findt[u];
                                }
                                System.out.println(funct + " +:" + elements);
                                elements = " elements ";
                                h = 0;
                                t--;
                                status3 = true;
                                array3 = b.newarray(findk, k);
                                break;
                            }
                        }
                        if (array4 != null && status4 == false) {

                            checkarrays = checkarray(array1, array4);
                            int checkarrays1 = checkarray(array2, array4);
                            int checkarrays2 = checkarray(array3, array4);
                            // System.out.println("checkarrays " + checkarrays);
                            if (checkarrays == 1 || checkarrays1 == 1 | checkarrays2 == 1) {
                                h = 0;
                                if (checkarrays == 1) {
                                    countarray = 1;
                                    status1 = false;
                                    array1 = null;
                                    System.out.println(funct + " -");
                                    //t++;
                                    break;
                                } else if (checkarrays1 == 1) {
                                    countarray = 2;
                                    array2 = null;
                                    status2 = false;
                                    System.out.println(funct + " -");
                                    // t++;
                                    System.out.println(funct + " -");
                                    break;
                                } else if (checkarrays2 == 1) {
                                    countarray = 3;
                                    status3 = false;
                                    array3 = null;
                                    //t++;
                                    System.out.println(funct + " -");
                                    break;
                                }

                            } else if (checkarrays == 2 || checkarrays1 == 2 || checkarrays2 == 2) {
                                h = 0;
                                countarray = 4;
                                //t++;
                                array4 = null;
                                status4 = false;
                                System.out.println(funct + " -");
                                break;
                            } else {

                                for (int u = 0; u < findt.length; u++) {
                                    elements += " " + findt[u];
                                }
                                System.out.println(funct + " +:" + elements);
                                elements = " elements ";
                                h = 0;
                                t--;
                                array4 = b.newarray(findk, k);

                                break;
                            }
                        }

                        //System.out.println( funct+" +" );
                    } else {
                        System.out.println(funct + " -");
                        h = 0;
                        break;
                    }
                }
            }

            k++;

        }

        int len = 2;
 
        if (array1 != null && array2 != null || array3 != null || array4 != null) {

            if (array3 != null) {
                len = 3;
            }
            if (array4 != null) {
                len = 4;
            }
            if (array5 != null) {
                len = 5;
            }
            //newarray=new int[len][];
            int lend = len;
           
           double  newarray[][] = new double [len][];
            for (int i = 0; i <newarray.length; i++) {
                {
                    //System.out.println("length " +Array.getLength(newarray));
                    if (lend == 4) {
                        //  System.out.println("length " +array4.length);
                        newarray[i] = new double[array4.length];
                        lend--;
                        
                        for  (int j=0;j<newarray[i].length;j++)
                        {
                            for (int e=0;e<s.length;e++)
                            {
                            if (array4[j]==s[e])
                        newarray[i][j]=e+1;
                            else if (j==array4.length-1)
                            {
                                newarray[i][j]=array4[j];
                                 break;
                            }
                            }
                        }
                    } else if (lend == 3) {
                        newarray[i] = new double[array3.length];
                        lend--;
                        for  (int j=0;j<newarray[i].length;j++)
                        {
                        //newarray[i][j]=array3[j];
                            for (int e=0;e<s.length;e++)
                            {
                            if (array3[j]==s[e])
                        newarray[i][j]=e+1;
                           else if (j==array3.length-1)
                            {
                                newarray[i][j]=array3[j];
                                 break;
                            }
                            }
                        }
                    } else if (lend == 2) {
                        newarray[i] = new double[array2.length];
                        lend--;
                        for  (int j=0;j<newarray[i].length;j++)
                        {
                       // newarray[i][j]=array2[j];
                            for (int e=0;e<s.length;e++)
                            {
                            if (array2[j]==s[e])
                        newarray[i][j]=e+1;
                           else if (j==array2.length-1)
                            {
                                newarray[i][j]=array2[j];
                                 break;
                            }
                            }
                        }
                    } else if (lend == 1) {
                        newarray[i] = new double[array1.length];
                        lend--;
                        for  (int j=0;j<newarray[i].length;j++)
                        {
                        //newarray[i][j]=array1[j];
                            for (int e=0;e<s.length;e++)
                            {
                            if (array1[j]==s[e])
                        newarray[i][j]=e+1;
                            else if (j==array1.length-1)
                            {
                                newarray[i][j]=array1[j];
                                 break;
                            }
                            }
                        }
              } 
//else if (lend == 0) {
//                        newarray[i] = new int[array1.length];
//                        lend--;
//                        for  (int j=0;j<newarray[i].length;j++)
//                        {
//                        newarray[i][j]=array1[j];
//                        }
//                    }
                    
                }
            }
//             for (int i=0;i<newarray.length;i++)
//        {
//        for (int j=0;j<newarray[i].length;j++)
//                System.out.print(newarray[i][j]+" ");
//            System.out.println("");
//        }
               printSystem(newarray);
       getTriangleFormMart(newarray);
        }
       
      
    }

}
