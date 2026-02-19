import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application{

    //Module 6 - GUI
    @Override 
    public void start(Stage primaryStage) {
        VBox vBox = new VBox(15); 
        vBox.setPadding(new Insets(15, 15, 15, 15));

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

        vBox.getChildren().add(paneForRadioButtons1);

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

        Button btnGenerate = new Button("Generate");

        vBox.getChildren().add(paneForRadioButtons2);
        vBox.getChildren().add(btnGenerate);

        Text nameText = new Text("Name:");
        Text genderText = new Text("Gender:");
        Text heightText = new Text("Height:");
        Text ageText = new Text("Age:");
        Text personalityText = new Text("Personality Type:");

        Text attackText = new Text("Attack Power:");
        Text defenseText = new Text("Defense:");
        Text speedText = new Text("Speed:");
        Text staminaText = new Text("Stamina:");
        Text intelligenceText = new Text("Intelligence:");

        VBox traits = new VBox(15);

        traits.getChildren().add(nameText);
        traits.getChildren().add(genderText);
        traits.getChildren().add(heightText);
        traits.getChildren().add(ageText);
        traits.getChildren().add(personalityText);

        VBox stats = new VBox(15);
        Button btnStats = new Button("Re-generate Stats");

        stats.getChildren().add(attackText);
        stats.getChildren().add(defenseText);
        stats.getChildren().add(speedText);
        stats.getChildren().add(staminaText);
        stats.getChildren().add(intelligenceText);
        stats.getChildren().add(btnStats);

        HBox results = new HBox(20);
        results.getChildren().addAll(traits,stats);

        vBox.getChildren().add(results);

        Scene scene = new Scene(vBox);
        primaryStage.setScene(scene); 
        primaryStage.show();
    }    
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
