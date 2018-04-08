package MainP;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Planir {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel label_1;
	private JLabel label_2;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(boolean i) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Planir window = new Planir();
					window.frame.setVisible(i);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Planir() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setTitle("Планировщик");
		frame.setBounds(100, 100, 480, 313);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel label = new JLabel("Введите площадь всей комнаты");

		textField = new JTextField();
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Параметры объекта");

		textField_1 = new JTextField();
		textField_1.setColumns(10);

		label_1 = new JLabel("Ширина");
		label_2 = new JLabel("Длина");

		textField_2 = new JTextField();
		textField_2.setColumns(10);

		Formula fl = new Formula(this);

		JButton button = new JButton("Добавить объект");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JButton button_1 = new JButton("Расчёт свободной площади");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fl.getFormula(gettextField(), gettextField_1(), gettextField_2());
			}
		});

		JButton button_2 = new JButton("В меню");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});

		textField_3 = new JTextField();
		textField_3.setColumns(10);

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel).addComponent(label_1).addComponent(label_2)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(button)
								.addGroup(groupLayout.createSequentialGroup().addComponent(button_1).addGap(18)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
										.addComponent(button_2))
								.addComponent(label, GroupLayout.PREFERRED_SIZE, 434, GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addComponent(label)
				.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGap(18).addComponent(lblNewLabel).addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(label_1).addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(label_2)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGap(18).addComponent(button).addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(button_1)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addContainerGap(30, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(button_2).addContainerGap()))));
		
		frame.getContentPane().setLayout(groupLayout);
	}

	public String gettextField() {
		return textField.getText();
	}

	public String gettextField_1() {
		return textField_1.getText();
	}

	public String gettextField_2() {
		return textField_2.getText();
	}

	public JFrame frame() {
		return frame;
	}

	public void settextField_3(String arg) {
		textField_3.setText(arg);
	}

	public void setVisiable(boolean arg) {
		frame.setVisible(arg);
	}
}
