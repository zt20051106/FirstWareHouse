package Bridge;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Account account=new PersonalCreditCardAccount();
			AbstructAccount abstructAccount=new RMBaccount();
			account.getAccount();
			abstructAccount.setAccount(account);
			String nameString=abstructAccount.getname();
			show(nameString);
	}
	public static void show(String name) {
		JFrame jframe=new JFrame();
		Container container=jframe.getContentPane();
		JPanel panel =new JPanel();
		JLabel label=new JLabel(new ImageIcon("D:\\Java\\design mode\\src\\Builder\\666.jpg"));//填入地址
		panel.setLayout(new GridLayout(1,1));
		panel.setBorder(BorderFactory.createTitledBorder("银行账户选择"));
		panel.add(label);
		container.add(panel,BorderLayout.CENTER);
		jframe.pack();
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
