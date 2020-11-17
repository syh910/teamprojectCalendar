package HealthChart;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class healthListController implements Initializable {
 
	   @FXML private Button goBack;	//뒤로가기버튼
	   
	   @Override
	   public void initialize(URL location, ResourceBundle resources) {
		   goBack.setOnAction(e->btngoBack(e));
 
	   }
  
	   public void btngoBack(ActionEvent event) {   
		   try {
		      Parent foodPicker = FXMLLoader.load(getClass().getResource("chart.fxml"));
		      Scene scene = new Scene(foodPicker);
		      Stage primaryStage= (Stage)goBack.getScene().getWindow();
		      primaryStage.setScene(scene);
		   } catch (Exception e) {}
	   }
}
