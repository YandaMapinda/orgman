package ac.za.cput.adp3.xyzcongolmerate.util;

import java.util.UUID;

public class Helper {

    public static String generateRandomGivenSuffix(String suffix) {
        return suffix + "-" + UUID.randomUUID().toString();
    }

    public static String getClassName(Class<?>  aClass) {
        return aClass.getSimpleName();
    }

    public static String getSuffixFromClassName(Class<?> aClass) {
        String className = getClassName(aClass);
        String value = "";
       char[]ar = className.toCharArray();
        for(int i=0;i<ar.length;i++) {
            if(Character.isUpperCase(ar[i])){
                value += ar[i];
            }
        }
        return generateRandomGivenSuffix(value);

        }

    }



