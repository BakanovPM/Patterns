package Decorator.Objects;

public class Window implements Component{

    @Override
    public void draw() {
        System.out.println("Draw window");
    }
}
