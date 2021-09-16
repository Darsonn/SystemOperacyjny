/*
TODO: 1. Ladowanie 2. Powitanie pierwszego uruchomienia 3. BIOS
 */

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoadingScreen();
            }
        });
    }
}
