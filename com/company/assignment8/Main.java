package com.company.assignment8;

public class Main {
    public static void main(String args[]){
        try{
            ExceptionExercise excercise=new ExceptionExercise();
            excercise.checkException();
        }
        catch(ArithmeticException| ArrayIndexOutOfBoundsException | NullPointerException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally got executed");
        }
    }
    static void rethrow(String s) throws ArithmeticException, ArrayIndexOutOfBoundsException,
            NullPointerException {
        try {
            if (s.equals("Arithmetic"))
                throw new ArithmeticException("Arithmetic ");
            else if (s.equals("ArrayIndexOutOfBounds"))
                throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBounds");
            else
                throw new NullPointerException("NullPointer");
        } catch (Exception e) {
            throw e;
        }
    }
}
