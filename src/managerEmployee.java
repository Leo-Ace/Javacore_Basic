import java.util.Scanner;

public class managerEmployee {

    public static void menu(int n, boolean check) {
        Scanner sc = new Scanner(System.in);
        int choose;
        Employeelmpl employeelmpl = new Employeelmpl();
        do {
            System.out.println("1. Nhap vao thong tin "+(check ? "nhan vien." : "quan tri."));
            System.out.println("2. Hien thi danh sach thong tin vua nhap.");
            if(check) System.out.println("3. Hien thi danh sach thong tin cac nhan vien, sap xep theo ten tang dan.");
            else System.out.println("3. Hien thi danh sach thong tin cac quan ly, sap xep theo luong giam dan.");
            System.out.println("4. Luu danh sach vao tep tin.");
            System.out.println("5. Tim kiem thong tin theo ten.");
            System.out.println("6. Ket thuc.");
            System.out.print("Chon: ");
            choose = sc.nextInt(); sc.nextLine();
            switch (choose) {
                case 1:
                    for (int i=0; i<n; i++) {
                        System.out.println("Nhap vao nhan vien thu "+(i+1));
                        if(check) {
                            Employee employee = new Employee();
                            employee.input();
                            employeelmpl.insert(employee);
                        } else {
                            Manager manager = new Manager();
                            manager.input();
                            employeelmpl.insert(manager);
                        }
                    }
                    break;
                case 2:
                    employeelmpl.showAll();
                    break;
                case 3:
                    if(check) employeelmpl.sortAscending();
                    else employeelmpl.sortDescending();
                    break;
                case 4:
                    employeelmpl.saveFile();
                    break;
                case 5:
                    System.out.printf("Nhap ten can tim kiem: ");
                    String nameValue = sc.nextLine();
                    employeelmpl.search(nameValue);
                    break;
                default:break;
            }
        } while (choose != 6);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, choose;
        do {
            System.out.println("1. Nhap vao so nhan vien.");
            System.out.println("2. Nhap vao so quan tri.");
            System.out.print("Chon:");
            choose = sc.nextInt(); sc.nextLine();
        }while (choose != 1 && choose != 2);
        System.out.print("Nhap: ");
        n = sc.nextInt();
        if(choose == 1) {
            menu(n, true);
        } else if(choose == 2) {
            menu(n, false);
        }
    }

}
