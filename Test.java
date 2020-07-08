/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personinterface;

/**
 *
 * @author Ashad Nadeem
 */
public class Test {
    public static void main(String [] args){
        //ceate obj instance of person class
        person p1 = new person(100,200,"Ashad","Nadeem");
        
        //You can assign the object instance to PersonInterface
        PersonInterface pi1 = p1;
        
        //Dsiplay data from p1 & pi1
        System.out.println("p1.getName() = " + p1.getName() + " , " +"pi1.computeTotalWealth() = " + pi1.computeTotalWealth() );
        
        //check of object instance that is reffered by p1 and pi1 is same?
        boolean check1 = p1 == pi1 ;
        System.out.println("Are both p1 & pi1 pointing to same objects?" + check1);
        
        //below will give error
        //System.out.println(pi1.measureIntelligence(p1.getName()));
        
        //You can assign the object instance to AnotherInterfaceExample
        AnotherInterfaceExample Aie1 = p1;
        boolean check2 = p1 == Aie1 ;
        System.out.println("Are both p1 & Aie1 pointing to same objects?" + check2);
        System.out.println(Aie1.measureIntelligence("Ashad"));
        System.out.println(Aie1.measureIntelligence("smart"));
    }
}
