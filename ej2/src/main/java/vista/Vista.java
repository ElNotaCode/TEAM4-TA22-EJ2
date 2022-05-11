package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista extends JFrame {

	public static JPanel contentPane;
	public JTextField textDNI = new JTextField();
	public  JTextField textNomApels = new JTextField();

	public  JTable table;
	public  JTextField textFieldID = new JTextField();
	public  JTextField textNombre = new JTextField();
	public  JTextField textHoras = new JTextField();
	public  JTextField 	textAsignadoCientifico = new JTextField();

	public  JTextField textAsignadoProyecto = new JTextField();
	public  JTextField textFieldTCientificos;
	public  JTextField textFieldTProyectos;
	public  JTextField textFieldTAsignadoA;
	public  JButton btnGuardarCientificos = new JButton("Guardar");
	public 	JButton btnGuardarProyecto = new JButton("Guardar");
	public 	JButton btnGuardarAsignado_A = new JButton("Guardar");

	public JButton btnEliminar = new JButton("Eliminar");
	public JButton btnEliminarProyecto = new JButton("Eliminar");

	public JButton btnEditarProyecto = new JButton("Editar");
	public JButton btnEditarAsignado_A = new JButton("Editar");
	public JButton btnEditar = new JButton("Editar");

	
	public JButton btnSalir = new JButton("Salir");
	public JButton btnAbout = new JButton("About");
	public JTextField textCientificosEditarEliminar = new JTextField();

	public JTextField textProyectoEditarEliminar = new JTextField();

	public JTextField textAsignadoEditarEliminar = new JTextField();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
		});
	}

	/**
	 * Create the frame.
	 */
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 595);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Cientificos = new JPanel();
		Cientificos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "CIENTIFICOS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		Cientificos.setBounds(508, 10, 500, 147);
		contentPane.add(Cientificos);
		Cientificos.setLayout(null);
		
		JLabel lblDNI = new JLabel("DNI:");
		lblDNI.setBounds(10, 20, 57, 13);
		Cientificos.add(lblDNI);
		
		JLabel lblNomApels = new JLabel("NomApels:");
		lblNomApels.setBounds(10, 43, 57, 13);
		Cientificos.add(lblNomApels);
		
	
		textDNI.setBounds(66, 17, 239, 19);
		Cientificos.add(textDNI);
		textDNI.setColumns(10);
		
		textNomApels.setBounds(66, 40, 239, 19);
		Cientificos.add(textNomApels);
		textNomApels.setColumns(10);
		
		
		btnGuardarCientificos.setBounds(315, 16, 175, 21);
		Cientificos.add(btnGuardarCientificos);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setBounds(315, 39, 175, 21);
		Cientificos.add(btnListar);
		
		btnEditar.setBounds(315, 101, 85, 21);
		Cientificos.add(btnEditar);
		
	
		btnEliminar.setBounds(410, 101, 80, 21);
		Cientificos.add(btnEliminar);
		
		textCientificosEditarEliminar.setBounds(66, 102, 239, 19);
		Cientificos.add(textCientificosEditarEliminar);
		textCientificosEditarEliminar.setColumns(10);
		
		JLabel lblEliminarDNI = new JLabel("DNI");
		lblEliminarDNI.setBounds(10, 105, 45, 13);
		Cientificos.add(lblEliminarDNI);
		
		JPanel PanelTablaCientificos = new JPanel();
		PanelTablaCientificos.setBorder(new TitledBorder(null, "TABLA CIENTIFICOS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		PanelTablaCientificos.setBounds(10, 10, 500, 147);
		contentPane.add(PanelTablaCientificos);
		PanelTablaCientificos.setLayout(null);
		
		textFieldTCientificos = new JTextField();
		textFieldTCientificos.setBounds(10, 20, 480, 117);
		PanelTablaCientificos.add(textFieldTCientificos);
		textFieldTCientificos.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(0, 167, 1010, 2);
		contentPane.add(separator);
		
		JPanel Cientificos_1 = new JPanel();
		Cientificos_1.setLayout(null);
		Cientificos_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "PROYECTO", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		Cientificos_1.setBounds(508, 179, 500, 155);
		contentPane.add(Cientificos_1);
		
		JLabel lblID_Proyecto = new JLabel("ID:");
		lblID_Proyecto.setBounds(10, 20, 57, 13);
		Cientificos_1.add(lblID_Proyecto);
		
		JLabel lblNombre_Proyecto = new JLabel("Nombre:");
		lblNombre_Proyecto.setBounds(10, 43, 57, 13);
		Cientificos_1.add(lblNombre_Proyecto);
		

		textFieldID.setColumns(10);
		textFieldID.setBounds(63, 17, 242, 19);
		Cientificos_1.add(textFieldID);
		
		textNombre.setColumns(10);
		textNombre.setBounds(63, 40, 242, 19);
		Cientificos_1.add(textNombre);
		
		btnGuardarProyecto.setBounds(315, 16, 175, 21);
		Cientificos_1.add(btnGuardarProyecto);
		
		JButton btnListarProyecto = new JButton("Listar");
		btnListarProyecto.setBounds(315, 39, 175, 21);
		Cientificos_1.add(btnListarProyecto);
		
	

		btnEditarProyecto.setBounds(315, 101, 90, 21);
		Cientificos_1.add(btnEditarProyecto);
		
		btnEliminarProyecto.setBounds(415, 101, 75, 21);
		Cientificos_1.add(btnEliminarProyecto);
		
		JLabel lblNewLabel = new JLabel("Horas:");
		lblNewLabel.setBounds(10, 66, 45, 13);
		Cientificos_1.add(lblNewLabel);
		
		textHoras.setBounds(63, 63, 242, 19);
		Cientificos_1.add(textHoras);
		textHoras.setColumns(10);
		
		textProyectoEditarEliminar.setColumns(10);
		textProyectoEditarEliminar.setBounds(63, 102, 239, 19);
		Cientificos_1.add(textProyectoEditarEliminar);
		
		JLabel lblIEditarEliminarProyecto = new JLabel("ID");
		lblIEditarEliminarProyecto.setBounds(10, 105, 45, 13);
		Cientificos_1.add(lblIEditarEliminarProyecto);
		
		JPanel PanelTablaCientificos_1 = new JPanel();
		PanelTablaCientificos_1.setLayout(null);
		PanelTablaCientificos_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "TABLA PROYECTOS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		PanelTablaCientificos_1.setBounds(10, 179, 500, 155);
		contentPane.add(PanelTablaCientificos_1);
		
		textFieldTProyectos = new JTextField();
		textFieldTProyectos.setColumns(10);
		textFieldTProyectos.setBounds(10, 28, 480, 117);
		PanelTablaCientificos_1.add(textFieldTProyectos);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(0, 344, 1008, 2);
		contentPane.add(separator_1);
		
		JPanel PanelTablaCientificos_1_1 = new JPanel();
		PanelTablaCientificos_1_1.setLayout(null);
		PanelTablaCientificos_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "TABLA ASIGNADO_A", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		PanelTablaCientificos_1_1.setBounds(10, 356, 500, 155);
		contentPane.add(PanelTablaCientificos_1_1);
	
		
		//textFieldTAsignadoA.setColumns(10);
		//textFieldTAsignadoA.setBounds(10, 28, 480, 117);
		//PanelTablaCientificos_1_1.add(textFieldTAsignadoA);
		
		JPanel Cientificos_2 = new JPanel();
		Cientificos_2.setLayout(null);
		Cientificos_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "ASIGNADO_A", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		Cientificos_2.setBounds(508, 356, 500, 155);
		contentPane.add(Cientificos_2);
		
		JLabel lblCientifico = new JLabel("Cientifico");
		lblCientifico.setBounds(10, 20, 57, 13);
		Cientificos_2.add(lblCientifico);
		
		JLabel lblProyecto = new JLabel("Proyecto");
		lblProyecto.setBounds(10, 43, 57, 13);
		Cientificos_2.add(lblProyecto);
		
		textAsignadoCientifico.setColumns(10);
		textAsignadoCientifico.setBounds(77, 17, 228, 19);
		Cientificos_2.add(textAsignadoCientifico);
		
		
		textAsignadoProyecto.setColumns(10);
		textAsignadoProyecto.setBounds(77, 40, 228, 19);
		Cientificos_2.add(textAsignadoProyecto);
		
		btnGuardarAsignado_A.setBounds(315, 16, 175, 21);
		Cientificos_2.add(btnGuardarAsignado_A);
		
		JButton btnListarAsignado_A = new JButton("Listar");
		btnListarAsignado_A.setBounds(315, 39, 175, 21);
		Cientificos_2.add(btnListarAsignado_A);
		
		btnEditarAsignado_A.setBounds(317, 101, 85, 21);
		Cientificos_2.add(btnEditarAsignado_A);
		
		JButton btnEliminarAsignado_A = new JButton("Eliminar");
		btnEliminarAsignado_A.setBounds(412, 101, 78, 21);
		Cientificos_2.add(btnEliminarAsignado_A);
		
		textAsignadoEditarEliminar = new JTextField();
		textAsignadoEditarEliminar.setColumns(10);
		textAsignadoEditarEliminar.setBounds(77, 102, 228, 19);
		Cientificos_2.add(textAsignadoEditarEliminar);
		
		JLabel lblEditarEliminarAsignadoA = new JLabel("ID");
		lblEditarEliminarAsignadoA.setBounds(10, 105, 45, 13);
		Cientificos_2.add(lblEditarEliminarAsignadoA);
		
	
		btnSalir.setBounds(919, 537, 85, 21);
		contentPane.add(btnSalir);
		
		btnAbout.setBounds(824, 537, 85, 21);
		contentPane.add(btnAbout);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBounds(0, 521, 1010, 2);
		contentPane.add(separator_1_1);
		
		
	}
}
