package HealthChart;

import java.net.URL;
import java.util.ResourceBundle;

import com.sun.javafx.collections.SetListenerHelper;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class healthChartController implements Initializable {

	   @FXML private Button healthLog;	//기록버튼
	   @FXML private NumberAxis weight;
	   @FXML private AreaChart<String, Number> areachart;
	   
	   @Override
	   public void initialize(URL location, ResourceBundle resources) {
		   healthLog.setOnAction(e->btnhealthlog(e));
		   
		   
	   }
	   
	   public void btnhealthlog(ActionEvent event) {
	      try {
	    	 //끌어오는 주소는 페이지를 전환할 fxml명
	    	 //fxml마다 컨트롤러를 주니 한 컨트롤러에서 여러 fxml을 잡지는 말자
	         Parent foodPicker = FXMLLoader.load(getClass().getResource("healthList.fxml"));
	         Scene scene = new Scene(foodPicker);
	         Stage primaryStage= (Stage)healthLog.getScene().getWindow();
	         primaryStage.setScene(scene);
	      } catch (Exception e) {}
	   }
}
