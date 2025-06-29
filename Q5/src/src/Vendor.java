
import java.util.Locale;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luong
 */
public class Vendor {
    private int id;
    private String name;
    private String address;
    private String phone;
    private double sale;
    
    public Vendor() {
        id = 0;
        name = "";
        address = "";
        phone = "";
        sale = 0;
    }
    
    public Vendor(int id, String name, String address, String phone, double sale) {
        this.id = id;
        this.setName(name);
        this.setAddress(address);
        this.setPhone(phone);
        this.setSale(sale);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        String[] nameSplit = name.split("[ ]+");
        String nameTitle = "";
        for (String word: nameSplit) {
            word = word.substring(0,1).toUpperCase() + word.substring(1);
            nameTitle += word + " ";
        }
        return nameTitle.trim();
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }
        else {
            this.name = "No Name";
        }
    }

    public String getAddress() {
        String[] nameSplit = address.split("[ ]+");
        String addressTitle = "";
        for (String word: nameSplit) {
            word = word.substring(0,1).toUpperCase() + word.substring(1);
            addressTitle += word + " ";
        }
        return addressTitle.trim();
    }

    public void setAddress(String address) {
        if (!address.isEmpty()) {
            this.address = address;
        }
        else {
            this.address = "No Address";
        }
    }

    public String getPhone() {        
        return phone;
    }

    public void setPhone(String phone) {
        if (phone.matches("0\\d{8,9}|\\(0\\d{2}\\)\\d{8}")) {
            this.phone = phone;
        }
        else {
            this.phone = "No Phone";
        }
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        if (sale >= 100 && sale <= 5000000) {
            this.sale = sale;
        }
        else {
            this.sale = 100;
        }
    }
    
    @Override
    public String toString() {
        return String.format(Locale.US,"%d,%s,%s,%s,%.3f", getId(), getName(), getAddress(), getPhone(), getSale());
    }
}
