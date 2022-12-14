
package Object;

public class FAMILY_OF_PATIENT extends PEOPLE {
    private String relationship_With_Patient;
    private String id_OfPatient;

    public String getId_OfPatient() {
        return id_OfPatient;
    }

    public void setId_OfPatient(String id_OfPatien) {
        this.id_OfPatient = id_OfPatien;
    }

    public FAMILY_OF_PATIENT(String iD, String name, String phone,
            double age, String relationship_With_Patient, String id_OfPatient) {
        super(iD, name, phone, age);
        this.relationship_With_Patient = relationship_With_Patient;
        this.id_OfPatient = id_OfPatient;
    }
 

    public String getRelationship_With_Patient() {
        return relationship_With_Patient;
    }

    public void setRelationship_With_Patient(String relationship_With_Patient) {
        this.relationship_With_Patient = relationship_With_Patient;
    }

}
