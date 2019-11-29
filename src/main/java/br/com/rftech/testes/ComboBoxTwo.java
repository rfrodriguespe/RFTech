/*
 * The MIT License
 *
 * Copyright 2019 Rodrigo Ferreira Rodrigues <https://github.com/rfrodriguespe>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package br.com.rftech.testes;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author Rodrigo Ferreira Rodrigues <https://github.com/rfrodriguespe>
 */
public class ComboBoxTwo extends JFrame implements ActionListener {

    private JComboBox mainComboBox;
    private JComboBox subComboBox;
    private Hashtable subItems = new Hashtable();

    public ComboBoxTwo() {
        String[] items = {"Select Item", "Color", "Shape", "Fruit"};
        mainComboBox = new JComboBox(items);
        mainComboBox.addActionListener(this);

        //  In JDK1.4 this prevents action events from being fired when the
        //  up/down arrow keys are used on the dropdown menu
        mainComboBox.putClientProperty("JComboBox.isTableCellEditor", Boolean.TRUE);
        getContentPane().add(mainComboBox, BorderLayout.WEST);

        //  Create sub combo box with multiple models 
        subComboBox = new JComboBox();
        subComboBox.setPrototypeDisplayValue("XXXXXXXXXXXX"); // JDK1.4
        getContentPane().add(subComboBox, BorderLayout.EAST);

        String[] subItems1 = {"Select Color", "Red", "Blue", "Green"};
        subItems.put(items[1], subItems1);

        String[] subItems2 = {"Select Shape", "Circle", "Square", "Triangle"};
        subItems.put(items[2], subItems2);

        String[] subItems3 = {"Select Fruit", "Apple", "Orange", "Banana"};
        subItems.put(items[3], subItems3);
    }

    public void actionPerformed(ActionEvent e) {
        String item = (String) mainComboBox.getSelectedItem();
        Object o = subItems.get(item);

        if (o == null) {
            subComboBox.setModel(new DefaultComboBoxModel());
        } else {
            subComboBox.setModel(new DefaultComboBoxModel((String[]) o));
        }

        //  make sure popup is closed when 'isTableCellEditor' is used 
        mainComboBox.hidePopup();
    }

    public static void main(String[] args) {
        JFrame frame = new ComboBoxTwo();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
