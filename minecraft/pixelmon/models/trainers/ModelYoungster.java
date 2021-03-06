// Date: 16/06/2012 8:06:47 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package pixelmon.models.trainers;

import net.minecraft.src.*;

public class ModelYoungster extends ModelBase {
	// fields
	ModelRenderer backpackstrap1;
	ModelRenderer backpackstrap2;
	ModelRenderer backpackstrap3;
	ModelRenderer backpackstrap4;
	ModelRenderer backpackstrap5;
	ModelRenderer backpackstrap6;
	ModelRenderer backpackstrap7;
	ModelRenderer backpackstrap8;
	ModelRenderer backpackstrap9;
	ModelRenderer backpackstrap10;
	ModelRenderer backpackstrap11;
	ModelRenderer backpackstrap12;
	ModelRenderer backpackstrap13;
	ModelRenderer backpackstrap14;
	ModelRenderer body;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer HeadBase;
	ModelRenderer Backpack1;
	ModelRenderer BackPack2;
	ModelRenderer Cap3;
	ModelRenderer Cap2;
	ModelRenderer Cap1;
	ModelRenderer head;

	public ModelYoungster() {
		textureWidth = 64;
		textureHeight = 32;
		//setTextureOffset("BackPack.Backpack", 0, 0);

		backpackstrap1 = new ModelRenderer(this, 59, 27);
		backpackstrap1.addBox(0F, 0F, 0F, 1, 3, 1);
		backpackstrap1.setRotationPoint(-4F, 5F, 0F);
		backpackstrap1.setTextureSize(64, 32);
		backpackstrap1.mirror = true;
		setRotation(backpackstrap1, 0.5205006F, 0.3346075F, 0F);
		backpackstrap2 = new ModelRenderer(this, 53, 28);
		backpackstrap2.addBox(-1F, 0F, 0F, 1, 3, 1);
		backpackstrap2.setRotationPoint(3F, 5F, 0F);
		backpackstrap2.setTextureSize(64, 32);
		backpackstrap2.mirror = true;
		setRotation(backpackstrap2, 0.5204921F, -0.3346145F, 0F);
		backpackstrap3 = new ModelRenderer(this, 52, 29);
		backpackstrap3.addBox(0F, 0F, 0F, 1, 1, 2);
		backpackstrap3.setRotationPoint(-4.01F, 4.4F, -1F);
		backpackstrap3.setTextureSize(64, 32);
		backpackstrap3.mirror = true;
		setRotation(backpackstrap3, -0.1047198F, 0F, 0F);
		backpackstrap4 = new ModelRenderer(this, 55, 27);
		backpackstrap4.addBox(0F, 0F, 0F, 1, 1, 2);
		backpackstrap4.setRotationPoint(1.99F, 4.4F, -1F);
		backpackstrap4.setTextureSize(64, 32);
		backpackstrap4.mirror = true;
		setRotation(backpackstrap4, -0.1047198F, 0F, 0F);
		backpackstrap5 = new ModelRenderer(this, 53, 26);
		backpackstrap5.addBox(0F, 0F, 0F, 1, 1, 2);
		backpackstrap5.setRotationPoint(2F, 5.4F, -2.7F);
		backpackstrap5.setTextureSize(64, 32);
		backpackstrap5.mirror = true;
		setRotation(backpackstrap5, 0.669215F, 0F, 0F);
		backpackstrap6 = new ModelRenderer(this, 53, 26);
		backpackstrap6.addBox(0F, 0F, 0F, 1, 1, 2);
		backpackstrap6.setRotationPoint(-4.01F, 5.4F, -3F);
		backpackstrap6.setTextureSize(64, 32);
		backpackstrap6.mirror = true;
		setRotation(backpackstrap6, 0.669215F, 0F, 0F);
		backpackstrap7 = new ModelRenderer(this, 53, 27);
		backpackstrap7.addBox(0F, 0F, 0F, 1, 3, 1);
		backpackstrap7.setRotationPoint(-4F, 5F, -3F);
		backpackstrap7.setTextureSize(64, 32);
		backpackstrap7.mirror = true;
		setRotation(backpackstrap7, 0.0371786F, 0F, 0F);
		backpackstrap8 = new ModelRenderer(this, 53, 27);
		backpackstrap8.addBox(0F, 0F, 0F, 1, 3, 1);
		backpackstrap8.setRotationPoint(2F, 5F, -3F);
		backpackstrap8.setTextureSize(64, 32);
		backpackstrap8.mirror = true;
		setRotation(backpackstrap8, 0.0371786F, 0F, 0F);
		backpackstrap9 = new ModelRenderer(this, 53, 24);
		backpackstrap9.addBox(0F, 0F, 0F, 1, 6, 1);
		backpackstrap9.setRotationPoint(2F, 7F, -3F);
		backpackstrap9.setTextureSize(64, 32);
		backpackstrap9.mirror = true;
		setRotation(backpackstrap9, 0.1396263F, 0F, -0.0743572F);
		backpackstrap10 = new ModelRenderer(this, 53, 26);
		backpackstrap10.addBox(0F, 0F, 0F, 1, 1, 4);
		backpackstrap10.setRotationPoint(2.5F, 12F, -2F);
		backpackstrap10.setTextureSize(64, 32);
		backpackstrap10.mirror = true;
		setRotation(backpackstrap10, 0.1115358F, -0.0371786F, 0F);
		backpackstrap11 = new ModelRenderer(this, 53, 24);
		backpackstrap11.addBox(-1F, 0F, 0F, 1, 6, 1);
		backpackstrap11.setRotationPoint(-3F, 7F, -3F);
		backpackstrap11.setTextureSize(64, 32);
		backpackstrap11.mirror = true;
		setRotation(backpackstrap11, 0.1396263F, 0F, 0.074351F);
		backpackstrap12 = new ModelRenderer(this, 53, 26);
		backpackstrap12.addBox(0F, 0F, 0F, 1, 1, 4);
		backpackstrap12.setRotationPoint(-4.5F, 12F, -2F);
		backpackstrap12.setTextureSize(64, 32);
		backpackstrap12.mirror = true;
		setRotation(backpackstrap12, 0.1115358F, -0.0371786F, 0F);
		backpackstrap13 = new ModelRenderer(this, 52, 27);
		backpackstrap13.addBox(0F, 0F, 0F, 1, 1, 1);
		backpackstrap13.setRotationPoint(2F, 11F, 1F);
		backpackstrap13.setTextureSize(64, 32);
		backpackstrap13.mirror = true;
		setRotation(backpackstrap13, 0F, 0F, 0.669215F);
		backpackstrap14 = new ModelRenderer(this, 52, 27);
		backpackstrap14.addBox(0F, 0F, 0F, 1, 1, 1);
		backpackstrap14.setRotationPoint(-4F, 12F, 1F);
		backpackstrap14.setTextureSize(64, 32);
		backpackstrap14.mirror = true;
		setRotation(backpackstrap14, 0F, 0F, -0.6692116F);
		body = new ModelRenderer(this, 16, 16);
		body.addBox(-4F, 0F, -2F, 7, 9, 3);
		body.setRotationPoint(0F, 5F, 0F);
		body.setTextureSize(64, 32);
		body.mirror = true;
		setRotation(body, 0F, 0F, 0F);
		rightarm = new ModelRenderer(this, 40, 16);
		rightarm.addBox(-2F, -2F, -1F, 2, 10, 2);
		rightarm.setRotationPoint(-4F, 7F, -0.5F);
		rightarm.setTextureSize(64, 32);
		rightarm.mirror = true;
		setRotation(rightarm, 0F, 0F, 0.074351F);
		leftarm = new ModelRenderer(this, 40, 16);
		leftarm.addBox(0F, -2F, -1F, 2, 10, 2);
		leftarm.setRotationPoint(3F, 7F, -1F);
		leftarm.setTextureSize(64, 32);
		leftarm.mirror = true;
		setRotation(leftarm, 0F, 0F, -0.0743572F);
		rightleg = new ModelRenderer(this, 0, 16);
		rightleg.addBox(-2F, 0F, -2F, 3, 10, 3);
		rightleg.setRotationPoint(-2F, 14F, 0F);
		rightleg.setTextureSize(64, 32);
		rightleg.mirror = true;
		setRotation(rightleg, 0F, 0F, 0F);
		leftleg = new ModelRenderer(this, 0, 16);
		leftleg.addBox(-2F, 0F, -2F, 3, 10, 3);
		leftleg.setRotationPoint(2F, 14F, 0F);
		leftleg.setTextureSize(64, 32);
		leftleg.mirror = true;
		setRotation(leftleg, 0F, 0F, 0F);
	    BackPack2 = new ModelRenderer(this, 51, 27);
	    BackPack2.addBox(-2F, -0.3F, 1.5F, 4, 2, 1);
	    BackPack2.setRotationPoint(-0.5F, 10F, 1F);
	    BackPack2.setTextureSize(64, 32);
	    BackPack2.mirror = true;
        setRotation(BackPack2, 0F, 0F, 0F);
	    Backpack1 = new ModelRenderer(this, 50, 24);
	    Backpack1.addBox(-2.5F, 6F, 0F, 5, 6, 2);
	    Backpack1.setRotationPoint(-0.5F, 0F, 1F);
	    Backpack1.setTextureSize(64, 32);
	    Backpack1.mirror = true;
        setRotation(Backpack1, 0F, 0F, 0F);
      HeadBase = new ModelRenderer(this, "HeadBase");
      HeadBase.setRotationPoint(-0.5F, 5F, -0.5F);
      setRotation(HeadBase, 0F, 0F, 0F);
      HeadBase.mirror = true;
        ModelRenderer Cap2 = new ModelRenderer(this, 42, 0);
        Cap2 = new ModelRenderer(this, 42, 0);
        Cap2.addBox(-1.5F, -5.2F, 0.5F, 3, 0, 4);
        Cap2.setRotationPoint(0F, 0F, 0F);
        Cap2.setTextureSize(64, 32);
        Cap2.mirror = true;
        setRotation(Cap2, 0F, 0F, 0F);
        ModelRenderer Cap1 = new ModelRenderer(this, 22, 0);
        Cap1 = new ModelRenderer(this, 22, 0);
        Cap1.addBox(-2F, -6F, -2.5F, 4, 1, 5);
        Cap1.setRotationPoint(0F, 0F, 0F);
        Cap1.setTextureSize(64, 32);
        Cap1.mirror = true;
        setRotation(Cap1, 0F, 0F, 0F);
        ModelRenderer head = new ModelRenderer(this, 0, 0);
        head = new ModelRenderer(this, 0, 0);
        head.addBox(-2.5F, -5F, -2.5F, 5, 5, 5);
        head.setRotationPoint(0F, 0F, 0F);
        head.setTextureSize(64, 32);
        head.mirror = true;
        setRotation(head, 0F, 0F, 0F);
        ModelRenderer Cap3 = new ModelRenderer(this, 46, 7);
        Cap3 = new ModelRenderer(this, 46, 7);
        Cap3.addBox(-1.5F, -7.5F, -2.5F, 3, 2, 5);
        Cap3.setRotationPoint(0F, 0F, 0F);
        Cap3.setTextureSize(64, 32);
        Cap3.mirror = true;
        setRotation(Cap3, -0.1358052F, 0F, 0F);
        HeadBase.addChild(head);
        HeadBase.addChild(Cap1);
        HeadBase.addChild(Cap2);
        HeadBase.addChild(Cap3);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		backpackstrap1.render(f5);
		backpackstrap2.render(f5);
		backpackstrap3.render(f5);
		backpackstrap4.render(f5);
		backpackstrap5.render(f5);
		backpackstrap6.render(f5);
		backpackstrap7.render(f5);
		backpackstrap8.render(f5);
		backpackstrap9.render(f5);
		backpackstrap10.render(f5);
		backpackstrap11.render(f5);
		backpackstrap12.render(f5);
		backpackstrap13.render(f5);
		backpackstrap14.render(f5);
		body.render(f5);
		rightarm.render(f5);
		leftarm.render(f5);
		rightleg.render(f5);
		leftleg.render(f5);
		Backpack1.render(f5);
		BackPack2.render(f5);
		HeadBase.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
		HeadBase.rotateAngleY = f3 / (180F / (float) Math.PI);
		 HeadBase.rotateAngleX = f4 / (180F / (float) Math.PI);
	      rightleg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
	      leftleg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
	      rightleg.rotateAngleY = 0.0F;
	      leftleg.rotateAngleY = 0.0F;
	      rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * .5F * f1;
	      leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * .5F * f1;
	}

}
