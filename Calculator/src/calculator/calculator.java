package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JPanel;

public class calculator {

	private JFrame frame;
	private JTextField textField;
	String symbol;//符号判断
	boolean isResult=true;//是否按下功能键
	String first_num="";//前一个数
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 372, 518);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		textField = new JTextField();
		textField.setText("0");
		textField.setFont(new Font("宋体", Font.PLAIN, 33));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(35, 27, 284, 67);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setEditable(false);
		
		JButton button = new JButton("+/-");
		button.setBackground(Color.WHITE);
		button.setFont(new Font("宋体", Font.PLAIN, 20));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String second_num=textField.getText();
				double num=Double.valueOf(second_num);
				num=-num;
				second_num=Double.toString(num);
				textField.setText(second_num);
				textField.requestFocus();
			}
		});
		button.setBounds(35, 399, 70, 54);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("1");
		button_1.setBackground(Color.WHITE);
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("宋体", Font.PLAIN, 20));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setNum("1");
				
			}
		});
		button_1.setBounds(35, 343, 70, 54);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.setBackground(Color.WHITE);
		button_2.setFont(new Font("宋体", Font.PLAIN, 20));
		button_2.addActionListener(new ActionListener() {//鼠标点击事件
			public void actionPerformed(ActionEvent e) {
				setNum("2");
				
			}
		});
		button_2.setBounds(107, 343, 70, 54);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.setBackground(Color.WHITE);
		button_3.setFont(new Font("宋体", Font.PLAIN, 20));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setNum("3");
				
			}
		});
		button_3.setBounds(178, 343, 70, 54);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.setBackground(Color.WHITE);
		button_4.setFont(new Font("宋体", Font.PLAIN, 20));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setNum("4");
	
			}
		});
		button_4.setBounds(35, 286, 70, 54);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.setBackground(Color.WHITE);
		button_5.setFont(new Font("宋体", Font.PLAIN, 20));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setNum("5");
				
			}
		});
		button_5.setBounds(107, 286, 70, 54);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.setBackground(Color.WHITE);
		button_6.setFont(new Font("宋体", Font.PLAIN, 20));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setNum("6");
				
			}
		});
		button_6.setBounds(178, 286, 70, 54);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.setBackground(Color.WHITE);
		button_7.setFont(new Font("宋体", Font.PLAIN, 20));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setNum("7");
				
			}
		});
		button_7.setBounds(35, 230, 70, 54);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.setBackground(Color.WHITE);
		button_8.setFont(new Font("宋体", Font.PLAIN, 20));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setNum("8");
				
			}
		});
		button_8.setBounds(107, 230, 70, 54);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.setBackground(Color.WHITE);
		button_9.setFont(new Font("宋体", Font.PLAIN, 20));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setNum("9");
				
			}
		});
		button_9.setBounds(178, 230, 70, 54);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("0");
		button_10.setBackground(Color.WHITE);
		button_10.setFont(new Font("宋体", Font.PLAIN, 20));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickZero();
			}
		});
		button_10.setBounds(106, 399, 70, 54);
		frame.getContentPane().add(button_10);
		
		JButton button_point = new JButton(".");
		button_point.setBackground(Color.WHITE);
		button_point.setFont(new Font("宋体", Font.PLAIN, 20));
		button_point.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickPoint();
			}
		});
		button_point.setBounds(178, 399, 70, 54);
		frame.getContentPane().add(button_point);
		
		
		//乘法按钮
		JButton button_multiply = new JButton("\u00D7");
		button_multiply.setBackground(SystemColor.menu);
		button_multiply.setFont(new Font("宋体", Font.PLAIN, 20));
		button_multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickOperator("*");
			}
		});
		
		
		//加法按钮
		JButton button_plus = new JButton("\uFF0B");
		button_plus.setBackground(SystemColor.menu);
		button_plus.setFont(new Font("宋体", Font.PLAIN, 20));
		button_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickOperator("+");
			}
		});
		button_plus.setBounds(249, 343, 70, 54);
		frame.getContentPane().add(button_plus);
		
		
		//减法按钮
		JButton button_minus = new JButton("\uFF0D");
		button_minus.setBackground(SystemColor.menu);
		button_minus.setFont(new Font("宋体", Font.PLAIN, 20));
		button_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickOperator("-");
			}
		});
		button_minus.setBounds(249, 286, 70, 54);
		frame.getContentPane().add(button_minus);
		button_multiply.setBounds(249, 230, 70, 54);
		frame.getContentPane().add(button_multiply);
		
		
		//等于按钮
		JButton button_equal = new JButton("\uFF1D");
		button_equal.setBackground(SystemColor.activeCaption);
		button_equal.setFont(new Font("宋体", Font.PLAIN, 20));
		button_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickEqual();
				
			}
		});
		
		
		//除法按钮
		JButton button_divide = new JButton("\u00F7");
		button_divide.setBackground(SystemColor.menu);
		button_divide.setFont(new Font("宋体", Font.PLAIN, 20));
		button_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickOperator("/");
			}
		});
		button_divide.setBounds(249, 174, 70, 54);
		frame.getContentPane().add(button_divide);
		button_equal.setBounds(249, 399, 70, 54);
		frame.getContentPane().add(button_equal);
		
		
		
		//百分号按钮
		JButton button_percentage = new JButton("%");
		button_percentage.setBackground(SystemColor.menu);
		button_percentage.setFont(new Font("宋体", Font.PLAIN, 20));
		button_percentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickPercentage();
			}
		});
		button_percentage.setBounds(35, 117, 70, 54);
		frame.getContentPane().add(button_percentage);
		
		JButton btnx = new JButton("1/x");
		btnx.setBackground(SystemColor.menu);
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickFetched();
			}
		});
		btnx.setFont(new Font("宋体", Font.PLAIN, 18));
		btnx.setBounds(35, 174, 70, 54);
		frame.getContentPane().add(btnx);
		
		JButton button_square = new JButton(" x\u00B2");//平方
		button_square.setBackground(SystemColor.menu);
		button_square.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clickSquare();
			}
		});
		button_square.setFont(new Font("宋体", Font.PLAIN, 20));
		button_square.setBounds(107, 174, 70, 54);
		frame.getContentPane().add(button_square);
		
		JButton button_sqrt = new JButton("\u221A");//开平方根
		button_sqrt.setBackground(SystemColor.menu);
		button_sqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clickSqrt();
			}
		});
		button_sqrt.setBounds(178, 174, 70, 54);
		frame.getContentPane().add(button_sqrt);
		
		JButton button_BS = new JButton("\u2190");//退格
		button_BS.setBackground(SystemColor.menu);
		button_BS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickBS();
				
			}
		});
		button_BS.setFont(new Font("宋体", Font.PLAIN, 20));
		button_BS.setBounds(249, 117, 70, 54);
		frame.getContentPane().add(button_BS);
		
		//清除全部
				JButton btnC = new JButton("C");
				btnC.setBackground(SystemColor.menu);
				btnC.setFont(new Font("宋体", Font.PLAIN, 20));
				btnC.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						clickC();
					}
				});
				btnC.setBounds(178, 117, 70, 54);
				frame.getContentPane().add(btnC);
				
				//清除当前数按钮
				JButton btnCe = new JButton("CE");
				btnCe.setBackground(SystemColor.menu);
				btnCe.setFont(new Font("宋体", Font.PLAIN, 20));
				btnCe.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						clickCE();
					}
				});
				btnCe.setBounds(106, 117, 70, 54);
				frame.getContentPane().add(btnCe);
		
		//键盘监听
		textField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO 自动生成的方法存根
				int keyChar=e.getKeyChar();
				switch (keyChar) {
				case '1':
					button_1.doClick();
					break;
				case '2':
					button_2.doClick();
					break;
				case '3':
					button_3.doClick();
					break;
				case '4':
					button_4.doClick();
					break;
				case '5':
					button_5.doClick();
					break;
				case '6':
					button_6.doClick();
					break;
				case '7':
					button_7.doClick();
					break;
				case '8':
					button_8.doClick();
					break;
				case '9':
					button_9.doClick();
					break;
				case '0':
					button_10.doClick();
					break;
				case '+':
					button_plus.doClick();
					break;
				case '-':
					button_minus.doClick();
					break;
				case '*':
					button_multiply.doClick();
					break;
				case '/':
					button_divide.doClick();
					break;
				case '=':
					button_equal.doClick();
					break;
				case '.':
					button_point.doClick();
					break;
				case '\b':
					button_BS.doClick();
					break;
				default:
					break;
				}
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO 自动生成的方法存根
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO 自动生成的方法存根
				
			}
		});
		
	}
	
	//等号功能实现
	public String equal(String str1,String str2,String symbol) {
		double a_num=Double.valueOf(str1);
		double b_num=Double.valueOf(str2);
		double sum=0;
		switch (symbol) {
		case "+":
			sum=a_num+b_num;
			break;
		case "-":
			sum=a_num-b_num;
			break;
		case "*":
			sum=a_num*b_num;
			break;
		case "/":
			if (b_num==0) {
				String res="除数不能为零";
				first_num="";
				isResult=true;
				return res;
			}
			else {
				sum=a_num/b_num;
			}
			
			break;
			
		default:
			break;
		}
		
		String res=Double.toString(sum);
		return res;
	}
	//数字输入
	public void setNum(String str) {
		String s=textField.getText();
		if (s.indexOf("0")==0 && s.length()==1) {
			isResult=true;
		}
		if (isResult) {
			textField.setText("");
			isResult=false;
			String string=textField.getText();
			string+=str;
				textField.setText(string);
				textField.requestFocus();
		}
		else {
			String string=textField.getText();
			string+=str;
				textField.setText(string);
				textField.requestFocus();
		}
	}
	//按下运算符
	public void clickOperator(String str) {
		if (first_num=="") {
			first_num=textField.getText();
			isResult=true;
			symbol=str;
			textField.requestFocus();
		}
		else {
			if (!isResult) {
				String second_num=textField.getText();
				String res = equal(first_num, second_num, symbol);
				first_num=res;
				textField.setText(res);
			}
			isResult=true;
			symbol=str;
			textField.requestFocus();
		}
	}
	//按下小数点
	public void clickPoint() {
		String string=textField.getText();
		if (string.indexOf(".")==-1 || isResult) {
			
			if (isResult) {
				textField.setText("");
				string="0.";
				isResult=false;
				textField.setText(string);
				textField.requestFocus();
			}
			else {
				isResult=false;
				string+=".";
				textField.setText(string);
				textField.requestFocus();
			}
		}
		textField.requestFocus();
	}
	
	//按下数字0，以及处理方法
	public void clickZero() {
		if (isResult) {
			textField.setText("");
			isResult=false;
			
			String string=textField.getText();
			if (string.indexOf("0")==0) {
				
			}
			else {
				string+="0";
				textField.setText(string);
			}
			
		}
		else {
			String string=textField.getText();
			if (string.indexOf("0")==0) {
				if (string.indexOf(".")!=-1) {
					string+="0";
					textField.setText(string);
				}
				
			}
			else {
				string+="0";
				textField.setText(string);
			}
		}
		textField.requestFocus();
	}
	//清除当前按钮（CE）
	public void clickCE() {
		isResult=true;
		textField.setText("0");
		textField.requestFocus();
	}
	public void clickC() {
		first_num="";
		isResult=true;
		textField.setText("0");
		textField.requestFocus();
	}
	public void clickBS() {
		String num=textField.getText();
		if (num.length()>0) {
			if (num.length()==1) {
				textField.setText("0");
				isResult=true;
				textField.requestFocus();
			}
			else {
				num= num.substring(0,num.length()-1); 
				textField.setText(num);
				textField.requestFocus();
			}
			
		}
	}
	public void clickSqrt() {
		isResult=true;
		String second_num=textField.getText();
		double num=Double.valueOf(second_num);
		num=Math.sqrt(num);
		second_num=Double.toString(num);
		textField.setText(second_num);
		textField.requestFocus();
	}
	public void clickSquare() {
		isResult=true;
		String second_num=textField.getText();
		double num=Double.valueOf(second_num);
		num*=num;
		second_num=Double.toString(num);
		textField.setText(second_num);
		textField.requestFocus();
	}
	public void clickFetched() {
		isResult=true;
		String second_num=textField.getText();
		double num=Double.valueOf(second_num);
		if (num!=0) {
			num=1/num;
			second_num=Double.toString(num);
		}
		else {
			second_num="除数不能为零";
		}
		textField.setText(second_num);
		textField.requestFocus();
	}
	public void clickPercentage() {
		if (first_num=="") {
			isResult=true;
			textField.setText("0");
			textField.requestFocus();
		}
		else {
			isResult=true;
			String second_num=textField.getText();
			double num=Double.valueOf(second_num);
			num/=100;
			second_num=Double.toString(num);
			textField.setText(second_num);
			textField.requestFocus();
		}
	}
	public void clickEqual() {
		if (first_num=="") {
			isResult=true;
		}
		else {
			isResult=true;
			String second_num=textField.getText();
			String res = equal(first_num, second_num, symbol);
			textField.setText(res);
			first_num="";
		}
	}
}
