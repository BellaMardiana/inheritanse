/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_praktikum;

/**
 *
 * @author user
 */
public class Turunan extends Induk{
    public void test(String z){
        System.out.println("Method overload didalam kelas turunan");
        System.out.println("Z:\""+z+"\"");
    }
    public void test(){
         System.out.println("Method override didalam kelas turunan");
    }
    
}
