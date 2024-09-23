package client;

import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.Identifier;
import yaszu.whereismymagic.WhereIsMyMagic;

public class SoulHudOverlay implements HudRenderCallback {
    private static final Identifier FILLED_MANA = new Identifier(WhereIsMyMagic.MOD_ID,
            "textures/mana/filled_mana.png");
    private static final Identifier EMPTY_MANA = new Identifier(WhereIsMyMagic.MOD_ID,
            "textures/mana/empty_mana.png");
    @Override
    public void onHudRender(DrawContext drawContext, float tickDelta) {

    }
}
