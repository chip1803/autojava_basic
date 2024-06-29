package kieudulieu.phuongthuc;

import java.sql.SQLOutput;

public class PhuongThuc {
    public static void main(String[] args) {
        Company.getInforCompany();

        String company_name = Company.getCompany();
         System.out.println(company_name);

    }
}
