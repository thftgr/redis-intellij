package com.thftgr.redis;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.wm.ToolWindow;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class redisTabUI {


    private JPanel mainWindowContent;
    private JButton buttonAddDatabase;
    private JButton buttonRemoveDatabase;
    private JButton buttonRefreshDatabase;
    private JButton buttonOpenConsoleSelected;
    private JLabel pipe;

    public redisTabUI(ToolWindow toolWindow) {
        this.loadRedisToolBar();
    }

    private void loadRedisToolBar() {
        buttonAddDatabase.setIcon(AllIcons.General.Add);
        buttonAddDatabase.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                buttonAddDatabase.setContentAreaFilled(true);
            }

            public void mouseExited(MouseEvent e) {
                buttonAddDatabase.setContentAreaFilled(false);
            }
        });


        buttonRemoveDatabase.setIcon(AllIcons.General.HideToolWindow);
        buttonRemoveDatabase.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                buttonRemoveDatabase.setContentAreaFilled(true);
            }

            public void mouseExited(MouseEvent e) {
                buttonRemoveDatabase.setContentAreaFilled(false);
            }
        });
        pipe.setIcon(AllIcons.General.Divider);


        buttonRefreshDatabase.setIcon(AllIcons.Actions.Refresh);
        buttonRefreshDatabase.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                buttonRefreshDatabase.setContentAreaFilled(true);
            }

            public void mouseExited(MouseEvent e) {
                buttonRefreshDatabase.setContentAreaFilled(false);
            }
        });


        buttonOpenConsoleSelected.setIcon(AllIcons.Debugger.Console);
        buttonOpenConsoleSelected.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                buttonOpenConsoleSelected.setContentAreaFilled(true);
            }

            public void mouseExited(MouseEvent e) {
                buttonOpenConsoleSelected.setContentAreaFilled(false);
            }
        });
    }


    public JPanel getContent() {
        return mainWindowContent;
    }


}
