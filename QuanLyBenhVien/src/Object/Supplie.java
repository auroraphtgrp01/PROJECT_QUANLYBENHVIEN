package Object;


public abstract class Supplie {
    private String id, name;
    private Date Date;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return this.Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public Supplie() {
    }

    public Supplie(String id, String name, Date Date) {
        this.id = id;
        this.name = name;
        this.Date = Date;
    }

    public Supplie id(String id) {
        setId(id);
        return this;
    }

    public Supplie name(String name) {
        setName(name);
        return this;
    }

    public Supplie Date(Date Date) {
        setDate(Date);
        return this;
    }

}
