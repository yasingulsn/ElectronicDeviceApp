import org.w3c.dom.ls.LSOutput;

public class ElectronicDevice {
    protected String make;
    protected double price;
    private boolean status;

    public ElectronicDevice(String make, double price) {
        this.make = make;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public boolean isOpen() {
        return status == true;
    }

    public void open() {
        if (isOpen()) {
            System.out.println(getMake() + " " + "Cihazınız zaten açık.");
        } else {
            status = true;
            System.out.println(getMake() + " " + "Cihazınız açıldı.");
        }
    }
    public void setOpen(boolean isOpen){
        this.status=isOpen;
    }
    public void close(){
        if (isOpen()){
            status=false;
            System.out.println(getMake()+" "+"Cihazınız kapatıldı.");
        }else {
            System.out.println(getMake()+" "+"Cihazınız zaten kapalı. ");
        }
    }
}