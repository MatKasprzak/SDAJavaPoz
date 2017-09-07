package pl.sda.poznan.chor;

public class infoLogger extends Logger {

    public infoLogger(){
        this.logLevel = LogLevel.INFO;
    }

    @Override
    protected void write(String message){
        System.out.println("INFO: " + message);

    }
}
