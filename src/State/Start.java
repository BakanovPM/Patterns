package State;

// Создавать обьект который меняет свое поведение в зависимости от своего состояния
// Позволяет избегать многочисленных if

import State.Context.TransformerContext;
import State.State.FireState;
import State.State.MoveState;
import State.State.TransformerState;

public class Start {
    public static void main(String[] args) {

        TransformerContext transformerContext = new TransformerContext();

        TransformerState stateMove = new MoveState();
        TransformerState stateFire = new FireState();

        transformerContext.setState(stateFire);
        transformerContext.action();

        transformerContext.setState(stateMove);
        transformerContext.action();
    }
}
