package ban1333.enderbow.item;

import ban1333.enderbow.Enderbow;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, Enderbow.MODID);
    
    public static final RegistryObject<Item> ENDERBOW = ITEMS.register("enderbow",
        () -> new BowItem(new Item.Properties().tab(ItemCreativeModeTab.TUTORIAL_TAB).durability(500)));
    
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
