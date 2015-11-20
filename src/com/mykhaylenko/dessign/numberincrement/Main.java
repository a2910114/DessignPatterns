package com.mykhaylenko.dessign.numberincrement;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by pavlo.mykhaylenko on 11/3/2015.
 */
public class Main {
    public static void main(String[] args) {
        String potsNumber = "17.899.9999";
        String low = "16.898.9990";
        String high = "17.202.0003";
//        String low = "17.899.9998";
//        String high = "11.200.0003";
//        List<String> list = incrementNumberRange(low, high);
//        list.stream().forEach(s -> System.out.println(s));

//        String[] strings = stringToArray(low);
//        for (String s: strings) {
//            System.out.println(s);
//        }

        BigInteger bigInteger1 = new BigInteger("22");
        BigInteger bigInteger2 = new BigInteger("55");
        System.out.println(bigInteger1.compareTo(bigInteger2) < 0);

        for(int i = 0; i < 5; i++) {
            bigInteger1 = bigInteger1.add(BigInteger.ONE);
            bigInteger2 = bigInteger2.add(BigInteger.ONE);
            System.out.println(String.valueOf(bigInteger1));
            System.out.println(String.valueOf(bigInteger2));
            System.out.println(bigInteger1.compareTo(bigInteger2) < 0);
        }
    }

    //TODO: required
    public static List<PartRule> createPartsRuleFromNumber(String numberType) {
        List<PartRule> parts = new ArrayList<>();
        parts.add(new PartRule("11", "17", false));
        parts.add(new PartRule(".", ".", true));
        parts.add(new PartRule("200", "899", false));
        parts.add(new PartRule(".", ".", true));
        parts.add(new PartRule("0000", "9999", false));

        return parts;
    }

    public static List<PartValue> createPartsValueFromNumber(String number) {
        List<PartValue> parts = new ArrayList<>();
        parts.add(new PartValue("17"));
        parts.add(new PartValue("."));
        parts.add(new PartValue("899"));
        parts.add(new PartValue("."));
        parts.add(new PartValue("9999"));

        return parts;
    }

    //TODO: required
    public static List<PartValue> createPartsValueFromCurrentNumber(String number) {
        List<PartValue> parts = new ArrayList<>();

        String[] split = number.split("\\.");
        for (String part: split) {
            parts.add(new PartValue(part));
            parts.add(new PartValue("."));
        }

        parts.remove(parts.size() - 1);
        return parts;
    }

    public static String[] stringToArray(String number) {
        StringTokenizer tokenizer = new StringTokenizer(number, ".", true);
        String[] currentParts = new String[tokenizer.countTokens()];
        int i = 0;
        while (tokenizer.hasMoreElements()) {
            currentParts[i] = (String) tokenizer.nextElement();
            i++;
        }
        return currentParts;
    }

    public static List<PartValue> createPartsValueFromHighNumber(String number) {
        List<PartValue> parts = new ArrayList<>();
        parts.add(new PartValue("17"));
        parts.add(new PartValue("."));
        parts.add(new PartValue("899"));
        parts.add(new PartValue("."));
        parts.add(new PartValue("9999"));

        return parts;
    }

    public static List<String> incrementNumberRange(String lowNumber, String highNumber) {
        List<String> result = new ArrayList<>();


        result.add(lowNumber);
        if (lowNumber.equals(highNumber)) {
            return result;
        }
        do {
            StringBuffer num = incrementSingleNumber(lowNumber, highNumber,  result.get(result.size() - 1));

            result.add(num.toString());
            num.delete(0, num.length() - 1);

        } while (!result.get(result.size() - 1).equals(highNumber));

        return result;
    }

    private static StringBuffer incrementSingleNumber(String lowNumber, String highNumber, String currectNumber) {
        boolean isNeedToIncrement = true;
        StringBuffer num = new StringBuffer();
        List<PartRule> rule = createPartsRuleFromNumber(lowNumber);
        List<PartValue> lowNumberParts = createPartsValueFromCurrentNumber(currectNumber);
        List<PartValue> highNumberParts = createPartsValueFromHighNumber(highNumber);
        String[] number = new String[rule.size()];
        for (int i = lowNumberParts.size() - 1; i >= 0; i--) {
            if (isNeedToIncrement) {
                if (!rule.get(i).isDelimiter()) {
                    int currentValue = Integer.parseInt(lowNumberParts.get(i).getValue());
                    int currentPartRuleMax = Integer.parseInt(rule.get(i).getHigh());
                    int highNumberValue = Integer.parseInt(highNumberParts.get(i).getValue());

                    if (currentValue < currentPartRuleMax && currentValue < highNumberValue ) {
                        currentValue ++;
                        StringBuffer part = new StringBuffer(String.valueOf(currentValue));
                        if (part.length() < rule.get(i).getLow().length()) {
                            while ((part.length() < rule.get(i).getLow().length())) {
                                part.insert(0, "0");
                            }
                        }
                        number[i] = (part.toString());
                        isNeedToIncrement = false;
                    } else {
                        number[i] = (rule.get(i).getLow());
                        isNeedToIncrement = true;
                    }
                } else {
                    number[i] = (rule.get(i).getLow());
                    isNeedToIncrement = true;
                }
            } else {
                number[i] = (lowNumberParts.get(i).getValue());
            }

        }

        for (String s: number) {
            num.append(s);
        }
//        System.out.println(num.toString());
        return num;
    }
}
