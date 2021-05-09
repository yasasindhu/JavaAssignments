package com.company.assignment6;

public class Vampire {
    public static void main(String[] args){
        int totalVampireCount=0;
        for(int i=1;i<Integer.MAX_VALUE;i++){
           int digitCount=noOfDigits(i);
            if(digitCount%2==0){
                int factorDigit=(digitCount/2)-1;
                int start= (int) (1*Math.pow(10,factorDigit));
                int end=calculateEnd(9,factorDigit);
                for(int j=start;j<=end;j++){
                    if(i%j==0){
                        if(check(j,i/j,i) && findTrailingZeros(j)!=0 && findTrailingZeros(i/j)!=0) {
                            System.out.println(i);
                            totalVampireCount++;
                        }
                    }
                    if(totalVampireCount==100)
                        break;
                }
            }
            if(totalVampireCount==100)
                break;
        }

    }
   public static int findTrailingZeros(int n)
    {
        int count=0;
        for (int i = 5; n / i >= 1; i *= 5)
            count += n / i;

        return count;
    }

   public static boolean check(int x,int y,int num){
        String firstFactor=String.valueOf(x);
        String secondFactor=String.valueOf(y);
        String actualNumber=String.valueOf(num);
        if(actualNumber.equals(firstFactor+secondFactor))
            return true;
        else if(actualNumber.equals(StringFormatter.reverseString(firstFactor)+StringFormatter.reverseString(secondFactor)))
            return true;
        else if(actualNumber.equals(StringFormatter.reverseString(firstFactor)+secondFactor))
            return true;
        else if(actualNumber.equals(firstFactor+StringFormatter.reverseString(secondFactor)))
            return true;
        return false;

    }
    public static int calculateEnd(int digits,int factorDigit){
        int num=9;
        while(factorDigit>0){
            num=num*10+9;
            factorDigit--;
        }
        return num;
    }
    public static int noOfDigits(int var){
        int count=0;
        while(var!=0){
            count++;
            var=var/10;
        }
        return count;
    }
}
