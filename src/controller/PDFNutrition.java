package controller;

/*** Class used to manage a PDF file for Code of Nutrition Ethics. ***/

import java.awt.Desktop;
import java.io.File;

import javax.swing.JOptionPane;

/**
*
* @authors: Gabriel Franco e Daniela Gomes
*/

public class PDFNutrition {
	
	public PDFNutrition() {
		
		/*** A file object is created with the Tutorial for Bio-Oracle in PDF ***/
		File pdf = new File ("arquivos" + File.separator + "cod_nutricao.pdf");
		
		/*** Trying to open the file ***/
        try {  
        	
          Desktop.getDesktop().open(pdf);  
          
        } catch(Exception ex) {  
        	
          ex.printStackTrace();  
          /*** If it fails an error message is shown ***/
          JOptionPane.showMessageDialog(null, "Erro no Desktop: " + ex);  
          
        }  
	}
}
