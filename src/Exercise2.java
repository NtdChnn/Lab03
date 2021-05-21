
import java.util.Scanner;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author notda
 */
public class Exercise2 {
    public static void main(String[] args) {
        System.out.print("Enter list1: ");
        Scanner input1 = new Scanner(System.in);
        String s1[]= input1.nextLine().split(" ");
        
        System.out.print("Enter list2: ");
        Scanner input2 = new Scanner(System.in);
        String s2[]= input2.nextLine().split(" ");
        
        int[] list1 = new int[s1.length];
        int[] list2 = new int[s2.length];
        
    for(int i =0 ;i < s1.length;i++){
        list1[i]= Integer.parseInt(s1[i]);
        }
    for(int i =0 ;i < s2.length;i++){
        list2[i]= Integer.parseInt(s2[i]);
        }
    
        int[] mergeList = new int[list1.length+list2.length];
        mergeList = merge(list1,list2);
        Arrays.sort(mergeList);
        
        System.out.print("The merge list is ");
        for(int i =0 ;i < mergeList.length;i++){
            System.out.print(mergeList[i] + " ");
        }
    }
    
    public static int[] merge(int[] list1, int[] list2)
    {
        int i = 0 ;
        int[] mergeList = new int[list1.length+list2.length];
        for(;i < list1.length;i++){
        mergeList[i]= list1[i];
        }
        for(int j = 0;j < list2.length;j++){
        mergeList[i]= list2[j];
            i++;
        }
        return mergeList;
    }
}
