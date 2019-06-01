/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import javafx.stage.FileChooser;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import service.Nos;
import service.ParseHtml;
import service.navegadorService;

/**
 *
 * @author Lenon
 */
public class interfaceGrafica extends javax.swing.JFrame {

    navegadorService nav = new navegadorService();

    /**
     * Creates new form interfaceGrafica
     */
    public interfaceGrafica() {
        initComponents();
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
        jPAbas = new javax.swing.JPanel();
        jBNovaAba = new javax.swing.JButton();
        jTPAbas = new JTabbedPane();
        jPAba1 = new javax.swing.JPanel();
        jPNavegacao = new javax.swing.JPanel();
        jBVoltar = new javax.swing.JButton();
        jBAvancar = new javax.swing.JButton();
        jPUrl = new javax.swing.JPanel();
        jTFUrl = new javax.swing.JTextField();
        jBBuscarUrl = new javax.swing.JButton();
        jBUser = new javax.swing.JButton();
        jBMenu = new javax.swing.JButton();
        pagina = new javax.swing.JTextField();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Navegador");

        jBNovaAba.setText("+");
        jBNovaAba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovaAbaActionPerformed(evt);
            }
        });

        jTPAbas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTPAbas.setRequestFocusEnabled(false);

        jPAba1.setRequestFocusEnabled(false);
        jPAba1.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPAba1Layout = new javax.swing.GroupLayout(jPAba1);
        jPAba1.setLayout(jPAba1Layout);
        jPAba1Layout.setHorizontalGroup(
            jPAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPAba1Layout.setVerticalGroup(
            jPAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTPAbas.addTab("Nova aba", jPAba1);

        javax.swing.GroupLayout jPAbasLayout = new javax.swing.GroupLayout(jPAbas);
        jPAbas.setLayout(jPAbasLayout);
        jPAbasLayout.setHorizontalGroup(
            jPAbasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAbasLayout.createSequentialGroup()
                .addComponent(jTPAbas, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(jBNovaAba)
                .addContainerGap(315, Short.MAX_VALUE))
        );
        jPAbasLayout.setVerticalGroup(
            jPAbasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBNovaAba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTPAbas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jBVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/voltar.png"))); // NOI18N
        jBVoltar.setToolTipText("Voltar uma página");

        jBAvancar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/avancar.png"))); // NOI18N
        jBAvancar.setToolTipText("Avançar uma página");

        jPUrl.setBackground(new java.awt.Color(255, 255, 255));

        jTFUrl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFUrlActionPerformed(evt);
            }
        });

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
                .addComponent(jTFUrl, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
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

        jBUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/user.png"))); // NOI18N

        jBMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/menu.png"))); // NOI18N
        jBMenu.setToolTipText("Abrir menu");
        jBMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMenuActionPerformed(evt);
            }
        });

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jBMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
        jPNavegacaoLayout.setVerticalGroup(
            jPNavegacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPNavegacaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPNavegacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPNavegacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPAbas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pagina, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPAbas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPNavegacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(84, Short.MAX_VALUE)
                    .addComponent(pagina, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMenuActionPerformed
        //conferir com o professor se pode ser dessa forma
        jPopupMenu.show(jBMenu, WIDTH - 160, jBMenu.getY() + 27);
    }//GEN-LAST:event_jBMenuActionPerformed

    private void jBBuscarUrlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarUrlActionPerformed

        try {
            //testes com arquivo local, html mais simples
//            URL url = new URL(jTFUrl.getText());
//            File file = new File("C:\\Users\\Lenon\\Desktop\\page.html");
//            nav.urlDown(url, file);
            JFileChooser chooser = new JFileChooser();
            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {

            }
            BufferedReader br = new BufferedReader(new FileReader(chooser.getSelectedFile()));
//            BufferedReader br = new BufferedReader(new FileReader(file));
            String linha = "";
            while (br.ready()) {
                linha += br.readLine();
            }
            br.close();

            ParseHtml p = new ParseHtml();
            Nos arvore = p.parseArvore(linha, null);
            System.out.println(arvore.getNameTag());

            for (int i = 0; i < arvore.getNoChildren().size(); i++) {
                if (arvore.getNoChildren().get(i).getTexto() != null) {
                    pagina.setText(pagina.getText() + "\n" + arvore.getNoChildren().get(i).getTexto());
                }
                for (int k = 0; k < arvore.getNoChildren().get(i).getNoChildren().size(); k++) {
                    if (arvore.getNoChildren().get(i).getNoChildren().get(k).getTexto() != null) {
                        pagina.setText(pagina.getText() + "\n" + arvore.getNoChildren().get(i).getNoChildren().get(k).getTexto());
                    }
                    for (int l = 0; l < arvore.getNoChildren().get(i).getNoChildren().get(k).getNoChildren().size(); l++) {
                        if (arvore.getNoChildren().get(i).getNoChildren().get(k).getNoChildren().get(l).getTexto() != null) {
                            pagina.setText(pagina.getText() + "\n" + arvore.getNoChildren().get(i).getNoChildren().get(k).getNoChildren().get(l).getTexto());
                        }
                        for (int m = 0; m < arvore.getNoChildren().get(i).getNoChildren().get(k).getNoChildren().get(l).getNoChildren().size(); m++) {
                            if (arvore.getNoChildren().get(i).getNoChildren().get(k).getNoChildren().get(l).getNoChildren().get(m).getTexto() != null) {
                                pagina.setText(pagina.getText() + "\n" + arvore.getNoChildren().get(i).getNoChildren().get(k).getNoChildren().get(l).getNoChildren().get(m).getTexto());
                            }
                        }
                    }
                }
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jBBuscarUrlActionPerformed

    private void jTFUrlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFUrlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFUrlActionPerformed

    private void jMIHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIHistoricoActionPerformed
        MenuHistorico historico = new MenuHistorico();
        historico.setVisible(true);
    }//GEN-LAST:event_jMIHistoricoActionPerformed

    private void jMIExibirFavoritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIExibirFavoritosActionPerformed
        MenuFavoritos favoritos = new MenuFavoritos();
        favoritos.setVisible(true);
    }//GEN-LAST:event_jMIExibirFavoritosActionPerformed

    private void jBNovaAbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovaAbaActionPerformed
        //        JPanel jPAba2 = new JPanel();
                jPNavegacao.setVisible(false);
        //        int altura = jTPAbas.getHeight();
        //        //System.out.println(jTPAbas.getSize());
        //        jTPAbas.setSize(jPAba1.getWidth() + jPAba1.getWidth(), altura);
        //        //System.out.println(jTPAbas.getSize());
        //        jTPAbas.add(jPAba2).setBounds(jPAba1.getX() + 1, jPAba1.getY(), jPAba1.getWidth(), jPAba1.getHeight());

        int numero = jTPAbas.getTabCount();

        JPanel panel = new JPanel(new BorderLayout());

        String titulo = "Aba " + numero;

        jTPAbas.addTab(titulo, panel);
    }//GEN-LAST:event_jBNovaAbaActionPerformed

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
    private javax.swing.JPanel jPAbas;
    private javax.swing.JPanel jPNavegacao;
    private javax.swing.JPanel jPUrl;
    private javax.swing.JPopupMenu jPopupMenu;
    private javax.swing.JPopupMenu.Separator jSeparador1;
    private javax.swing.JPopupMenu.Separator jSeparador2;
    private javax.swing.JPopupMenu.Separator jSeparador3;
    private javax.swing.JTextField jTFUrl;
    private javax.swing.JTabbedPane jTPAbas;
    private javax.swing.JTextField pagina;
    // End of variables declaration//GEN-END:variables
}
