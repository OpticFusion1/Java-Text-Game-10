package test.magneticstudio.transience.ui;

import java.awt.Dimension;
import java.awt.Toolkit;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

import com.magneticstudio.transience.ui.Game;

/**
 * This class is designed to test the class
 * "Game" in the source code package.
 *
 * @author Max
 */
public final class GameTest {

    /**
     * Main entry point of the program.
     * @param args Arguments from command-line.
     */
    public static void main(String[] args) throws SlickException, NoSuchFieldException, IllegalAccessException {
        Game game = new Game("Test");

        Dimension resolution = Toolkit.getDefaultToolkit().getScreenSize();
        AppGameContainer container = new AppGameContainer(game, (int) resolution.getWidth(), (int) resolution.getHeight(), true);
        container.setMouseGrabbed(true);
        container.setIcons(new String[] {
                "resources/logos/magnetic-studio-temp-icon-16.png",
                "resources/logos/magnetic-studio-temp-icon-32.png"
        });
        container.setVerbose(false);
        container.setShowFPS(false);
        container.setVSync(false);
        container.start();
    }
}
