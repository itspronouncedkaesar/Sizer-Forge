package tasty.pommes.sizer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.common.MinecraftForge;

@Mod(SizerForge.MOD_ID)
public class SizerForge {
    public static final String MOD_ID = "sizer";

    public SizerForge() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        // Register render scaler for client
        MinecraftForge.EVENT_BUS.register(RenderScaler.class);
    }
}
