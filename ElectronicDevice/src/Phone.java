public class Phone extends ElectronicDevice{
    private String phoneNumber;
    public Phone(String make, double price, String phoneNumber) {
        super(make, price);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void call(String number){
        if (isOpen()){
            System.out.println(phoneNumber+" "+"numaralı telefon,"+" "+number+" "+"numaralı telefonu arıyor.");
        }else {
            System.out.println("Arama yapmak için telefonun açık olması gerekiyor.");
        }
    }

}
