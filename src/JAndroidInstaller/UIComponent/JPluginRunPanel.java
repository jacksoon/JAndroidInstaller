/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JAndroidInstaller.UIComponent;

import JAndroidInstaller.InstallerUI.JAPKInstallerDriverUI;
import JAndroidInstaller.PluginManager.*;
import WSwingUILib.Component.JMiddleContentPanel;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author wcss
 */
public class JPluginRunPanel extends JMiddleContentPanel implements JPluginScriptRequest {

    private JPluginInfo pluginObj = null;
    private Boolean onlyRead = false;
    private JRunPluginScript scriptRun = new JRunPluginScript();

    /**
     * Creates new form JPluginRunPanel
     */
    public JPluginRunPanel(JPluginInfo obj, Boolean oread) {
        initComponents();
        scriptRun.setRequestEvent(this);
        pluginObj = obj;
        onlyRead = oread;

        if (onlyRead) {
            this.onlyReadShow();
        } else {
            this.allShow();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        plReadme = new JAndroidInstaller.UIComponent.JReadmePanel();
        plSelectFile = new WSwingUILib.Component.Base.JImagePanel("/JAndroidInstaller/UIImage/readme-back.png");
        jLabel1 = new javax.swing.JLabel();
        txtFile = new javax.swing.JTextField();
        ubtnSelectFile = new WSwingUILib.Component.JUIButton();
        plPluginStartup = new WSwingUILib.Component.Base.JImagePanel("/JAndroidInstaller/UIImage/readme-back.png");
        ubtnRun = new WSwingUILib.Component.JUIButton();
        lblInfo = new javax.swing.JLabel();

        jScrollPane1.setAutoscrolls(true);

        jEditorPane1.setEditable(false);
        jEditorPane1.setFont(new java.awt.Font("文泉驿微米黑", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(jEditorPane1);

        plSelectFile.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        jLabel1.setFont(new java.awt.Font("文泉驿微米黑", 1, 14)); // NOI18N
        jLabel1.setText("镜像文件：");

        ubtnSelectFile.setButtonText("选择镜像文件");
        ubtnSelectFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ubtnSelectFileMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ubtnSelectFileLayout = new javax.swing.GroupLayout(ubtnSelectFile);
        ubtnSelectFile.setLayout(ubtnSelectFileLayout);
        ubtnSelectFileLayout.setHorizontalGroup(
            ubtnSelectFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
        );
        ubtnSelectFileLayout.setVerticalGroup(
            ubtnSelectFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout plSelectFileLayout = new javax.swing.GroupLayout(plSelectFile);
        plSelectFile.setLayout(plSelectFileLayout);
        plSelectFileLayout.setHorizontalGroup(
            plSelectFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plSelectFileLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ubtnSelectFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        plSelectFileLayout.setVerticalGroup(
            plSelectFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plSelectFileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plSelectFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plSelectFileLayout.createSequentialGroup()
                        .addComponent(ubtnSelectFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFile))
                .addContainerGap())
        );

        plPluginStartup.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        ubtnRun.setButtonText("运行");
        ubtnRun.setFont(new java.awt.Font("文泉驿微米黑", 0, 18)); // NOI18N
        ubtnRun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ubtnRunMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ubtnRunLayout = new javax.swing.GroupLayout(ubtnRun);
        ubtnRun.setLayout(ubtnRunLayout);
        ubtnRunLayout.setHorizontalGroup(
            ubtnRunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 93, Short.MAX_VALUE)
        );
        ubtnRunLayout.setVerticalGroup(
            ubtnRunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblInfo.setFont(new java.awt.Font("文泉驿微米黑", 1, 14)); // NOI18N
        lblInfo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblInfo.setText("jLabel2");

        javax.swing.GroupLayout plPluginStartupLayout = new javax.swing.GroupLayout(plPluginStartup);
        plPluginStartup.setLayout(plPluginStartupLayout);
        plPluginStartupLayout.setHorizontalGroup(
            plPluginStartupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plPluginStartupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ubtnRun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        plPluginStartupLayout.setVerticalGroup(
            plPluginStartupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plPluginStartupLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plPluginStartupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(ubtnRun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(plPluginStartup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(plReadme, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plSelectFile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plSelectFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plPluginStartup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plReadme, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * 显示打开对话框
     *
     * @return
     */
    private String showOpenDialog() {
        JFileChooser parseDir = new JFileChooser();
        parseDir.setDialogTitle("选择镜像文件！（支持：.img,.zip）");
        parseDir.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int result = parseDir.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            if (parseDir.getSelectedFile().getName().endsWith(".img")) {
                return parseDir.getSelectedFile().getAbsolutePath();
            } else if (parseDir.getSelectedFile().getName().endsWith(".zip")) {
                return parseDir.getSelectedFile().getAbsolutePath();
            } else {
                return "";
            }
        } else {
            return "";
        }
    }

    private void ubtnSelectFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ubtnSelectFileMouseClicked
        // TODO add your handling code here:
        this.txtFile.setText(showOpenDialog());
    }//GEN-LAST:event_ubtnSelectFileMouseClicked

    private void ubtnRunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ubtnRunMouseClicked
        // TODO add your handling code here:
        try {
            scriptRun.runScript(pluginObj.getPluginWorkspace(), this.txtFile.getText(), pluginObj.getPluginWorkspace() + "/run.sh");
            ubtnRun.setEnabled(false);
        } catch (Exception ex) {
            Logger.getLogger(JPluginRunPanel.class.getName()).log(Level.SEVERE, null, ex);
            plReadme.setReadmeInfo("插件运行的过程中出错！请联系作者！");
        }
    }//GEN-LAST:event_ubtnRunMouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblInfo;
    private WSwingUILib.Component.Base.JImagePanel plPluginStartup;
    private JAndroidInstaller.UIComponent.JReadmePanel plReadme;
    private WSwingUILib.Component.Base.JImagePanel plSelectFile;
    private javax.swing.JTextField txtFile;
    private WSwingUILib.Component.JUIButton ubtnRun;
    private WSwingUILib.Component.JUIButton ubtnSelectFile;
    // End of variables declaration//GEN-END:variables

    @Override
    public void printHint(final String content) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                plReadme.setReadmeInfo(content);
            }
        });
    }

    @Override
    public void shell(String cmd, String param) {
    }

    /**
     * 载入说明
     *
     * @throws Exception
     */
    private void loadReadme() throws Exception {
        if (new File(this.pluginObj.getPluginWorkspace() + "/readme.txt").exists()) {
            String[] lines = JAppToolKit.JDataHelper.readAllLines(this.pluginObj.getPluginWorkspace() + "/readme.txt");
            String allTxt = "";
            for (String s : lines) {
                allTxt += s + "\n";
            }
            this.jEditorPane1.setText(allTxt);
        }
    }

    /**
     * 只读
     */
    private void onlyReadShow() {
        try {
            loadReadme();
            this.plReadme.setReadmeInfo("对不起，由于您当前所用的设备环境与插件要求的环境不符合，所以不能使用此插件！");
            this.plSelectFile.setVisible(false);
            this.plPluginStartup.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(JPluginRunPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * 显示所有
     */
    private void allShow() {
        try {
            loadReadme();
            this.plReadme.setReadmeInfo(this.pluginObj.getPluginInfo());
            this.lblInfo.setText("请您仔细阅读上面的说明后,再点击右边的按钮运行此插件！-->");
            this.plSelectFile.setVisible(false);
            this.plPluginStartup.setVisible(false);
            if (pluginObj.getPluginUIType() != null) {
                if (pluginObj.getPluginUIType().equals("shell")) {
                    this.plPluginStartup.setVisible(true);
                } else if (pluginObj.getPluginUIType().equals("flash")) {
                    this.plSelectFile.setVisible(true);
                    this.plPluginStartup.setVisible(true);
                }
            } else {
                plReadme.setReadmeInfo("插件配置文件有错误！此插件无法使用！");
            }
        } catch (Exception ex) {
            Logger.getLogger(JPluginRunPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
