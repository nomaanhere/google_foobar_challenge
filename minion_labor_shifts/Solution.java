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
                if(newList.contains(data[i])){
                    break;
                } else {
                    newList.add(data[i]);
                }
            }
        }
          Integer[] intList = new Integer[newList.size()];
    
    //Gotta convert Integer[] to int[], because Java.
    
    int[] javaSucksList = new int[newList.size()];
    
    for(int ughjavaIndex = 0; ughjavaIndex < newList.size(); ughjavaIndex++){
        javaSucksList[ughjavaIndex] = newList.get(ughjavaIndex);
    }
    
    return javaSucksList;
    } 
    
    public static void main (String[] args) throws java.lang.Exception
    {
        //int[] list = {1,2,2,3,3,3,4,5,5};
        //int[] list = {5,10,15,10,7};
        int[] list = {1,2,2,4,4,4,6,7};
        int n = 2;
        int[] newList = answer(list, n);


        for(int k = 0; k < newList.length; k++){
            System.out.print(newList[k] + " ");
        }
    }
}
