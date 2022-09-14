import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class panel2 extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public panel2() {
		
		JLabel lblNewLabel = new JLabel("Nodo Actual:");
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEditable(false);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("PR");
		add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Top PR:");
		add(lblNewLabel_2);
		
		textField_2 = new JTextField("Google");
		textField_2.setEditable(false);
		add(textField_2);
		textField_2.setColumns(10);
		
	}
	
	public void  setTxt1(String a) {
		this.textField.setText(a);
	}
	
	public void  setTxt2(String b) {
		this.textField_1.setText(b);
	}
	
	public void  setTxt3(String c) {
		this.textField_2.setText(c);
	}
	

	

}
