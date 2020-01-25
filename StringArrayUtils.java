 

/**
 * Created by Yang on 1/23/20.
 */
import java.util.*;

public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        int arrayLength = array.length;
        return array[arrayLength - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        int arrayLength = array.length;
        return array[arrayLength - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean result = false;
        
        for (String str : array) {
            if (str.equals(value)) {
                result = true;
            }
        }
        return result;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reversedArray = new String[array.length];
        int j = 0;
        
        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[j] = array[i];
            j++;
        }
        return reversedArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reversedArray = reverse(array);
        
        if (Arrays.equals(array, reversedArray)) {
            return true;
        }
        
        else {
            return false;
        }
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        HashMap<Character, Integer> pangramMap = new HashMap<Character, Integer>(26);
        
        for (int i = 0; i < array.length; i++) {
            String s = array[i].replaceAll("\\s+","").toLowerCase();
            for (int j = 0; j < s.length(); j++) {
               char ch = s.charAt(j);
               if (pangramMap.containsKey(ch)) {
                   continue;
               }
               else {
                   pangramMap.put(ch, 1);
               }
            }
        }
        
        if (pangramMap.size() == 26) {
            return true;
        }

        else {
            return false;
        }
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int occurences = 0;
        
        for (String s : array) {
            if (s.equals(value)) {
                occurences += 1;
            }
        }
        return occurences;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> newArray = new ArrayList<String>();
        
        for (int i = 0; i < array.length; i++) {
            String s = array[i];
            if (s.equals(valueToRemove)) {
                continue;
            }
            
            else {
                newArray.add(s);
            }
        }
        
        String[] resultingArray = new String[newArray.size()];
        int j = 0;
        
        for (String s : newArray) {
            resultingArray[j] = s;
            j++;
        }
        return resultingArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> newArray = new ArrayList<String>();
        
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                String str = array[i];
                String consecutiveStr = array[i+1];
                if (str.equals(consecutiveStr)) {
                    continue;
                }
            
                else {
                    newArray.add(s);
                }
            }
        }
        
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }
    
    public static void main(String[] args) {
        
        StringArrayUtils strArrUtilsObject = new StringArrayUtils();
        
        String[] strArr = {"OOP", "OOP", "Principles", "-", "Abstraction", "Inheritance", "Polymorhism"};
        String[] palindromeArr = {"OOP", "Principles", "OOP"};
        String[] pangramicArr = {"The quick", "Fox jumps over", "The lazy dog"};
        
        System.out.println("First element of the array: " + strArrUtilsObject.getFirstElement(strArr));
        System.out.println("Second element of the array: " + strArrUtilsObject.getSecondElement(strArr));
        System.out.println("Last element of the array: " + strArrUtilsObject.getLastElement(strArr));
        System.out.println("Second to Last element of the array: " + strArrUtilsObject.getSecondToLastElement(strArr));
        System.out.println("String contains the element: " + strArrUtilsObject.contains(strArr, "Ruby"));
        System.out.println("Reversed string array: " + Arrays.toString(strArrUtilsObject.reverse(strArr)));
        System.out.println("isPalindrome: " + strArrUtilsObject.isPalindromic(palindromeArr));
        System.out.println("isPaangramic: " + strArrUtilsObject.isPangramic(pangramicArr));
        System.out.println("Number of occurences: " + strArrUtilsObject.getNumberOfOccurrences(strArr, "OOP"));
        System.out.println("Remove value from string array: " + Arrays.toString(strArrUtilsObject.removeValue(strArr, "OOP")));
        System.out.println("Remove Consecutive Values: " + Arrays.toString(strArrUtilsObject.removeConsecutiveDuplicates(strArr)));
    
    }


}
