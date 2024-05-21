package co.com.sofka.exceptions;


public class ErrorServicesException extends RuntimeException {
    public ErrorServicesException(String exceptionMessage){
        super(exceptionMessage);
    }
}