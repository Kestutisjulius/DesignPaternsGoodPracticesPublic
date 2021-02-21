package any.firstGUI;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Screen extends JFrame {
    private JPanel panelTop;
    private JPanel panelLeft;
    private JPanel panelRight;
    private JList listPeople;
    private JButton buttonNew;
    private JButton buttonSave;
    private JTextField textName;
    private JTextField textEmail;
    private JTextField textPhoneNumber;
    private JTextField textAddress;
    private JLabel labelAge;
    private JTextField textDateOfBirth;
    private JPanel panelMain;
    private ArrayList<PersonGui> people;
    private DefaultListModel listPeopleModel;

    Screen() {
        super("My fancy contacts project");
        this.setContentPane(this.panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        people = new ArrayList<PersonGui>();
        listPeopleModel = new DefaultListModel();
        listPeople.setModel(listPeopleModel);
        buttonSave.setEnabled(false);

        buttonNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonNewClick(e);
            }
        });

        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonSavedClick(e);
                }
        });
        listPeople.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                listPeopleSelection(e);
            }
        });


    }

    public void buttonNewClick (ActionEvent e) {
        PersonGui p = new PersonGui(
                textName.getText(),
                textEmail.getText(),
                textPhoneNumber.getText(),
                textDateOfBirth.getText()
        );
        people.add(p);
        refreshPeopleList();
    }

    public void buttonSavedClick (ActionEvent e) {
        int personNumber = listPeople.getSelectedIndex();
        if (personNumber >= 0) {
            PersonGui p = people.get(personNumber);
            p.setName(textName.getText());
            p.setEmail(textEmail.getText());
            p.setPhoneNr(textPhoneNumber.getText());
            p.setDateOfBirth(textDateOfBirth.getText());
            refreshPeopleList();
        }

    }

    public void listPeopleSelection (ListSelectionEvent e) {
        int personNumber = listPeople.getSelectedIndex();
        if (personNumber >= 0 ) {
            PersonGui p = people.get(personNumber);
            textName.setText(p.getName());
            textEmail.setText(p.getEmail());
            textPhoneNumber.setText(p.getPhoneNr());
            textDateOfBirth.setText(p.getDateOfBirth().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            labelAge.setText(Integer.toString(p.getAge()) + " years");
            buttonSave.setEnabled(true);
        } else {
            buttonSave.setEnabled(false);
        }

    }

    public void refreshPeopleList(){
        listPeopleModel.removeAllElements();
        System.out.println("Removing all people from list");
        for (PersonGui p : people) {
            System.out.println("Adding person to list: " + p.getName());
            listPeopleModel.addElement(p.getName());

        }

    }

    public void addPerson(PersonGui p) {
        people.add(p);
        refreshPeopleList();
    }

    public static void main(String[] args) {
        Screen screen = new Screen();
        screen.setVisible(true);
        PersonGui sheldon = new PersonGui("Sheldon Lee Cooper", "sheldon@gmail.com", "555 0001", "26/02/1980");
        PersonGui howard = new PersonGui("Howard Joel Wolowitz", "howard@gmail.com", "555 0002", "01/03/1981");
        PersonGui raj = new PersonGui("Rajesh Ramayan Koothrappali", "raj@gmail.com", "555 0003", "06/10/1981");
        PersonGui penny = new PersonGui("Penny Hofstadter", "penny@gmail.com", "555 0004", "02/12/1985");
        PersonGui bernadette = new PersonGui("Bernadette Rostenkowski-Wolowitz", "bernadette@gmail.com", "555 0005", "07/07/1983");
        PersonGui amy = new PersonGui("Amy Farrah Fowler", "amy@gmail.com", "555 0006", "17/12/1979");
        PersonGui leonard = new PersonGui("Leonard Hofstadter", "leonard@gmail.com", "555 0007", "17/05/1980");

        screen.addPerson(sheldon);
        screen.addPerson(howard);
        screen.addPerson(raj);
        screen.addPerson(penny);
        screen.addPerson(bernadette);
        screen.addPerson(amy);
        screen.addPerson(leonard);

    }
}
