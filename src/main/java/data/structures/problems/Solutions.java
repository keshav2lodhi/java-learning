package data.structures.problems;

public class Solutions {
    /*********Find the 2nd highest ele form Array*********/
    public static void main(String[] args) {
        int []arr = {7,5,6,1,4,2};
        int res = findSecondHighest(arr);
        System.out.println(res);
    }

    public static int findSecondHighest(int []arr){
        int highest = 0;
        int secondHighest = 0;
        for(int i = 0; i < arr.length; i++) {

            if(arr[i] > highest){
                secondHighest = highest;
                highest = arr[i];
            }else if(arr[i] > secondHighest){
                secondHighest = arr[i];
            }
        }
        return secondHighest;
    }
}
