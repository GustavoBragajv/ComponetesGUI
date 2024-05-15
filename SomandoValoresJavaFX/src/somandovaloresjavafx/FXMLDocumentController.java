/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package somandovaloresjavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author hbraga
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button btnClick;

    @FXML
    private Label lblResultado;

    @FXML
    private TextField txtValor1;

    @FXML
    private TextField txtValor2;
    
    @FXML
    private void clicouBotao(ActionEvent event) {
        int valor1 = Integer.parseInt(txtValor1.getText());
        int valor2 = Integer.parseInt(txtValor2.getText());
        int resultado = valor1 + valor2;
        lblResultado.setText("A soma entre " + valor1 + " e " + valor2 + 
                " é igual a " + String.valueOf(resultado));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
