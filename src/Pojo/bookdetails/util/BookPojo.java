package bookdetails.util;
public class BookPojo {
 private int busid;
 private String busname;
 private String source;
 private String destination;
 private  String arrivaltime;
 private String destinationtime;
 private String price;
private int seat;

    public BookPojo(int busid, String busname, String source, String destination, String arrivaltime, String destinationtime, String price, int seat) {
        this.busid = busid;
        this.busname = busname;
        this.source = source;
        this.destination = destination;
        this.arrivaltime = arrivaltime;
        this.destinationtime = destinationtime;
        this.price = price;
        this.seat = seat;
    }

    public int getBusid() {
        return busid;
    }

    public void setBusid(int busid) {
        this.busid = busid;
    }

    public String getBusname() {
        return busname;
    }

    public void setBusname(String busname) {
        this.busname = busname;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getArrivaltime() {
        return arrivaltime;
    }

    public void setArrivaltime(String arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    public String getDestinationtime() {
        return destinationtime;
    }

    public void setDestinationtime(String destinationtime) {
        this.destinationtime = destinationtime;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }
   
}
