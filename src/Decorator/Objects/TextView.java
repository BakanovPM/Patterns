package Decorator.Objects;

public class TextView implements Component{

    @Override
    public void draw() {
        System.out.println("Draw textview");
    }
}