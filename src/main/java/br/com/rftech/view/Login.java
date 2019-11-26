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
import br.com.rftech.bean.Sessao;
import br.com.rftech.util.Sha256;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo Ferreira Rodrigues <https://github.com/rfrodriguespe>
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        jPanelMudaSenha.setVisible(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLogin = new javax.swing.JPanel();
        jTextFieldLogin = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jButtonAcessarSistema = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabelEsqueceuSenha = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jPanelMudaSenha = new javax.swing.JPanel();
        pfSenha = new javax.swing.JPasswordField();
        jButtonAcessarSistema1 = new javax.swing.JButton();
        jLabelSenha1 = new javax.swing.JLabel();
        jLabelUsuarioLogado = new javax.swing.JLabel();
        jLabelSenha2 = new javax.swing.JLabel();
        pfConfirmaSenha = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto de Segurança da Informação");

        jTextFieldLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLoginActionPerformed(evt);
            }
        });

        jButtonAcessarSistema.setText("Acessar o sistema");
        jButtonAcessarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarSistemaActionPerformed(evt);
            }
        });

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jLabelEsqueceuSenha.setText("Esqueceu a senha?");
        jLabelEsqueceuSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEsqueceuSenhaMouseClicked(evt);
            }
        });

        jLabelSenha.setText("Senha");

        jLabelUsuario.setText("Usuário");

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addComponent(jLabelUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldLogin))
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addComponent(jButtonSair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAcessarSistema))
                    .addComponent(jLabelEsqueceuSenha)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addComponent(jLabelSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEsqueceuSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSair)
                    .addComponent(jButtonAcessarSistema))
                .addGap(19, 19, 19))
        );

        pfSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pfSenhaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pfSenhaKeyTyped(evt);
            }
        });

        jButtonAcessarSistema1.setText("Mudar Senha");
        jButtonAcessarSistema1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarSistema1ActionPerformed(evt);
            }
        });

        jLabelSenha1.setText("Senha");

        jLabelUsuarioLogado.setText("Bem vindo, por favor altera a sua senha padrão");

        jLabelSenha2.setText("Confirma Senha");

        pfConfirmaSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pfConfirmaSenhaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pfConfirmaSenhaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanelMudaSenhaLayout = new javax.swing.GroupLayout(jPanelMudaSenha);
        jPanelMudaSenha.setLayout(jPanelMudaSenhaLayout);
        jPanelMudaSenhaLayout.setHorizontalGroup(
            jPanelMudaSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMudaSenhaLayout.createSequentialGroup()
                .addGroup(jPanelMudaSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMudaSenhaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelMudaSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelMudaSenhaLayout.createSequentialGroup()
                                .addComponent(jLabelSenha1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelMudaSenhaLayout.createSequentialGroup()
                                .addComponent(jLabelSenha2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pfConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelMudaSenhaLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabelUsuarioLogado)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMudaSenhaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonAcessarSistema1)
                .addGap(133, 133, 133))
        );
        jPanelMudaSenhaLayout.setVerticalGroup(
            jPanelMudaSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMudaSenhaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabelUsuarioLogado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelMudaSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSenha1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMudaSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSenha2)
                    .addComponent(pfConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAcessarSistema1)
                .addGap(24, 24, 24))
        );

        jButton1.setText("user sessao");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton1))
                    .addComponent(jPanelMudaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jButton1)))
                .addGap(9, 9, 9)
                .addComponent(jPanelMudaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelEsqueceuSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEsqueceuSenhaMouseClicked
        JOptionPane.showMessageDialog(null, "Envie email com seus dados pessoais para\n\n"
                + "rodrigo2208@gmail.com");
    }//GEN-LAST:event_jLabelEsqueceuSenhaMouseClicked

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonAcessarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarSistemaActionPerformed
        acessaSistema();
    }//GEN-LAST:event_jButtonAcessarSistemaActionPerformed

    private void jTextFieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLoginActionPerformed

    private void pfSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            alteraSenha();
        }
    }//GEN-LAST:event_pfSenhaKeyPressed

    private void pfSenhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfSenhaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_pfSenhaKeyTyped

    private void jButtonAcessarSistema1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarSistema1ActionPerformed
        alteraSenha();
    }//GEN-LAST:event_jButtonAcessarSistema1ActionPerformed

    private void pfConfirmaSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfConfirmaSenhaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfConfirmaSenhaKeyPressed

    private void pfConfirmaSenhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfConfirmaSenhaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_pfConfirmaSenhaKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.out.println("Sessao usuario " + Sessao.getInstance().getFuncionario());
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAcessarSistema;
    private javax.swing.JButton jButtonAcessarSistema1;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabelEsqueceuSenha;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelSenha1;
    private javax.swing.JLabel jLabelSenha2;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JLabel jLabelUsuarioLogado;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPanel jPanelMudaSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JPasswordField pfConfirmaSenha;
    private javax.swing.JPasswordField pfSenha;
    // End of variables declaration//GEN-END:variables

    public void acessaSistema() {
        String login = jTextFieldLogin.getText();
        String senha = new String(jPasswordFieldSenha.getPassword());
        if (login.equals("") && senha.equals("")) {
            JOptionPane.showMessageDialog(null, "Campos de usuário e senha em branco");
        } else if (FuncionarioJpaDao.getInstance().getByUserName(login) == null) {
            JOptionPane.showMessageDialog(null, "Usuário " + login + " não consta em nossa base de dados");
        } else if (FuncionarioJpaDao.getInstance().getByUserName(login) != null) {
            if (!FuncionarioJpaDao.getInstance().auth(login, senha)) {
                JOptionPane.showMessageDialog(null, "Senha incorreta para o usuário" + login + ".");
            } else if (FuncionarioJpaDao.getInstance().auth(login, senha) && !Sha256.getInstance().getSHA256Hash(senha).equals("7E32C6E5E1D0D0106FB6BC8F2F838CB71CEC1A14E9F165A4E77A0C3154E0D01F")) {
                JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO\n"
                        + "Bem Vindo " + login + "\n"
                        + "Você está logado como usuário " + Sessao.getInstance().getFuncionario().getNomeUsuario());
                new TelaPrincipal().setVisible(true);
                this.dispose();
            } else if (FuncionarioJpaDao.getInstance().auth(login, senha) && Sha256.getInstance().getSHA256Hash(senha).equals("7E32C6E5E1D0D0106FB6BC8F2F838CB71CEC1A14E9F165A4E77A0C3154E0D01F")) {
                jPanelMudaSenha.setVisible(true);
                jTextFieldLogin.setEditable(false);
                jPasswordFieldSenha.setEditable(false);
                jButtonAcessarSistema.setEnabled(false);
                jLabelUsuarioLogado.setText("Bem vindo," + Sessao.getInstance().getFuncionario().getNomeUsuario() + " por favor altera a sua senha padrão");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao tentar logar");
        }
    }

    public void alteraSenha() {
        String senha = new String(pfSenha.getPassword());
        String confirmaSenha = new String(pfConfirmaSenha.getPassword());
        if (!senha.equals(confirmaSenha)) {
            JOptionPane.showMessageDialog(null, "Campos Senha e Confirma Senha não conferem");
        } else if (senha.equals(confirmaSenha) && senha.length() >= 4) {
            Sessao.getInstance().getFuncionario().setSenha(Sha256.getInstance().getSHA256Hash(senha));
            if (FuncionarioJpaDao.getInstance().update(Sessao.getInstance().getFuncionario())) {
                JOptionPane.showMessageDialog(null, "ALTERAÇÃO EFETUADA COM SUCESSO\n"
                        + "Bem vindo, " + Sessao.getInstance().getFuncionario().getNomeUsuario());
                new TelaPrincipal().setVisible(true);
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Senha mínima deve ter ao menos 4 caracteres");
        }
    }

}
