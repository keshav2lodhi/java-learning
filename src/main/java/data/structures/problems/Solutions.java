package data.structures.problems;

import java.util.*;

public class Solutions {
    /*********Find the 2nd highest ele form Array*********/
    /*public static void main(String[] args) {
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
    }*/

    /****** Find the first repeated ele in Array ******/
    /*public static void main(String[] args) {
        int []arr = {1,7,1,3,5,6,4};
        boolean flag = false;
        int ele = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    flag = true;
                    ele = arr[j];
                    System.out.println(i +" and "+ j);
                    break;
                }
            }
            if(flag) break;
        }
        System.out.println(ele);
    }*/

    /****** Find the odd occurrence of an ele in Array*****/
    /*public static void main(String[] args) {
        int []arr = {20, 40, 60, 50, 20, 30, 30, 50, 20, 40, 40, 20};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int ele = arr[i];
            if(!map.containsKey(ele)){
                map.put(ele, 1);
            }else{
                map.put(ele, map.get(ele) + 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() % 2 == 1){
                System.out.println("Key:--> " + entry.getKey() + " and value:--> " + entry.getValue());
                //break;
            }
        }
    }*/

    /*******Find the Palindrome OR Reverse of the string********/
    /*public static void main(String[] args) {
        String str = "121";
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }*/

    /**************Find unique char***************/
    /*public static void main(String[] args) {
        String str = "abca";
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(!set.add(c)){
                System.out.println("Unique char: " + set);
            }
        }
    }*/

    /********Solution 1. Find the pair of ele whose sum is equal to k********/
    /*public static void main(String[] args) { // O(n^2) time complexity
        int []arr = {1,2,3,4};
        int k = 5;
        List<List<Integer>> res = fun(arr, k);
        System.out.println(res);
    }
    public static List<List<Integer>> fun(int arr[], int k){
        List<Integer> tempList = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == k){
                    tempList.add(arr[i]);
                    tempList.add(arr[j]);
                    list.add(tempList);
                    tempList = new ArrayList<>();
                }
            }
        }
        return list;
    }*/

    /********Solution 2. Find the pair of ele whose sum is equal to k********/
    /*public static void main(String[] args) { // O(n) time complexity
        int arr[] = {1, 4, 45, 6, 10, 8};
        int n = 16;
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            int temp = n - arr[i];
            if(set.contains(temp)){
                System.out.println("The pair is: " + temp + " and " + arr[i]);
                break;
            }
            set.add(arr[i]);
        }
    }*/

    /********Solution 3. Find the pair of ele whose sum is equal to k********/
    /*public static void main(String[] args) { // O(nlogn) time complexity
        int arr[] = {1, 4, 45, 6, 10, 8};
        int sum = 16;
        int l = 0;
        int r = arr.length - 1;

        Arrays.sort(arr);

        while(l < r){
            if(arr[l] + arr[r] == sum)
                break;
            else if(arr[l] + arr[r] < sum)
                l++;
            else
                r--;
        }
        System.out.println("The pair is: " + arr[l] + " and " + arr[r]);
    }*/

}
