import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application{

    //Module 6 - GUI
    @Override 
    public void start(Stage primaryStage) {
        VBox vBox = new VBox(15); 
        vBox.setPadding(new Insets(15, 15, 15, 15));

        //creating radio buttons for user input
        HBox paneForRadioButtons1 = new HBox(20);
        paneForRadioButtons1.setPadding(new Insets(5, 5, 5, 5)); 

        RadioButton rbHuman = new RadioButton("Human");
        RadioButton rbElf = new RadioButton("Elf");
        RadioButton rbDwarf = new RadioButton("Dwarf");
        paneForRadioButtons1.getChildren().addAll(rbHuman, rbElf, rbDwarf);

        ToggleGroup group1 = new ToggleGroup();
        rbHuman.setToggleGroup(group1);
        rbElf.setToggleGroup(group1);
        rbDwarf.setToggleGroup(group1);

        //second set of user input radio buttons
        HBox paneForRadioButtons2 = new HBox(20);
        paneForRadioButtons2.setPadding(new Insets(5, 5, 5, 5)); 

        RadioButton rbRandom = new RadioButton("Random");
        RadioButton rbMale = new RadioButton("Male");
        RadioButton rbFemale = new RadioButton("Female");
        paneForRadioButtons2.getChildren().addAll(rbRandom, rbMale, rbFemale);

        ToggleGroup group2 = new ToggleGroup();
        rbRandom.setToggleGroup(group2);
        rbMale.setToggleGroup(group2);
        rbFemale.setToggleGroup(group2);

        //set default radio button options
        rbHuman.setSelected(true);
        rbRandom.setSelected(true);

        //add 'generate' button
        Button btnGenerate = new Button("Generate");

        //add radio buttons and generate button to vbox
        vBox.getChildren().addAll(paneForRadioButtons1, paneForRadioButtons2, btnGenerate);

        btnGenerate.setOnAction(e -> {
            //initial character
            Character character = null;
            //character type and character gender are determined by user input
            String characterType = null;
            if(rbDwarf.isSelected()){
                character = new Dwarf();
                characterType = "Dwarf";
                if(rbFemale.isSelected()){
                    character.randomize(character, false);
                } else if(rbMale.isSelected()){
                    character.randomize(character, true);
                } else{
                    character.randomize(character);
                }
            }else if(rbElf.isSelected()){
                character = new Elf();
                characterType = "Elf";
                if(rbFemale.isSelected()){
                    character.randomize(character, false);
                } else if(rbMale.isSelected()){
                    character.randomize(character, true);
                } else{
                    character.randomize(character);
                }
            }else if(rbHuman.isSelected()){
                character = new Human();
                characterType = "Human";
                if(rbFemale.isSelected()){
                    character.randomize(character, false);
                } else if(rbMale.isSelected()){
                    character.randomize(character, true);
                } else{
                    character.randomize(character);
                }
            } 

            //add character traits and stats to the dialog box text
            Text typeText = new Text(characterType);
            typeText.setFont(new Font(20));
            Text nameText = new Text("Name: " + character.getName());
            Text genderText = new Text("Gender: " + character.getGenderAsString());
            Text heightText = new Text("Height: " + character.getHeight());
            Text ageText = new Text("Age: " + character.getAge());
            Text personalityText = new Text("Personality Type: " + character.getPersonality());

            Text attackText = new Text("Attack: " + character.getAttack());
            Text defenseText = new Text("Defense: " + character.getDefense());
            Text speedText = new Text("Speed: " + character.getSpeed());
            Text staminaText = new Text("Stamina: " + character.getStamina());
            Text intelligenceText = new Text("Intelligence: " + character.getIntelligence());

            //add text to the dialog box
            VBox traits = new VBox(15);
            traits.getChildren().addAll(typeText, nameText, genderText, heightText, ageText,personalityText);
            VBox stats = new VBox(15);

            //button to regenerate just the character stats
            Button btnStats = new Button("Regenerate Stats");

            //add character stats to the dialog box
            stats.getChildren().addAll(attackText, defenseText, speedText, staminaText, intelligenceText, btnStats);

            //add both the traits box and the stats box to the dialog
            HBox results = new HBox(20);
            results.setPadding(new Insets(15, 15, 15, 15));
            results.getChildren().addAll(traits,stats);

            btnStats.setOnAction(f -> {
                //another character object is created for this button
                Character characterStats = new Human();

                //new stats are generated
                characterStats.setAttack();
                characterStats.setDefense();
                characterStats.setSpeed();
                characterStats.setStamina();
                characterStats.setIntelligence();

                attackText.setText("Attack: " + characterStats.getAttack().toString());
                defenseText.setText("Defense: " + characterStats.getDefense().toString());
                speedText.setText("Speed: " + characterStats.getSpeed().toString());
                staminaText.setText("Stamina:" + characterStats.getStamina().toString());
                intelligenceText.setText("Intelligence: " + characterStats.getIntelligence().toString());
                
            });

            //create the dialog box
            Scene scene2 = new Scene(results);
            Stage secondStage = new Stage();
            secondStage.setScene(scene2);
            secondStage.show();

            //close the dialog box and return the user inputs to the defaults
            Button btnClear = new Button("Clear");
            btnClear.setOnAction(g -> {
                secondStage.close();
                rbHuman.setSelected(true);
                rbRandom.setSelected(true);
            });

            //add the 'clear' button
            traits.getChildren().add(btnClear);

        });

        //creating the scene
        Scene scene = new Scene(vBox);
        primaryStage.setScene(scene); 
        primaryStage.show();
    }    
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
