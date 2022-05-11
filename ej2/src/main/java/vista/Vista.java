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

public class Vista extends JFrame {

	private JPanel contentPane;
	private JTextField textDNI;
	private JTextField textNomApels;
	private JTable table;
	private JTextField textFieldID;
	private JTextField textNombre;
	private JTextField textHoras;
	private JTextField textAsignadoCientifico;
	private JTextField textAsignadoProyecto;
	private JTextField textFieldTCientificos;
	private JTextField textFieldTProyectos;
	private JTextField textFieldTAsignadoA;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Vista frame = new Vista();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

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
		
		textDNI = new JTextField();
		textDNI.setBounds(66, 17, 239, 19);
		Cientificos.add(textDNI);
		textDNI.setColumns(10);
		
		textNomApels = new JTextField();
		textNomApels.setBounds(66, 40, 239, 19);
		Cientificos.add(textNomApels);
		textNomApels.setColumns(10);
		
		JButton btnGuardarCientificos = new JButton("Guardar");
		btnGuardarCientificos.setBounds(315, 16, 175, 21);
		Cientificos.add(btnGuardarCientificos);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setBounds(315, 39, 175, 21);
		Cientificos.add(btnListar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(315, 70, 85, 21);
		Cientificos.add(btnEditar);
		
		JButton btnOK = new JButton("OK");
		btnOK.setBounds(405, 70, 85, 21);
		Cientificos.add(btnOK);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(315, 101, 175, 21);
		Cientificos.add(btnEliminar);
		
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
		
		textFieldID = new JTextField();
		textFieldID.setColumns(10);
		textFieldID.setBounds(63, 17, 242, 19);
		Cientificos_1.add(textFieldID);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(63, 40, 242, 19);
		Cientificos_1.add(textNombre);
		
		JButton btnGuardarProyecto = new JButton("Guardar");
		btnGuardarProyecto.setBounds(315, 16, 175, 21);
		Cientificos_1.add(btnGuardarProyecto);
		
		JButton btnListarProyecto = new JButton("Listar");
		btnListarProyecto.setBounds(315, 39, 175, 21);
		Cientificos_1.add(btnListarProyecto);
		
		JButton btnEditarProyecto = new JButton("Editar");
		btnEditarProyecto.setBounds(315, 70, 85, 21);
		Cientificos_1.add(btnEditarProyecto);
		
		JButton btnOKProyecto = new JButton("OK");
		btnOKProyecto.setBounds(405, 70, 85, 21);
		Cientificos_1.add(btnOKProyecto);
		
		JButton btnEliminarProyecto = new JButton("Eliminar");
		btnEliminarProyecto.setBounds(315, 101, 175, 21);
		Cientificos_1.add(btnEliminarProyecto);
		
		JLabel lblNewLabel = new JLabel("Horas:");
		lblNewLabel.setBounds(10, 66, 45, 13);
		Cientificos_1.add(lblNewLabel);
		
		textHoras = new JTextField();
		textHoras.setBounds(63, 63, 242, 19);
		Cientificos_1.add(textHoras);
		textHoras.setColumns(10);
		
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
		
		textFieldTAsignadoA = new JTextField();
		textFieldTAsignadoA.setColumns(10);
		textFieldTAsignadoA.setBounds(10, 28, 480, 117);
		PanelTablaCientificos_1_1.add(textFieldTAsignadoA);
		
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
		
		textAsignadoCientifico = new JTextField();
		textAsignadoCientifico.setColumns(10);
		textAsignadoCientifico.setBounds(77, 17, 228, 19);
		Cientificos_2.add(textAsignadoCientifico);
		
		textAsignadoProyecto = new JTextField();
		textAsignadoProyecto.setColumns(10);
		textAsignadoProyecto.setBounds(77, 40, 228, 19);
		Cientificos_2.add(textAsignadoProyecto);
		
		JButton btnGuardarAsignado_A = new JButton("Guardar");
		btnGuardarAsignado_A.setBounds(315, 16, 175, 21);
		Cientificos_2.add(btnGuardarAsignado_A);
		
		JButton btnListarAsignado_A = new JButton("Listar");
		btnListarAsignado_A.setBounds(315, 39, 175, 21);
		Cientificos_2.add(btnListarAsignado_A);
		
		JButton btnEditarAsignado_A = new JButton("Editar");
		btnEditarAsignado_A.setBounds(315, 70, 85, 21);
		Cientificos_2.add(btnEditarAsignado_A);
		
		JButton btnOKAsignado_A = new JButton("OK");
		btnOKAsignado_A.setBounds(405, 70, 85, 21);
		Cientificos_2.add(btnOKAsignado_A);
		
		JButton btnEliminarAsignado_A = new JButton("Eliminar");
		btnEliminarAsignado_A.setBounds(315, 101, 175, 21);
		Cientificos_2.add(btnEliminarAsignado_A);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(919, 537, 85, 21);
		contentPane.add(btnSalir);
		
		JButton btnAbout = new JButton("About");
		btnAbout.setBounds(824, 537, 85, 21);
		contentPane.add(btnAbout);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBounds(0, 521, 1010, 2);
		contentPane.add(separator_1_1);
		
		
	}
}
