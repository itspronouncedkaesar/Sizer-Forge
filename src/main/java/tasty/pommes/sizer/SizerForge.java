package tasty.pommes.sizer;

import net.minecraftforge.api.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.IEventBusSubscriber;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.common.MinecraftForge;

@Mod(SizerForge.MOD_ID)
public class SizerForge {
    public static final String MOD_ID = "sizer";

    public SizerForge() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register mod's common setup method for modloading
        ModLoadingContext.registerConfig(MOD_ID, ModConfig.Type.COMMON, Config.SPEC);

        // Register RenderScaler class to handle player rendering
        MinecraftForge.EVENT_BUS.register(RenderScaler.class);
    }
}
