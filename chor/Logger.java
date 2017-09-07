package pl.sda.poznan.chor;

public abstract class Logger {
    protected LogLevel logLevel;
    protected Logger nextLogger;

    public void setNextLogger(Logger nextLogger){
        this.nextLogger = nextLogger;
    }
    public void logMessage(LogLevel logLevel, String message){
        //Jeżeli poziom logwania mniejszy niz mój to zaleguj, jeżeli nie ot przeniś wyżej.
        if(this.logLevel.ordinal() >= logLevel.ordinal()){
            write(message);
        }
        else if (nextLogger != null) {
            nextLogger.logMessage(logLevel, message);
        }else{
            System.out.println("Żądanie nie obsłużone");
        }
    }

    protected abstract void write(String message);
}
