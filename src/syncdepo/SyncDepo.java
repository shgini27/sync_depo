/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syncdepo;

import com.saptaslama.controller.MyLog;
import com.saptaslama.controller.SendDataManual;
import com.saptaslama.controller.SendScheduledTask;
import com.saptaslama.controller.SyncScheduledTask;
import com.saptaslama.view.SyncDepoView;
import java.util.Timer;

/**
 *
 * @author Shagy
 */
public class SyncDepo {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyLog.initLog();
        
//        Timer time = new Timer(); // Instantiate Timer Object
//        Timer time2 = new Timer(); // Instantiate Timer Object
//        SendScheduledTask st = new SendScheduledTask(); // Instantiate SheduledTask class
//        SyncScheduledTask sync = new SyncScheduledTask();
//        time.schedule(st, 0, 1000 * 60 * 30); // Create Repetitively task for every 1 secs
//        time2.schedule(sync, 1000 * 60 * 15, 1000 * 60 * 30);

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing
                    .UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | 
                javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SyncDepoView.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SyncDepoView().setVisible(true);
        });
    }
}
