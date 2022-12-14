
package Object;

public class PATIENT extends PEOPLE {
    private String blood_Group, id_BHYT, symptom, diagnose, medical_history, id_DOCTOR, id_FML;

    public String getId_FML() {
        return id_FML;
    }

    public void setId_FML(String id_FML) {
        this.id_FML = id_FML;
    }

    public String getId_DOCTOR() {
        return id_DOCTOR;
    }

    public void setId_DOCTOR(String id_DOCTOR) {
        this.id_DOCTOR = id_DOCTOR;
    }

    private double weight, height;
    private Date hospitalized_Day;
    private FAMILY_OF_PATIENT a_Relative;

    public FAMILY_OF_PATIENT getA_Relative() {
        return a_Relative;
    }

    public void setA_Relative(FAMILY_OF_PATIENT a_Relative) {
        this.a_Relative = a_Relative;
    }

    // MÃ, TÊN, EMAIL, SDT, ĐỊA CHỈ, GIỚI TÍNH, TUỔI, NGÀY VÀO VIỆN, NHÓM MÁU, SỐ
    // BHYT, TRIỆU CHỨNG, CHẨN ĐOÁN, TIỀN SỬ BỆNH, CÂN NẶNG, CHIỀU CAO

    public PATIENT(String iD, String name, String email, String phone, String address, boolean sex, double age,
            String blood_Group, String id_BHYT, String symptom, String diagnose, String medical_history, double weight,
            double height, Date hospitalized_Day, String id_FML, String id_DOCTOR) {
        super(iD, name, email, phone, address, sex, age);
        this.blood_Group = blood_Group;
        this.id_BHYT = id_BHYT;
        this.symptom = symptom;
        this.diagnose = diagnose;
        this.medical_history = medical_history;
        this.weight = weight;
        this.height = height;
        this.hospitalized_Day = hospitalized_Day;
        this.id_FML = id_FML;
        this.id_DOCTOR = id_DOCTOR;

    }

    public Date getHospitalized_Day() {
        return hospitalized_Day;
    }

    public void setHospitalized_Day(Date hospitalized_Day) {
        this.hospitalized_Day = hospitalized_Day;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMedical_history() {
        return medical_history;
    }

    public void setMedical_history(String medical_history) {
        this.medical_history = medical_history;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getId_BHYT() {
        return id_BHYT;
    }

    public void setId_BHYT(String id_BHYT) {
        this.id_BHYT = id_BHYT;
    }

    public String getBlood_Group() {
        return blood_Group;
    }

    public void setBlood_Group(String blood_Group) {
        this.blood_Group = blood_Group;
    }

}
