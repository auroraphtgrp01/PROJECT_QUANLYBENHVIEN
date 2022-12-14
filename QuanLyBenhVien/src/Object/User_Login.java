package Object;

public class User_Login {

    private String userName, passWord;
    private boolean permission_Doctor = false,
            permission_Supplies = false,
            permission_Patients = false,
            permission_Edit = false;

    public User_Login(String userName, String passWord, boolean permission_Doctor, boolean permission_Supplies,
            boolean permission_Patients, boolean permission_Edit) {
        this.userName = userName;
        this.passWord = passWord;
        this.permission_Doctor = permission_Doctor;
        this.permission_Supplies = permission_Supplies;
        this.permission_Patients = permission_Patients;
        this.permission_Edit = permission_Edit;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public boolean isPermission_Doctor() {
        return permission_Doctor;
    }

    public void setPermission_Doctor(boolean permission_Doctor) {
        this.permission_Doctor = permission_Doctor;
    }

    public boolean isPermission_Supplies() {
        return permission_Supplies;
    }

    public void setPermission_Supplies(boolean permission_Supplies) {
        this.permission_Supplies = permission_Supplies;
    }

    public boolean isPermission_Patients() {
        return permission_Patients;
    }

    public void setPermission_Patients(boolean permission_Patients) {
        this.permission_Patients = permission_Patients;
    }

    public boolean isPermission_Edit() {
        return permission_Edit;
    }

    public void setPermission_Edit(boolean permission_Edit) {
        this.permission_Edit = permission_Edit;
    }

}
