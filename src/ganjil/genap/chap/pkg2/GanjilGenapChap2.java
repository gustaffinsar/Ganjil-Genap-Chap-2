/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ganjil.genap.chap.pkg2;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class GanjilGenapChap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah N : ");
        int N = input.nextInt();
        
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            System.out.print("Masukkan nilai arrray [" + i + "]: ");
            arr[i] = input.nextInt();
        }
         for (int i = 0; i < N; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print("[" + i + "] genap , ");
            } else {
                System.out.print("[" + i + "] ganjil , ");
            }
        }
    }
    
}
