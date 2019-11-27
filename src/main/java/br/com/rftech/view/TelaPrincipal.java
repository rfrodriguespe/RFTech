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

package br.com.rftech.view;

import br.com.rftech.Dao.FuncionarioJpaDao;
import br.com.rftech.bean.Funcionario;
import br.com.rftech.bean.Sessao;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Rodrigo Ferreira Rodrigues <https://github.com/rfrodriguespe>
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Construtor
     */
    public TelaPrincipal() {
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); // atribui look and feel
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
        }

        initComponents();
        
        //BLOCO PARA LOGAR DIRETO, DEPOIS REMOVER
        Funcionario funcionario = FuncionarioJpaDao.getInstance().getById(1);
        Sessao.getInstance().setFuncionario(funcionario);
        //BLOCO PARA LOGAR DIRETO, DEPOIS REMOVER
        
        permissoesFuncionario();
        setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPanel = new javax.swing.JDesktopPane();
        jMenuBarMenuPrincipal = new javax.swing.JMenuBar();
        jMenuLogin = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuArquivoSair = new javax.swing.JMenuItem();
        jMenuCadastro = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RF Loja");
        setIconImage(new ImageIcon(getClass().getResource("/IMGS/iconFnr.png")).getImage());

        jDesktopPanel.setBackground(new java.awt.Color(204, 204, 204));
        jDesktopPanel.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jDesktopPanelLayout = new javax.swing.GroupLayout(jDesktopPanel);
        jDesktopPanel.setLayout(jDesktopPanelLayout);
        jDesktopPanelLayout.setHorizontalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 787, Short.MAX_VALUE)
        );
        jDesktopPanelLayout.setVerticalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        jMenuLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/connect.png"))); // NOI18N
        jMenuLogin.setMnemonic('a');
        jMenuLogin.setText("Login");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/disconnect.png"))); // NOI18N
        jMenuItem1.setText("Logout / Trocar de Usuário");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuLogin.add(jMenuItem1);

        jMenuArquivoSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        jMenuArquivoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/exit_power.png"))); // NOI18N
        jMenuArquivoSair.setMnemonic('s');
        jMenuArquivoSair.setText("Sair");
        jMenuArquivoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuArquivoSairActionPerformed(evt);
            }
        });
        jMenuLogin.add(jMenuArquivoSair);

        jMenuBarMenuPrincipal.add(jMenuLogin);

        jMenuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/user.png"))); // NOI18N
        jMenuCadastro.setText("Cadastro");

        jMenu2.setText("Clientes");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Clientes Pessoa Física");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Clientes Pessoa Jurídica");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuCadastro.add(jMenu2);

        jMenu1.setText("Equipamentos");
        jMenuCadastro.add(jMenu1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Funcionários");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItem2);

        jMenuBarMenuPrincipal.add(jMenuCadastro);

        setJMenuBar(jMenuBarMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuArquivoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuArquivoSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuArquivoSairActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        ClientePfView tela = new ClientePfView();
        jDesktopPanel.add(tela);
        tela.setVisible(true);
        try {
            tela.setSelected(true);
            //diz que a janela interna é maximizável   
            tela.setMaximizable(true);
            //set o tamanho máximo dela, que depende da janela pai   
            tela.setMaximum(true);
        } catch (java.beans.PropertyVetoException e) {
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Sessao.getInstance().setFuncionario(null);
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        FuncionarioView tela = new FuncionarioView();
        jDesktopPanel.add(tela);
        tela.setVisible(true);
        try {
            tela.setSelected(true);
            //diz que a janela interna é maximizável   
            tela.setMaximizable(true);
            //set o tamanho máximo dela, que depende da janela pai   
            tela.setMaximum(true);
        } catch (java.beans.PropertyVetoException e) {
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        ClientePjView tela = new ClientePjView();
        jDesktopPanel.add(tela);
        tela.setVisible(true);
        try {
            tela.setSelected(true);
            //diz que a janela interna é maximizável   
            tela.setMaximizable(true);
            //set o tamanho máximo dela, que depende da janela pai   
            tela.setMaximum(true);
        } catch (java.beans.PropertyVetoException e) {
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuArquivoSair;
    private javax.swing.JMenuBar jMenuBarMenuPrincipal;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenu jMenuLogin;
    // End of variables declaration//GEN-END:variables

    public void permissoesFuncionario() {
        Funcionario funcLogado = Sessao.getInstance().getFuncionario();
        this.setTitle("RFTECH - usuário logado: " + funcLogado.getNome() + " Cargo: " + funcLogado.getCargo());
        if (!funcLogado.getCargo().getNome().equals("Gerente")) {
            jMenuCadastro.setVisible(false);
        }
    }
}
