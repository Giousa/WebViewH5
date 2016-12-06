package com.ut.webviewh5;

/**
 * Created by djf on 2016/11/23.
 */
public class TransformUtils {
    public static String ArrayToString(int[] array) {
        if (array != null) {
            int arrayLength = array.length;
            if (arrayLength > 0) {
                StringBuilder string = new StringBuilder();
                for (int i = 0; i < array.length; i++) {
                    if (i == 0) {
                        string.append("[");
                        string.append(array[i]);
                        string.append(",");
                    } else if (i == arrayLength - 1) {
                        string.append(array[i]);
                        string.append("]");
                    } else {
                        string.append(array[i]);
                        string.append(",");
                    }
                }
                return string.toString();
            } else {
                return "";
            }

        } else {
            return "";
        }

    }
}
