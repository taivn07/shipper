package jp.shipper.app.view.item;

/**
 * Created by QuyTrongNguyen on 13/12/2015.
 */
public class HistoryGoShipperItem {
    private int status;
    private String nameShop;
    private int shopID;

    private int shipperID;

    private String addressOfSender;
    private String addressOfReceiver;
    private int thuHo;
    private int phiShip;
    private String yeuCau;

    private String khoangCach;
    private String date;

    public HistoryGoShipperItem(int status, String nameShop, int shopID, int shipperID, String addressOfReceiver, String addressOfSender, int thuHo, int phiShip, String yeuCau, String khoangCach, String date){
        this.status = status;
        this.nameShop = nameShop;
        this.shopID = shopID;
        this.shipperID = shipperID;
        this.addressOfSender = addressOfSender;
        this.addressOfReceiver = addressOfReceiver;
        this.thuHo = thuHo;
        this.phiShip = phiShip;
        this.yeuCau = yeuCau;
        this.khoangCach = khoangCach;
        this.date = date;
    }
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getNameShop() {
        return nameShop;
    }

    public void setNameShop(String nameShop) {
        this.nameShop = nameShop;
    }

    public int getShopID() {
        return shopID;
    }

    public void setShopID(int shopID) {
        this.shopID = shopID;
    }

    public int getShipperID() {
        return shipperID;
    }

    public void setShipperID(int shipperID) {
        this.shipperID = shipperID;
    }

    public String getAddressOfSender() {
        return addressOfSender;
    }

    public void setAddressOfSender(String addressOfSender) {
        this.addressOfSender = addressOfSender;
    }

    public String getAddressOfReceiver() {
        return addressOfReceiver;
    }

    public void setAddressOfReceiver(String addressOfReceiver) {
        this.addressOfReceiver = addressOfReceiver;
    }

    public int getThuHo() {
        return thuHo;
    }

    public void setThuHo(int thuHo) {
        this.thuHo = thuHo;
    }

    public int getPhiShip() {
        return phiShip;
    }

    public void setPhiShip(int phiShip) {
        this.phiShip = phiShip;
    }

    public String getYeuCau() {
        return yeuCau;
    }

    public void setYeuCau(String yeuCau) {
        this.yeuCau = yeuCau;
    }

    public String getKhoangCach() {
        return khoangCach;
    }

    public void setKhoangCach(String khoangCach) {
        this.khoangCach = khoangCach;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
