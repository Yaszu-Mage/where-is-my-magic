package yaszu.whereismymagic.mobs;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import yaszu.whereismymagic.WhereIsMyMagic;
import yaszu.whereismymagic.mobs.client.Rug;
import yaszu.whereismymagic.mobs.custom.RugEntity;

public class ModEntities {
    public static final EntityType<RugEntity> RUG = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(WhereIsMyMagic.MOD_ID, "rug"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, RugEntity::new).dimensions(EntityDimensions.fixed(1f,1f)).build());
}
