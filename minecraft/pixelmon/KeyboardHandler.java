package pixelmon;

import java.util.Random;

import org.lwjgl.input.Keyboard;

import pixelmon.comm.EnumPackets;
import pixelmon.comm.PacketCreator;
import pixelmon.entities.pixelmon.BaseEntityPixelmon;
import pixelmon.entities.pixelmon.EntityWaterPixelmon;
import pixelmon.entities.pixelmon.helpers.IHaveHelper;
import pixelmon.entities.pokeballs.EntityPokeBall;
import pixelmon.enums.EnumPokeballs;
import pixelmon.gui.GuiPixelmonOverlay;
import pixelmon.storage.PixelmonStorage;
import net.minecraft.client.Minecraft;
import net.minecraft.src.KeyBinding;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModLoader;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.Packet250CustomPayload;

public class KeyboardHandler {
	public static final KeyBinding minmizePixelmonKey = new KeyBinding("Minimize Pixelmon Overlay", Keyboard.KEY_O);
	public static final KeyBinding sendPixelmonKey = new KeyBinding("Send/Recieve Pixelmon", Keyboard.KEY_P);
	public static final KeyBinding nextPixelmonKey = new KeyBinding("Next Pixelmon", 27);
	public static final KeyBinding previousPixelmonKey = new KeyBinding("Previous Pixelmon", 26);
	// Debug Key
	public static final KeyBinding debugKey = new KeyBinding("Debug Key [Pixelmon]", Keyboard.KEY_F1);

	public static void handleKeyboardEvent(KeyBinding event) {
		if (ModLoader.getMinecraftInstance().theWorld == null)
			return;
		if (ModLoader.getMinecraftInstance().currentScreen != null)
			return;
		if (event == nextPixelmonKey) {
			GuiPixelmonOverlay.selectNextPixelmon();
		} else if (event == previousPixelmonKey) {
			GuiPixelmonOverlay.selectPreviousPixelmon();
		} else if (event == sendPixelmonKey) {
			ModLoader.sendPacket(PacketCreator.createPacket(EnumPackets.SendPokemon, ServerStorageDisplay.pokemon[GuiPixelmonOverlay.selectedPixelmon].pokemonID));
		} else if (event == minmizePixelmonKey) {
			GuiPixelmonOverlay.isGuiMinimized = !GuiPixelmonOverlay.isGuiMinimized;
//		} else if (event == debugKey) {
//			Minecraft mc = ModLoader.getMinecraftInstance();
//			PixelmonDebug.debugKeyFunction(mc);
		}
	}
}
