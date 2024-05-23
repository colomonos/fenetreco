
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Fenetre3  {
    private Button bouton3;
       
    public Fenetre3(Button bouton){
        super();
        this.bouton3 = bouton;
       
        HBox f3 = new HBox();
        f3.setStyle("-fx-background-color: #ffe4b5;");

        Text title = new Text("Fenêtre 3 (HBox)");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 32));

        // Le titre à la position (0,0) sur 2 colonnes et 1 ligne.
        f3.add(title, 0, 0, 2, 1);
        
        // Texte à la position (0,1) sur 2 colonnes et 1 ligne.
        f3.add(new Text("Tables de multiplication"), 0, 1, 2, 1);
        
        // Image à la position (1, 3) sur 1 colonnes et 10 lignes.
        
        
        for (int i=0; i<10; i++){
           Text text = new Text(i+" * 5 = " +(i*5));
           this.add(text, 0, i+2);
        }
        
        // Bouton à la position (1, 13)
        f3.add(this.bouton3, 1, 13);
        
   }
}
