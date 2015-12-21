package jp.shipper.app.view.item;

/**
 * Created by QuyTrongNguyen on 10/12/2015.
 */
public class ShipperNotificationObject {
    private String content;
    private int contentType;
    private String date;


    public ShipperNotificationObject(String content, int contentType, String date){
        this.content = content;
        this.contentType = contentType;
        this.date = date;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getContentType() {
        return contentType;
    }

    public void setContentType(int contentType) {
        this.contentType = contentType;
    }
}
