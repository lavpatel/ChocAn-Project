package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "provider_name")
public class ProviderDir {

    public ProviderDir() {
    }

    
    @Id
    @Column(name = "service_code")
    private long serviceCode;

    @Column(name = "provider_number")
    private long providerNumber;

    @Column(name = "service_name")
    private String serviceName;

    @Column(name = "provider_name")
    private String providerName;

    @Column(name = "fees")
    private int fees;

    public long getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(long serviceCode) {
        this.serviceCode = serviceCode;
    }

    public long getProviderNumber() {
        return providerNumber;
    }

    public void setProviderNumber(long providerNumber) {
        this.providerNumber = providerNumber;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
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
    
    

}
