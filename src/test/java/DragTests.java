import config.AppiumConfiguration;
import org.testng.annotations.Test;
import screens.DragScreen;

public class DragTests extends AppiumConfiguration {
    @Test
    public void dragDown() {
        new DragScreen(driver)
                .selectDraggableBasic()
                //.dragDown(2);
                //.dragDown(1,3)
                .dragDownWindow();

    }

    @Test
    public void dragUp() {
        new DragScreen(driver)
                .selectDraggableBasic()
                .dragUp(5, 3);
    }
}

