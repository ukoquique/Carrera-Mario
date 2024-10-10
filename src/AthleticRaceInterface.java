import javax.swing.*;
import java.awt.event.ActionListener;

// CUIDADO dice que esto deberia ser una interface
public class AthleticRaceInterface extends JFrame implements ActionListener {

    // Componentes
    JButton registrar;
    JButton iniciar;
    JButton reiniciar;
    JButton terminar;
    JTextField nombre;
    JTextArea registrados;
    JTextArea resultados;
    JLabel registro;
    JLabel registros;
    JLabel resultado;

    // Llamamos a la clase runner
    private final Runner corredor;

    public AthleticRaceInterface() {

        corredor = new Runner();

        setTitle("Carrera v. 0.0.0");
        setSize(600, 460);
        setResizable(false);
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);

        registro = new JLabel("Registrar Corredor");
        registro.setBounds(10, 10, 330, 30);
        nombre = new JTextField();
        nombre.setBounds(10, 40, 350, 30);
        registrar = new JButton("Registrar");
        registrar.setBounds(370, 40, 200, 30);
        registros = new JLabel("Corredores registrados");
        registros.setBounds(10, 90, 350, 30);
        registrados = new JTextArea();
        registrados.setBounds(10, 130, 560, 100);
        registrados.setEditable(false);
        resultado = new JLabel("Resultados");
        resultado.setBounds(10, 250, 360, 30);
        resultados = new JTextArea();
        resultados.setBounds(10, 290, 380, 110);
        resultados.setEditable(false);
        iniciar = new JButton("Iniciar");
        iniciar.setBounds(400, 290, 160, 30);
        reiniciar = new JButton("Reiniciar");
        reiniciar.setBounds(400, 330, 160, 30);
        terminar = new JButton("Terminar");
        terminar.setBounds(400, 370, 160, 30);

        registrar.addActionListener(this);
        terminar.addActionListener(this);
        iniciar.addActionListener(this);
        reiniciar.addActionListener(this);

        getContentPane().add(registro);
        getContentPane().add(nombre);
        getContentPane().add(registrar);
        getContentPane().add(registros);
        getContentPane().add(registrados);
        getContentPane().add(resultado);
        getContentPane().add(resultados);
        getContentPane().add(iniciar);
        getContentPane().add(reiniciar);
        getContentPane().add(terminar);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}