package Quan_Ly__Thi_Sinh.Menu;

import Quan_Ly__Thi_Sinh.Model.Candidates;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    ArrayList<Candidates> students = new ArrayList<>();
    Scanner inputString = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);
    private Candidates candidate;

    public void addStudent() {

        System.out.println("Enter id:");
        int id = inputInt.nextInt();
        System.out.println("Enter full name:");
        String fullName = inputString.nextLine();
        System.out.println("Enter address");
        String address = inputString.nextLine();
        System.out.println("Enter prorityLevel: ");
        String prorityLevel = inputString.nextLine();
        System.out.println("Enter khối thi: ");
        String khoiThi = inputString.nextLine();
        Candidates candidates = new Candidates(id, fullName, address, prorityLevel, khoiThi);
        students.add(candidates);
        System.out.println("Thông tin thí sinh vừa nhập: ");
        System.out.println(candidates);
    }
    public void showAll(){
        System.out.println(students);
    }public void show(){
        System.out.println(students);
    }
    public void findById(){
        System.out.println("Enter ID:");
        int id = inputInt.nextInt();
        for (Candidates student : students) {
            if (student.getId() == id) {
                System.out.println(student);
            }
        }
    }


}






