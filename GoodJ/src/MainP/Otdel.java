package MainP;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Otdel {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	private void main(boolean arg) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Otdel window = new Otdel();
					window.frame.setVisible(arg);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Otdel() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setTitle("Отделочник");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel label = new JLabel("Общая площадь");

		textField = new JTextField();
		textField.setColumns(10);

		JLabel label_1 = new JLabel("Свободная площадь");

		textField_1 = new JTextField();
		textField_1.setColumns(10);

		JButton button = new JButton("Сохранить");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SaveInFile();
			}
		});

		JButton button_1 = new JButton("В меню");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout
				.createParallelGroup(
						Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(label)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(label_1)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(button))
						.addContainerGap(319, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup().addContainerGap(335, Short.MAX_VALUE)
						.addComponent(button_1).addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(label)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(label_1)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 83, Short.MAX_VALUE).addComponent(button)
						.addGap(24).addComponent(button_1).addContainerGap()));
		frame.getContentPane().setLayout(groupLayout);
	}

	private void SaveInFile() {
		SaveFile sf = new SaveFile();
		sf.GetSaveInFile();
	}

	private void UpdateTextFields() {

		Planir pl = new Planir();
		Formula fl = new Formula(pl);

		textField.setText(String.valueOf(fl.getAllArea()));
		textField_1.setText(String.valueOf(fl.getFreeArea()));

	}

	public void SetVisiable(boolean arg) {
		frame.setVisible(arg);
		UpdateTextFields();
	}
	public void init(boolean arg) {
		main(arg);
	}
}
