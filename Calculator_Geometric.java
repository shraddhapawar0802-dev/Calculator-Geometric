import javax.swing.*;

class Calculator_Geometric
{
    public static void main(String[] args) 
    {
        JFrame f = new JFrame("Calculator_Geometric");
        f.setSize(400,500);
        f.setLayout(null);

        JLabel l1 = new JLabel("Number 1");
        JLabel l2 = new JLabel("Number 2");
        JLabel l3 = new JLabel("Result");
        JTextField t1= new JTextField();
        JTextField t2= new JTextField();
        JTextField t3= new JTextField();
        JButton b1 = new JButton("Area");
        JButton b2 = new JButton("Perimeter");
        JButton b3 = new JButton("Volume");

        l1.setBounds(200,100,100,30);
        l2.setBounds(200,150,100,30);
        l3.setBounds(250,200,100,30);

        t1.setBounds(50,100,100,30);
        t2.setBounds(50,150,100,30);
        t3.setBounds(50,200,150,30);

        b1.setBounds(50,250,100,40);
        b2.setBounds(150,250,100,40);
        b3.setBounds(250,250,100,40);

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(b1);
        f.add(b2);
        f.add(b3);

        b1.addActionListener(e->{
            String shapes [] = {"Square","Rectangle","Circle","Triangle"};
            JComboBox<String>  cb = new JComboBox<>(shapes);

            int option = JOptionPane.showConfirmDialog(f,cb,"Select Shape", JOptionPane.OK_CANCEL_OPTION);

            if(option==JOptionPane.OK_OPTION)
            {
                if(t1.getText().isEmpty() || t2.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(f,"Enter Values!");
                    return;
                }
                try{
                     double a = Double.parseDouble(t1.getText());
                     double b = Double.parseDouble(t2.getText());
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(f,"Invalid input!");
                }
            
                String s = cb.getSelectedItem().toString();
                 
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                if(s.equals("Square"))
                    t3.setText("Area= "+(a*a));
                else if(s.equals("Rectangle"))
                    t3.setText("Area= "+(a*b));
                else if(s.equals("Circle"))
                    t3.setText("Area= "+(3.14*a*a));
                else if(s.equals("Triangle"))
                    t3.setText("Area= "+(0.5*a*b));
            }
        });

        b2.addActionListener(e->{
            String shapes[] = {"Square","Rectangle","Circle"};
            JComboBox<String> cb = new JComboBox<>(shapes);

            int option = JOptionPane.showConfirmDialog(f,cb,"Select Shape",JOptionPane.OK_CANCEL_OPTION);

            if(option==JOptionPane.OK_OPTION)
            {
                 if(t1.getText().isEmpty() || t2.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(f,"Enter Values!");
                    return;
                }
                try{
                     double a = Double.parseDouble(t1.getText());
                     double b = Double.parseDouble(t2.getText());
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(f,"Invalid input!");
                }

                String s=cb.getSelectedItem().toString();
                double a= Double.parseDouble(t1.getText());
                double b= Double.parseDouble(t2.getText());

                if(s.equals("Square"))
                    t3.setText("Perimeter= "+(4*a));
                else if(s.equals("Rectangle"))
                    t3.setText("Perimeter= "+(2*(a+b)));
                 else if(s.equals("Circle"))
                    t3.setText("Perimeter= "+(2*3.14*a));
            }
        });

        b3.addActionListener(e->{
            String shapes[] = {"Cube","Cylinder","Sphere"};
            JComboBox<String> cb = new JComboBox<>(shapes);

            int option = JOptionPane.showConfirmDialog(f,cb,"Select shape",JOptionPane.OK_CANCEL_OPTION);
            if(option==JOptionPane.OK_OPTION)
            {
                 if(t1.getText().isEmpty() || t2.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(f,"Enter Values!");
                    return;
                }
                try{
                     double a = Double.parseDouble(t1.getText());
                     double b = Double.parseDouble(t2.getText());
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(f,"Invalid input!");
                }
                
               String s=cb.getSelectedItem().toString();
               double a = Double.parseDouble(t1.getText());
               double b = Double.parseDouble(t2.getText());

               if(s.equals("Cube"))
                t3.setText("Volume: "+(a*a*a));
               else if(s.equals("Cylinder"))
                 t3.setText("Volume: "+(3.14*a*a*b));
               else if(s.equals("Sphere"))
                 t3.setText("Volume: "+(4.0/3.0*3.14*a*a*a));
            }
        });
        f.setVisible(true);
    }
}
