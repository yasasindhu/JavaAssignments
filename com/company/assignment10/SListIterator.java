package com.company.assignment10;

import java.util.List;

public class SListIterator <T>{
    Link<T> current;

    public SListIterator(Link<T> head) {
        current=head;
    }

    public boolean hasNext(){
        return current.next!=null;
    }
    public Link<T> next(){
        current=current.next;
        return (Link<T>) current;
    }
    public void insert(T t){
        current.next=new Link<T>(t,current.next);
        current=current.next;
    }
    public void remove(){
        if(current.next!=null){
            current.next=current.next.next;
        }
    }
}
