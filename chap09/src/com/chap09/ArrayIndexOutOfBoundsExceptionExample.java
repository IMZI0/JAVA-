package com.chap09;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        try {
            int[] numbers= {1,2,3};
            int number = numbers[3];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException 발생 : "+e.getMessage());
        }

    }
}
