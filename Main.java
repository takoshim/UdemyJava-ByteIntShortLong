package com.company;

public class Main {

    public static void main(String[] args) {
    int myValue = 1_000;
    int myMinIntValue = Integer.MIN_VALUE;
    int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum value: " + myMinIntValue);
        System.out.println("Integer maximum value: " + myMaxIntValue);
        System.out.println("Busted max value: " + (myMaxIntValue + 1));
        System.out.println("Busted min value: " + (myMinIntValue - 1));
    int myMaxIntTest = 2_147_483_647;

    byte myMinByteValue = Byte.MIN_VALUE;
    byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte minimum value: " + myMinByteValue);
        System.out.println("Byte maximum value: " + myMaxByteValue);

    short myMinShortValue = Short.MIN_VALUE;
    short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short minimum value: " + myMinShortValue);
        System.out.println("Short maximum value: " + myMaxShortValue);

    long myMinLongValue = Long.MIN_VALUE;
    long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long minimum value: " + myMinLongValue);
        System.out.println("Long maximum value: " + myMaxLongValue);
    long myLongValue = 2_147_483_647_274L;
        System.out.println("myLongValue: " + myLongValue);

    int myNewIntValue = (myMinIntValue / 2);
    byte myNewByteValue = (byte) (myMinByteValue / 2);
    short myNewShortValue = (short) (myMinShortValue / 2);
    }
}
