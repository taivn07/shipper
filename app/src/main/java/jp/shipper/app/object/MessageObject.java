package jp.shipper.app.object;

/**
 * Created by paditechmacbookair on 12/9/15.
 */
public class MessageObject {

    private String message;
    private int userId;

    public MessageObject(String message, int userId) {
        this.message = message;
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
