package freeseawind.lf.basic.toolips;

import java.awt.Insets;

import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import freeseawind.lf.cfg.LuckResourceBundle;
import freeseawind.lf.utils.LuckRes;

/**
 * <p>
 * LuckToolipUI资源绑定类。
 * </p>
 * <p>
 * A LuckToolipUI resource bundle class.
 * </p>
 *
 * @author freeseawind@github
 * @version 1.0
 *
 */
public class LuckToolipUIBundle extends LuckResourceBundle
{
    /**
     * <p>JToolip边框属性key</p>
     * <p>JToolip border properties.</p>
     */
    public static final String BORDER = "ToolTip.border";

    /**
     * <p>[LittleLuck属性]JToolip背景图片属性key。<p>
     * <p>[LittLeLuck Attributes] JToolip background image properties.</p>
     */
    public static final String BGIMG = "ToolTip.bgImg";

    public void uninitialize()
    {
        UIManager.put(BORDER, null);

        UIManager.put(BGIMG, null);
    }

    @Override
    protected void installBorder(UIDefaults table)
    {
        // 由于不能直接在JToolip上加半透明阴影边框, 这里的边框只作为内边框使用,间距根据背景图片阴影来设置。

        // Because it is not applied directly on JToolip translucent shadow
        // border, where border use only as an internal border, spacing,
        // according to the background image to set the shadow.
        UIManager.put(BORDER, new EmptyBorder(new Insets(6, 8, 8, 8)));
    }

    @Override
    protected void loadImages(UIDefaults table)
    {
        UIManager.put(BGIMG, LuckRes.getImage("toolip/shadow_border.9.png"));
    }
}
