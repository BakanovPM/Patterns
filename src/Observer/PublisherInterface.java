package Observer;

import java.util.ArrayList;

public interface PublisherInterface {
    ArrayList<PublisherActionListener> getListeners();
    void  addListener(PublisherActionListener listener);
    void removeListeners(PublisherActionListener listener);
    void removeAllListeners();
    void notifySubscribers(String message);
}
