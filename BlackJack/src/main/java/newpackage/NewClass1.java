/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author Mohamed
 */
public class  NewClass1  {

    public static int globalId;
    public int localId;
    protected String name;
static String address;

    public NewClass1(String name, String address) {

        this.name = name;
        this.address = address;
        getName();
     NewClass1.getAddress() ;
    }

    public   String getName() {
        return name;
        
    }

  private final static String getAddress() {
        return address;
    }
}
