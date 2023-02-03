package State.State;

public class FireState implements TransformerState{
    @Override
    public void action() {
        System.out.println("Transformer fires");
    }
}
