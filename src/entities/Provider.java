package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import utility.Utils;


@Entity
@Table(name = "provider")
public class Provider {

    public Provider() {
    }
  
    @Id
    @Column(name = "pro_id")
    private long id;

    @Column(name = "pro_name")
    private String name;

    @Column(name = "pro_address")
    private String address;

    @Column(name = "pro_city")
    private String city;

    @Column(name = "pro_state")
    private String state;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "pro_zip_code")
    private String zipCode;

    @Column(name = "pro_password")
    private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    
        public long generateId() {
        Session session = Utils.getSession();
        session.beginTransaction();
        Long id =  (Long) session.createCriteria(Provider.class)
                .setProjection(Projections.count("id"))
                .uniqueResult();
        session.getTransaction().commit();
        session.close();
        return 876543210+id;
        }
}
