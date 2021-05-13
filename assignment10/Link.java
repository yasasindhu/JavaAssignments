package com.company.assignment10;

public class Link <T>{
    T t;
    Link<T> next;
    Link(T t,Link<T> next){
        this.t=t;
        this.next=next;
    }
    Link(T t){
        this(t,null);
    }
    public String toString(){
        if(t==null)
            return "null";
        return t.toString();
    }
}
