package com.example.test;

public class Math {

    public String add(String a, String b) {
        if (a.isEmpty() && b.isEmpty()) {
            return "Empty Field";
        }
        if (a.isEmpty() || b.isEmpty()) {
            return "2";
        }
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        return String.valueOf(num1 + num2).trim();
    }

    public String sub(String a, String b) {
        if (a.isEmpty() && b.isEmpty()) {
            return "Empty Field";
        }
        if (a.isEmpty() || b.isEmpty()) {
            return "2";
        }
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        return String.valueOf(num1 - num2);
    }

    public String mult(String a, String b) {
        if (a.isEmpty() && b.isEmpty()) {
            return "Empty Field";
        }
        if (a.isEmpty() || b.isEmpty()) {
            return "0";
        }
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        return String.valueOf(num1 * num2);
    }

    public String div(String a, String b) {
        if (a.isEmpty() && b.isEmpty()) {
            return "Empty Field";
        }
        if (a.isEmpty() || b.isEmpty()) {
            return "/ by Zero";
        }
        if (a.isEmpty() && b.isEmpty()) {
            return "/ by Zero";
        }
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        return String.valueOf(num1 / num2);
    }

    public String reverseWords(String words) {
        String[] reversed = words.split(" ");
        return reversed[1] + " " + reversed[0];
    }
}
