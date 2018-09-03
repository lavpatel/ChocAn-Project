package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import utility.Utils;

@Entity
@Table(name = "member")
public class Members implements Serializable {

    public Members() {
    }

    @Id
    @Column(name = "mem_id")
    private long id;

    @Column(name = "mem_name")
    private String name;

    @Column(name = "mem_address")
    private String address;

    @Column(name = "mem_city")
    private String city;

    @Column(name = "mem_state")
    private String state;

    @Column(name = "mem_zip_code")
    private String zipCode;

    @Column(name = "mem_valid")
    private boolean isValid;

    public long getId() {

        return this.id;
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

    public boolean isIsValid() {
        return isValid;
    }

    public void setIsValid(boolean isValid) {
        this.isValid = isValid;
    }

    public long generateId() {
        Session session = Utils.getSession();
        session.beginTransaction();
        Long id =  (Long) session.createCriteria(Members.class)
                .setProjection(Projections.count("id"))
                .uniqueResult();
        session.getTransaction().commit();
        session.close();
        return 123456780+id;

    }

}
