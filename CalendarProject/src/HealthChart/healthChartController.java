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

	   @FXML private Button healthLog;	//��Ϲ�ư
	   @FXML private NumberAxis weight;
	   @FXML private AreaChart<String, Number> areachart;
	   
	   @Override
	   public void initialize(URL location, ResourceBundle resources) {
		   healthLog.setOnAction(e->btnhealthlog(e));
		   
		   
	   }
	   
	   public void btnhealthlog(ActionEvent event) {
	      try {
	    	 //������� �ּҴ� �������� ��ȯ�� fxml��
	    	 //fxml���� ��Ʈ�ѷ��� �ִ� �� ��Ʈ�ѷ����� ���� fxml�� ������ ����
	         Parent foodPicker = FXMLLoader.load(getClass().getResource("healthList.fxml"));
	         Scene scene = new Scene(foodPicker);
	         Stage primaryStage= (Stage)healthLog.getScene().getWindow();
	         primaryStage.setScene(scene);
	      } catch (Exception e) {}
	   }
}
