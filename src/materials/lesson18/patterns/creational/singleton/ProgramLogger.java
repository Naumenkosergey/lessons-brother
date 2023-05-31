package materials.lesson18.patterns.creational.singleton;

public class ProgramLogger {

    private static final ProgramLogger PROGRAM_LOGGER = new ProgramLogger();
    private static String logFile = "This is log File\n";

    private ProgramLogger() {
    }

    public static ProgramLogger getProgramLogger() {
        return PROGRAM_LOGGER;
    }

    public void addLogInfo(String logInfo) {
        logFile += logInfo + "\n";
    }

    public void showLogFile() {
        System.out.println(logFile);
    }
}
