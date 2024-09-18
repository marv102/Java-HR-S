import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        String[] substrings = new String[s.length()-k+1];

        for(int i=0; i<=s.length()-k;i++){
            substrings[i] = s.substring(i, i+k);
        }

        for(int i=0; i<substrings.length; i++){
            for(int j=0; j<substrings.length-1-i;j++){
                if(substrings[j].compareTo(substrings[j+1])>0){

                    String temp = substrings[j];
                    substrings[j] = substrings[j+1];
                    substrings[j+1] = temp;
                }

            }
        }

        return substrings[0] + "\n" + substrings[substrings.length-1];
    }


    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs", 30));
    }
}