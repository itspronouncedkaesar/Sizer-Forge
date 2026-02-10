import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.IEventBusSubscriber;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import tasty.pommes.sizer.RenderScaler;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import tasty.pommes.sizer.Config;

@Mod(SizerForge.MOD_ID)
public class SizerForge {
    public static final String MOD_ID = "sizer";

    public SizerForge() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        
        // Register config and setup events
        modBus.addListener(this::commonSetup);

        // Register render scaler for client
        MinecraftForge.EVENT_BUS.register(RenderScaler.class);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Register the mod config in the appropriate way
        ModConfig.register(Config.SPEC);
    }
}
