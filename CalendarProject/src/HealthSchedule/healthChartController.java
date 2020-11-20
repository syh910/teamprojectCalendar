package HealthSchedule;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class healthChartController implements Initializable {

	   @FXML private Button healthLog;	//��Ϲ�ư
	   @FXML private Button food;	//�Ĵܰ�����ư
	   @FXML private Button chart;	//ü�߰�����ư
	   @FXML private Button HT;		//ȨƮ�����ư
	   @FXML private Button home;	//Ȩ��ư
	   @FXML private NumberAxis weight;
	   @FXML private TextField challenge;	//��ǥü�� �ؽ�Ʈ�ʵ�
	   @FXML private AreaChart<String, Number> areachart;
	   
	   @Override
	   public void initialize(URL location, ResourceBundle resources) {
		   //��ư�׼��߰�
		   healthLog.setOnAction(e->btnhealthlog(e));
		   food.setOnAction(e->btnfood(e));
		   chart.setOnAction(e->btnchart(e));
		   HT.setOnAction(e->btnHT(e));
		   home.setOnAction(e->btnhome(e));
		   
	   }
	   
	   //�ڷΰ���
	   public void btnhealthlog(ActionEvent event) {
	      try {
	    	 //������� �ּҴ� �������� ��ȯ�� fxml��
	    	 //fxml���� ��Ʈ�ѷ��� �ִ� �� ��Ʈ�ѷ����� ���� fxml�� ������ ����
	         Parent Log = FXMLLoader.load(getClass().getResource("healthList.fxml"));
	         Scene scene = new Scene(Log);
	         Stage primaryStage= (Stage)healthLog.getScene().getWindow();
	         primaryStage.setScene(scene);
	      } catch (Exception e) {}
	   }
	   
	   //�Ĵܰ���
	   public void btnfood(ActionEvent event) {
		   try {
		     Parent foodList = FXMLLoader.load(getClass().getResource("todayFood.fxml"));
		     Scene scene = new Scene(foodList);
		     Stage primaryStage= (Stage)food.getScene().getWindow();
		     primaryStage.setScene(scene);
		  } catch (Exception e) {}
	   }
	   
	   public void btnchart(ActionEvent event) {
		   try {
		     Parent healthChart = FXMLLoader.load(getClass().getResource("chart.fxml"));
		     Scene scene = new Scene(healthChart);
		     Stage primaryStage= (Stage)chart.getScene().getWindow();
		     primaryStage.setScene(scene);
		  } catch (Exception e) {}
	   }
	   
	   public void btnHT(ActionEvent event) {
		   try {
		     Parent hometranning = FXMLLoader.load(getClass().getResource("���ϸ�.fxml"));
		     Scene scene = new Scene(hometranning);
		     Stage primaryStage= (Stage)HT.getScene().getWindow();
		     primaryStage.setScene(scene);
		  } catch (Exception e) {}
	   }
	   
	   public void btnhome(ActionEvent event) {
		   try {
		     Parent Home = FXMLLoader.load(getClass().getResource("maintest.fxml"));
		     Scene scene = new Scene(Home);
		     Stage primaryStage= (Stage)home.getScene().getWindow();
		     primaryStage.setScene(scene);
		  } catch (Exception e) {}
	   }
	   
}
