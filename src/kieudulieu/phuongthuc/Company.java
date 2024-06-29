package kieudulieu.phuongthuc;

public class Company {
    public static String company = "Ha Noi";
    public static String address = "Ha Dong";
    public static String phone = "123456";
    public static String email = "HN@gmail.com";

    public static void getInforCompany(){
        System.out.println("Company: " + company);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);




    }
    public static String getCompany(){
        return company;
    }
    public static String getEmail(){
        return email;
    }
}
