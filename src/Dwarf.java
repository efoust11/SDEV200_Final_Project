import java.util.Random;

public class Dwarf extends Character {

    //Creating the Random object
    private Random r = new Random();

    public void setAge(){
        //an age between 20 and 100
        this.age = 20 + r.nextInt(80);
    }

    public void setHeight(){
        //a height between 2 and 5 ft
        this.height = 24 + r.nextInt(37);
    }

    //Default constructor
    Dwarf(){

    }

    @Override
    public String toString(){
        String genderString;
        if(gender){
            genderString = "Male";
        }else{
            genderString = "Female";
        }
        return "Dwarf: " +
            "\nName: "+name+
            "\nGender: "+ genderString+ 
            "\nAge: "+age+ " years old" +
            "\nHeight: "+height+ " inches tall" +
            "\nPersonalityType: "+personalityTypes+
            "\nAttackPower: "+attackPower+
            "\nDefensePower: "+defensePower+
            "\nSpeed: "+speed+
            "\nStamina: "+stamina+
            "\nIntelligence: "+intelligence;
    }
    
}
