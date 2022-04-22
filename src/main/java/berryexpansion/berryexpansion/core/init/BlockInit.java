package berryexpansion.berryexpansion.core.init;

import berryexpansion.berryexpansion.BerryExpansion;
import berryexpansion.berryexpansion.common.blocks.BlackberryBushBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BerryExpansion.MOD_ID);

    public static final RegistryObject<Block> BLACKBERRY_BUSH = BLOCKS.register("blackberry_bush", () -> new BlackberryBushBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH)));
}
