import java.awt.List;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Bilateral;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

//VS4E -- DO NOT REMOVE THIS LINE!
public class mainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField jTextField0;
	private JLabel jLabel0;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JTextField jTextField1;
	private JTextField jTextField2;
	private JTextField jTextField3;
	private JButton jButton0;
	public mainFrame() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJTextField0(), new Constraints(new Leading(181, 82, 10, 10), new Leading(17, 12, 12)));
		add(getJLabel0(), new Constraints(new Leading(122, 10, 10), new Leading(19, 12, 12)));
		add(getJLabel1(), new Constraints(new Leading(122, 12, 12), new Leading(51, 12, 12)));
		add(getJLabel2(), new Constraints(new Leading(122, 12, 12), new Leading(83, 12, 12)));
		add(getJLabel3(), new Constraints(new Leading(121, 12, 12), new Leading(116, 10, 10)));
		add(getJTextField1(), new Constraints(new Leading(181, 82, 12, 12), new Leading(49, 12, 12)));
		add(getJTextField2(), new Constraints(new Leading(181, 82, 12, 12), new Leading(79, 12, 12)));
		add(getJTextField3(), new Constraints(new Leading(181, 82, 12, 12), new Leading(113, 12, 12)));
		add(getJComboBox0(), new Constraints(new Leading(16, 10, 10), new Leading(34, 12, 12)));
		add(getJScrollPane0(), new Constraints(new Bilateral(300, 12, 22), new Leading(40, 129, 10, 10)));
		add(getJLabel4(), new Constraints(new Leading(303, 10, 10), new Leading(17, 12, 12)));
		add(getJButton0(), new Constraints(new Leading(114, 10, 10), new Leading(170, 10, 10)));
		add(getJButton1(), new Constraints(new Leading(186, 12, 12), new Leading(170, 12, 12)));
		setSize(639, 269);
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("清零");
			jButton1.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jButton1MouseMouseClicked(event);
				}
			});
		}
		return jButton1;
	}

	private JScrollPane getJScrollPane0() {
		if (jScrollPane0 == null) {
			jScrollPane0 = new JScrollPane();
			jScrollPane0.setViewportView(getJTextArea0());
		}
		return jScrollPane0;
	}

	private JTextArea getJTextArea0() {
		if (jTextArea0 == null) {
			jTextArea0 = new JTextArea();
		}
		return jTextArea0;
	}

	private JLabel getJLabel4() {
		if (jLabel4 == null) {
			jLabel4 = new JLabel();
			jLabel4.setText("投资记录：");
		}
		return jLabel4;
	}

	private JComboBox getJComboBox0() {
		if (jComboBox0 == null) {
			jComboBox0 = new JComboBox();
			jComboBox0.setModel(new DefaultComboBoxModel(new Object[] { "复利计算", "单利计算" }));
			jComboBox0.setDoubleBuffered(false);
			jComboBox0.setBorder(null);
		}
		return jComboBox0;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setText("确定");
			jButton0.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jButton0MouseMouseClicked(event);
				}
			});
		}
		return jButton0;
	}

	private JTextField getJTextField3() {
		if (jTextField3 == null) {
			jTextField3 = new JTextField();
		}
		return jTextField3;
	}

	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField();
		}
		return jTextField2;
	}

	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
		}
		return jTextField1;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("终值：");
		}
		return jLabel3;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("时间：");
		}
		return jLabel2;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("利率：");
		}
		return jLabel1;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("本金：");
		}
		return jLabel0;
	}

	private JTextField getJTextField0() {
		if (jTextField0 == null) {
			jTextField0 = new JTextField();
		}
		return jTextField0;
	}

	private static void installLnF() {
		try {
			String lnfClassname = PREFERRED_LOOK_AND_FEEL;
			if (lnfClassname == null)
				lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(lnfClassname);
		} catch (Exception e) {
			System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL + " on this platform:" + e.getMessage());
		}
	}

	/**
	* Main entry of the class.
	* Note: This class is only created so that you can easily preview the result at runtime.
	* It is not expected to be managed by the designer.
	* You can modify it as you like.
	*/
	public static void main(String[] args) {
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ButtonGroup group=new ButtonGroup();
				
				mainFrame frame = new mainFrame();
				frame.setDefaultCloseOperation(mainFrame.EXIT_ON_CLOSE);
				frame.setTitle("复利计算");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
		
	}
    public String getbackpath()
	    {	       
	        String path = jTextField0.getText();
	        return  path;
	    }
    public String getbackinvest()
    {	       
        String invest = jTextField1.getText();
        return  invest;
    }
    public String getbacktime()
    {	       
        String time = jTextField1.getText();
        return  time;
    }
    Fuli f =new Fuli();
    Danli d =new Danli();
	private JComboBox jComboBox0;
	private JLabel jLabel4;
	private JTextArea jTextArea0;
	private JScrollPane jScrollPane0;

	private JButton jButton1;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	@SuppressWarnings("null")
	private void jButton0MouseMouseClicked(MouseEvent event) {
		
		String p =this.jTextField0.getText();
		String i =this.jTextField1.getText();
		String year =this.jTextField2.getText();
		String sum =this.jTextField3.getText();
	//	String list[] = null;
		int n=0;
		if(this.jComboBox0.getSelectedItem()=="复利计算"){
			if(this.jTextField0.getText().equals("")||this.jTextField1.getText().equals("")||this.jTextField2.getText().equals(""))
			{
				this.jTextField0.setText("请输入大于0的数");
				this.jTextField1.setText("请输入大于0的数");
				this.jTextField2.setText("请输入大于0的数");
			}
			else{
			
				f.calculate(p, i, year);
				this.jTextField3.setText(f.sum);
				
				jTextArea0.setText("本金\t利率\t时间\t终值\n");
				jTextArea0.append(p+"\t"+i+"\t"+year+"\t"+f.sum);
	//			list[n+1]=jTextArea0.getText();
				this.jTextField0.setText(null);
				this.jTextField1.setText(null);
				this.jTextField2.setText(null);
				this.jTextField3.setText(null);
		}
		}
		if(this.jComboBox0.getSelectedItem()=="单利计算"){
			
			if(this.jTextField0.getText().equals("")||this.jTextField1.getText().equals("")||this.jTextField2.getText().equals(""))
			{
				this.jTextField0.setText("请输入大于0的数");
				this.jTextField1.setText("请输入大于0的数");
				this.jTextField2.setText("请输入大于0的数");
			}
			d.calculate(p, i, year);
			this.jTextField3.setText(d.sum);
			jTextArea0.setText("本金\t利率\t时间\t终值\n");
			jTextArea0.append(p+"\t"+i+"\t"+year+"\t"+d.sum);
//			list[n+1]=jTextArea0.getText();
			this.jTextField0.setText(null);
			this.jTextField1.setText(null);
			this.jTextField2.setText(null);
			this.jTextField3.setText(null);
		}
		


	}

	private void jButton1MouseMouseClicked(MouseEvent event) {
		this.jTextField0.setText(null);
		this.jTextField1.setText(null);
		this.jTextField2.setText(null);
		this.jTextField3.setText(null);
	}


}
