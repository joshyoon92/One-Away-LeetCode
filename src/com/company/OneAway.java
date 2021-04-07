package com.company;

public class OneAway extends Main{
    public static boolean oneAway(String first, String second){
        if (first.length() == second.length()){
            return oneEditReplace(first, second);
        } else if (first.length() +1 == second.length()){
            return oneEditInsrt(first,second);
        } else if (second.length()+1 == first.length()){
            return oneEditInsrt(second,first);
        }
        return false;
    }
    public static boolean oneEditReplace(String s, String t){
        int count =0;
        for (int i=0; i<s.length();i++){
            if (s.charAt(i) != t.charAt(i)){
                if (count>1){
                    return false;
                }
                count++;
            }
        }
        return true;
    }
    public static boolean oneEditInsrt(String s, String t){
        int idx1 = 0;
        int idx2 = 0;
        while (idx1<s.length() && idx2<t.length()){
            if (s.charAt(idx1) != t.charAt(idx2)){
                if (idx1 != idx2){
                    return false;
                }
                idx2++;
            }
            else {
                idx1++;
                idx2++;
            }
        }
        return true;
    }
}
