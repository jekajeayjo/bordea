/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3;

/**
 *
 * @author User
 */
public class GaussSystem {

    private static double getRightFactor(double frstRow, double scndRow) {
        return frstRow / scndRow;
    }

    private static double[] getMultArrOnNum(double[] arr, double number) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= number;
        }
        return arr;
    }

    private static double[] getSubstractrTwoArrays(double[] frstArr, double[] scndArr, double eps) {
        double subst;
        for (int i = 0; i < frstArr.length; i++) {
            subst = scndArr[i] - frstArr[i];
            if (Math.abs(subst) < eps) {
                frstArr[i] = 0;
            } else {
                frstArr[i] = subst;
            }
        }
        return frstArr;
    }

    static void printSystem(double[][] squareFormMatrix) {
        System.out.println("Система линейных уравнений:");
        for (double[] row : squareFormMatrix) {
            int index = 1;
            int index1 = 1;
            for (double elem : row) {
                if (index < row.length) {
                    if (elem > 0) {
                        if (index1 > 1) {
                            if (elem == 1) {
                                System.out.printf("+X%d", 1);
                            } else if (elem == 2) {
                                System.out.printf("+X%d", 2, index++);
                            } else if (elem == 3) {
                                System.out.printf("+X%d", 3, index++);
                            } else if (elem == 4) {
                                System.out.printf("+X%d", 4, index++);
                            }
                        } else if (index1 == 1) {
                            if (elem == 1) {
                                System.out.printf("X%d", 1,index++);
                            } else if (elem == 2) {
                                System.out.printf("X%d", 2, index++);
                            } else if (elem == 3) {
                                System.out.printf("X%d", 3, index++);
                            } else if (elem == 4) {
                                System.out.printf("X%d", 4, index++);
                            }
                            index1++;
                        }

                    }
                    // else System.out.printf(" %.2f*X%d", elem, index++);

                } else {
                    System.out.printf(" = %.2f", elem);
                    index1 = 1;
                }

            }
            System.out.println();
        }
        System.out.println("_____________________");
    }

    static double[][] getTriangleFormMart(double[][] squareFormMatrix) {
        double[][] triangleFormMatr = squareFormMatrix.clone();
        double[] tmpRow;
        double factor;
        for (int i = 0; i < triangleFormMatr.length; i++) {
            tmpRow = triangleFormMatr[i];
            for (int j = i + 1; j < triangleFormMatr.length; j++) {
                factor = getRightFactor(tmpRow[i], triangleFormMatr[j][i]);
                triangleFormMatr[j] = getMultArrOnNum(triangleFormMatr[j], factor);
                triangleFormMatr[j] = getSubstractrTwoArrays(triangleFormMatr[j], tmpRow, 1.e-6);
            }
        }
        return triangleFormMatr;
    }

    static void printRoots(double[][] trianglMatrix) {
        double[] root = new double[trianglMatrix.length];
        for (int i = trianglMatrix.length - 1; i >= 0; i--) {
            root[i] = getRootFromTriangleMatrixRow(trianglMatrix[i], root, i);
            System.out.printf("'X%d' = %.3f%n", (i + 1), root[i]);
        }
    }

    private static double getRootFromTriangleMatrixRow(double[] trianglMatrixRow, double[] roots, int numRoot) {
        double summ = 0;
        for (int i = 0; i < roots.length; i++) {
            if (i != numRoot) {
                summ += trianglMatrixRow[i] * roots[i];
            }
        }
        return (trianglMatrixRow[trianglMatrixRow.length - 1] - summ) / trianglMatrixRow[numRoot];
    }

}
