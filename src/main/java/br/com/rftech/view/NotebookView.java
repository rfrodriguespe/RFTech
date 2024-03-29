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

import br.com.rftech.Dao.NotebookJpaDao;
import br.com.rftech.Dao.ClientePfJpaDao;
import br.com.rftech.Dao.EquipamentosTipoJpaDao;
import br.com.rftech.Dao.FabricanteJpaDao;
import br.com.rftech.bean.Notebook;
import br.com.rftech.bean.NotebookTableModel;
import br.com.rftech.bean.ClientePf;
import br.com.rftech.bean.EquipamentosTipo;
import br.com.rftech.bean.Fabricante;
import br.com.rftech.bean.TableColumnAdjuster;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Rodrigo Ferreira Rodrigues <https://github.com/rfrodriguespe>
 */
public class NotebookView extends javax.swing.JInternalFrame {

    /**
     * Creates new form ClientesPFView
     */
    public NotebookView() {
        initComponents();
        jTableNotebook.setModel(tableModel);
        preencheTabela();
        populaComboBoxes();
        habilitaCampos(false);
    }

    //Instancia minha jTable com base no modelo de Tabela definido no pacote MODEL
    NotebookTableModel tableModel = new NotebookTableModel();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDadosFuncionario = new javax.swing.JPanel();
        tfId = new javax.swing.JTextField();
        jLabelFabricante = new javax.swing.JLabel();
        jLabelTipoEquipamento = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jLabelDono = new javax.swing.JLabel();
        jLabelSerial = new javax.swing.JLabel();
        jLabelTela = new javax.swing.JLabel();
        jComboBoxTipoEquipamento = new javax.swing.JComboBox<>();
        jComboBoxDono = new javax.swing.JComboBox<>();
        tfSerial = new javax.swing.JTextField();
        jComboBoxTela = new javax.swing.JComboBox<>();
        jLabelRam = new javax.swing.JLabel();
        jComboBoxRam = new javax.swing.JComboBox<>();
        jLabelRamGb = new javax.swing.JLabel();
        jLabelHdGb = new javax.swing.JLabel();
        jComboBoxHd = new javax.swing.JComboBox<>();
        jLabelRamGb1 = new javax.swing.JLabel();
        jLabelModelo = new javax.swing.JLabel();
        tfModelo = new javax.swing.JTextField();
        jComboBoxFabricante = new javax.swing.JComboBox<>();
        jLabelPolegadas = new javax.swing.JLabel();
        jPanelTabela = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableNotebook = new javax.swing.JTable();
        jPanelBotoes = new javax.swing.JPanel();
        jButtonExcluir = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonVerificaPendencias = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonFecharJanela = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(787, 412));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jPanelDadosFuncionario.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Notebook"));
        jPanelDadosFuncionario.setPreferredSize(new java.awt.Dimension(787, 412));

        tfId.setEditable(false);

        jLabelFabricante.setText("Fabricante:");

        jLabelTipoEquipamento.setText("Tipo Equipamento");

        jLabelId.setText("ID:");

        jLabelDono.setText("Dono:");

        jLabelSerial.setText("Serial:");

        jLabelTela.setText("Tela");

        jComboBoxTipoEquipamento.setEnabled(false);

        jComboBoxDono.setEnabled(false);

        tfSerial.setEnabled(false);

        jComboBoxTela.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tamanho", "11", "12", "13", "14", "15", "17" }));
        jComboBoxTela.setEnabled(false);

        jLabelRam.setText("Memória");

        jComboBoxRam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tamanho", "1", "2", "3", "4", "6", "8", "12", "16", "20", "24", "32" }));
        jComboBoxRam.setEnabled(false);

        jLabelRamGb.setText("GB");

        jLabelHdGb.setText("GB");

        jComboBoxHd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tamanho", "160", "240", "320", "480", "500", "1000", "2000", " " }));
        jComboBoxHd.setEnabled(false);

        jLabelRamGb1.setText("HD");

        jLabelModelo.setText("Modelo");

        tfModelo.setEnabled(false);

        jComboBoxFabricante.setEnabled(false);

        jLabelPolegadas.setText("''");

        javax.swing.GroupLayout jPanelDadosFuncionarioLayout = new javax.swing.GroupLayout(jPanelDadosFuncionario);
        jPanelDadosFuncionario.setLayout(jPanelDadosFuncionarioLayout);
        jPanelDadosFuncionarioLayout.setHorizontalGroup(
            jPanelDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosFuncionarioLayout.createSequentialGroup()
                        .addComponent(jLabelFabricante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTipoEquipamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxTipoEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabelSerial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSerial))
                    .addGroup(jPanelDadosFuncionarioLayout.createSequentialGroup()
                        .addComponent(jLabelId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxDono, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelDadosFuncionarioLayout.createSequentialGroup()
                        .addComponent(jLabelModelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfModelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTela)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPolegadas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelRam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelRamGb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelRamGb1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxHd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelHdGb)))
                .addContainerGap())
        );
        jPanelDadosFuncionarioLayout.setVerticalGroup(
            jPanelDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelId)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDono)
                    .addComponent(jComboBoxDono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipoEquipamento)
                    .addComponent(jComboBoxTipoEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFabricante)
                    .addComponent(jLabelSerial)
                    .addComponent(tfSerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTela)
                    .addComponent(jComboBoxTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRam)
                    .addComponent(jComboBoxRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRamGb)
                    .addComponent(jLabelHdGb)
                    .addComponent(jComboBoxHd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRamGb1)
                    .addComponent(jLabelModelo)
                    .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPolegadas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelTabela.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta de Equipamentos"));

        jTableNotebook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "HP", "Garantia pelo Fabricante"}
            },
            new String [] {
                "Cód", "Fabricante", "Obs"
            }
        ));
        jTableNotebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableNotebookMouseClicked(evt);
            }
        });
        jTableNotebook.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableNotebookKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTableNotebook);

        javax.swing.GroupLayout jPanelTabelaLayout = new javax.swing.GroupLayout(jPanelTabela);
        jPanelTabela.setLayout(jPanelTabelaLayout);
        jPanelTabelaLayout.setHorizontalGroup(
            jPanelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTabelaLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTabelaLayout.setVerticalGroup(
            jPanelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTabelaLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelBotoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar Campos");
        jButtonLimpar.setEnabled(false);
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonVerificaPendencias.setText("Verifica Pendências");
        jButtonVerificaPendencias.setEnabled(false);
        jButtonVerificaPendencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificaPendenciasActionPerformed(evt);
            }
        });

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonFecharJanela.setText("Fechar");
        jButtonFecharJanela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharJanelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotoesLayout = new javax.swing.GroupLayout(jPanelBotoes);
        jPanelBotoes.setLayout(jPanelBotoesLayout);
        jPanelBotoesLayout.setHorizontalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonVerificaPendencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonFecharJanela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBotoesLayout.setVerticalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVerificaPendencias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonFecharJanela)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelDadosFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelDadosFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))
                    .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelTabela.getAccessibleContext().setAccessibleName("Dados Pessoais");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        if (jTableNotebook.getSelectedRow() != -1) {
            Notebook notebook = new Notebook();
            notebook.setId(Integer.parseInt(tfId.getText()));
            if (NotebookJpaDao.getInstance().delete(notebook)) {
                JOptionPane.showMessageDialog(this, "Notebook deletado com sucesso");
                preencheTabela();
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Não foi possível deletar o funcionário id: " + notebook.getId());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um Notebook para deletar");
        }

    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        // Limpa os campos
        limparCampos();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (!CamposEmBranco()) {
            Notebook notebook = new Notebook();
            ClientePf clientePfExemplo = (ClientePf)jComboBoxDono.getSelectedItem();
            ClientePf dono = ClientePfJpaDao.getInstance().getById(clientePfExemplo.getId());
            notebook.setDono(dono);
            EquipamentosTipo equipamentoTipo = EquipamentosTipoJpaDao.getInstance().getById(jComboBoxTipoEquipamento.getSelectedIndex() + 1);
            notebook.setEquipamentoTipo(equipamentoTipo);
            Fabricante fabricante = FabricanteJpaDao.getInstance().getById(jComboBoxFabricante.getSelectedIndex() + 1);
            notebook.setFabricante(fabricante);
            notebook.setModelo(tfModelo.getText());
            notebook.setSerial(tfSerial.getText());
            notebook.setTamanhoTela(jComboBoxTela.getSelectedItem().toString());
            notebook.setRam(jComboBoxRam.getSelectedItem().toString());
            notebook.setHd(jComboBoxHd.getSelectedItem().toString());
            if (NotebookJpaDao.getInstance().create(notebook)) {
                JOptionPane.showMessageDialog(this, "Salvo com sucesso");
                preencheTabela();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao salvar");
            }
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:
        if (!CamposEmBranco()) {
            if (jTableNotebook.getSelectedRow() != -1) {
                Notebook notebook = NotebookJpaDao.getInstance().getById(Integer.parseInt(tfId.getText()));
                ClientePf cliExemplo = (ClientePf) jComboBoxDono.getSelectedItem();
                ClientePf dono = ClientePfJpaDao.getInstance().getById(cliExemplo.getId());
                notebook.setDono(dono);
                EquipamentosTipo equipamentoTipo = EquipamentosTipoJpaDao.getInstance().getById(jComboBoxTipoEquipamento.getSelectedIndex() + 1);
                notebook.setEquipamentoTipo(equipamentoTipo);
                Fabricante fabricante = FabricanteJpaDao.getInstance().getById(jComboBoxFabricante.getSelectedIndex() + 1);
                notebook.setFabricante(fabricante);
                notebook.setModelo(tfModelo.getText());
                notebook.setSerial(tfSerial.getText());
                notebook.setTamanhoTela(jComboBoxTela.getSelectedItem().toString());
                notebook.setRam(jComboBoxRam.getSelectedItem().toString());
                notebook.setHd(jComboBoxHd.getSelectedItem().toString());
                if (NotebookJpaDao.getInstance().update(notebook)) {
                    JOptionPane.showMessageDialog(this, "Notebook Alterado com sucesso");
                    preencheTabela();
                    limparCampos();
                } else {
                    JOptionPane.showMessageDialog(this, "Não foi possível alterar o Notebook id: " + notebook.getId());
                }
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um Notebook para alterar");
            }
        }

    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:
        habilitaCampos(true);
        habilitaBotoes(true);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        habilitaBotoes(false);
        habilitaCampos(false);
        jButtonExcluir.setEnabled(false);
        jButtonAlterar.setEnabled(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTableNotebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNotebookMouseClicked
        // TODO add your handling code here:
        populaCamposByJTable();
    }//GEN-LAST:event_jTableNotebookMouseClicked

    private void jButtonVerificaPendenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificaPendenciasActionPerformed
        // TODO add your handling code here:
        if (!CamposEmBranco()) {
            JOptionPane.showMessageDialog(this, "Nenhuma Pendência encontrada");
        }
    }//GEN-LAST:event_jButtonVerificaPendenciasActionPerformed

    private void jButtonFecharJanelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharJanelaActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonFecharJanelaActionPerformed

    private void jTableNotebookKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableNotebookKeyPressed
        // TODO add your handling code here:
        populaCamposByJTable();
    }//GEN-LAST:event_jTableNotebookKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFecharJanela;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVerificaPendencias;
    private javax.swing.JComboBox<ClientePf> jComboBoxDono;
    private javax.swing.JComboBox<String> jComboBoxFabricante;
    private javax.swing.JComboBox<String> jComboBoxHd;
    private javax.swing.JComboBox<String> jComboBoxRam;
    private javax.swing.JComboBox<String> jComboBoxTela;
    private javax.swing.JComboBox<String> jComboBoxTipoEquipamento;
    private javax.swing.JLabel jLabelDono;
    private javax.swing.JLabel jLabelFabricante;
    private javax.swing.JLabel jLabelHdGb;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelModelo;
    private javax.swing.JLabel jLabelPolegadas;
    private javax.swing.JLabel jLabelRam;
    private javax.swing.JLabel jLabelRamGb;
    private javax.swing.JLabel jLabelRamGb1;
    private javax.swing.JLabel jLabelSerial;
    private javax.swing.JLabel jLabelTela;
    private javax.swing.JLabel jLabelTipoEquipamento;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelDadosFuncionario;
    private javax.swing.JPanel jPanelTabela;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableNotebook;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfModelo;
    private javax.swing.JTextField tfSerial;
    // End of variables declaration//GEN-END:variables

    private void populaComboBoxes() {

        List<ClientePf> listaClientesPf = ClientePfJpaDao.getInstance().readAll();
        for (ClientePf clientePf : listaClientesPf) {
            jComboBoxDono.addItem(clientePf);
        }

        List<Fabricante> listaFabricantes = FabricanteJpaDao.getInstance().readAll();
        for (Fabricante fabricante : listaFabricantes) {
            jComboBoxFabricante.addItem(fabricante.getNome());
        }

        List<EquipamentosTipo> listaEquipamentosTipo = EquipamentosTipoJpaDao.getInstance().readAll();
        for (EquipamentosTipo et : listaEquipamentosTipo) {
            jComboBoxTipoEquipamento.addItem(et.getTipo());
        }
    }

    public void preencheTabela() {
        limpaTabela();
        List<Notebook> listaNotebook = NotebookJpaDao.getInstance().readAll();
        listaNotebook.forEach((notebook) -> {
            tableModel.addRow(notebook);
        });
        jTableNotebook.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        TableColumnAdjuster tca = new TableColumnAdjuster(jTableNotebook);
        tca.adjustColumns();
    }

    public void limpaTabela() {
        tableModel.limpaTabela();
    }

    public JTextField[] limparCampos() {
        JTextField[] campos = {tfModelo, tfSerial};
        for (int i = 0; i < campos.length; i++) {
            campos[i].setText("");
        }
        jComboBoxTela.setSelectedIndex(0);
        jComboBoxRam.setSelectedIndex(0);
        jComboBoxHd.setSelectedIndex(0);
        return campos;
    }

    public boolean CamposEmBranco() {
        int erros = 0;
        JTextField[] campos = {tfModelo, tfSerial};
        String[] camposNome = {"Modelo", "Serial"};
        for (int i = 0; i < campos.length; i++) {
            if (campos[i].getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Campo " + camposNome[i] + " em branco, verifique");
                erros++;
            }
        }
        JComboBox[] comboBoxes = {jComboBoxTela, jComboBoxRam, jComboBoxHd};
        String[] comboBoxesNomes = {"Tamanho da Tela", "Ram", "Hd"};
        for (int i = 0; i < comboBoxes.length; i++) {
            if (comboBoxes[i].getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Selecione um campo em " + comboBoxesNomes[i] + ".");
                erros++;
            }
        }
        if (erros == 0) {
            return false;
        } else {
            return true;
        }
    }

    private void habilitaCampos(boolean estado) {
        JTextField[] listaCampos = {tfModelo, tfSerial};
        for (JTextField campos : listaCampos) {
            campos.setEnabled(estado);
        }
        JComboBox[] listaComboBoxes = {jComboBoxDono, jComboBoxFabricante, jComboBoxHd,
            jComboBoxRam, jComboBoxTela, jComboBoxTipoEquipamento};
        for (JComboBox comboBox : listaComboBoxes) {
            comboBox.setEnabled(estado);
        }
    }

    private void habilitaBotoes(boolean estado) {
        jButtonCancelar.setEnabled(estado);
        jButtonLimpar.setEnabled(estado);
        jButtonSalvar.setEnabled(estado);
        jButtonVerificaPendencias.setEnabled(estado);
    }

    private void populaCamposByJTable() {
        if (jTableNotebook.getSelectedRow() != -1) {

            jButtonExcluir.setEnabled(true);
            jButtonAlterar.setEnabled(true);

            tfId.setText(jTableNotebook.getValueAt(jTableNotebook.getSelectedRow(), 0).toString());
            ClientePf cliEx = (ClientePf) jTableNotebook.getValueAt(jTableNotebook.getSelectedRow(), 1);
            jComboBoxDono.setSelectedItem(cliEx);
            EquipamentosTipo tipoEquipamento = (EquipamentosTipo) jTableNotebook.getValueAt(jTableNotebook.getSelectedRow(), 2);
            jComboBoxTipoEquipamento.setSelectedIndex(tipoEquipamento.getId() - 1);
            Fabricante fabricante = (Fabricante) jTableNotebook.getValueAt(jTableNotebook.getSelectedRow(), 3);
            jComboBoxFabricante.setSelectedIndex(fabricante.getId() - 1);
            tfModelo.setText(jTableNotebook.getValueAt(jTableNotebook.getSelectedRow(), 4).toString());
            tfSerial.setText(jTableNotebook.getValueAt(jTableNotebook.getSelectedRow(), 5).toString());
            jComboBoxTela.setSelectedItem(jTableNotebook.getValueAt(jTableNotebook.getSelectedRow(), 6));
            jComboBoxRam.setSelectedItem(jTableNotebook.getValueAt(jTableNotebook.getSelectedRow(), 7));
            jComboBoxHd.setSelectedItem(jTableNotebook.getValueAt(jTableNotebook.getSelectedRow(), 8));
        }
    }
}
