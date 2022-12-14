package Object;

public class Medicine extends Supplie {
    private String uses;
    private Date expiry;

    private String usedPatient;

    public String getUsedPatient() {
        return usedPatient;
    }

    public void setUsedPatient(String usedPatient) {
        this.usedPatient = usedPatient;
    }

    public Medicine(String id, String name, Date Date, String uses, Date expiry) {
        super(id, name, Date);
        this.uses = uses;
        this.expiry = expiry;
    }

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }

    public String getUses() {
        return uses;
    }

    public void setUses(String uses) {
        this.uses = uses;
    }

    public Medicine() {
    }

}
