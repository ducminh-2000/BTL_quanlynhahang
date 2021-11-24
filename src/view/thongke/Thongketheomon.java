package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.KhachhangDAO;
import model.Hoadon;
import model.Monan;
import model.Mondadat;
import model.NguoiDung;
import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.awt.event.ActionEvent;
public class Thongketheomon extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Monan> list;
	private NguoiDung nd;
	private Mondadat mdd;
	
	public Thongketheomon(NguoiDung nd, Mondadat mdd) {
		initComponents();
		this.nd = nd;
		this.mdd = mdd;
	}

	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	public Thongketheomon() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Doanh thu theo m\u00F3n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(140, 47, 210, 20);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ng\u00E0y b\u1EAFt \u0111\u1EA7u :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(52, 98, 100, 20);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ng\u00E0y k\u1EBFt th\u00FAc :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(52, 138, 100, 20);
		getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(165, 99, 104, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(UIManager.getColor("Button.foreground"));
		textField_1.setBackground(UIManager.getColor("Button.light"));
		textField_1.setHorizontalAlignment(SwingConstants.LEADING);
		textField_1.setEnabled(true);
		textField_1.setEditable(true);
		textField_1.setDropMode(DropMode.USE_SELECTION);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setText("");
		textField_1.setBounds(165, 139, 104, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Xem");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fillTable();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(313, 115, 99, 26);
		getContentPane().add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 184, 407, 312);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"T\u00EAn m\u00F3n \u0103n", "S\u1ED1 l\u1EA7n \u0111\u1EB7t", "T\u1ED5ng doanh thu"
			}
		));
		scrollPane.setViewportView(table);
	}
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
			try {
				Thongketheomon frame = new Thongketheomon();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}	
		public void fillTable() {
			DefaultTableModel tbModel = (DefaultTableModel) table.getModel();
			tbModel.setRowCount(0);
			for (Monan ma:list) {
				Object dataRow[] = new Object[3];
				dataRow[0] = ma.getTen();
				dataRow[1] = mdd.getNum();
				dataRow[2] = (mdd.getNum()*ma.getDonGia());
				tbModel.addRow(dataRow); 
	}
	}
}