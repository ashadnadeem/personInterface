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
public class person implements PersonInterface, AnotherInterfaceExample{
    int cashSavings;
    int retirementFund;
    String firstName;
    String lastName;
    //Constructor with arguments
    person(int cashSaving,int retirementFund,String firstName, String lastName){
        this.cashSavings = cashSaving;
        this.retirementFund = retirementFund;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //Compute person's total wealth
    public int computeTotalWealth(){
        int twealth = this.cashSavings + this.retirementFund;
        System.out.println(twealth);
        return twealth ;
    }
    //Get person's name
    public String getName(){
        return this.firstName + " " + this.lastName ;
    }
    public int measureIntelligence(String name){
        if(name.startsWith("smart")){
            return 100;
        }
        else{
            return 50;
        }
    }
}
