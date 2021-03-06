package freeseawind.lf.basic.rootpane;

import java.awt.Component;
import java.awt.Container;
import java.awt.Insets;
import java.awt.Rectangle;

import javax.swing.JMenuBar;
import javax.swing.JRootPane;
import javax.swing.plaf.RootPaneUI;

/**
 * 根窗格布局类
 *
 * @author freeseawind@github
 * @version 1.0
 *
 */
public class LuckMetalRootPaneLayout extends LuckRootPaneLayout
{
    public void layoutContainer(Container parent)
    {
        JRootPane root = (JRootPane) parent;
        Rectangle bound = root.getBounds();
        Insets inset = root.getInsets();

        // 获取内容面板实际宽度, 减去左右边框面积
        int w = bound.width - inset.right - inset.left;

        // 获取内容面板实际高度, 减去上下边框面积
        int h = bound.height - inset.top - inset.bottom;

        // 设置层级面板在根窗格中的位置
        if(root.getLayeredPane() != null)
        {
            root.getLayeredPane().setBounds(inset.left, inset.top, w, h);
        }

        // 玻璃窗格是在层级面板中,所以坐标从(0, 0)开始
        if(root.getGlassPane() != null)
        {
            root.getGlassPane().setBounds(inset.left, inset.top, w, h);
        }

        int nextY = 0;

        RootPaneUI rootPaneUI = root.getUI();

        if(rootPaneUI instanceof LuckMetalRootPaneUI)
        {
            // 先布局标题面板
            Component titlePanel = ((LuckMetalRootPaneUI)rootPaneUI).getTitlePane();

            // 如果未取消窗体装饰
            if (titlePanel != null)
            {
                titlePanel.setBounds(0, nextY, w, titlePanel.getHeight());

                nextY += titlePanel.getHeight();
            }
        }

        // 布局JMenuBar
        JMenuBar menuBar = root.getJMenuBar();

        if(menuBar != null && menuBar.isVisible())
        {
            menuBar.setBounds(0, nextY, w, menuBar.getPreferredSize().height);

            nextY += menuBar.getPreferredSize().getHeight();
        }

        // 布局内容面板
        root.getContentPane().setBounds(0, nextY, w, h);
    }
}
