import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.IEventBusSubscriber;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.api.distmarker.Dist;

@Mod(SizerForge.MOD_ID)
public class SizerForge {
    public static final String MOD_ID = "sizer";

    public SizerForge() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register config loading event
        modBus.addListener(this::commonSetup);

        // Register render scaler for client
        MinecraftForge.EVENT_BUS.register(RenderScaler.class);
    }

    private void commonSetup(final ModConfig.ModConfigEvent event) {
        // Now using the correct API
        Config.SPEC.setConfig(Config.SPEC);
    }
}
