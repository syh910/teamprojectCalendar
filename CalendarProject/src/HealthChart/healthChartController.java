package HealthChart;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class healthChartController implements Initializable {

	   @FXML private Button healthLog;	//��Ϲ�ư
	   @FXML private NumberAxis weight;
	   
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
