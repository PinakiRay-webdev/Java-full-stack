package Generics;

public class DemoBox<T> {
    T item;

    public void setItem(T item)
    {
        this.item = item;
    }

    public T display(){
        return item;
    }
}
