// Date: 5/18/2012 7:43:45 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package pixelmon.models.pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelBlastoise extends ModelBase {
	// fields
	ModelRenderer Body;
	ModelRenderer Shell1;
	ModelRenderer Shell2;
	ModelRenderer Belly;
	ModelRenderer UpperRim;
	ModelRenderer LowerRim;
	ModelRenderer HEADBASE;
	ModelRenderer LEFTARM;
	ModelRenderer RIGHTARM;
	ModelRenderer LEFTLEG;
	ModelRenderer RIGHTLEG;
	ModelRenderer TAIL;
	ModelRenderer RIGHTCANNON;
	ModelRenderer LEFTCANNON;

	public ModelBlastoise() {
		textureWidth = 256;
		textureHeight = 128;

		Body = new ModelRenderer(this, 0, 97);
		Body.addBox(-9F, -10.5F, -5.5F, 18, 20, 11);
		Body.setRotationPoint(0F, 10F, 0F);
		Body.setTextureSize(256, 128);
		Body.mirror = true;
		setRotation(Body, 0.2094395F, 0F, 0F);
		Shell1 = new ModelRenderer(this, 58, 108);
		Shell1.addBox(-8F, -9F, 0F, 16, 18, 2);
		Shell1.setRotationPoint(0F, 8.5F, 4.8F);
		Shell1.setTextureSize(256, 128);
		Shell1.mirror = true;
		setRotation(Shell1, 0.2094395F, 0F, 0F);
		Shell2 = new ModelRenderer(this, 58, 91);
		Shell2.addBox(-6F, -7.5F, 0F, 12, 15, 2);
		Shell2.setRotationPoint(0F, 8.2F, 6.2F);
		Shell2.setTextureSize(256, 128);
		Shell2.mirror = true;
		setRotation(Shell2, 0.2094395F, 0F, 0F);
		Belly = new ModelRenderer(this, 0, 64);
		Belly.addBox(-8F, -9.5F, -0.5F, 16, 18, 1);
		Belly.setRotationPoint(0F, 11.5F, -5.5F);
		Belly.setTextureSize(256, 128);
		Belly.mirror = true;
		setRotation(Belly, 0.2094395F, 0F, 0F);
		UpperRim = new ModelRenderer(this, 0, 83);
		UpperRim.addBox(-10F, -10F, -1F, 20, 10, 2);
		UpperRim.setRotationPoint(0F, 8.7F, -0.6F);
		UpperRim.setTextureSize(256, 128);
		UpperRim.mirror = true;
		setRotation(UpperRim, 0.1745329F, 0F, 0F);
		LowerRim = new ModelRenderer(this, 0, 83);
		LowerRim.addBox(-10F, 0F, -1F, 20, 12, 2);
		LowerRim.setRotationPoint(0F, 8.4F, -0.7F);
		LowerRim.setTextureSize(256, 128);
		LowerRim.mirror = true;
		setRotation(LowerRim, 0.4363323F, 0F, 0F);
		HEADBASE = new ModelRenderer(this, "HEADBASE");
		HEADBASE.setRotationPoint(0F, 2F, -6.5F);
		setRotation(HEADBASE, 0F, 0F, 0F);
		HEADBASE.mirror = true;
		ModelRenderer Nose = new ModelRenderer(this, 94, 108);
		Nose.addBox(-3F, -2F, -1F, 6, 4, 2);
		Nose.setRotationPoint(0F, -1.8F, -4.5F);
		Nose.setTextureSize(256, 128);
		Nose.mirror = true;
		setRotation(Nose, 0.0872665F, 0F, 0F);
		ModelRenderer EarL = new ModelRenderer(this, 111, 110);
		EarL.addBox(-1.5F, -3F, -0.5F, 3, 3, 1);
		EarL.setRotationPoint(2F, -5.5F, 1F);
		EarL.setTextureSize(256, 128);
		EarL.mirror = true;
		setRotation(EarL, 0.2094395F, -0.6981317F, 0.6108652F);
		ModelRenderer EarR = new ModelRenderer(this, 111, 110);
		EarR.addBox(-1.5F, -3F, -0.5F, 3, 3, 1);
		EarR.setRotationPoint(-2F, -5.5F, 1F);
		EarR.setTextureSize(256, 128);
		EarR.mirror = true;
		setRotation(EarR, 0.2094395F, 0.6981317F, -0.6108652F);
		ModelRenderer HeadBase = new ModelRenderer(this, 94, 114);
		HeadBase.addBox(-3.5F, -7F, -3.5F, 7, 7, 7);
		HeadBase.setRotationPoint(0F, 0F, 0F);
		HeadBase.setTextureSize(256, 128);
		HeadBase.mirror = true;
		setRotation(HeadBase, 0.0872665F, 0F, 0F);

		HEADBASE.addChild(HeadBase);
		HEADBASE.addChild(Nose);
		HEADBASE.addChild(EarL);
		HEADBASE.addChild(EarR);

		LEFTARM = new ModelRenderer(this, "LEFTARM");
		LEFTARM.setRotationPoint(6F, 4F, -3F);
		setRotation(LEFTARM, 0F, 0F, 0F);
		LEFTARM.mirror = true;
		ModelRenderer ThumbClawL = new ModelRenderer(this, 45, 89);
		ThumbClawL.addBox(-0.5F, -0.5F, -2F, 1, 1, 2);
		ThumbClawL.setRotationPoint(4F, 7F, -4.5F);
		ThumbClawL.setTextureSize(256, 128);
		ThumbClawL.mirror = true;
		setRotation(ThumbClawL, 1.58825F, -0.4712389F, 0.3316126F);
		ModelRenderer PinkyClawL = new ModelRenderer(this, 45, 89);
		PinkyClawL.addBox(-0.5F, -0.5F, -2F, 1, 1, 2);
		PinkyClawL.setRotationPoint(6.2F, 7.5F, -5F);
		PinkyClawL.setTextureSize(256, 128);
		PinkyClawL.mirror = true;
		setRotation(PinkyClawL, 1.43117F, -0.4712389F, 0.3316126F);
		ModelRenderer IndexClawL = new ModelRenderer(this, 45, 89);
		IndexClawL.addBox(-0.5F, -0.5F, -2F, 1, 1, 2);
		IndexClawL.setRotationPoint(4.8F, 7F, -5.8F);
		IndexClawL.setTextureSize(256, 128);
		IndexClawL.mirror = true;
		setRotation(IndexClawL, 1.43117F, -0.4712389F, 0.3316126F);
		ModelRenderer LowerArmL = new ModelRenderer(this, 0, 1);
		LowerArmL.addBox(-1.5F, -1.5F, -4F, 3, 3, 4);
		LowerArmL.setRotationPoint(5F, 5F, -2.8F);
		LowerArmL.setTextureSize(256, 128);
		LowerArmL.mirror = true;
		setRotation(LowerArmL, 1.047198F, -0.4712389F, 0.3316126F);
		ModelRenderer MiddleArmL = new ModelRenderer(this, 0, 8);
		MiddleArmL.addBox(-2F, -2F, -5F, 4, 4, 5);
		MiddleArmL.setRotationPoint(3F, 1.9F, -1F);
		MiddleArmL.setTextureSize(256, 128);
		MiddleArmL.mirror = true;
		setRotation(MiddleArmL, 0.8901179F, -0.715585F, 0F);
		ModelRenderer UpperArmL = new ModelRenderer(this, 0, 17);
		UpperArmL.addBox(-2.5F, -2.5F, -6F, 5, 5, 6);
		UpperArmL.setRotationPoint(0F, 0F, 0F);
		UpperArmL.setTextureSize(256, 128);
		UpperArmL.mirror = true;
		setRotation(UpperArmL, 0.6457718F, -0.9599311F, -0.2094395F);

		LEFTARM.addChild(UpperArmL);
		LEFTARM.addChild(MiddleArmL);
		LEFTARM.addChild(LowerArmL);
		LEFTARM.addChild(ThumbClawL);
		LEFTARM.addChild(IndexClawL);
		LEFTARM.addChild(PinkyClawL);

		RIGHTARM = new ModelRenderer(this, "RIGHTARM");
		RIGHTARM.setRotationPoint(-6F, 4F, -3F);
		setRotation(RIGHTARM, 0F, 0F, 0F);
		RIGHTARM.mirror = true;
		ModelRenderer PinkyClawR = new ModelRenderer(this, 45, 89);
		PinkyClawR.addBox(-0.5F, -0.5F, -2F, 1, 1, 2);
		PinkyClawR.setRotationPoint(-6.2F, 7.5F, -5F);
		PinkyClawR.setTextureSize(256, 128);
		PinkyClawR.mirror = true;
		setRotation(PinkyClawR, 1.43117F, 0.4712389F, -0.3316126F);
		ModelRenderer ThumbClawR = new ModelRenderer(this, 45, 89);
		ThumbClawR.addBox(-0.5F, -0.5F, -2F, 1, 1, 2);
		ThumbClawR.setRotationPoint(-4F, 7F, -4.5F);
		ThumbClawR.setTextureSize(256, 128);
		ThumbClawR.mirror = true;
		setRotation(ThumbClawR, 1.58825F, 0.4712389F, -0.3316126F);
		ModelRenderer IndexClawR = new ModelRenderer(this, 45, 89);
		IndexClawR.addBox(-0.5F, -0.5F, -2F, 1, 1, 2);
		IndexClawR.setRotationPoint(-4.6F, 7F, -5.8F);
		IndexClawR.setTextureSize(256, 128);
		IndexClawR.mirror = true;
		setRotation(IndexClawR, 1.43117F, 0.4712389F, -0.3316126F);
		ModelRenderer LowerArmR = new ModelRenderer(this, 0, 1);
		LowerArmR.addBox(-1.5F, -1.5F, -4F, 3, 3, 4);
		LowerArmR.setRotationPoint(-5F, 5F, -2.8F);
		LowerArmR.setTextureSize(256, 128);
		LowerArmR.mirror = true;
		setRotation(LowerArmR, 1.047198F, 0.4712389F, -0.3316126F);
		ModelRenderer MiddleArmR = new ModelRenderer(this, 0, 8);
		MiddleArmR.addBox(-2F, -2F, -5F, 4, 4, 5);
		MiddleArmR.setRotationPoint(-3F, 1.9F, -1F);
		MiddleArmR.setTextureSize(256, 128);
		MiddleArmR.mirror = true;
		setRotation(MiddleArmR, 0.8901179F, 0.715585F, 0F);
		ModelRenderer UpperArmR = new ModelRenderer(this, 0, 17);
		UpperArmR.addBox(-2.5F, -2.5F, -5.5F, 5, 5, 6);
		UpperArmR.setRotationPoint(0F, 0F, 0F);
		UpperArmR.setTextureSize(256, 128);
		UpperArmR.mirror = true;
		setRotation(UpperArmR, 0.6457718F, 0.9599311F, 0.2094395F);

		RIGHTARM.addChild(UpperArmR);
		RIGHTARM.addChild(MiddleArmR);
		RIGHTARM.addChild(LowerArmR);
		RIGHTARM.addChild(ThumbClawR);
		RIGHTARM.addChild(IndexClawR);
		RIGHTARM.addChild(PinkyClawR);

		LEFTLEG = new ModelRenderer(this, "LEFTLEG");
		LEFTLEG.setRotationPoint(5.8F, 14F, -0.5F);
		setRotation(LEFTLEG, 0F, 0F, 0F);
		LEFTLEG.mirror = true;
		ModelRenderer RearToeTipL = new ModelRenderer(this, 45, 92);
		RearToeTipL.addBox(-0.5F, -0.5F, -1F, 1, 1, 1);
		RearToeTipL.setRotationPoint(-1F, 9.3F, 2.2F);
		RearToeTipL.setTextureSize(256, 128);
		RearToeTipL.mirror = true;
		setRotation(RearToeTipL, 0.2617994F, 2.443461F, 0F);
		ModelRenderer RearToeBaseL = new ModelRenderer(this, 45, 94);
		RearToeBaseL.addBox(-1F, -0.5F, -2F, 2, 1, 2);
		RearToeBaseL.setRotationPoint(0F, 9F, 1F);
		RearToeBaseL.setTextureSize(256, 128);
		RearToeBaseL.mirror = true;
		setRotation(RearToeBaseL, 0.1745329F, 2.443461F, 0F);
		ModelRenderer OuterToeTipL = new ModelRenderer(this, 45, 92);
		OuterToeTipL.addBox(-0.5F, -0.5F, -1F, 1, 1, 1);
		OuterToeTipL.setRotationPoint(6.2F, 9.3F, -2.6F);
		OuterToeTipL.setTextureSize(256, 128);
		OuterToeTipL.mirror = true;
		setRotation(OuterToeTipL, 0.2617994F, -1.22173F, 0F);
		ModelRenderer OuterBaseL = new ModelRenderer(this, 45, 94);
		OuterBaseL.addBox(-1F, -0.5F, -2F, 2, 1, 2);
		OuterBaseL.setRotationPoint(4.7F, 9F, -2F);
		OuterBaseL.setTextureSize(256, 128);
		OuterBaseL.mirror = true;
		setRotation(OuterBaseL, 0.1745329F, -1.22173F, 0F);
		ModelRenderer MiddleToeTipL = new ModelRenderer(this, 45, 92);
		MiddleToeTipL.addBox(-0.5F, -0.5F, -1F, 1, 1, 1);
		MiddleToeTipL.setRotationPoint(4.7F, 9.3F, -5F);
		MiddleToeTipL.setTextureSize(256, 128);
		MiddleToeTipL.mirror = true;
		setRotation(MiddleToeTipL, 0.2617994F, -0.6981317F, 0F);
		ModelRenderer MiddleToeBaseL = new ModelRenderer(this, 45, 94);
		MiddleToeBaseL.addBox(-1F, -0.5F, -2F, 2, 1, 2);
		MiddleToeBaseL.setRotationPoint(3.7F, 9F, -3.8F);
		MiddleToeBaseL.setTextureSize(256, 128);
		MiddleToeBaseL.mirror = true;
		setRotation(MiddleToeBaseL, 0.1745329F, -0.6981317F, 0F);
		ModelRenderer InnerToeTipL = new ModelRenderer(this, 45, 92);
		InnerToeTipL.addBox(-0.5F, -0.5F, -1F, 1, 1, 1);
		InnerToeTipL.setRotationPoint(2.1F, 9.3F, -6F);
		InnerToeTipL.setTextureSize(256, 128);
		InnerToeTipL.mirror = true;
		setRotation(InnerToeTipL, 0.2617994F, -0.2617994F, 0F);
		ModelRenderer InnerToeBaseL = new ModelRenderer(this, 45, 94);
		InnerToeBaseL.addBox(-1F, -0.5F, -2F, 2, 1, 2);
		InnerToeBaseL.setRotationPoint(1.7F, 9F, -4.4F);
		InnerToeBaseL.setTextureSize(256, 128);
		InnerToeBaseL.mirror = true;
		setRotation(InnerToeBaseL, 0.1745329F, -0.2617994F, 0F);
		ModelRenderer FootL = new ModelRenderer(this, 0, 28);
		FootL.addBox(-3.5F, 0F, -3.5F, 7, 2, 7);
		FootL.setRotationPoint(1.7F, 8F, -1.2F);
		FootL.setTextureSize(256, 128);
		FootL.mirror = true;
		setRotation(FootL, 0F, -0.6981317F, 0F);
		ModelRenderer LowerLegL = new ModelRenderer(this, 0, 37);
		LowerLegL.addBox(-3F, 0F, -3F, 6, 7, 6);
		LowerLegL.setRotationPoint(2F, 2F, -1.7F);
		LowerLegL.setTextureSize(256, 128);
		LowerLegL.mirror = true;
		setRotation(LowerLegL, 0.0872665F, -0.6981317F, 0F);
		ModelRenderer UpperLegL = new ModelRenderer(this, 0, 50);
		UpperLegL.addBox(-3F, -1F, -6F, 7, 7, 7);
		UpperLegL.setRotationPoint(0F, 0F, 0F);
		UpperLegL.setTextureSize(256, 128);
		UpperLegL.mirror = true;
		setRotation(UpperLegL, 0.5410521F, -0.6981317F, 0F);

		LEFTLEG.addChild(UpperLegL);
		LEFTLEG.addChild(LowerLegL);
		LEFTLEG.addChild(FootL);
		LEFTLEG.addChild(RearToeTipL);
		LEFTLEG.addChild(RearToeBaseL);
		LEFTLEG.addChild(OuterToeTipL);
		LEFTLEG.addChild(OuterBaseL);
		LEFTLEG.addChild(MiddleToeTipL);
		LEFTLEG.addChild(MiddleToeBaseL);
		LEFTLEG.addChild(InnerToeTipL);
		LEFTLEG.addChild(InnerToeBaseL);

		RIGHTLEG = new ModelRenderer(this, "RIGHTLEG");
		RIGHTLEG.setRotationPoint(-5.8F, 14F, -0.5F);
		setRotation(RIGHTLEG, 0F, 0F, 0F);
		RIGHTLEG.mirror = true;
		ModelRenderer RearToeTipR = new ModelRenderer(this, 45, 92);
		RearToeTipR.addBox(-0.5F, -0.5F, -1F, 1, 1, 1);
		RearToeTipR.setRotationPoint(1F, 9.3F, 2.2F);
		RearToeTipR.setTextureSize(256, 128);
		RearToeTipR.mirror = true;
		setRotation(RearToeTipR, 0.2617994F, -2.443461F, 0F);
		ModelRenderer RearToeBaseR = new ModelRenderer(this, 45, 94);
		RearToeBaseR.addBox(-1F, -0.5F, -2F, 2, 1, 2);
		RearToeBaseR.setRotationPoint(0F, 9F, 1F);
		RearToeBaseR.setTextureSize(256, 128);
		RearToeBaseR.mirror = true;
		setRotation(RearToeBaseR, 0.1745329F, -2.443461F, 0F);
		ModelRenderer OuterToeTipR = new ModelRenderer(this, 45, 92);
		OuterToeTipR.addBox(-0.5F, -0.5F, -1F, 1, 1, 1);
		OuterToeTipR.setRotationPoint(-6.2F, 9.3F, -2.6F);
		OuterToeTipR.setTextureSize(256, 128);
		OuterToeTipR.mirror = true;
		setRotation(OuterToeTipR, 0.2617994F, 1.22173F, 0F);
		ModelRenderer OuterBaseR = new ModelRenderer(this, 45, 94);
		OuterBaseR.addBox(-1F, -0.5F, -2F, 2, 1, 2);
		OuterBaseR.setRotationPoint(-4.7F, 9F, -2F);
		OuterBaseR.setTextureSize(256, 128);
		OuterBaseR.mirror = true;
		setRotation(OuterBaseR, 0.1745329F, 1.22173F, 0F);
		ModelRenderer MiddleToeTipR = new ModelRenderer(this, 45, 92);
		MiddleToeTipR.addBox(-0.5F, -0.5F, -1F, 1, 1, 1);
		MiddleToeTipR.setRotationPoint(-4.7F, 9.3F, -5F);
		MiddleToeTipR.setTextureSize(256, 128);
		MiddleToeTipR.mirror = true;
		setRotation(MiddleToeTipR, 0.2617994F, 0.6981317F, 0F);
		ModelRenderer MiddleToeBaseR = new ModelRenderer(this, 45, 94);
		MiddleToeBaseR.addBox(-1F, -0.5F, -2F, 2, 1, 2);
		MiddleToeBaseR.setRotationPoint(-3.7F, 9F, -3.8F);
		MiddleToeBaseR.setTextureSize(256, 128);
		MiddleToeBaseR.mirror = true;
		setRotation(MiddleToeBaseR, 0.1745329F, 0.6981317F, 0F);
		ModelRenderer InnerToeTipR = new ModelRenderer(this, 45, 92);
		InnerToeTipR.addBox(-0.5F, -0.5F, -1F, 1, 1, 1);
		InnerToeTipR.setRotationPoint(-2.1F, 9.3F, -6F);
		InnerToeTipR.setTextureSize(256, 128);
		InnerToeTipR.mirror = true;
		setRotation(InnerToeTipR, 0.2617994F, 0.2617994F, 0F);
		ModelRenderer InnerToeBaseR = new ModelRenderer(this, 45, 94);
		InnerToeBaseR.addBox(-1F, -0.5F, -2F, 2, 1, 2);
		InnerToeBaseR.setRotationPoint(-1.7F, 9F, -4.4F);
		InnerToeBaseR.setTextureSize(256, 128);
		InnerToeBaseR.mirror = true;
		setRotation(InnerToeBaseR, 0.1745329F, 0.2617994F, 0F);
		ModelRenderer FootR = new ModelRenderer(this, 0, 28);
		FootR.addBox(-3.5F, 0F, -3.5F, 7, 2, 7);
		FootR.setRotationPoint(-1.7F, 8F, -1.2F);
		FootR.setTextureSize(256, 128);
		FootR.mirror = true;
		setRotation(FootR, 0F, 0.6981317F, 0F);
		ModelRenderer LowerLegR = new ModelRenderer(this, 0, 37);
		LowerLegR.addBox(-3F, 0F, -3F, 6, 7, 6);
		LowerLegR.setRotationPoint(-2F, 2F, -1.7F);
		LowerLegR.setTextureSize(256, 128);
		LowerLegR.mirror = true;
		setRotation(LowerLegR, 0.0872665F, 0.6981317F, 0F);
		ModelRenderer UpperLegR = new ModelRenderer(this, 0, 50);
		UpperLegR.addBox(-4F, -1F, -6F, 7, 7, 7);
		UpperLegR.setRotationPoint(0F, 0F, 0F);
		UpperLegR.setTextureSize(256, 128);
		UpperLegR.mirror = true;
		setRotation(UpperLegR, 0.5585054F, 0.6981317F, 0F);

		RIGHTLEG.addChild(UpperLegR);
		RIGHTLEG.addChild(LowerLegR);
		RIGHTLEG.addChild(FootR);
		RIGHTLEG.addChild(RearToeTipR);
		RIGHTLEG.addChild(RearToeBaseR);
		RIGHTLEG.addChild(OuterToeTipR);
		RIGHTLEG.addChild(OuterBaseR);
		RIGHTLEG.addChild(MiddleToeTipR);
		RIGHTLEG.addChild(MiddleToeBaseR);
		RIGHTLEG.addChild(InnerToeTipR);
		RIGHTLEG.addChild(InnerToeBaseR);

		TAIL = new ModelRenderer(this, "TAIL");
		TAIL.setRotationPoint(0F, 18.3F, 0F);
		setRotation(TAIL, 0F, 0F, 0F);
		TAIL.mirror = true;
		ModelRenderer TailTip = new ModelRenderer(this, 58, 67);
		TailTip.addBox(-1F, -0.5F, 0F, 2, 1, 2);
		TailTip.setRotationPoint(0F, 1.5F, 11F);
		TailTip.setTextureSize(256, 128);
		TailTip.mirror = true;
		setRotation(TailTip, 0.0698132F, 0F, 0F);
		ModelRenderer TailSeg2 = new ModelRenderer(this, 58, 70);
		TailSeg2.addBox(-2F, -1F, 0F, 4, 2, 3);
		TailSeg2.setRotationPoint(0F, 1.5F, 8.5F);
		TailSeg2.setTextureSize(256, 128);
		TailSeg2.mirror = true;
		setRotation(TailSeg2, 0F, 0F, 0F);
		ModelRenderer TailSeg1 = new ModelRenderer(this, 58, 75);
		TailSeg1.addBox(-2.5F, -1F, 0F, 5, 3, 4);
		TailSeg1.setRotationPoint(0F, 0.7F, 5F);
		TailSeg1.setTextureSize(256, 128);
		TailSeg1.mirror = true;
		setRotation(TailSeg1, -0.0872665F, 0F, 0F);
		ModelRenderer TailBase = new ModelRenderer(this, 58, 82);
		TailBase.addBox(-3.5F, -1.5F, 0F, 7, 3, 6);
		TailBase.setRotationPoint(0F, 0F, 0F);
		TailBase.setTextureSize(256, 128);
		TailBase.mirror = true;
		setRotation(TailBase, -0.2443461F, 0F, 0F);

		TAIL.addChild(TailBase);
		TAIL.addChild(TailSeg1);
		TAIL.addChild(TailSeg2);
		TAIL.addChild(TailTip);

		RIGHTCANNON = new ModelRenderer(this, "RIGHTCANNON");
		RIGHTCANNON.setRotationPoint(-5F, 3F, 1.3F);
		setRotation(RIGHTCANNON, 0F, 0F, 0F);
		RIGHTCANNON.mirror = true;
		ModelRenderer CannoHousingR = new ModelRenderer(this, 94, 96);
		CannoHousingR.addBox(-3F, -6F, -2.5F, 6, 6, 6);
		CannoHousingR.setRotationPoint(0F, 0F, 0F);
		CannoHousingR.setTextureSize(256, 128);
		CannoHousingR.mirror = true;
		setRotation(CannoHousingR, 0.1396263F, 0.1919862F, -0.7853982F);
		ModelRenderer CannonShaftR = new ModelRenderer(this, 94, 90);
		CannonShaftR.addBox(-1.5F, -3F, -1.5F, 3, 3, 3);
		CannonShaftR.setRotationPoint(-4F, -4F, 0.5F);
		CannonShaftR.setTextureSize(256, 128);
		CannonShaftR.mirror = true;
		setRotation(CannonShaftR, 0.1396263F, 0.1919862F, -0.7853982F);
		ModelRenderer CannonNoseR = new ModelRenderer(this, 94, 83);
		CannonNoseR.addBox(-2F, -3F, -2F, 4, 3, 4);
		CannonNoseR.setRotationPoint(-5.8F, -5.8F, 0.5F);
		CannonNoseR.setTextureSize(256, 128);
		CannonNoseR.mirror = true;
		setRotation(CannonNoseR, 0.1396263F, 0.1919862F, -0.7853982F);

		RIGHTCANNON.addChild(CannoHousingR);
		RIGHTCANNON.addChild(CannonShaftR);
		RIGHTCANNON.addChild(CannonNoseR);

		LEFTCANNON = new ModelRenderer(this, "LEFTCANNON");
		LEFTCANNON.setRotationPoint(5F, 3F, 1.3F);
		setRotation(LEFTCANNON, 0F, 0F, 0F);
		LEFTCANNON.mirror = true;
		ModelRenderer CannoHousingL = new ModelRenderer(this, 94, 96);
		CannoHousingL.addBox(-3F, -6F, -2.5F, 6, 6, 6);
		CannoHousingL.setRotationPoint(0F, 0F, 0F);
		CannoHousingL.setTextureSize(256, 128);
		CannoHousingL.mirror = true;
		setRotation(CannoHousingL, 0.1396263F, -0.1919862F, 0.7853982F);
		ModelRenderer CannonShaftL = new ModelRenderer(this, 94, 90);
		CannonShaftL.addBox(-1.5F, -3F, -1.5F, 3, 3, 3);
		CannonShaftL.setRotationPoint(4F, -4F, 0.5F);
		CannonShaftL.setTextureSize(256, 128);
		CannonShaftL.mirror = true;
		setRotation(CannonShaftL, 0.1396263F, -0.1919862F, 0.7853982F);
		ModelRenderer CannonNoseL = new ModelRenderer(this, 94, 83);
		CannonNoseL.addBox(-2F, -3F, -2F, 4, 3, 4);
		CannonNoseL.setRotationPoint(5.8F, -5.8F, 0.5F);
		CannonNoseL.setTextureSize(256, 128);
		CannonNoseL.mirror = true;
		setRotation(CannonNoseL, 0.1396263F, -0.1919862F, 0.7853982F);

		LEFTCANNON.addChild(CannoHousingL);
		LEFTCANNON.addChild(CannonShaftL);
		LEFTCANNON.addChild(CannonNoseL);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Body.render(f5);
		Shell1.render(f5);
		Shell2.render(f5);
		Belly.render(f5);
		UpperRim.render(f5);
		LowerRim.render(f5);
		HEADBASE.render(f5);
		LEFTARM.render(f5);
		RIGHTARM.render(f5);
		LEFTLEG.render(f5);
		RIGHTLEG.render(f5);
		TAIL.render(f5);
		RIGHTCANNON.render(f5);
		LEFTCANNON.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3,
			float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		HEADBASE.rotateAngleY = f3 / (180F / (float) Math.PI);
		HEADBASE.rotateAngleX = f4 / (180F / (float) Math.PI);
		RIGHTARM.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI)
				* 1F * f1 * 0.5F;
		LEFTARM.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1F * f1 * 0.5F;
		RIGHTARM.rotateAngleZ = 0.0F;
		LEFTARM.rotateAngleZ = 0.0F;
		RIGHTLEG.rotateAngleX = MathHelper.cos(f * 0.6662F) * 0.7F * f1;
		LEFTLEG.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI)
				* 0.7F * f1;
		RIGHTLEG.rotateAngleY = 0.0F;
		LEFTLEG.rotateAngleY = 0.0F;
	}

}
