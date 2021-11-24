package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Hoadon;
import model.Khachhang;
import model.NguoiDung;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Thongketheokhach extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Khachhang> list;
	private NguoiDung nd;
	private Hoadon hd;
	private JTextField textField;
	private JTextField textField_1;
	private JTable tableresult;
	public Thongketheokhach() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Doanh thu theo kh\u00E1ch");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(192, 54, 230, 20);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ng\u00E0y b\u1EAFt \u0111\u1EA7u :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(30, 103, 100, 20);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ng\u00E0y k\u1EBFt th\u00FAc :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(30, 140, 100, 20);
		getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(148, 106, 96, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setBounds(148, 143, 96, 19);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Xem");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fillTable();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(283, 127, 85, 21);
		getContentPane().add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 238, 397, 413);
		getContentPane().add(scrollPane);
		
		tableresult = new JTable();
		tableresult.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"T\u00EAn kh\u00E1ch h\u00E0ng", "S\u1ED1 l\u1EA7n \u0111\u1EB7t", "T\u1ED5ng doanh thu"
			}
		));
		tableresult.setFont(new Font("Tahoma", Font.PLAIN, 14));
		scrollPane.setViewportView(tableresult);
	}

	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Thongketheokhach frame = new Thongketheokhach();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}	
	
	public void fillTable() {
		DefaultTableModel tbModel = (DefaultTableModel) tableresult.getModel();
		tbModel.setRowCount(0);
		for (Khachhang kh:list) {
			Object dataRow[] = new Object[3];
			dataRow[0] = kh.getTen();
			dataRow[1] = kh.getNum();
			dataRow[2] = hd.getTongtien();
			tbModel.addRow(dataRow); 
	}
		}
}
