import java.util.*;
import java.lang.*;
import java.io.*;

class Answer {   
    public static int[] answer(int[] data, int n) { 
        if(n == 0){
            return new int[0];
        }
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for(int i = 0; i < data.length; i++){
            int count=0;
            for(int j=0;j<data.length;j++){
                if(data[i]==data[j]){
                    count++;
                }
            }
            if(count<=n){
                newList.add(data[i]);
            }
        }
    Integer[] intList = new Integer[newList.size()];
    int[] javaList = new int[newList.size()];
    
    for(int k = 0; k < newList.size(); k++){
        javaList[k] = newList.get(k);
    }
    
    return javaList;
    } 
    
    public static void main (String[] args) throws java.lang.Exception
    {
        //int[] list = {1,2,3};
        //int[] list = {5,10,15,10,7};
        int[] list = {1,3,4,4,4,5,5,6};
        int n = 2;
        int[] newList = answer(list, n);


        for(int k = 0; k < newList.length; k++){
            System.out.print(newList[k] + " ");
        }
    }
}
