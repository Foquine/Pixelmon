package pixelmon.models.apricornTrees;

import java.util.ArrayList;

import net.minecraft.src.ModelBase;
import pixelmon.enums.EnumApricornTrees;

public class ApricornTreeStore {

	private static ArrayList<ModelStageEnum> treeModels = new ArrayList<ModelStageEnum>();

	private static final String[] modelList=new String[]{"ModelApricornTreeSprout", "ModelApricornTreeStage1", "ModelApricornTreeMiddle", "ModelApricornTreeStage2", "ModelApricornTreeStage3", "ModelApricornTreeFinal" };
	
	public static ModelApricornTreeBase getModel(int stage) {
		for (int i = 0; i < treeModels.size(); i++) {
			if (treeModels.get(i).stage == stage) {
				return treeModels.get(i).model;
			}
		}
		ModelApricornTreeBase model = null;
		try {
			Class<?> var3 = (Class<?>) Class.forName("pixelmon.models.apricornTrees." + modelList[stage]);
			if (var3 != null) {
				model = (ModelApricornTreeBase) var3.getConstructor(new Class[] {}).newInstance(new Object[] {});
			}

		} catch (Exception e) {
			System.out.println("Can't find Model for apricorn tree stage " + stage);
		}
		treeModels.add(new ModelStageEnum(stage, model));
		return model;
	}

	public static String getTexture(EnumApricornTrees tree, int i) {
		return "/pixelmon/texture/apricornTrees/apricornTree" + tree.toString()+"/" + modelList[i] + ".png";
	}

}
