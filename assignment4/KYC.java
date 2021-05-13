package com.company.assignment4;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class KYC {
    public  List<String> check(String signDate,String currentDate) throws ParseException {
        List<String> DurationDates=new ArrayList<>();
        SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy");
        Calendar calendar=new GregorianCalendar();
        Date signDt=formatter.parse(signDate);
        Date currentDt=formatter.parse(currentDate);
        calendar.setTime(currentDt);
        currentDt=calendar.getTime();
        int currYear=1900+currentDt.getYear();
        int signYear=1900+signDt.getYear();
        if(signYear>=currYear) {
            DurationDates.add("No Results");
            return DurationDates;
        }
        calendar.setTime(signDt);
        calendar.add(Calendar.DATE, -30);
        calendar.set(Calendar.YEAR, currYear);
        Date formStartDt = calendar.getTime();
        calendar.setTime(signDt);
        calendar.add(Calendar.DATE,30);
        calendar.set(Calendar.YEAR, currYear);
        Date formEndDt = calendar.getTime();


        if(formEndDt.compareTo(currentDt)>0) {
         formEndDt=currentDt;
        }
        DurationDates.add(new SimpleDateFormat("dd-MM-yyyy").format(formStartDt));
        DurationDates.add(new SimpleDateFormat("dd-MM-yyyy").format(formEndDt));
        return DurationDates;

    }
}
//Time Complexity->O(N) N-is nofInputs provided
//Space Complexity->O(1)
