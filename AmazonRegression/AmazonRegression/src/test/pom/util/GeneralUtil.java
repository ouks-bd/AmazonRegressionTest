package LeadManagement.pom.util;

public class GeneralUtil {

    final static public int PAGE_LOAD_TIME = 60000;
    final public static int IMPLICIT_WAIT = 30;

    public static void waitForDomStable() {
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
