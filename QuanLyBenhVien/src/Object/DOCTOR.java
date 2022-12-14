
package Object;

public class DOCTOR extends PEOPLE {
    private String position_Job;

    public DOCTOR(String iD, String name, String email, String phone, String address, boolean sex, double age,
            String position_Job) {
        super(iD, name, email, phone, address, sex, age);
        this.position_Job = position_Job;
    }

    public String getPosition_Job() {
        return position_Job;
    }

    public void setPosition_Job(String position_Job) {
        this.position_Job = position_Job;
    }

}
