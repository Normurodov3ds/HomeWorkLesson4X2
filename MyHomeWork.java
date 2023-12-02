package tortinchi_dars;

import java.util.Arrays;
import java.util.Scanner;

// for (int i = n-1-n%2; i >= 0; i-=2) {
//
//            System.out.print(myArray[i]+" ");
//        }
public class MyHomeWork {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //int k = in.nextInt();
        int[] myArray = myNewArray(n);

        myArray  = remove_same(myArray);

        for (int i = 0; i < myArray[myArray.length-1]; i++) {
            System.out.print(myArray[i]+" ");
        }
        /*myArray = remove_element(myArray, k);
        for (int i = 0; i < n - 1; i++) {
            System.out.print(myArray[i]+" ");
        }*/
        // System.out.println(Arrays.toString(change_Array(myArray)));
        // lastIndexMinFirst(myArray);
        // System.out.println(Arrays.toString(increaseArray(myArray,k)));
        // System.out.println(Arrays.toString(sortMyArray(myNewArray(n))));
        //coutEven(myArray,k);
        //eventIndexMin(myArray);
    }
    public static int[] myNewArray(int n) { // arrayga qiymat berib qaytarish
        Scanner in = new Scanner(System.in);
        int[] myArray = new int[n];

        for (int i = 0; i < n; i++) {
            myArray[i] = in.nextInt();
        }
        return myArray;
    }//3

    public static int[] sortMyArray(int[] myarray) { // arrayni sortlash
        for (int i = 0; i < myarray.length; i++) {
            for (int j = i; j < myarray.length; j++) {
                if (myarray[i] > myarray[j]) {
                    myarray[j] = myarray[i] + myarray[j];
                    myarray[i] = myarray[j] - myarray[i];
                    myarray[j] = myarray[j] - myarray[i];
                }
            }
        }
        return myarray;
    }//3

    public static int[] increaseArray(int[] myArray, int k) {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] += myArray[k];
        }
        return myArray;
    }//4

    public static void coutEven(int[] myarray, int k) {
        System.out.print("[ ");
        for (int i = 0; i < myarray.length; i += k) {
            System.out.print(myarray[i] + ", ");
        }
        System.out.print("]");
    }//5

    public static void eventIndexMin(int[] myArray) {
        int min = myArray[0];
        for (int i = 2; i < myArray.length; i += 2) {
            if (myArray[i] < min) {
                min = myArray[i];
            }
        }
        System.out.println(min);
    }//6

    public static void lastIndexMinFirst(int[] myarray) {
        boolean b = true;
        for (int i = 0; i < myarray.length; i++) {
            if (myarray[myarray.length - 1] > myarray[i]) {
                System.out.print(myarray[i]);
                b = false;
                break;
            }
        }
        if (b) System.out.println("oxirgi elementdan kichik son yo'q!");

    }//7

    public static int[] change_Array(int[] myArray) {
        int[] arrayB = new int[myArray.length];

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 5) {
                arrayB[i] = 2 * myArray[i];
            } else {
                arrayB[i] = myArray[i] / 2;
            }
        }
        return arrayB;

    }//8
    public static int[] remove_element(int[] array, int k) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != k) {
                array[index] = array[i];
                index++;
            }
        }
        return array;
    }//9

    public static int[] remove_same(int[] myArray){
        int n = myArray.length;
        for (int i = 0; i < n-1; i++) {
            int k = i+1;
            boolean b = false;
            for (int j = i+1; j < n; j++) {
                if (myArray[i]!=myArray[j]){
                    myArray[k] = myArray[j];
                    k++;
                    b = true;
                }
            }
            if (b) n = k;
        }
        myArray[myArray.length-1] = n;
        return myArray;
    } // 10
}
