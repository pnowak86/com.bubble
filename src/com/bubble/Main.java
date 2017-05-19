package com.bubble;

public class Main {

    public static void main(String[] args) {

        int[] a = { 7, 2, 9, 1};
        boolean wasSwap = true;

        while(wasSwap){
            wasSwap = false;
            for (int j = 0; j < a.length -1 ; j++) {

                if(a[j] >a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    wasSwap=true;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("i = " + i + ", a[i] = " +a[i] );
        }



    }
}
