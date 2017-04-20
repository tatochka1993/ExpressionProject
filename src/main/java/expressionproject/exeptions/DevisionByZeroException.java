package expressionproject.exeptions;

import javax.xml.ws.WebFault;

@WebFault
public class DevisionByZeroException extends Exception {

    private String message;

    public DevisionByZeroException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
