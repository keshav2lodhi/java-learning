package datastructures.problems;

import java.util.*;
import java.util.regex.Pattern;

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

    /***********Closest pair whose sum is equal to x************/
    /*public static void main(String[] args) {
        int arr[] = {10, 22, 28, 29, 30, 40};
        int sum = 54;
        int res_l = 0;
        int res_r = 0;
        int l = 0;
        int r = arr.length - 1;
        int diff = Integer.MAX_VALUE;

        while(l < r){
            if(Math.abs(arr[l] + arr[r] - sum) < diff){
                System.out.println("from if " + diff);
                res_l = l;
                res_r = r;
                diff = Math.abs(arr[l] + arr[r] - sum);
                System.out.println("from end: " + diff);
            } else if(arr[l] + arr[r] <= sum){
                System.out.println(arr[l] +", "+ arr[r]);
                l++;
            }
            else
                r--;
        }
        System.out.println("The closest pair is: " + arr[res_l] + " and " + arr[res_r]);
    }*/

    /**************All permutation of str****************/
    /*public static void main(String[] args) {
        String str = "abc";
        permutation("",str);
    }
    public static void permutation(String prefix, String str){
        int length = str.length();
        if(length == 0) System.out.println(prefix +"\n");
        else {
            for (int i = 0; i < length; i++){
                String rest = str.substring(0, i) + str.substring(i + 1);
                System.out.println(prefix + str.charAt(i) +" and "+ rest +" value of i: "+i);
                permutation(prefix + str.charAt(i), rest);
            }
        }
    }*/

    /*********Print the no whose occurrence is greater than the half size of an array********/
    /*public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,2,2,2,2,3,4,4,4,6);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < list.size(); i++){
            if(!map.containsKey(list.get(i))){
                map.put(list.get(i), 1);
            } else{
                map.put(list.get(i),map.get(list.get(i))+1);
            }
        }
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            System.out.println("Key: " + m.getKey() +"and value " + m.getValue());
            if(m.getValue() > list.size()/2){
                System.out.println(m.getKey());
                break;
            }else{
                System.out.println(-1);
                break;
            }
        }
    }*/

    /******Find the max no of square roots of number b/w given range******/
    /*public static void main(String[] args) {
        Solutions s = new Solutions();
        int res = s.solution(6000, 7000);
        System.out.println(res);
    }
    public static Boolean validSquare(int i){
        Double d = Math.sqrt(i);
        if(d.intValue() == d){
            return   true;
        }
        else
            return false;
    }
    public static int rec(int i, int j){

        Double d = Math.sqrt(i);
        if(d.intValue() == d){
            j = j+1;
            return rec(d.intValue(), j);
        }
        else
            return j;

    }
    public static int solution(int A, int B){
        int first = 0;
        int last = 0;
        int max = 0;

        for(int i = A; i<= B; i++){
            if(validSquare(i)){
                first = (int) Math.sqrt(i);
                break;
            }
        }
        for(int i = B; i >= A; i--){
            if(validSquare(i)){
                last = (int) Math.sqrt(i);
                break;
            }
        }
        for(int i = first ; i <= last; i++){
            int sol =  rec(i, 1);
            if(sol > max){
                max = sol;
            }
        }
        return max;
    }*/

    /****** String example with literals and new keyword *****/
    /*public static void main(String[] args) {
        String a = "string";
        String b = new String("string");
        //String b = new String("string").intern();
        String c = a;
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b.equals(c));
    }*/

    /*************Print all substrings*********/
    /*public static void main(String[] args) {
        String str = "abbc";
        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1; j <= str.length(); j++){
                System.out.println(str.substring(i, j));
            }
        }
    }*/

    /********Find length w/o using length method*******/
    /*public static void main(String[] args) {
        String str = "abc";
        int len = 0;
        char[] arr = str.toCharArray();
        for(char c : arr){
            len++;
        }
        System.out.println(len);
    }*/

    /*****Find the duplicate char in string OR find the occurrence each char*****/
    /*public static void main(String[] args) {
        String str = "java";
        char[] chararr = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for(char ch : chararr){
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }else{
                map.put(ch, map.get(ch) + 1);
            }
        }
        for(Map.Entry<Character, Integer> e : map.entrySet()){
            if(e.getValue() > 1) {
                System.out.println("Key:-->" + e.getKey() + " and value:--> " + e.getValue());
            }
        }
    }*/

    /************Find String anagrams***********/
    /*public static void main(String[] args) {
        String str1 = "Keep";
        String str2 = "Peek";
        boolean flag = true;

        if(str1.length() != str2.length()){
            flag = false;
        }else {
            char[] arr1 = str1.toLowerCase().toCharArray();
            char[] arr2 = str2.toLowerCase().toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);
            flag = Arrays.equals(arr1,arr2);
        }

        if(flag){
            System.out.println("String is anagram");
        }else {
            System.out.println("String is not anagram");
        }
    }*/

    /*************Count the no of Vowels and consonants************/
    /*public static void main(String[] args) {
        String str = "Programming";
        int vowel = 0;
        int consonants = 0;
        char[] charArr = str.toCharArray();
        for (char c : charArr) {
            if (Pattern.matches("[aeiou]", Character.toString(c)))
                vowel++;
            else {
                consonants++;
            }
        }
        System.out.println("No of vowels:--> " + vowel+"\nAnd no of consonants:--> "+consonants);
    }*/

    /**********Remove a specific char from the string***********/
    /*public static void main(String[] args) {
        String str = "abc";
        char[] arr = str.toCharArray();
        char ch = 'c';
        StringBuilder sb = new StringBuilder();

        for(char c : arr){
            if(c != ch){
               sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }*/

    /**********Count the frequency of words***********/
    /*public static void main(String[] args) {
        String str = "This this is is done by Saket Saket";
        String []arr = str.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            } else{
                map.put(arr[i], map.get(arr[i])+1);
            }
        }
        System.out.println(map);
    }*/

    /**************Remove white spaces from the string*************/
    /*public static void main(String[] args) {
        String str = "Saket Saurav        is a QualityAna    list";
        System.out.println(str.replaceAll("\\s", ""));
        //System.out.println(str.replaceAll(" ", ""));
    }*/

    /**********Check equality of two Array**********/
    /*public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        boolean flag = true;

        //System.out.println(Arrays.equals(arr1, arr2));

        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    flag = false;
                }
            }
        } else{
            flag = false;
        }
        if(flag){
            System.out.println("Both are equal");
        } else{
            System.out.println("Both are not equal");
        }
    }*/

    /**********************Sort binary no in Array*******************/
    /*public static void main(String[] args) {
        int []arr = {0,0,1,0,1,1,0};
        //Arrays.sort(arr);
        //Arrays.stream(arr).forEach(System.out :: println);
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                count ++;
            }
        }
        System.out.println("count: " + count);
        for(int j = 0; j < arr.length; j++){
            if(j < count)
                arr[j] = 0;
            else
                arr[j] = 1;
        }
        Arrays.stream(arr).forEach(System.out :: print);
    }*/

    /**********************Sort binary no in Array*******************/
    /*public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0 };
        int j = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 1){
                j++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        Arrays.stream(arr).forEach(System.out :: print);
    }*/

    /***************Find armstrong number*****************/
    /*public static void main(String[] args) {
        int c=0,a,temp;
        int n=153;//This is the number to check armstrong
        temp=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        if(temp==c)
            System.out.println("armstrong number:--> " + temp);
        else
            System.out.println("Not armstrong number");
    }*/

    /****************Merge two sorted array into one sorted array************/
    /*public static void main(String[] args) {
        int arr[] = {5,8,9};
        int arr2[] = {2,4,7};
        int finalArr[] = new int[arr.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < arr.length && j < arr2.length){
            if(arr[i] < arr2[j]){
                finalArr[k++] = arr[i++];
                System.out.println("From if");
            } else{
                finalArr[k++] = arr2[j++];
                System.out.println("From else");
            }
        }

        while(i < arr.length)
            finalArr[k++] = arr[i++];

        while(j < arr.length)
            finalArr[k++] = arr2[j++];

        System.out.println(Arrays.toString(finalArr));
    }*/

    /*********Find duplicate string********/
    /*public static void main(String[] args) {
        String str = "I am am learning java java";
        Map<String, Integer> map = new HashMap<>();
        String []arr = str.split(" ");

        for(int i = 0; i < arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            } else{
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        for(Map.Entry<String,Integer> m: map.entrySet()){
            if(m.getValue() > 1){
                System.out.println("Key:--> " + m.getKey() +" and value:--> "+ m.getValue());
            }
        }
    }*/

    /*******Merging ele from 2 arrays alternatively into 3rd array*****/
    /*public static void main(String[] args) {
        int arr1[] = {10, 15, 25};
        int arr2[] = {1, 5, 20, 30};
        int arr3[] = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < arr1.length && j < arr2.length){
            arr3[k++] = arr1[i++];
            arr3[k++] = arr2[j++];
        }
        while(i < arr1.length){
            arr3[k++] = arr1[i++];
        }
        while(j < arr2.length){
            arr3[k++] = arr2[j++];
        }
        System.out.println(Arrays.toString(arr3));
    }*/

    /**********Find if one string is rotation of the other string*********/
    /*public static boolean findRotation(String s1, String s2) {
        return (s1.length() == s2.length()) && ((s1 + s1).contains(s2));
    }
    public static void main(String args[]){
        String s1 = "ABCD";
        String s2 = "AACD";
        boolean res = findRotation(s1, s2);
        System.out.println("Response: " + res);
    }*/

    /*******convert ArrayList and Set of String to Array of String*******/
    /*public static void main(String[] args) {
        List<String> collection = new ArrayList<>();
        //Set<String> collection = new HashSet<>();
        collection.add("Keshav");
        collection.add("Lodhi");

        System.out.println(collection);

        Object [] obj = collection.stream()
                .toArray(String[] :: new);
        System.out.println(Arrays.toString(obj));
    }*/

    /******************Left rotation of array****************/
    /*public static void main(String[] args){
        int arr[] = {6,2,3,4,5};
        int d = 2;
        int n = arr.length;

        for(int i = 0; i < d; i++) {
            int first = arr[0];
            int j;
            for(j = 0; j < n - 1; j++){
                arr[j] = arr[j + 1]; // Shift by one
            }
            arr[j] = first;
        }
        System.out.println(Arrays.toString(arr));
    }*/

    /******************Right rotation of array****************/
    /*public static void main(String[] args){

        int arr[] = {1,2,3,4,5};
        int d = 2;
        int n = arr.length;

        for(int i = 0; i < d; i++){
            int last = arr[n - 1];
            for(int j = n - 1 ; j > 0; j--){
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
            System.out.println("Array after each iteration: " + Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }*/

    /*public static boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday || vacation)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(sleepIn(false, false));
        System.out.println(sleepIn(true, false));
        System.out.println(sleepIn(false, true));
    }*/

}
