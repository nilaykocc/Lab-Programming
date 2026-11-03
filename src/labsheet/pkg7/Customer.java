
package labsheet.pkg7;

/**
 *
 * @author Nilay
 */
public class Customer {
    
    private String name;
    private String phone;
    private Address address;

    public Customer(String name, String phone, String street, String district, String city) {
        this.name = name;
        this.phone = phone;
        this.address = new Address(street, district, city);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
