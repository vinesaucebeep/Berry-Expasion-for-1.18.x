package berryexpansion.berryexpansion;

import berryexpansion.berryexpansion.core.init.BlockInit;
import berryexpansion.berryexpansion.core.init.ItemInit;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("berryexpansion")
public class BerryExpansion {

    public static final String MOD_ID = "berryexpansion";

    public static final CreativeModeTab BE_TAB = new CreativeModeTab(MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.SWEET_BERRY_JAM.get());
        }
    };

    private static final Logger LOGGER = LogManager.getLogger();

    public BerryExpansion() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MinecraftForge.EVENT_BUS.register(this);

        ItemInit.ITEMS.register(eventBus);
        BlockInit.BLOCKS.register(eventBus);

        eventBus.addListener(this::clientSetup);

    }

    public void clientSetup(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKBERRY_BUSH.get(), RenderType.cutout());
    }
}
