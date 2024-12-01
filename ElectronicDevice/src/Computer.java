public class Computer extends ElectronicDevice{
    private String operatingSystem;
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    public Computer(String make,double price,String operatingSystem){
        super(make, price);
        this.operatingSystem = operatingSystem;
    }
   public void updateGeneratingSystem(String operatingSystem){
        if (isOpen()){
            this.operatingSystem=operatingSystem;
            System.out.println("İşletim sistemi güncelleniyor...");
            System.out.println("İşletim sistemi"+" "+operatingSystem+" "+"olarak güncellendi.");
        }else{
            System.out.println("Güncellemeniz için bilgisayarınızı açmanız gerekmektedir !");
        }
   }
}
