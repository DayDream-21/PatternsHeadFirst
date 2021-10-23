package compound_patterns.beat_app.djview;

import javax.swing.*;
import java.io.Serial;

public class BeatBar extends JProgressBar implements Runnable {
    @Serial
    private static final long serialVersionUID = 2L;
    JProgressBar progressBar;
    Thread thread;

    public BeatBar() {
        thread = new Thread(this);
        setMaximum(100);
        thread.start();
    }

    public void run() {
        for(;;) {
            int value = getValue();
            value = (int)(value * .75);
            setValue(value);
            repaint();
            try {
                Thread.sleep(50);
            } catch (Exception ignored) {};
        }
    }
}
