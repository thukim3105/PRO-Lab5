
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luong
 */
public class VendorList extends ArrayList<Vendor>{
    public void addVendor(Vendor v) {
        this.add(v);
    }
    
    public double getVendorSaleById(int id) {
        for (Vendor ven : this) {
            if (ven.getId() == id) {
                return ven.getSale();
            }
        }
        return (double) id;
    }
    
    public Vendor getVendorWithMaxSale() {
        double maxSale = -1;
        int index = -1;
        for (Vendor ven : this) {
            if (ven.getSale() > maxSale) {
                maxSale = ven.getSale();
                index = indexOf(ven);
            }
        }
        return get(index);
    }
    
    public double getTotalSaleAllVendors() {
        double sumSale = 0;
        for (Vendor ven : this) {
            sumSale += ven.getSale();
        }
        return sumSale;
    }
    
    public void printVendorList() {
            Collections.sort(this, new Comparator<Vendor>() {
            @Override
            public int compare(Vendor ven1, Vendor ven2) {
                if (Double.compare(ven2.getSale(), ven1.getSale()) != 0) {
                    return Double.compare(ven2.getSale(), ven1.getSale());
                }
                else {
                    return ven1.getName().compareTo(ven2.getName());
                }
            }
        });
        for (Vendor v : this) {
            System.out.println(v);
        }
    }
}
