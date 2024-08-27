package jcd.registrarpersonas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VentanaRegistro extends JFrame implements ActionListener{

    ModeloDatos miModelo;
	
    private JLabel LabelDireccion;
    private JButton btonAceptar,btnConsultar,btnConsultarIndividual,btnBorrar;
    private JButton btonCancelar;
    private JTextField campoTelefono;
    private JTextField campoDireccion;
    private JTextField campoDocumento;
    private javax.swing.JTextField campoEdad;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoProfesion;
    private javax.swing.JLabel tituloRegistro;
    private javax.swing.JLabel labelDocumento;
    private javax.swing.JLabel labelEdad;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelProfesion;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTexto;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JSeparator separadorInferior;
    private javax.swing.JSeparator separadorSuperior;
	
	
    /**
     * Creates new form VentanaRegistro
     */
    public VentanaRegistro() {
        initComponents();
        setSize(705,330);
        setResizable(false);
        setLocationRelativeTo(null);
        miModelo=new ModeloDatos();
    }

     private void initComponents() {

        panelRegistro = new javax.swing.JPanel();
        tituloRegistro = new javax.swing.JLabel();
        labelProfesion = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        labelTexto = new javax.swing.JLabel();
        labelDocumento = new javax.swing.JLabel();
        labelEdad = new javax.swing.JLabel();
        LabelDireccion = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        separadorInferior = new javax.swing.JSeparator();
        campoNombre = new javax.swing.JTextField();
        campoDireccion = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoProfesion = new javax.swing.JTextField();
        campoDocumento = new javax.swing.JTextField();
        campoEdad = new javax.swing.JTextField();
        separadorSuperior = new javax.swing.JSeparator();
        btonCancelar = new javax.swing.JButton();
        btonAceptar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnConsultarIndividual = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
       // getContentPane().setLayout(null);

        panelRegistro.setBackground(new java.awt.Color(204, 204, 2));
        panelRegistro.setLayout(null);

        tituloRegistro.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        tituloRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloRegistro.setText("Registro de Usuario");
        tituloRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelRegistro.add(tituloRegistro);
        tituloRegistro.setBounds(20, 10, 660, 60);

        labelProfesion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelProfesion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelProfesion.setText("Profesi�n:");
        panelRegistro.add(labelProfesion);
        labelProfesion.setBounds(0, 170, 90, 20);

        labelTelefono.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelTelefono.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTelefono.setText("Telefono:");
        panelRegistro.add(labelTelefono);
        labelTelefono.setBounds(400, 200, 100, 20);

        labelTexto.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        labelTexto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTexto.setText("Diligencie el Formulario para registrar el Usuario en el Sistema");
        panelRegistro.add(labelTexto);
        labelTexto.setBounds(0, 90, 510, 20);

        labelDocumento.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelDocumento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelDocumento.setText("* Documento:");
        panelRegistro.add(labelDocumento);
        labelDocumento.setBounds(400, 140, 100, 20);

        labelEdad.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelEdad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelEdad.setText("Edad:");
        panelRegistro.add(labelEdad);
        labelEdad.setBounds(400, 170, 100, 20);

        LabelDireccion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        LabelDireccion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelDireccion.setText("Direcci�n:");
        panelRegistro.add(LabelDireccion);
        LabelDireccion.setBounds(0, 200, 90, 20);

        labelNombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelNombre.setText("* Nombre:");
        
        panelRegistro.add(labelNombre);
        labelNombre.setBounds(0, 140, 90, 20);
        panelRegistro.add(separadorInferior);
        separadorInferior.setBounds(20, 240, 660, 10);
        panelRegistro.add(campoNombre);
        campoNombre.setBounds(100, 140, 300, 20);
        panelRegistro.add(campoDireccion);
        campoDireccion.setBounds(100, 200, 300, 20);
        panelRegistro.add(campoTelefono);
        campoTelefono.setBounds(510, 200, 170, 20);
        panelRegistro.add(campoProfesion);
        campoProfesion.setBounds(100, 170, 300, 20);
        panelRegistro.add(campoDocumento);
        campoDocumento.setBounds(510, 140, 170, 20);
        panelRegistro.add(campoEdad);
        campoEdad.setBounds(510, 170, 170, 20);
        panelRegistro.add(separadorSuperior);
        separadorSuperior.setBounds(20, 120, 660, 10);

        btonCancelar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btonCancelar.setText("Cancelar");
        panelRegistro.add(btonCancelar);
        btonCancelar.setBounds(570, 260, 110, 30);
        btonCancelar.addActionListener(this);

        btonAceptar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btonAceptar.setText("Registrar");
        panelRegistro.add(btonAceptar);
        btonAceptar.setBounds(450, 260, 110, 30);
        btonAceptar.addActionListener(this);
        
        btnConsultar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        panelRegistro.add(btnConsultar);
        btnConsultar.setBounds(330, 260, 110, 30);
        btnConsultar.addActionListener(this);
        
        btnConsultarIndividual.setFont(new java.awt.Font("Verdana", 0, 14));
        btnConsultarIndividual.setText("Consultar individuo");
        panelRegistro.add(btnConsultarIndividual);
        btnConsultarIndividual.setBounds(130, 260, 190, 30);
        btnConsultarIndividual.addActionListener(this);
        
        btnBorrar.setFont(new java.awt.Font("Verdana", 0, 14));
        btnBorrar.setText("Eliminar");
        panelRegistro.add(btnBorrar);
        btnBorrar.setBounds(10, 260, 110, 30);
        btnBorrar.addActionListener(this);

        getContentPane().add(panelRegistro);
        panelRegistro.setBounds(0, 0, 690, 300);

    }

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btonAceptar) {
			registrar();
		}else if(e.getSource()==btonCancelar){
			limpiar();
		}else if(e.getSource()==btnConsultar){
			miModelo.consultarPersonas();
		}else if(e.getSource()==btnConsultarIndividual) {
                        miModelo.consultarPersonaIndividual(campoDocumento.getText());
                }else if(e.getSource()==btnBorrar) {
                        miModelo.eliminarPersona(campoDocumento.getText());
                }
	}

	private void registrar() {
		Persona miP=new Persona();
                if (campoNombre.getText().length() > 0) {
                    miP.setNombre(campoNombre.getText());
                } else {
                    JOptionPane.showMessageDialog(null, "Se debe ingresar un nombre", "Dato invalido", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                if (campoDocumento.getText().length() > 0) {
                    miP.setDocumento(campoDocumento.getText());
                } else {
                    JOptionPane.showMessageDialog(null, "Se debe ingresar el documento", "Dato invalido", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                if (campoDireccion.getText().length() > 0) {
                    miP.setDireccion(campoDireccion.getText());
                } else {
                    JOptionPane.showMessageDialog(null, "Se debe ingresar la dirección", "Dato invalido", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                try {
                    if (Integer.parseInt(campoEdad.getText()) >= 0)
                        miP.setEdad(Integer.parseInt(campoEdad.getText()));
                    else {
                        JOptionPane.showMessageDialog(null, "La edad debe ser un número positivo", "Dato invalido", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                } catch(Exception e) {
                    JOptionPane.showMessageDialog(null, "La edad debe ser un número", "Dato invalido", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                if (campoDireccion.getText().length() > 0) {
                    miP.setProfesion(campoProfesion.getText());
                } else {
                    JOptionPane.showMessageDialog(null, "Se debe ingresar el trabajo", "Dato invalido", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                if (campoDireccion.getText().length() > 0) {
                    miP.setTelefono(campoTelefono.getText());
                } else {
                    JOptionPane.showMessageDialog(null, "Se debe ingresar el telefono", "Dato invalido", JOptionPane.ERROR_MESSAGE);
                    return;
                }
		
		miModelo.registrarPersona(miP);
	}

	private void limpiar() {
		campoNombre.setText("");
		campoDocumento.setText("");
		campoDireccion.setText("");
	}

	
}