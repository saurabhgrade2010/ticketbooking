package bussystem.gui;
public class TicketPojo {
   private String name;
   private String mobile;
   private String email1;
   private int seat;
   private String email;

    public TicketPojo(String name, String mobile, String email1, int seat, String email) {
        this.name = name;
        this.mobile = mobile;
        this.email1 = email1;
        this.seat = seat;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    
}
