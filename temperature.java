import java.awt.*;
import java.awt.event.*;

public class temperature extends Frame implements ActionListener{

    TextField t1,t2,t3,t4;
	Label title,l1,l2,l3,l4;
	Button b1,b2,b3,b4;
	Font f1;
	temperature()
	{
		f1 = new Font("Animo",Font.BOLD,20);
		
		title = new Label("TEMPERATURE CONVERSION");
		title.setBounds(170,80,300,50);
		
		l1 = new Label("Enter Fahrenheit Temperature :");
		l1.setBounds(50,150,300,50);
		
		t1 = new TextField();
		t1.setBounds(350,160,190,30);
		
		l2 = new Label("Enter Celcius Temperature :");
		l2.setBounds(50,220,300,50);
		
		t2 = new TextField();
		t2.setBounds(350,230,190,30);
		
		b1 = new Button("F to C");
		b1.setBounds(100,320,80,30);
		
		b2 = new Button("C to F");
		b2.setBounds(200,320,80,30);
		
		b3 = new Button("Reset");
		b3.setBounds(300,320,80,30);
		
		b4 = new Button("Exit");
		b4.setBounds(400,320,80,30);
		
		l3 = new Label("Fahrenheit to Celcius is: ");
		l3.setBounds(50,390,300,50);
		
		t3 = new TextField();
		t3.setBounds(350,400,190,30);
		t3.setEditable(false);
		
		l4 = new Label("Celcius to Fahrenheit is:");
		l4.setBounds(50,460,300,50);
		
		t4 = new TextField();
		t4.setBounds(350,470,190,30);
		t4.setEditable(false);
		
		setFont(f1);
		setForeground(Color.red);
		add(title);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(l3);
		add(t3);
        add(l4);
		add(t4);

        b1.addActionListener(this);
        b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		setTitle("Temperature Converter ");
		setSize(600,600);
		setLayout(null);
		setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == b1){
            int a1 = Integer.parseInt(t1.getText());
            double a2 = (double)((a1 - 32) * 5)/9;
            t3.setText((a2)+"°C");
        }
        if(ae.getSource() == b2){
            int a3 = Integer.parseInt(t2.getText());
            double a4 = (((a3 * 9)/5)+32);
            t4.setText((a4)+"°F");
        }
		if(ae.getSource() == b3){
			t1.setText(""+0);
			t2.setText(""+0);
			t3.setText(""+0);
			t4.setText(""+0);
		}
		if(ae.getSource() == b4){
			System.exit(0);
    }
}
public static void main(String[] args){
	new temperature();
}
}
