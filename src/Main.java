/*
 * Simulador de una carrera atletíca aplicando el uso de hilos
 * 17-Junio-2022
 *
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Mario García. Modificado por Héctor Corbellini.
 */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new AthleticRaceInterface();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registrar) {
            if (corredor.contadorRegistros() < 5) {
                if (nombre.getText().trim().length() == 0) {
                    JOptionPane.showMessageDialog(null, "Error - no puedes registrar un campo vacio");
                } else {
                    corredor.setName(nombre.getText());
                    corredor.setCorredores();
                    registrados.setText(corredor.getCorredores());
                    nombre.setText("");
                    nombre.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Se llegó al limíte de registros - 5");
            }
        } else if (e.getSource() == iniciar) {
            System.out.println("Validar que esten registrados los 5 corredores");
            if (corredor.contadorRegistros() == 5) {
                System.out.println("Iniciar hilos");
                resultados.setText(corredor.inicarHilo());
            } else {
                JOptionPane.showMessageDialog(null, "Error - Debes de registrar 5 corredores para iniciar. Registros totales: " + corredor.contadorRegistros());
            }
        } else if (e.getSource() == terminar) {
            int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?", "Terminar", JOptionPane.YES_NO_OPTION);
            if (seleccion == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        } else if (e.getSource() == reiniciar) {
            System.out.println("Reiniciar");
            resultados.setText("");
            nombre.setText("");
            registrados.setText("");
            System.out.println("Contador " + corredor.contadorRegistros());
            corredor.borrarRegistros();
            System.out.println("Contador " + corredor.contadorRegistros());
        }
    }
