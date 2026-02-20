import java.util.Random;

abstract public class Character {
    //Default Characteristics:
    public String name = "John Doe";
    public Integer age = 50;
    public Integer height = 60;
    public boolean gender = true;
    public String personalityTypes = "INTJ";
    
    public Integer speed = 3;
    public Integer stamina = 3;
    public Integer attackPower = 3;
    public Integer defensePower = 3;
    public Integer intelligence = 3;

    //Default Constructor
    protected Character(){

    }

    //Contructor using user inputs
    protected Character(boolean gender){
        this.gender = gender;
    }

    //Name arrays for testing. This will be expanded later to include more names.
    private String[] maleNames = {"John","Bob","Joe"};
    private String[] femaleNames = {"Jane", "Sue", "Sara"};

    //Myers-Briggs Types
    private String[] personalities = {
        "INTP","INTJ","INFP","INFJ",
        "ISTP","ISTJ","ISFP","ISFJ",
        "ESTP","ESTJ","ESFP","ESFJ",
        "ENTP","ENTJ","ENFP","ENFJ"
    };

    //Creating the Random object
    private Random r = new Random();

    //Setting a random name
    public void setName(){
        if(gender){
            this.name = maleNames[r.nextInt(3)];
        } else{
            this.name = femaleNames[r.nextInt(3)];
        }
        
    }
    //Abstract classes for age and height. These ranges will vary by character type
    public abstract void setAge();
    public abstract void setHeight();

    //Setting random gender and personality type
    public void setGender(){this.gender = r.nextBoolean();}
    public void setPersonality(){
        this.personalityTypes = personalities[r.nextInt(16)];
    }

    //Setting the gender of the character based on input
    public void setGender(boolean gender){this.gender = gender;}

    //Setting random character abilities
    public void setSpeed(){this.speed = r.nextInt(6);}
    public void setAttack(){this.attackPower = r.nextInt(6);}
    public void setDefense(){this.defensePower = r.nextInt(6);}
    public void setStamina(){this.stamina = r.nextInt(6);}
    public void setIntelligence(){this.intelligence = r.nextInt(6);}
    
    //Setting inputted character abilities
    public void setSpeed(Integer speed){this.speed = speed;}
    public void setAttack(Integer attackPower){this.attackPower = attackPower;}
    public void setDefense(Integer defensePower){this.defensePower = defensePower;}
    public void setStamina(Integer stamina){this.stamina = stamina;}
    public void setIntelligence(Integer intelligence){this.intelligence = intelligence;}

    //Getter functions
    public String getName(){return name;}
    public Integer getAge(){return age;}
    public Integer getHeight(){return height;}
    public boolean getGender(){return gender;}
    public String getGenderAsString(){
        if(gender){return "Male";}
        else{return "Female";}
    }
    public String getPersonality(){return personalityTypes;}

    public Integer getAttack(){return attackPower;}
    public Integer getDefense(){return defensePower;}
    public Integer getSpeed(){return speed;}
    public Integer getStamina(){return stamina;}
    public Integer getIntelligence(){return intelligence;}

    //Create a completely random character, without any user input
    public Character randomize(Character character){
        character.setGender();
        character.setAge();
        character.setHeight();
        character.setName();
        character.setPersonality();

        character.setAttack();
        character.setDefense();
        character.setSpeed();
        character.setStamina();
        character.setIntelligence();

        return character;
    }

    //create a random character, with user input
    public Character randomize(Character character, boolean gender){
        character.setGender(gender);
        character.setAge();
        character.setHeight();
        character.setName();
        character.setPersonality();

        character.setAttack();
        character.setDefense();
        character.setSpeed();
        character.setStamina();
        character.setIntelligence();

        return character;
    }

}
