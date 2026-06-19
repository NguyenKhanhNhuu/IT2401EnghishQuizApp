package com.nguyenkhanhnhu.quizappv1;

import com.nguyenkhanhnhu.utils.MyAlertSingleton;
import com.nguyenkhanhnhu.utils.themes.ThemeTypes;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;

public class PrimaryController implements Initializable {
  @FXML  private ComboBox<ThemeTypes> cbThemes;
   @Override
    public void initialize(URL url, ResourceBundle rb) {
      ThemeTypes.values();
      this.cbThemes.setItems(FXCollections.observableArrayList(ThemeTypes.values()));
      
      
    }
    
    public void manageQuestions (ActionEvent e) {
        MyAlertSingleton.getInstance().showMsg("Coming soon...");
        
    }
    
    public void parctice(ActionEvent e) {
          MyAlertSingleton.getInstance().showMsg("Coming soon...");
        
    }
    
    public void exam(ActionEvent e) {
         MyAlertSingleton.getInstance().showMsg("Coming soon...");
    }

   
            
    
}