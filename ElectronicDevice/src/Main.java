public class Main {
    public static void main(String[] args) {
       Phone phone = new Phone("Apple",30000,"551-1234");
        Computer computer = new Computer("Asus",15000,"Windows 10");

        computer.open();
        phone.isOpen();
        System.out.println();
        System.out.println("Başlangıçta tanımlanan cihazlara tanımlanan nesneler üzerinden erişiliyor. ");
        System.out.println(computer.getMake()+" "+"marka,"+computer.getPrice()+" "+"fiyatında,"+phone.getPhoneNumber()+" "+"telefon numarasına sahip telefon.");
        System.out.println();
        computer.updateGeneratingSystem("windows 11");
        phone.call("555-5678");
        computer.close();
        phone.close();


    }
}