package JavaEngine.Base;

import java.nio.channels.AcceptPendingException;

import javax.swing.event.AncestorListener;

public abstract class JavaEngineBehaviour implements AncestorListener{
    abstract void Start();
    JavaEngineBehaviour() {
        Start();
    }
    
}
