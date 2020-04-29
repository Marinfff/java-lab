import javax.swing.*;

class SecondSwing {
    public static void printResult(String title, String value) {
        System.out.print(value);
        JFrame frame = new JFrame(title);
        JLabel label = new JLabel(value);

        label.setBounds(10, 0, 400, 100);
        frame.add(label);
        frame.setSize(500, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void ex1(String value) {
        int k = 5;
        printResult("Ex1", "Elementul pe pozitia k(5) este '" + value.charAt(k) + "'");
    }

    public static void ex2(String value, String value2) {
        String str = "";
        if (value.equals(value2)) {
            str += "Sunt egale(fara registru), ";
        } else {
            str += "Nu sunt egale(fara registru), ";
        }

        if (value.equalsIgnoreCase(value2)) {
            str += "Sunt egale(cu registru)";
        } else {
            str += "Nu sunt egale(cu registru)";
        }

        printResult("Ex2", str);
    }

    public static void ex3(String value) {
        boolean start = value.startsWith("my");
        boolean end = value.endsWith("exe");

        printResult("Ex3", "Sirul contine la inceput 'my': " + start + ", " + "Sirul contine la sfarsit 'exe: " + end);
    }

    public static void ex4(String value) {
        String str = "my";

        if (value.contains(str)) {
            printResult("Ex4", "Sirul contine 'my' pe pozitia " + value.indexOf(str));
        } else {
            printResult("Ex4", "Sirul nu contine 'my'");
        }
    }

    public static void ex5(String value) {
        String str = "__my__";
        printResult("Ex5", "Sirul dupa inlocuirea 'my' cu '__my__' este " + value.replace("my", str));
    }

    public static void ex6(String value) {
        String[] words = value.split(" ");
        printResult("Ex6", "Sirul contine " + words.length + " cuvinte");
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        JTextField label1 = new JTextField(16);
        JTextField label2 = new JTextField(16);
        JButton b = new JButton("click");

        label1.setBounds(10, 0, 200, 40);
        label2.setBounds(10, 50, 200, 40);
        b.setBounds(10, 150, 200, 40);

        f.add(b);
        f.add(label1);
        f.add(label2);

        b.addActionListener(ae -> {
            try {
                String first = label1.getText();
                String second = label2.getText();

                ex1(first);
                ex2(first, second);
                ex3(first);
                ex4(first);
                ex5(first);
                ex6(first);
            } catch (Throwable error) {
                System.out.print(error);
            }
        });

        f.setSize(535, 540);
        f.setLayout(null);
        f.setVisible(true);
    }
}  