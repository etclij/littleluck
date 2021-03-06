package freeseawind.lf.basic.checkboxmenuitem;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.UIDefaults;
import javax.swing.plaf.IconUIResource;

import freeseawind.lf.cfg.LuckResourceBundle;
import freeseawind.lf.img.LuckIcon;
import freeseawind.lf.utils.LuckRes;

/**
 * LuckCheckBoxMenuItemUI资源绑定类
 *
 * @author freeseawind@github
 * @version 1.0
 */
public class LuckCheckboxMenuItemUIBundle extends LuckResourceBundle
{
    /**
     * CheckBoxMenuItem选中时背景颜色属性key
     */
    public static final String SELECTIONBG = "CheckBoxMenuItem.selectionBackground";

    /**
     * CheckBoxMenuItem选中时字体颜色属性key
     */
    public static final String SELECTIONFG = "CheckBoxMenuItem.selectionForeground";

    /**
     * CheckBoxMenuItem背景颜色属性key
     */
    public static final String BACKGROUND = "CheckBoxMenuItem.background";

    /**
     * CheckBoxMenuItem边框属性key
     */
    public static final String BORDER = "CheckBoxMenuItem.border";

    /**
     * CheckBoxMenuItem复选框属性key
     */
    public static final String CHECK_ICON = "CheckBoxMenuItem.checkIcon";

    /**
     * CheckBoxMenuItem箭头图标属性key
     */
    public static final String ARROW_ICON = "CheckBoxMenuItem.arrowIcon";

    /**
     * [自定义属性] JCheckBoxMenuItem选中时图标
     */
    public static final String NORMAL_ICON = "CheckBoxMenuItem.checkNormlIcon";

    /**
     * [自定义属性] JCheckBoxMenuItem选中时鼠标经过图标
     */
    public static final String ROLLVER_ICON = "CheckBoxMenuItem.checkRollverIcon";

    /**
     * CheckBoxMenuItem文本和复选框图标间距属性key, 当前默认为4
     */
    public static final String AFTERCHECKICONGAP = "CheckBoxMenuItem.afterCheckIconGap";

    /**
     * CheckBoxMenuItem最小文本偏移宽度属性key, 当前默认为0
     */
    public static final String MINIMUMTEXTOFFSET = "CheckBoxMenuItem.minimumTextOffset";

    /**
     * CheckBoxMenuItem复选框图标偏移x轴距离属性key, 当前默认为4
     */
    public static final String CHECKICONOFFSET = "CheckBoxMenuItem.checkIconOffset";

    @Override
    protected void installColor(UIDefaults table)
    {
        table.put(SELECTIONBG, getColorRes(60, 175, 210));

        table.put(SELECTIONFG, Color.WHITE);

        table.put(BACKGROUND, Color.WHITE);
    }

    @Override
    protected void installBorder(UIDefaults table)
    {
        table.put(BORDER, BorderFactory.createEmptyBorder());
    }

    @Override
    protected void loadImages(UIDefaults table)
    {
        table.put(CHECK_ICON, new LuckCheckboxIcon());

        table.put(ARROW_ICON, new IconUIResource(new LuckIcon(0, 0)));

        table.put(NORMAL_ICON, LuckRes.getImage("menu/checkbox_normal.png"));

        table.put(ROLLVER_ICON, LuckRes.getImage("menu/checkbox_rollver.png"));
    }

    @Override
    protected void installOther(UIDefaults table)
    {
        table.put(AFTERCHECKICONGAP, 4);

        table.put(MINIMUMTEXTOFFSET, 0);

        table.put(CHECKICONOFFSET, 4);
    }
}
