import java.util.logging.Logger;

public class SampleJavaApp {
    private static final Logger logger = Logger.getLogger(SampleJavaApp.class.getName());

    public static void main(String[] args) {
        logger.info("Starting Sample Java Application");

        SampleJavaApp app = new SampleJavaApp();
        app.performOperation();

        logger.info("Sample Java Application finished");
    }

    public void performOperation() {
        logger.info("Performing operations...");

        for (int i = 0; i < 5; i++) {
            logger.info("Operation step " + i);
        }
        logger.info("Operation completed");
    }
}