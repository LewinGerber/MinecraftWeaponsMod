package ch.hyperreal.nawm;

import ch.hyperreal.nawm.init.*;
import ch.hyperreal.nawm.objects.blocks.crops.MagicMushroomCrop;
import net.minecraft.item.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("nawm")
public class MinecraftWeaponsMod {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "nawm";
    public static MinecraftWeaponsMod instance;

    public MinecraftWeaponsMod() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);

        SoundInit.SOUNDS.register(modEventBus);
        EnchantmentInit.ENCHANTMENTS.register(modEventBus);
        ModEntityTypes.ENTITY_TYPES.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);
        ItemInit.ITEMS.register(modEventBus);

        instance = this;
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event){
        final IForgeRegistry<Item> registry = event.getRegistry();

        BlockInit.BLOCKS.getEntries().stream()
                .filter(block -> !(block.get() instanceof MagicMushroomCrop))
                .map(RegistryObject::get).forEach(block -> {
            final Item.Properties properties = new Item.Properties().group(WeaponItemGroup.instance);
            final BlockItem blockItem = new BlockItem(block, properties);
            blockItem.setRegistryName(Objects.requireNonNull(block.getRegistryName()));
            registry.register(blockItem);
        });
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {

    }

    public static class WeaponItemGroup extends ItemGroup {

        public static final WeaponItemGroup instance = new WeaponItemGroup(ItemGroup.GROUPS.length, "nAWM");

        private WeaponItemGroup(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemInit.AZURE.get());
        }
    }
}
