/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nashprojsem2javafxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author ADMIN
 */
public class FXMLDocumentController implements Initializable {
   // @FXML 
   // private  PieChart pieChart; 
    @FXML 
    private AnchorPane anchorPane;
    
   
     @FXML 
    private TabPane tPane;
    
     
     @FXML 
    private Tab tNigeria;
    
     
      @FXML 
    private Tab tKenya;
    
       @FXML 
    private Tab tRwan;
    
       
        @FXML 
    private Tab tUga;
        
         @FXML 
    private Tab tSa;
    
    
//    @FXML
//    private Label label;
//    
//    @FXML
//    private void handleButtonAction(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");
    //}
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        // TODO
         final PieChart pc = new PieChart(FXCollections.observableArrayList(
            new PieChart.Data("Kenya", 19),
            new PieChart.Data("Nigeria", 23),
            new PieChart.Data("South Africa", 18),
            new PieChart.Data("Rwanda", 23),
            new PieChart.Data("Uganda", 17)
         )
         );
        
                 
        // setup chart
        pc.setId("BasicPie");
      
       pc.setTitle("facebook users in each country");
     //   tPane.getTabs().addAll(tNigeria, tKenya, tRwan, tUga, tSa);
        anchorPane.getChildren().add(pc);
       // tPane.getChildren().add(pz);
       
    }    
    
}

        