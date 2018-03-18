package com.princylabs;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;

public class Chapter1 {
    public boolean hasUniqueChar(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        char previousChar = charArray[0];
        for (int i = 1;i <charArray.length;i++) {
            if(charArray[i] == previousChar){
                return false;
            }
            previousChar = charArray[i];
        }
        return true;
    }

    public boolean permutation(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        for (int i = 0;i < charArray1.length;i++){
            if(charArray1[i] != charArray2[i]) {
                return false;
            }
        }
        return true;
    }


    //TODO: solution not understood yet...
    public String urlify(char[] str, int length) throws NotImplementedException {

        // Solution from the book:
//        int spaceCount = 0, index, i = 0;
//        for (i = 0; i < length; i++) {
//            if (str[i] == ' ') {
//                spaceCount++;
//            }
//        }
//        index = length + spaceCount * 2;
//        str[index] = '\0';
//        for (i = length - 1; i >= 0; i--) {
//            if (str[i] == ' ') {
//                str[index - 1] = '0';
//                str[index - 2] = '2';
//                str[index - 3] = '%';
//                index = index - 3;
//            } else {
//                str[index - 1] = str[i];
//                index--;
//            }
//        }
//
//        return String.valueOf(str);

        throw new NotImplementedException();
    }
}
