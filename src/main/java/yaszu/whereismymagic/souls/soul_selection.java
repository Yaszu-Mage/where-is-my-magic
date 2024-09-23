package yaszu.whereismymagic.souls;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
@Environment(EnvType.CLIENT)
public class soul_selection extends Screen {
    protected soul_selection() {
        super(Text.literal("Soul Selection"));
    }

    public ButtonWidget button1;
}
