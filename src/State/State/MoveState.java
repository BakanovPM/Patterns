package State.State;

public class MoveState implements TransformerState{
    @Override
    public void action() {
        System.out.println("Transformer moves");
    }
}
