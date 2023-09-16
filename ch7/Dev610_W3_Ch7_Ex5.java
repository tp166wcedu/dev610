package ch7;

import java.util.HashMap;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W3_Ch7_Ex5 {

    public static void main(String[] args) {
        int[] array = {27, 15, 15, 11, 27};
        System.out.println(mode(array));
        int[] array02 = {27, 15, 15, 11, 27, 200, 1000, 200, 200};
        System.out.println(noLimitMode(array02));
    }

    public static int mode(int[] arr) {
        int[] tempArr = new int[101];
        for (int j : arr) {
            tempArr[j]++;
        }
        int mode = 0;
        for (int i = 1; i < tempArr.length; i++) {
            if (tempArr[i] > tempArr[mode]) {
                mode = i;
            }
        }
        return mode;
    }

    public static int noLimitMode(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int mode = arr[0];
        int maxFrequency = frequencyMap.get(arr[0]);
        for (int num : frequencyMap.keySet()) {
            if (frequencyMap.get(num) > maxFrequency ||
                    (frequencyMap.get(num) == maxFrequency && num < mode)) {
                maxFrequency = frequencyMap.get(num);
                mode = num;
            }
        }
        return mode;
    }
}

