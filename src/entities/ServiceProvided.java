package entities;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "service_provided")
public class ServiceProvided {

    public ServiceProvided() {
    }

    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "service_id")
    private long serviceId;
    
    @Column(name = "service_name")
    private String serviceName;
    
    @Column(name = "provider_number")
    private long providerNumber;

    @Column(name = "provider_name")
    private String providerName;

    @Column(name = "fees")
    private int fees;
            
    @Column(name = "Comments")
    private String comments;
    
    @Column(name = "TimeEntered")
    @Temporal(TemporalType.DATE)
    private Date timedate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getServiceId() {
        return serviceId;
    }

    public void setServiceId(long serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public long getProviderNumber() {
        return providerNumber;
    }

    public void setProviderNumber(long providerNumber) {
        this.providerNumber = providerNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getTimedate() {
        return timedate;
    }

    public void setTimedate(Date timedate) {
        this.timedate = timedate;
    }
    
    
}
