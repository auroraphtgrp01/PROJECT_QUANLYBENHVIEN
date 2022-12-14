package Object;

public class UserHistory {
    private String idBN, lieu, mathuoc;

    public UserHistory(String idBN, String lieu, String mathuoc) {
        this.idBN = idBN;
        this.lieu = lieu;
        this.mathuoc = mathuoc;
    }

    public String getMathuoc() {
        return mathuoc;
    }

    public void setMathuoc(String mathuoc) {
        this.mathuoc = mathuoc;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getIdBN() {
        return idBN;
    }

    public void setIdBN(String idBN) {
        this.idBN = idBN;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return mathuoc + " " + idBN + " " + lieu;
    }

}
