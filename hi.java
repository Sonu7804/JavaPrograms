import javax.swing.*;
public class hi
{
hi(){
JFrame f= new JFrame("CheckBox Example by Technolamror");
JCheckBox checkBox1 = new JCheckBox("C++");
checkBox1.setBounds(100,100, 70,80);
JCheckBox checkBox2 = new JCheckBox("Java", true);
checkBox2.setBounds(100,150, 70,80);
f.add(checkBox1);
f.add(checkBox2);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}
public static void main(String args[])
{
new hi();
}
}