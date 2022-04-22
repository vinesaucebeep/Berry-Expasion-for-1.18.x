package berryexpansion.berryexpansion.core.init;

import berryexpansion.berryexpansion.BerryExpansion;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BerryExpansion.MOD_ID);

    public static final RegistryObject<Item> SWEET_BERRY_JAM = ITEMS.register("sweet_berry_jam", () -> new HoneyBottleItem(new Item.Properties().tab(BerryExpansion.BE_TAB).food(new FoodProperties.Builder().nutrition(6).saturationMod(0.1F).build()).craftRemainder(Items.GLASS_BOTTLE).stacksTo(16)));
    public static final RegistryObject<Item> SWEET_BERRY_JAM_SANDWICH = ITEMS.register("sweet_berry_jam_sandwich", () -> new Item(new Item.Properties().tab(BerryExpansion.BE_TAB).food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6f).build())));
    public static final RegistryObject<Item> BLACKBERRIES = ITEMS.register("blackberries", () -> new ItemNameBlockItem(BlockInit.BLACKBERRY_BUSH.get(), new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.1F).build()).tab(BerryExpansion.BE_TAB)));
    public static final RegistryObject<Item> BLACKBERRY_JAM = ITEMS.register("blackberry_jam", () -> new HoneyBottleItem(new Item.Properties().tab(BerryExpansion.BE_TAB).food(new FoodProperties.Builder().nutrition(6).saturationMod(0.1F).build()).craftRemainder(Items.GLASS_BOTTLE).stacksTo(16)));
    public static final RegistryObject<Item> BLACKBERRY_JAM_SANDWICH = ITEMS.register("blackberry_jam_sandwich", () -> new Item(new Item.Properties().tab(BerryExpansion.BE_TAB).food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6F).build())));
}
