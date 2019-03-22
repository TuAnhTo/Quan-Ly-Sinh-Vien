import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        sinhVienTest test = new sinhVienTest();
        Scanner scanner = new Scanner(System.in);
        int check;
        int id;

        while (true){
            System.out.println("1. NHẬP VÀO 1 SINH VIÊN!");
            System.out.println("2. XEM DANH SÁCH SINH VIÊN!");
            System.out.println("3. SẮP XẾP DANH SÁCH THEO THỨ TỰ TĂNG DẦN THEO TỔNG ĐIỂM");
            System.out.println("4. SỬA THÔNG TIN SINH VIÊN CÓ MÃ ĐƯỢC NHẬP TỪ BÀN PHÍM!");
            System.out.println("5. XÓA SINH VIÊN CÓ MÃ NHẬP TỪ BÀN PHÍM!");
            System.out.println("0. THOÁT!");
            System.out.print("    --->NHẬP: ");

            check = scanner.nextInt();

            switch (check){
                case 1:
                    test.input();
                    break;
                case 2:
                    test.hienthi();
                    break;
                case 3:
                    test.sapXep();
                    break;
                case 4:
                    System.out.println("nhap vao id can sua");
                    id = scanner.nextInt();
                    test.edit(id);
                    break;
                case 5:
                    System.out.println(" nhap vao ID");
                    id =scanner.nextInt();
                    test.delete(id);

                    break;
                case 0:
                    System.exit(0);
                    break;
            }

        }






    }

}
