
package clasetecnicas;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Ingenieria {
      DecimalFormat df=new DecimalFormat("#.00");
    double promedio, parcial1, parcial2, Examenfinal;

    //programacion,calculo, ingles, algebra 
    public void programacion() {
        parcial1 = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del primer parcial"));
        parcial1 = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del segundo parcial"));
        parcial1 = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del Examen parcial"));
        promedio = (parcial1 + parcial2 + Examenfinal) / 3;

        JOptionPane.showMessageDialog(null, "El promedio es : " + promedio);
    }
     public void calculo() {
        parcial1 = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del primer parcial"));
        parcial1 = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del segundo parcial"));
        parcial1 = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del Examen parcial"));
        promedio = (parcial1 + parcial2 + Examenfinal) / 3;

        JOptionPane.showMessageDialog(null, "El promedio es : " + promedio);
    }

    public void algebra() {
        parcial1 = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del primer parcial"));
        parcial1 = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del segundo parcial"));
        parcial1 = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del Examen parcial"));
        promedio = (parcial1 + parcial2 + Examenfinal) / 3;

        JOptionPane.showMessageDialog(null, "El promedio es : " + promedio);
    }
     public void ingles() {
        parcial1 = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del primer parcial"));
        parcial1 = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del segundo parcial"));
        parcial1 = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del Examen parcial"));
        promedio = (parcial1 + parcial2 + Examenfinal) / 3;

        JOptionPane.showMessageDialog(null, "El promedio es : " + promedio);
    }

    public static void main(String[] args) {
        Ingenieria notas = new Ingenieria();
        int menu;
        do {
            menu =Integer.parseInt(JOptionPane.showInputDialog("Digite el promedio segun corresponda"
                    + "\n 1) Programacion"
                    + "\n 2) Calculo"
                    + "\n 3) Ingles "
                    + "\n 4) Algebra"
                    + "\n 0) Salir"));
            switch (menu) {
                  case 1:
                    notas.programacion();
                    break;
                
                  case 2:
                    notas.calculo();
                    break;
                
                 case 3:
                    notas.ingles();
                    break;
                
                 case 4:
                    notas.algebra();
                    break;
            
          
                        
                        
              }
                      
          }while (menu != 0);
    }
}
