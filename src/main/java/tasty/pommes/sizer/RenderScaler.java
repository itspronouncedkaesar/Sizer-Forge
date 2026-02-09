package tasty.pommes.sizer;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class RenderScaler {

    @SubscribeEvent
    public static void onRenderPlayer(RenderPlayerEvent.Pre event) {
        PoseStack stack = event.getPoseStack();
        // Cast Double to float for rendering
        float scale = (float) Config.PLAYER_SCALE.get();
        stack.scale(scale, scale, scale);
    }
}
