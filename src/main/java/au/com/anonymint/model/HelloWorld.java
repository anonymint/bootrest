package au.com.anonymint.model;

/**
 * //TODO description of this HelloWorld
 *
 * @author <a href="mailto:ekalak.rengwanidchakul@anonymint.com">erengwa</a>
 * @date 2014-03-03
 */
public class HelloWorld {

    public HelloWorld(String message, double version) {
        this.message = message;
        this.version = version;
    }

    private String message;
    private double version;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }
}
