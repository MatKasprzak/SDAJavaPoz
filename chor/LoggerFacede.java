package pl.sda.poznan.chor;

public class LoggerFacede {
   private static Logger info = new infoLogger();
   private static Logger debug = new DebugLogger();
   private static Logger error = new ErrorLogger();

    public LoggerFacede() {
        info.setNextLogger(debug);
        debug.setNextLogger(error);
    }

    public void log(LogLevel level, String message) {
        info.logMessage(LogLevel.SUPER_ERROR,"chor");
}
}
