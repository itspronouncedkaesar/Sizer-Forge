package tasty.pommes.sizer;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class RenderScaler {

    @SubscribeEvent
    public static void onRenderPlayer(RenderPlayerEvent.Pre event) {
        PoseStack stack = event.getPoseStack();
        double scale = Config.PLAYER_SCALE.get();
        stack.scale((float) scale, (float) scale, (float) scale);
    }
}
