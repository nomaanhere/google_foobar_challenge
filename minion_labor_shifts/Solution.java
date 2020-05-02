import java.util.*;
import java.lang.*;
import java.io.*;

class Answer {
public static int[] answer(int[] data, int n) { 
    ArrayList<Integer> list = new ArrayList<Integer>();
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<data.length;i++){
        if(map.containsKey(data[i])){
            map.put(data[i],map.get(data[i])+1);
        } else {
            map.put(data[i],1);
        }
    }
    for(int i=0;i<data.length;i++){
        if(map.get(data[i]) <= n){
            list.add(data[i]);
        }
    }
    Integer[] intList = new Integer[list.size()];
    int[] javaList = new int[list.size()];
    for(int k = 0; k < list.size(); k++){
        javaList[k] = list.get(k);
    }
    return javaList;
    } 

public static void main (String[] args) throws java.lang.Exception
{
    // your code goes here
    //int[] list = {1,2,2,3,3,3,4,5,5};
    //int[] list = {5,10,15,10,7};
    int[] list = {1,2,3};
    int n = 6;
    int[] newList = answer(list, n);


    System.out.println("New List\n");
    System.out.println("Size::" + newList.length);
    for(int k = 0; k < newList.length; k++){
        System.out.print(newList[k]);
    }
  }
}
