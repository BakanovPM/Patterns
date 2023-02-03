package Decorator.Objects;

public class Button implements Component{
    @Override
    public void draw() {
        System.out.println("Draw button");
    }
}
