import java.util.ArrayList;
import java.util.Scanner;

public class sinhVienTest implements interfaceSinhvien {
    private ArrayList<sinhVien> studentlist = new ArrayList<>();
    private int ID;


    // nhap sinh vien vao
    @Override
    public void input () {
        Scanner input = new Scanner(System.in);
        int ID;
        String name;
        String sex;
        int toan;
        int ly;
        int hoa;
        System.out.println(" nhap vao id: ");
        ID = input.nextInt();
        input.nextLine();
        System.out.println(" nhap vao ten: ");
        name = input.nextLine();
        System.out.println("nhap vao gioi tinh:");
        sex = input.nextLine();
        System.out.println("toan");
        toan = input.nextInt();
        System.out.println("Ly");
        ly = input.nextInt();
        System.out.println("hoa");
        hoa = input.nextInt();

        sinhVien student = new sinhVien(ID, name, sex, toan, ly, hoa);
        studentlist.add(student);


    }

    // xoa sinh vien
    public boolean delete (int id) {
        if (id > studentlist.size()) {
            return false;
        } else {
            for (sinhVien delete : studentlist) {
                if (delete.getID() == id) {
                    studentlist.remove(delete);
                    return true;
                }
            }
            return false;
        }
    }

    //xap xep sinh vien
    @Override
    public void sapXep () {
        for (int count = 0; count < studentlist.size(); count++) {
            for (int dem = count + 1; dem < studentlist.size(); dem++) {
                if (studentlist.get(count).tongdiem() > studentlist.get(dem).tongdiem()) {
                    sinhVien sinhVien;
                    sinhVien = studentlist.get(count);
                    studentlist.set(count, studentlist.get(dem));
                    studentlist.set(dem, sinhVien);
                }
            }
        }
    }
    //show ra ket qua
    @Override
    public void hienthi () {
        for (sinhVien displ : studentlist) {
            displ.display();
        }
    }

    @Override
    public void edit (int id) {
        for (sinhVien SV :studentlist) {
            if (SV.getID() == id) {
                System.out.println("ok");
            }else {
                System.out.println("khong co id; ");
            }
        }
    }
}