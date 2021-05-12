package com.company.assignment10;

public class SList <T>{
    private Link<T> head=new Link<T>(null);


    SListIterator<T> iterator(){
        return new SListIterator<T>(head);
    }
    public String toString(){
        if(head.next==null)
            return "SList:[]";
        System.out.print("SList:[");
        SListIterator<T> itr=this.iterator();
        StringBuilder s=new StringBuilder();
        while(itr.hasNext()){
            s.append(itr.next());
            if(itr.hasNext())
                s.append(",");
            else
                s.append("");
        }
        return s+"]";
    }
}
