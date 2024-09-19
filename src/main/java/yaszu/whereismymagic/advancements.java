 package yaszu.whereismymagic;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import yaszu.whereismymagic.item.ModItems;

import java.util.function.Consumer;


public class advancements implements DataGeneratorEntrypoint {

    static class AdvancementsProvider extends FabricAdvancementProvider {
        protected AdvancementsProvider(FabricDataOutput output) {
            super(output);
        }

        @Override
        public void generateAdvancement(Consumer<Advancement> consumer) {
            Advancement rootAdvancement = Advancement.Builder.create()
                    .display(
                            ModItems.CRACK,
                            Text.literal("Can I snort it?"),
                            Text.literal("OOOOO funny material"),
                            new Identifier("textures/gui/advancements/backgrounds/adventure.png"),
                            AdvancementFrame.GOAL,
                            true,
                            true,
                            true
                            )
                    .criterion("got_crack", InventoryChangedCriterion.Conditions.items((ModItems.CRACK)))
                    .build(consumer, "where-is-my-magic" + "/root");
        }
    }


    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {

    }
}
