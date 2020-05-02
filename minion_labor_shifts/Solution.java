public class Solution {
    public static int[] solution(int[] data, int n) {
     if(n == 0){
            return new int[0];
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < data.length; i++){
            int count=0;
            for(int j=0;j<data.length;j++){
                if(data[i]==data[j]){
                count++;
                }
            }
            if(count<=n){
                set.add(data[i]);
            }
        }
        Integer[] intList = new Integer[set.size()];
        int[] javaSucksList = new int[set.size()];
        set.toArray(intList);
        for(int k=0; k<intList.length;k++){
            javaSucksList[k] = intList[k];
        }
        
        return javaSucksList;
    }
}
