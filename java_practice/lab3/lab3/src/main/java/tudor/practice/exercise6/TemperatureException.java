package tudor.practice.exercise6;

public class TemperatureException extends Exception {
    
    private String errMessage;

    TemperatureException(String errMessage){
        this.errMessage = errMessage;
    }

    public String getErrMessage(){return this.errMessage;}

}
