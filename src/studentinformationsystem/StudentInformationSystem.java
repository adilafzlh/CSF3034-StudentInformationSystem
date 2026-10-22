/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

public class StudentInformationSystem {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Adila Fazilah Binti Fauzi");
        System.out.println("Student ID: S87249");
        
        double mark1 = 80.5;
        double mark2 = 95.5;
        
        double totalMark = mark1 + mark2;
        
        System.out.println("Total Mark: " + totalMark);
        
        if (totalMark >= 150) {
            System.out.println("Result: Excellent");
        } else if (totalMark >= 120) {
            System.out.println("Result: Good");
        } else {
            System.out.println("Result: Needs Improvement");
        }
    }
    
}
