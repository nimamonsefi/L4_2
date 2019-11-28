/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author nimamonsefi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Student student=new Student();
        System.out.print("Enter Your Code : ");
        student.setCode(scanner.next());
        
        System.out.print("Enter Your Name : ");
        student.setCode(scanner.next());
        
        System.out.print("Enter Your Password : ");
        student.setCode(scanner.next());
        
        for(int i=0;i<5;i++){
            System.out.print("Enter Your marks : ");
            student.setMark(scanner.nextDouble());
        }
    }
    
}
