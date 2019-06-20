/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.customized.ButtonTabComponent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import service.Nos;
import service.ParseHtml;
import service.Pilha;
import service.Render;
import service.navegadorService;
import view.customized.Aba;

/**
 *
 * @author Lenon
 */
public class interfaceGrafica extends javax.swing.JFrame {

    navegadorService nav = new navegadorService();
    Render rend = new Render();
    Pilha pilha = new Pilha();
    ConfigRede rede = new ConfigRede();
//    ParseHtml p = new ParseHtml();

    /**
     * Creates new form interfaceGrafica
     */
    public interfaceGrafica() {
        initComponents();
        if (pilha.pilhaEsquerda.empty()) {
            jBVoltar.setEnabled(false);
        }
        if (pilha.pilhaDireita.empty()) {
            jBAvancar.setEnabled(false);
        }
        //Isso faz com que ele sempre inicie centralizado
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu = new javax.swing.JPopupMenu();
        jMIHistorico = new javax.swing.JMenuItem();
        jMFavoritos = new javax.swing.JMenu();
        jMIAddFavorito = new javax.swing.JMenuItem();
        jSeparador2 = new javax.swing.JPopupMenu.Separator();
        jMIFavRecentes = new javax.swing.JMenuItem();
        jMIFav1 = new javax.swing.JMenuItem();
        jMIFav2 = new javax.swing.JMenuItem();
        jMIFav3 = new javax.swing.JMenuItem();
        jMIFav4 = new javax.swing.JMenuItem();
        jMIFav5 = new javax.swing.JMenuItem();
        jSeparador3 = new javax.swing.JPopupMenu.Separator();
        jMIExibirFavoritos = new javax.swing.JMenuItem();
        jSeparador1 = new javax.swing.JPopupMenu.Separator();
        jMIModoPrivado = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMIConfigRede = new javax.swing.JMenuItem();
        jPAcoes = new javax.swing.JPanel();
        jBUser = new javax.swing.JButton();
        jBMenu = new javax.swing.JButton();
        jBNovaAba = new javax.swing.JButton();
        jTPAbas = new javax.swing.JTabbedPane();
        jPAba1 = new javax.swing.JPanel();
        jPNavegacao = new javax.swing.JPanel();
        jBVoltar = new javax.swing.JButton();
        jBAvancar = new javax.swing.JButton();
        jPUrl = new javax.swing.JPanel();
        jTFUrl = new javax.swing.JTextField();
        jBBuscarUrl = new javax.swing.JButton();
        jSPPagina = new javax.swing.JScrollPane();
        pagina = new javax.swing.JEditorPane();

        jMIHistorico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMIHistorico.setText("Histórico");
        jMIHistorico.setToolTipText("Acessar histórico");
        jMIHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIHistoricoActionPerformed(evt);
            }
        });
        jPopupMenu.add(jMIHistorico);

        jMFavoritos.setText("Favoritos");
        jMFavoritos.setToolTipText("Ver favoritos");
        jMFavoritos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMIAddFavorito.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMIAddFavorito.setText("Adicionar página aos favoritos");
        jMIAddFavorito.setToolTipText("Salvar página como favorito");
        jMFavoritos.add(jMIAddFavorito);
        jMFavoritos.add(jSeparador2);

        jMIFavRecentes.setText("Favoritos recentes");
        jMIFavRecentes.setEnabled(false);
        jMFavoritos.add(jMIFavRecentes);

        jMIFav1.setText("<Vazio>");
        jMFavoritos.add(jMIFav1);

        jMIFav2.setText("<Vazio>");
        jMFavoritos.add(jMIFav2);

        jMIFav3.setText("<Vazio>");
        jMFavoritos.add(jMIFav3);

        jMIFav4.setText("<Vazio>");
        jMFavoritos.add(jMIFav4);

        jMIFav5.setText("<Vazio>");
        jMFavoritos.add(jMIFav5);
        jMFavoritos.add(jSeparador3);

        jMIExibirFavoritos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMIExibirFavoritos.setText("Mostrar favoritos");
        jMIExibirFavoritos.setToolTipText("Acessar favoritos");
        jMIExibirFavoritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIExibirFavoritosActionPerformed(evt);
            }
        });
        jMFavoritos.add(jMIExibirFavoritos);

        jPopupMenu.add(jMFavoritos);
        jPopupMenu.add(jSeparador1);

        jMIModoPrivado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMIModoPrivado.setText("Modo privativo");
        jMIModoPrivado.setToolTipText("Navegar de forma privada");
        jPopupMenu.add(jMIModoPrivado);
        jPopupMenu.add(jSeparator1);

        jMIConfigRede.setText("Configurar rede...");
        jMIConfigRede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIConfigRedeActionPerformed(evt);
            }
        });
        jPopupMenu.add(jMIConfigRede);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Navegador");

        jPAcoes.setPreferredSize(new java.awt.Dimension(82, 78));

        jBUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/user.png"))); // NOI18N
        jBUser.setToolTipText("Logar no navegador");
        jBUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUserActionPerformed(evt);
            }
        });

        jBMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/menu.png"))); // NOI18N
        jBMenu.setToolTipText("Abrir menu");
        jBMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMenuActionPerformed(evt);
            }
        });

        jBNovaAba.setText("+");
        jBNovaAba.setToolTipText("Adicionar nova aba");
        jBNovaAba.setPreferredSize(new java.awt.Dimension(43, 23));
        jBNovaAba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovaAbaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPAcoesLayout = new javax.swing.GroupLayout(jPAcoes);
        jPAcoes.setLayout(jPAcoesLayout);
        jPAcoesLayout.setHorizontalGroup(
            jPAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAcoesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAcoesLayout.createSequentialGroup()
                        .addComponent(jBUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jBMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBNovaAba, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPAcoesLayout.setVerticalGroup(
            jPAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAcoesLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jBNovaAba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTPAbas.setToolTipText("");
        jTPAbas.setPreferredSize(new java.awt.Dimension(23, 100));
        jTPAbas.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jTPAbasComponentRemoved(evt);
            }
        });

        jPNavegacao.setPreferredSize(new java.awt.Dimension(626, 55));

        jBVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/voltar.png"))); // NOI18N
        jBVoltar.setToolTipText("Voltar uma página");
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });

        jBAvancar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/avancar.png"))); // NOI18N
        jBAvancar.setToolTipText("Avançar uma página");
        jBAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAvancarActionPerformed(evt);
            }
        });

        jPUrl.setBackground(new java.awt.Color(255, 255, 255));

        jBBuscarUrl.setBackground(new java.awt.Color(255, 255, 255));
        jBBuscarUrl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/busca_url.png"))); // NOI18N
        jBBuscarUrl.setToolTipText("Ir para endereço digitado");
        jBBuscarUrl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarUrlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPUrlLayout = new javax.swing.GroupLayout(jPUrl);
        jPUrl.setLayout(jPUrlLayout);
        jPUrlLayout.setHorizontalGroup(
            jPUrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPUrlLayout.createSequentialGroup()
                .addComponent(jTFUrl, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jBBuscarUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPUrlLayout.setVerticalGroup(
            jPUrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPUrlLayout.createSequentialGroup()
                .addGroup(jPUrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBBuscarUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFUrl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPNavegacaoLayout = new javax.swing.GroupLayout(jPNavegacao);
        jPNavegacao.setLayout(jPNavegacaoLayout);
        jPNavegacaoLayout.setHorizontalGroup(
            jPNavegacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPNavegacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jBAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPUrl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPNavegacaoLayout.setVerticalGroup(
            jPNavegacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPNavegacaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPNavegacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jSPPagina.setPreferredSize(new java.awt.Dimension(593, 22));

        pagina.setEditable(false);
        pagina.setContentType(""); // NOI18N
        pagina.setToolTipText("");
        pagina.setPreferredSize(new java.awt.Dimension(593, 20));
        jSPPagina.setViewportView(pagina);

        javax.swing.GroupLayout jPAba1Layout = new javax.swing.GroupLayout(jPAba1);
        jPAba1.setLayout(jPAba1Layout);
        jPAba1Layout.setHorizontalGroup(
            jPAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPNavegacao, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
            .addGroup(jPAba1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jSPPagina, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        jPAba1Layout.setVerticalGroup(
            jPAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAba1Layout.createSequentialGroup()
                .addComponent(jPNavegacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSPPagina, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTPAbas.addTab("Nova Aba", jPAba1);
        int i = jTPAbas.getSelectedIndex();
        jTPAbas.setTabComponentAt(i, new ButtonTabComponent(jTPAbas));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTPAbas, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPAbas, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMenuActionPerformed
        //conferir com o professor se pode ser dessa forma
        jPopupMenu.show(jBMenu, WIDTH - 175, jBMenu.getY() - 7);
    }//GEN-LAST:event_jBMenuActionPerformed

    private void jBBuscarUrlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarUrlActionPerformed
        //Historico h = new Historico();
        //historicoDAO hDAO = new historicoDAO();
        //adicionar tratamento para pegar o Title
        //h.setPagina(pagina);
        //h.setUrl(jTFUrl.getText());
        //h.setData_acesso();
        //hDAO.create(h);

        ArrayList<String> imagens = new ArrayList<String>();
        String urlAcesso = jTFUrl.getText();
        String texto = null;
        String titulo = null;
        try {
//            URL url = new URL(jTFUrl.getText());
//            File file = new File("page.html");
//            texto = nav.urlDown(url, file);
//            
//            titulo = p.extrairTitulo(texto);
//            imagens = p.linkImage(texto, urlAcesso);
//            Nos arvore = p.parseArvore(texto, null);
//            
//            rend.render(arvore, pagina);
//            rend.renderTela(pagina, imagens);
//            
            if (!pilha.pilhaEsquerda.empty()) {
                jBVoltar.setEnabled(true);
            } else {
                jBVoltar.setEnabled(false);
            }
            pilha.pilhaEsquerda.push(urlAcesso);
            if (evt.getSource().equals(jBBuscarUrl)) {
                pilha.limparPilhaDireita();
                jBAvancar.setEnabled(false);
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jBBuscarUrlActionPerformed

    private void jMIHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIHistoricoActionPerformed
        MenuHistorico historico = new MenuHistorico();
        historico.setVisible(true);
    }//GEN-LAST:event_jMIHistoricoActionPerformed

    private void jMIExibirFavoritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIExibirFavoritosActionPerformed
        MenuFavoritos favoritos = new MenuFavoritos();
        favoritos.setVisible(true);
    }//GEN-LAST:event_jMIExibirFavoritosActionPerformed

    private void jBNovaAbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovaAbaActionPerformed

        int numero = jTPAbas.getTabCount();
        if (this.getExtendedState() == 0) {
            Aba panel = new Aba();

            if (numero <= 8) {
                String titulo = "Aba " + numero;

                jTPAbas.addTab(titulo, panel);
                jTPAbas.setSelectedComponent(panel);
                int i = jTPAbas.getSelectedIndex();
                jTPAbas.setTabComponentAt(i, new ButtonTabComponent(jTPAbas));
            } else {
                int resposta = JOptionPane.showConfirmDialog(null, "Para adicionar mais abas, "
                        + "é necessário maximizar seu navegador. Deseja fazer "
                        + "isso agora?", "Deseja adicionar mais abas?", JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                    this.setExtendedState(MAXIMIZED_BOTH);
                }
            }
        } else {
            Aba panel = new Aba();

            if (numero <= 18) {

                String titulo = "Aba " + numero;

                jTPAbas.addTab(titulo, panel);
                jTPAbas.setSelectedComponent(panel);
                int i = jTPAbas.getSelectedIndex();
                jTPAbas.setTabComponentAt(i, new ButtonTabComponent(jTPAbas));
            } else {
                JOptionPane.showMessageDialog(null, "Você alcançou o número máximo de abas");
                jBNovaAba.setEnabled(false);
            }
        }

    }//GEN-LAST:event_jBNovaAbaActionPerformed

    private void jTPAbasComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTPAbasComponentRemoved
        if (jTPAbas.getTabCount() <= 0) {
            System.exit(0);
        }
        if (!jBNovaAba.isEnabled()) {
            jBNovaAba.setEnabled(true);
        } else {
            jBNovaAba.setEnabled(false);
        }
    }//GEN-LAST:event_jTPAbasComponentRemoved

    private void jBUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUserActionPerformed
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
    }//GEN-LAST:event_jBUserActionPerformed

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed

        String ultimaUrl = pilha.pilhaEsquerda.empty() ? "" : pilha.voltar();
        jTFUrl.setText(ultimaUrl);
        jBBuscarUrlActionPerformed(evt);
        if (pilha.pilhaEsquerda.empty()) {
            jBVoltar.setEnabled(false);
        }
        jBAvancar.setEnabled(true);
    }//GEN-LAST:event_jBVoltarActionPerformed

    private void jBAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAvancarActionPerformed

        String proximaUrl = pilha.pilhaDireita.empty() ? "" : pilha.avancar();
        jTFUrl.setText(proximaUrl);
        jBBuscarUrlActionPerformed(evt);
        if (pilha.pilhaDireita.empty()) {
            jBAvancar.setEnabled(false);
        }
        if (pilha.pilhaEsquerda.empty()) {
            jBVoltar.setEnabled(false);
        }
    }//GEN-LAST:event_jBAvancarActionPerformed

    private void jMIConfigRedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIConfigRedeActionPerformed
        
        rede.setVisible(true);
    }//GEN-LAST:event_jMIConfigRedeActionPerformed

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
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaceGrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAvancar;
    private javax.swing.JButton jBBuscarUrl;
    private javax.swing.JButton jBMenu;
    private javax.swing.JButton jBNovaAba;
    private javax.swing.JButton jBUser;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JMenu jMFavoritos;
    private javax.swing.JMenuItem jMIAddFavorito;
    private javax.swing.JMenuItem jMIConfigRede;
    private javax.swing.JMenuItem jMIExibirFavoritos;
    private javax.swing.JMenuItem jMIFav1;
    private javax.swing.JMenuItem jMIFav2;
    private javax.swing.JMenuItem jMIFav3;
    private javax.swing.JMenuItem jMIFav4;
    private javax.swing.JMenuItem jMIFav5;
    private javax.swing.JMenuItem jMIFavRecentes;
    private javax.swing.JMenuItem jMIHistorico;
    private javax.swing.JMenuItem jMIModoPrivado;
    private javax.swing.JPanel jPAba1;
    private javax.swing.JPanel jPAcoes;
    private javax.swing.JPanel jPNavegacao;
    private javax.swing.JPanel jPUrl;
    private javax.swing.JPopupMenu jPopupMenu;
    private javax.swing.JScrollPane jSPPagina;
    private javax.swing.JPopupMenu.Separator jSeparador1;
    private javax.swing.JPopupMenu.Separator jSeparador2;
    private javax.swing.JPopupMenu.Separator jSeparador3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextField jTFUrl;
    private javax.swing.JTabbedPane jTPAbas;
    public javax.swing.JEditorPane pagina;
    // End of variables declaration//GEN-END:variables

    //testes com arquivo local, html mais simples
//            JFileChooser chooser = new JFileChooser();
//            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
//
//            }
//            BufferedReader br = new BufferedReader(new FileReader(chooser.getSelectedFile()));
//            String linha = "";
//            while (br.ready()) {
//                while (br.ready()) {
//                    linha += br.readLine();
//                }
//            }
//            br.close();
//            br.close();
    /*  Alguns sites que renderizam rápido
                http://po.ta.to/
                http://www.ismycomputeron.com/
                http://www.pudim.com.br/
     */
}
