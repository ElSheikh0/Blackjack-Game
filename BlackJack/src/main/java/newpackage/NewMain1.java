/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newpackage;

/**
 *
 * @author Mohamed
 */
class person {

   

}

class student extends person {
int v=10;
   
public void a(int v){
    v+=1;
    
    System.out.println(v);
       
}
  
   
    
}

public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      student obj = new student();
        
        obj.a(3);
        
        

    }

}
