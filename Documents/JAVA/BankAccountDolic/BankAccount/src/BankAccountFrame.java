import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BankAccountFrame extends JFrame {
	final int FIELD_WIDTH = 10;
	BankAccount account;
	JLabel amount = new JLabel("Amount:");
	JTextField amountField = new JTextField(FIELD_WIDTH);
	JButton deposit = new JButton("Deposit");
	JButton withdraw = new JButton("Withdraw");
	JLabel balance = new JLabel("Balance");
	

	public BankAccountFrame(BankAccount b) {
		account = b;
		depositListener d = new depositListener();
		deposit.addActionListener(d);
		withdrawListener w = new withdrawListener();
		withdraw.addActionListener(w);
		
		JPanel controlPanel = new JPanel();
		controlPanel.add(amount);
		controlPanel.add(amountField);
		controlPanel.add(deposit);
		controlPanel.add(withdraw);
		controlPanel.add(balance);
		
		add(controlPanel);
		setSize(400,100);

		
	}

	class depositListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String a = amountField.getText();
			double deposit = Double.parseDouble(a);
			double newBalance = account.getBalance() + deposit;
			account.setBalance(newBalance);
			balance.setText("balance=" + account.getBalance());
			
	}
	}

	class withdrawListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String a = amountField.getText();
			double withdraw = Double.parseDouble(a);
			double newBalance = account.getBalance() - withdraw;
			account.setBalance(newBalance);
			balance.setText("balance=" + account.getBalance());


		}
	}
}
