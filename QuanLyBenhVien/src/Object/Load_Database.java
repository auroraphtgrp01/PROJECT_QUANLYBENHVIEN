package Object;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Load_Database {
    private static ArrayList<PATIENT> list_Patients = new ArrayList<>();
    private static ArrayList<DOCTOR> list_Doctors = new ArrayList<>();
    private static ArrayList<FAMILY_OF_PATIENT> list_Fmls = new ArrayList<>();
    private static ArrayList<String> list = new ArrayList<>();
    private static ArrayList<User_Login> list_User = new ArrayList<>();
    private static ArrayList<UserHistory> listUserHS = new ArrayList<>();
    private static ArrayList<Medicine> listMedicine = new ArrayList<>();

    // ------------------------METHOD_READFILE-----------------------------------------------

    // ReadFile_Encrypt
    public static void readFile(String file) {
        String S = "";
        try {
            File f = new File(file);
            if (f.exists()) {
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    Scanner line = new Scanner(read.nextLine());
                    S = line.nextLine();
                    list.add(S);
                }
            }
        } catch (Exception e) {
        }
    }

    // Encrypt
    public static void Encryption(String file) {
        readFile(file);
        for (int i = 0; i < list.size(); i++) {
            char k[] = list.get(i).toCharArray();
            String s1 = "";
            for (int j = 0; j < k.length; j++) {
                int d = k[j] + 60;
                char ch = (char) d;
                s1 += String.valueOf(ch);
            }
            list.set(i, s1);
        }
        try {
            FileOutputStream fout = new FileOutputStream(file);
            PrintStream pout = new PrintStream(fout);
            for (String x : list) {
                pout.println(x);
            }
            pout.close();
            fout.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
        list.removeAll(list);
    }

    // Decrypt
    public static void Decryption(String file) {
        readFile(file);
        for (int i = 0; i < list.size(); i++) {
            char k[] = list.get(i).toCharArray();
            String s1 = "";
            for (int j = 0; j < k.length; j++) {
                int d = k[j] - 60;
                char ch = (char) d;
                s1 += String.valueOf(ch);
            }
            list.set(i, s1);
        }

        try {
            FileOutputStream fout = new FileOutputStream(file);
            PrintStream pout = new PrintStream(fout);
            for (String x : list) {
                pout.println(x);
            }
            pout.close();
            fout.close();
        } catch (Exception e) {
        }
        list.removeAll(list);
    }

    // ReadFile_Doctor
    public static void ReadFile_Doctor() {

        try {
            File f = new File("database/DOCTOR.dat");
            if (f.exists()) {
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    Scanner line = new Scanner(read.nextLine());
                    String id = "", name = "", email = "", sdt = "", addr = "", cvu = "";
                    double cache = 0, age = 0;
                    Boolean gt;
                    //
                    id = line.next();
                    //
                    while (!line.hasNextDouble()) {
                        name += line.next() + " ";
                    }
                    cache = line.nextDouble();
                    //
                    email = line.next();
                    //
                    sdt = line.next();
                    //
                    while (!line.hasNextBoolean()) {
                        addr += line.next() + " ";
                    }
                    //
                    gt = line.nextBoolean();
                    //
                    age = line.nextDouble();
                    //
                    while (line.hasNext()) {
                        cvu += line.next() + " ";

                    }
                    list_Doctors.add(new DOCTOR(id, name, email, sdt, addr, gt, age, cvu));
                }
            } else {
            }
        } catch (Exception e) {
        }
    }

    // WriteFile_Doctor
    public static void writeFile_Doctors() {
        try {
            FileOutputStream fout = new FileOutputStream("database/DOCTOR.dat");
            PrintStream pout = new PrintStream(fout);
            for (DOCTOR x : list_Doctors) {
                pout.println(x.getID() + " " + x.getName() + " " + 0.1 + " " + x.getEmail() + " "
                        + x.getPhone() + " "
                        + x.getAddress() + " " + x.isSex() + " " + x.getAge() + " "
                        + x.getPosition_Job());
            }
            pout.close();
            fout.close();
        } catch (Exception e) {
        }
    }

    // ReadFile_Patient
    public static void readFile_Patient() {

        try {
            File f = new File("database/HSBN.dat");
            if (f.exists()) {
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    Scanner line = new Scanner(read.nextLine());
                    String id, name = "", email, sdt = "", addr = "", idbhyt = "", date = "", nhomMau = "", tChung = "",
                            cDoan = "", tienSu = "", idbs = "", idnn = "";
                    Boolean gt;
                    double age = 0, cache = 0, canNang = 0, chieuCao = 0;
                    id = line.next();
                    while (!line.hasNextBoolean()) {
                        name += line.next() + " ";
                    }
                    gt = line.nextBoolean();
                    age = line.nextDouble();
                    email = line.next();
                    while (!line.hasNextDouble()) {
                        sdt = line.next();
                    }
                    String sdt1[] = sdt.split("/");
                    sdt = sdt1[1];
                    cache = line.nextDouble();

                    while (!line.hasNextDouble()) {
                        addr += line.next() + " ";
                    }
                    cache = line.nextDouble();

                    while (!line.hasNextDouble()) {
                        idbhyt = line.next();
                    }
                    String bhyt[] = idbhyt.split("/");
                    idbhyt = bhyt[1];

                    cache = line.nextDouble();

                    while (!line.hasNextDouble()) {
                        date = line.next();
                    }

                    cache = line.nextDouble();

                    while (!line.hasNextDouble()) {
                        nhomMau = line.next();
                    }

                    cache = line.nextDouble();

                    while (!line.hasNextDouble()) {
                        tChung += line.next() + " ";
                    }

                    cache = line.nextDouble();

                    while (!line.hasNextDouble()) {
                        cDoan += line.next() + " ";
                    }

                    cache = line.nextDouble();

                    while (!line.hasNextDouble()) {
                        tienSu += line.next() + " ";
                    }
                    canNang = line.nextDouble();
                    chieuCao = line.nextDouble();
                    idbs = line.next();
                    idnn = line.next();
                    // ------------------------------------------------------------------------------------------
                    list_Patients.add(new PATIENT(id, name, email, sdt, addr, gt, age, nhomMau, idbhyt, tChung, cDoan,
                            tienSu, canNang, chieuCao, new Date(date), idnn, idbs));
                }
            } else {

            }
        } catch (Exception e) {
        }
    }

    // WriteFile_Patient
    public static void writeFile_Patient() {
        try {
            FileOutputStream fout = new FileOutputStream("database/HSBN.dat");
            PrintStream pout = new PrintStream(fout);
            for (PATIENT x : list_Patients) {
                pout.println(x.getID() + " " + x.getName() + " " + x.isSex() + " " + x.getAge() + " " + x.getEmail()
                        + " " + "/" + x.getPhone() + " " + 0.1 + " " + x.getAddress() + " " + 0.1 + " " + "/"
                        + x.getId_BHYT() + " " + 0.1 + " " + x.getHospitalized_Day() + " " + 0.1 + " "
                        + x.getBlood_Group() + " " + 0.1 + " " + x.getSymptom() + " " + 0.1 + " " + x.getDiagnose()
                        + " "
                        + 0.1 + " " + x.getMedical_history() + " " + x.getWeight() + " " + x.getHeight() + " "
                        + x.getId_DOCTOR() + " " + x.getId_FML());
            }
            pout.close();
            fout.close();
        } catch (Exception e) {
        }
    }

    // ReadFile_Fml
    public static void readFile_Fml() {
        try {
            File f = new File("database/FML.dat");
            if (f.exists()) {
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    Scanner line = new Scanner(read.nextLine());

                    String idnn = "", namenn = "", emailnn = "", sdtnn = "", addrnn = "", rlnn = "", idbn = "";
                    Boolean gtnn;
                    double agenn = 0, cache = 0;

                    idnn = line.next();
                    while (!line.hasNextDouble()) {
                        namenn += line.next() + " ";
                    }
                    cache = line.nextDouble();

                    sdtnn = line.next();
                    agenn = line.nextDouble();
                    while (!line.hasNextDouble()) {
                        rlnn += line.next() + " ";
                    }
                    cache = line.nextDouble();
                    idbn = line.next();
                    FAMILY_OF_PATIENT x = new FAMILY_OF_PATIENT(idnn, namenn, sdtnn, agenn, rlnn, idbn);
                    list_Fmls.add(x);
                }
            } else {
            }
        } catch (Exception e) {
        }
    }

    // WriteFile_Fml
    public static void writeFile_Fml() {
        try {
            FileOutputStream fout = new FileOutputStream("database/FML.dat");
            PrintStream pout = new PrintStream(fout);
            for (FAMILY_OF_PATIENT x : list_Fmls) {
                pout.println(x.getID() + " " + x.getName() + " " + 0.1 + " " + x.getPhone() +
                        " " + x.getAge() + " " + x.getRelationship_With_Patient()
                        + " " + 0.1 + " " + x.getId_OfPatient());
            }
            pout.close();
            fout.close();
        } catch (Exception e) {
        }

    }

    // ReadUser
    public static void readUser() {

        try {
            File f = new File("database/user.dat");
            if (f.exists()) {
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    Scanner line = new Scanner(read.nextLine());
                    String username, password;
                    boolean doctor, patient, supplie, edit;
                    username = line.next();

                    password = line.next();
                    doctor = line.nextBoolean();
                    supplie = line.nextBoolean();
                    patient = line.nextBoolean();
                    edit = line.nextBoolean();
                    list_User.add(new User_Login(username, password, doctor, supplie, patient, edit));
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    // WriteUser
    public static void writeUser() {

        try {
            FileOutputStream fout = new FileOutputStream("database/user.dat");
            PrintStream pout = new PrintStream(fout);
            for (User_Login x : list_User) {
                pout.println(x.getUserName() + " " + x.getPassWord() + " " + x.isPermission_Doctor() + " "
                        + x.isPermission_Supplies() + " " + x.isPermission_Patients() + " " + x.isPermission_Edit());
            }
            pout.close();
            fout.close();
        } catch (Exception e) {
        }
    }

    // Read_Supplie
    public static void readFileMedicine() {
        try {
            File f = new File("database/Medicine.dat");
            if (f.exists()) {
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    Scanner line = new Scanner(read.nextLine());
                    String id = "", name = "", uses = "", userHistory = "";
                    String date1 = "", date2 = "";
                    String user = "";
                    double cache = 0;
                    id = line.next();
                    name = "";
                    while (!line.hasNextDouble()) {
                        name += line.next() + " ";
                    }
                    cache = line.nextDouble();
                    while (!line.hasNextDouble()) {
                        uses += line.next() + " ";
                    }
                    cache = line.nextDouble();
                    date1 = line.next();
                    date2 = line.next();
                    listMedicine.add(new Medicine(id, name, new Date(date1), uses, new Date(date2)));
                }
            }
        } catch (Exception e) {

        }
    }

    // Read_File_History
    public static void readUserHistory() {
        try {
            File f = new File("database/UserHistory.dat");
            if (f.exists()) {
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    Scanner line = new Scanner(read.nextLine());
                    String ma1 = "", ma2 = "", lieu = "";
                    ma1 = line.next();
                    ma2 = line.next();
                    while (line.hasNext()) {
                        lieu += line.next() + " ";
                    }

                    listUserHS.add(new UserHistory(ma2, lieu, ma1));
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    // WriteFile_Medicine
    public static void writeFileMedicine() {
        try {
            FileOutputStream fout = new FileOutputStream("database/Medicine.dat");
            PrintStream pout = new PrintStream(fout);
            for (Medicine x : listMedicine) {
                pout.println(
                        x.getId() + " " + x.getName() + " " + 0.1 + " " + x.getUses() + " " + 0.1 + " " + x.getDate()
                                + " " + x.getExpiry());
            }
            pout.close();
            fout.close();
        } catch (Exception e) {
        }
    }

    // WriteFile_UserHistory
    public static void writeFileUserHistory() {
        try {
            FileOutputStream fout = new FileOutputStream("database/UserHistory.dat");
            PrintStream pout = new PrintStream(fout);
            for (UserHistory x : listUserHS) {
                pout.println(x.getMathuoc() + " " + x.getIdBN() + " " + x.getLieu());
            }
            pout.close();
            fout.close();
        } catch (Exception e) {
        }
    }

    // --------------------------------------------------------------------------------------

    public static ArrayList<PATIENT> getList_Patients() {
        Decryption("database/HSBN.dat");
        readFile_Patient();
        return list_Patients;
    }

    public static ArrayList<PATIENT> getListPatientDoNotDecrypt() {
        readFile_Patient();
        return list_Patients;
    }

    public static ArrayList<DOCTOR> getList_Doctors() {
        Decryption("database/DOCTOR.dat");
        ReadFile_Doctor();
        return list_Doctors;
    }

    public static ArrayList<DOCTOR> getListDoctorDoNotDecrypt() {
        ReadFile_Doctor();
        return list_Doctors;
    }

    public static ArrayList<FAMILY_OF_PATIENT> getList_fmls() {
        Decryption("database/FML.dat");
        readFile_Fml();
        return list_Fmls;
    }

    public static ArrayList<FAMILY_OF_PATIENT> getListFmlDoNotDecrypt() {
        readFile_Fml();
        return list_Fmls;
    }

    public static ArrayList<User_Login> getUser() {
        Decryption("database/user.dat");
        readUser();
        return list_User;
    }

    public static ArrayList<User_Login> getUserDontDecryt() {
        readUser();
        return list_User;
    }

    public static ArrayList<UserHistory> getListUserHS() {
        Decryption("database/UserHistory.dat");
        readUserHistory();
        return listUserHS;
    }

    public static ArrayList<UserHistory> getListUserHSDontDecrypt() {
        readUserHistory();
        return listUserHS;
    }

    public static ArrayList<Medicine> getListMedicine() {
        Decryption("database/Medicine.dat");
        readFileMedicine();
        return listMedicine;
    }

    public static ArrayList<Medicine> getListMedicineDontDecrypt() {
        readFileMedicine();
        return listMedicine;
    }
}
