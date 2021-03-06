package pixelmon.models.pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelSnorlax extends ModelBase {
	// fields
	ModelRenderer BodyBase;
	ModelRenderer BodyFatWide;
	ModelRenderer BodyFatThick;
	ModelRenderer BodyFatBelly;
	ModelRenderer BodyFatBack;
	ModelRenderer HEADBASE;
	ModelRenderer RIGHTARM;
	ModelRenderer LEFTARM;
	ModelRenderer LEFTFOOT;
	ModelRenderer RIGHTFOOT;

	public ModelSnorlax() {
		textureWidth = 512;
		textureHeight = 256;

		BodyBase = new ModelRenderer(this, 1, 199);
		BodyBase.addBox(-18F, -18F, -10F, 36, 36, 20);
		BodyBase.setRotationPoint(0F, 1F, 0F);
		BodyBase.setTextureSize(512, 256);
		BodyBase.mirror = true;
		setRotation(BodyBase, 0F, 0F, 0F);
		BodyFatWide = new ModelRenderer(this, 114, 203);
		BodyFatWide.addBox(-19F, -18F, -9F, 38, 34, 18);
		BodyFatWide.setRotationPoint(0F, 2.5F, 0F);
		BodyFatWide.setTextureSize(512, 256);
		BodyFatWide.mirror = true;
		setRotation(BodyFatWide, 0F, 0F, 0F);
		BodyFatThick = new ModelRenderer(this, 1, 142);
		BodyFatThick.addBox(-17F, -17F, -11F, 34, 34, 22);
		BodyFatThick.setRotationPoint(0F, 1.5F, 0F);
		BodyFatThick.setTextureSize(512, 256);
		BodyFatThick.mirror = true;
		setRotation(BodyFatThick, 0F, 0F, 0F);
		BodyFatBelly = new ModelRenderer(this, 1, 89);
		BodyFatBelly.addBox(-15F, -16F, -10F, 30, 32, 20);
		BodyFatBelly.setRotationPoint(0F, 2F, -2F);
		BodyFatBelly.setTextureSize(512, 256);
		BodyFatBelly.mirror = true;
		setRotation(BodyFatBelly, 0F, 0F, 0F);
		BodyFatBack = new ModelRenderer(this, 115, 150);
		BodyFatBack.addBox(-16F, -16F, -10F, 32, 32, 20);
		BodyFatBack.setRotationPoint(0F, 1.5F, 2F);
		BodyFatBack.setTextureSize(512, 256);
		BodyFatBack.mirror = true;
		setRotation(BodyFatBack, 0F, 0F, 0F);
		HEADBASE = new ModelRenderer(this, "HEADBASE");
		HEADBASE.setRotationPoint(0F, -16.7F, 0F);
		setRotation(HEADBASE, 0F, 0F, 0F);
		HEADBASE.mirror = true;
		ModelRenderer EarInnerthickL = new ModelRenderer(this, 83, 38);
		EarInnerthickL.addBox(-1F, -2.5F, -2.5F, 2, 5, 5);
		EarInnerthickL.setRotationPoint(3.8F, -12.7F, 1.2F);
		EarInnerthickL.setTextureSize(512, 256);
		EarInnerthickL.mirror = true;
		setRotation(EarInnerthickL, 0.6632251F, 0.1745329F, 0F);
		ModelRenderer EarthickRL = new ModelRenderer(this, 81, 51);
		EarthickRL.addBox(-1F, -3F, -3F, 2, 6, 6);
		EarthickRL.setRotationPoint(4.5F, -13F, 1F);
		EarthickRL.setTextureSize(512, 256);
		EarthickRL.mirror = true;
		setRotation(EarthickRL, 0.6632251F, 0.1745329F, 0F);
		ModelRenderer EarthickLL = new ModelRenderer(this, 99, 52);
		EarthickLL.addBox(-1F, -3F, -3F, 2, 6, 6);
		EarthickLL.setRotationPoint(5.8F, -13F, 1F);
		EarthickLL.setTextureSize(512, 256);
		EarthickLL.mirror = true;
		setRotation(EarthickLL, 0.6632251F, 0.1745329F, 0F);
		ModelRenderer EarInnerthickR = new ModelRenderer(this, 83, 38);
		EarInnerthickR.addBox(-1F, -2.5F, -2.5F, 2, 5, 5);
		EarInnerthickR.setRotationPoint(-3.8F, -12.7F, 1.2F);
		EarInnerthickR.setTextureSize(512, 256);
		EarInnerthickR.mirror = true;
		setRotation(EarInnerthickR, 0.6632251F, -0.1745329F, 0F);
		ModelRenderer EarthickLR = new ModelRenderer(this, 81, 51);
		EarthickLR.addBox(-1F, -3F, -3F, 2, 6, 6);
		EarthickLR.setRotationPoint(-4.5F, -13F, 1F);
		EarthickLR.setTextureSize(512, 256);
		EarthickLR.mirror = true;
		setRotation(EarthickLR, 0.6632251F, -0.1745329F, 0F);
		ModelRenderer EarthickRR = new ModelRenderer(this, 99, 52);
		EarthickRR.addBox(-1F, -3F, -3F, 2, 6, 6);
		EarthickRR.setRotationPoint(-5.8F, -13F, 1F);
		EarthickRR.setTextureSize(512, 256);
		EarthickRR.mirror = true;
		setRotation(EarthickRR, 0.6632251F, -0.1745329F, 0F);
		ModelRenderer EarR = new ModelRenderer(this, 59, 49);
		EarR.addBox(-1F, -7F, -5F, 2, 7, 7);
		EarR.setRotationPoint(-5.8F, -11.5F, 4.333333F);
		EarR.setTextureSize(512, 256);
		EarR.mirror = true;
		setRotation(EarR, 0.6632251F, -0.1745329F, 0F);
		ModelRenderer EarL = new ModelRenderer(this, 59, 49);
		EarL.addBox(-1F, -7F, -5F, 2, 7, 7);
		EarL.setRotationPoint(5.8F, -11.5F, 4.3F);
		EarL.setTextureSize(512, 256);
		EarL.mirror = true;
		setRotation(EarL, 0.6632251F, 0.1745329F, 0F);
		ModelRenderer ToothL = new ModelRenderer(this, 0, 0);
		ToothL.addBox(-0.5F, -0.5F, -1F, 1, 1, 1);
		ToothL.setRotationPoint(2F, -3F, -6.5F);
		ToothL.setTextureSize(512, 256);
		ToothL.mirror = true;
		setRotation(ToothL, -0.7853982F, 0F, 0F);
		ModelRenderer ToothR = new ModelRenderer(this, 0, 0);
		ToothR.addBox(-0.5F, -0.5F, -1F, 1, 1, 1);
		ToothR.setRotationPoint(-2F, -3F, -6.5F);
		ToothR.setTextureSize(512, 256);
		ToothR.mirror = true;
		setRotation(ToothR, -0.7853982F, 0F, 0F);
		ModelRenderer HeadCheek = new ModelRenderer(this, 58, 65);
		HeadCheek.addBox(-9F, -5.5F, -5F, 18, 11, 10);
		HeadCheek.setRotationPoint(0F, -6F, 0F);
		HeadCheek.setTextureSize(512, 256);
		HeadCheek.mirror = true;
		setRotation(HeadCheek, 0F, 0F, 0F);
		ModelRenderer HeadThick = new ModelRenderer(this, 1, 33);
		HeadThick.addBox(-6.5F, -5.5F, -7F, 13, 13, 14);
		HeadThick.setRotationPoint(0F, -7.5F, 0F);
		HeadThick.setTextureSize(512, 256);
		HeadThick.mirror = true;
		setRotation(HeadThick, 0F, 0F, 0F);
		ModelRenderer Head = new ModelRenderer(this, 1, 61);
		Head.addBox(-7.5F, -13F, -6.5F, 15, 14, 13);
		Head.setRotationPoint(0F, -1F, 0F);
		Head.setTextureSize(512, 256);
		Head.mirror = true;
		setRotation(Head, 0F, 0F, 0F);
		ModelRenderer HeadWide = new ModelRenderer(this, 1, 7);
		HeadWide.addBox(-8.5F, -5.5F, -6F, 17, 13, 12);
		HeadWide.setRotationPoint(0F, -7.5F, 0F);
		HeadWide.setTextureSize(512, 256);
		HeadWide.mirror = true;
		setRotation(HeadWide, 0F, 0F, 0F);

		HEADBASE.addChild(HeadThick);
		HEADBASE.addChild(HeadWide);
		HEADBASE.addChild(Head);
		HEADBASE.addChild(HeadCheek);
		HEADBASE.addChild(ToothR);
		HEADBASE.addChild(ToothL);
		HEADBASE.addChild(EarR);
		HEADBASE.addChild(EarL);
		HEADBASE.addChild(EarInnerthickR);
		HEADBASE.addChild(EarInnerthickL);
		HEADBASE.addChild(EarthickRR);
		HEADBASE.addChild(EarthickLR);
		HEADBASE.addChild(EarthickRL);
		HEADBASE.addChild(EarthickLL);

		RIGHTARM = new ModelRenderer(this, "RIGHTARM");
		RIGHTARM.setRotationPoint(-19F, -9F, 0F);
		setRotation(RIGHTARM, 0F, 0F, 0F);
		RIGHTARM.mirror = true;
		ModelRenderer LowerFingerPinkyR = new ModelRenderer(this, 0, 0);
		LowerFingerPinkyR.addBox(-0.5F, 0F, -0.5F, 1, 2, 1);
		LowerFingerPinkyR.setRotationPoint(-5F, 17.5F, 3.5F);
		LowerFingerPinkyR.setTextureSize(512, 256);
		LowerFingerPinkyR.mirror = true;
		setRotation(LowerFingerPinkyR, 0F, 0F, 0F);
		ModelRenderer UpperFingerRingR = new ModelRenderer(this, 0, 0);
		UpperFingerRingR.addBox(-1F, 0F, -1F, 2, 2, 2);
		UpperFingerRingR.setRotationPoint(-5F, 16.5F, 1F);
		UpperFingerRingR.setTextureSize(512, 256);
		UpperFingerRingR.mirror = true;
		setRotation(UpperFingerRingR, 0F, 0F, 0F);
		ModelRenderer UpperFingerMiddleR = new ModelRenderer(this, 0, 0);
		UpperFingerMiddleR.addBox(-1F, 0F, -1F, 2, 2, 2);
		UpperFingerMiddleR.setRotationPoint(-5F, 16.5F, -1.5F);
		UpperFingerMiddleR.setTextureSize(512, 256);
		UpperFingerMiddleR.mirror = true;
		setRotation(UpperFingerMiddleR, 0F, 0F, 0F);
		ModelRenderer LowerFingerIndexR = new ModelRenderer(this, 0, 0);
		LowerFingerIndexR.addBox(-0.5F, 0F, -0.5F, 1, 2, 1);
		LowerFingerIndexR.setRotationPoint(-5F, 17.5F, -4F);
		LowerFingerIndexR.setTextureSize(512, 256);
		LowerFingerIndexR.mirror = true;
		setRotation(LowerFingerIndexR, 0F, 0F, 0F);
		ModelRenderer UpperArmR = new ModelRenderer(this, 168, 123);
		UpperArmR.addBox(-3F, 0F, -6F, 6, 14, 12);
		UpperArmR.setRotationPoint(2.8F, -5F, 0F);
		UpperArmR.setTextureSize(512, 256);
		UpperArmR.mirror = true;
		setRotation(UpperArmR, 0F, 0F, 0.4363323F);
		ModelRenderer LowerArmR = new ModelRenderer(this, 168, 101);
		LowerArmR.addBox(-2.5F, 0F, -6F, 5, 10, 11);
		LowerArmR.setRotationPoint(-3F, 7F, 0.5F);
		LowerArmR.setTextureSize(512, 256);
		LowerArmR.mirror = true;
		setRotation(LowerArmR, 0F, 0F, 0.1745329F);
		ModelRenderer LowerFingerMiddleR = new ModelRenderer(this, 0, 0);
		LowerFingerMiddleR.addBox(-0.5F, 0F, -0.5F, 1, 2, 1);
		LowerFingerMiddleR.setRotationPoint(-5F, 17.5F, -1.5F);
		LowerFingerMiddleR.setTextureSize(512, 256);
		LowerFingerMiddleR.mirror = true;
		setRotation(LowerFingerMiddleR, 0F, 0F, 0F);
		ModelRenderer UpperFingerPinkyR = new ModelRenderer(this, 0, 0);
		UpperFingerPinkyR.addBox(-1F, 0F, -1F, 2, 2, 2);
		UpperFingerPinkyR.setRotationPoint(-5F, 16.5F, 3.5F);
		UpperFingerPinkyR.setTextureSize(512, 256);
		UpperFingerPinkyR.mirror = true;
		setRotation(UpperFingerPinkyR, 0F, 0F, 0F);
		ModelRenderer LowerFingerRingR = new ModelRenderer(this, 0, 0);
		LowerFingerRingR.addBox(-0.5F, 0F, -0.5F, 1, 2, 1);
		LowerFingerRingR.setRotationPoint(-5F, 17.5F, 1F);
		LowerFingerRingR.setTextureSize(512, 256);
		LowerFingerRingR.mirror = true;
		setRotation(LowerFingerRingR, 0F, 0F, 0F);
		ModelRenderer UpperFingerIndexR = new ModelRenderer(this, 0, 0);
		UpperFingerIndexR.addBox(-1F, 0F, -1F, 2, 2, 2);
		UpperFingerIndexR.setRotationPoint(-5F, 16.5F, -4F);
		UpperFingerIndexR.setTextureSize(512, 256);
		UpperFingerIndexR.mirror = true;
		setRotation(UpperFingerIndexR, 0F, 0F, 0F);
		ModelRenderer LowerThumbR = new ModelRenderer(this, 0, 0);
		LowerThumbR.addBox(-0.5F, 0F, -0.5F, 1, 2, 1);
		LowerThumbR.setRotationPoint(-2.4F, 15F, -5.4F);
		LowerThumbR.setTextureSize(512, 256);
		LowerThumbR.mirror = true;
		setRotation(LowerThumbR, 0F, 1.134464F, -1.134464F);
		ModelRenderer UpperThumbR = new ModelRenderer(this, 0, 0);
		UpperThumbR.addBox(-1F, 0F, -1F, 2, 2, 2);
		UpperThumbR.setRotationPoint(-2.8F, 14.5F, -4.6F);
		UpperThumbR.setTextureSize(512, 256);
		UpperThumbR.mirror = true;
		setRotation(UpperThumbR, 0F, 1.134464F, -1.134464F);

		RIGHTARM.addChild(LowerFingerPinkyR);
		RIGHTARM.addChild(UpperFingerPinkyR);
		RIGHTARM.addChild(LowerFingerRingR);
		RIGHTARM.addChild(UpperFingerRingR);
		RIGHTARM.addChild(LowerFingerMiddleR);
		RIGHTARM.addChild(UpperFingerMiddleR);
		RIGHTARM.addChild(LowerFingerIndexR);
		RIGHTARM.addChild(UpperFingerIndexR);
		RIGHTARM.addChild(LowerThumbR);
		RIGHTARM.addChild(UpperThumbR);
		RIGHTARM.addChild(LowerArmR);
		RIGHTARM.addChild(UpperArmR);

		LEFTARM = new ModelRenderer(this, "LEFTARM");
		LEFTARM.setRotationPoint(19F, -9F, 0F);
		setRotation(LEFTARM, 0F, 0F, 0F);
		LEFTARM.mirror = true;
		ModelRenderer LowerFingerPinkyL = new ModelRenderer(this, 0, 0);
		LowerFingerPinkyL.addBox(-0.5F, 0F, -0.5F, 1, 2, 1);
		LowerFingerPinkyL.setRotationPoint(5F, 17.5F, 3.5F);
		LowerFingerPinkyL.setTextureSize(512, 256);
		LowerFingerPinkyL.mirror = true;
		setRotation(LowerFingerPinkyL, 0F, 0F, 0F);
		ModelRenderer UpperFingerPinkyL = new ModelRenderer(this, 0, 0);
		UpperFingerPinkyL.addBox(-1F, 0F, -1F, 2, 2, 2);
		UpperFingerPinkyL.setRotationPoint(5F, 16.5F, 3.5F);
		UpperFingerPinkyL.setTextureSize(512, 256);
		UpperFingerPinkyL.mirror = true;
		setRotation(UpperFingerPinkyL, 0F, 0F, 0F);
		ModelRenderer LowerFingerRingL = new ModelRenderer(this, 0, 0);
		LowerFingerRingL.addBox(-0.5F, 0F, -0.5F, 1, 2, 1);
		LowerFingerRingL.setRotationPoint(5F, 17.5F, 1F);
		LowerFingerRingL.setTextureSize(512, 256);
		LowerFingerRingL.mirror = true;
		setRotation(LowerFingerRingL, 0F, 0F, 0F);
		ModelRenderer UpperFingerRingL = new ModelRenderer(this, 0, 0);
		UpperFingerRingL.addBox(-1F, 0F, -1F, 2, 2, 2);
		UpperFingerRingL.setRotationPoint(5F, 16.5F, 1F);
		UpperFingerRingL.setTextureSize(512, 256);
		UpperFingerRingL.mirror = true;
		setRotation(UpperFingerRingL, 0F, 0F, 0F);
		ModelRenderer LowerFingerMiddleL = new ModelRenderer(this, 0, 0);
		LowerFingerMiddleL.addBox(-0.5F, 0F, -0.5F, 1, 2, 1);
		LowerFingerMiddleL.setRotationPoint(5F, 17.5F, -1.5F);
		LowerFingerMiddleL.setTextureSize(512, 256);
		LowerFingerMiddleL.mirror = true;
		setRotation(LowerFingerMiddleL, 0F, 0F, 0F);
		ModelRenderer UpperFingerMiddleL = new ModelRenderer(this, 0, 0);
		UpperFingerMiddleL.addBox(-1F, 0F, -1F, 2, 2, 2);
		UpperFingerMiddleL.setRotationPoint(5F, 16.5F, -1.5F);
		UpperFingerMiddleL.setTextureSize(512, 256);
		UpperFingerMiddleL.mirror = true;
		setRotation(UpperFingerMiddleL, 0F, 0F, 0F);
		ModelRenderer LowerFingerIndexL = new ModelRenderer(this, 0, 0);
		LowerFingerIndexL.addBox(-0.5F, 0F, -0.5F, 1, 2, 1);
		LowerFingerIndexL.setRotationPoint(5F, 17.5F, -4F);
		LowerFingerIndexL.setTextureSize(512, 256);
		LowerFingerIndexL.mirror = true;
		setRotation(LowerFingerIndexL, 0F, 0F, 0F);
		ModelRenderer UpperFingerIndexL = new ModelRenderer(this, 0, 0);
		UpperFingerIndexL.addBox(-1F, 0F, -1F, 2, 2, 2);
		UpperFingerIndexL.setRotationPoint(5F, 16.5F, -4F);
		UpperFingerIndexL.setTextureSize(512, 256);
		UpperFingerIndexL.mirror = true;
		setRotation(UpperFingerIndexL, 0F, 0F, 0F);
		ModelRenderer UpperArmL = new ModelRenderer(this, 168, 123);
		UpperArmL.addBox(-3F, 0F, -6F, 6, 14, 12);
		UpperArmL.setRotationPoint(-2.8F, -5F, 0F);
		UpperArmL.setTextureSize(512, 256);
		UpperArmL.mirror = true;
		setRotation(UpperArmL, 0F, 0F, -0.4363323F);
		ModelRenderer LowerArmL = new ModelRenderer(this, 168, 101);
		LowerArmL.addBox(-2.5F, 0F, -6F, 5, 10, 11);
		LowerArmL.setRotationPoint(3F, 7F, 0.5F);
		LowerArmL.setTextureSize(512, 256);
		LowerArmL.mirror = true;
		setRotation(LowerArmL, 0F, 0F, -0.1745329F);
		ModelRenderer LowerThumbL = new ModelRenderer(this, 0, 0);
		LowerThumbL.addBox(-0.5F, 0F, -0.5F, 1, 2, 1);
		LowerThumbL.setRotationPoint(2.4F, 15F, -5.4F);
		LowerThumbL.setTextureSize(512, 256);
		LowerThumbL.mirror = true;
		setRotation(LowerThumbL, 0F, 2.094395F, -1.134464F);
		ModelRenderer UpperThumbL = new ModelRenderer(this, 0, 0);
		UpperThumbL.addBox(-1F, 0F, -1F, 2, 2, 2);
		UpperThumbL.setRotationPoint(2.8F, 14.5F, -4.8F);
		UpperThumbL.setTextureSize(512, 256);
		UpperThumbL.mirror = true;
		setRotation(UpperThumbL, 0F, 2.094395F, -1.134464F);

		LEFTARM.addChild(LowerFingerPinkyL);
		LEFTARM.addChild(UpperFingerPinkyL);
		LEFTARM.addChild(LowerFingerRingL);
		LEFTARM.addChild(UpperFingerRingL);
		LEFTARM.addChild(LowerFingerMiddleL);
		LEFTARM.addChild(UpperFingerMiddleL);
		LEFTARM.addChild(LowerFingerIndexL);
		LEFTARM.addChild(UpperFingerIndexL);
		LEFTARM.addChild(LowerThumbL);
		LEFTARM.addChild(UpperThumbL);
		LEFTARM.addChild(LowerArmL);
		LEFTARM.addChild(UpperArmL);

		RIGHTFOOT = new ModelRenderer(this, "RIGHTFOOT");
		RIGHTFOOT.setRotationPoint(-12F, 19F, 2F);
		setRotation(RIGHTFOOT, 0F, 0F, 0F);
		RIGHTFOOT.mirror = true;
		ModelRenderer UpperToeMiddleR = new ModelRenderer(this, 59, 43);
		UpperToeMiddleR.addBox(-1F, 0F, -1F, 2, 3, 2);
		UpperToeMiddleR.setRotationPoint(-2.8F, 2F, -7.9F);
		UpperToeMiddleR.setTextureSize(512, 256);
		UpperToeMiddleR.mirror = true;
		setRotation(UpperToeMiddleR, -0.8028515F, 0.3490659F, 0F);
		ModelRenderer UpperToeUnoR = new ModelRenderer(this, 59, 43);
		UpperToeUnoR.addBox(-1F, 0F, -1F, 2, 3, 2);
		UpperToeUnoR.setRotationPoint(1F, 2F, -9.1F);
		UpperToeUnoR.setTextureSize(512, 256);
		UpperToeUnoR.mirror = true;
		setRotation(UpperToeUnoR, -0.8028515F, 0.3490659F, 0F);
		ModelRenderer UpperToePinkyR = new ModelRenderer(this, 59, 43);
		UpperToePinkyR.addBox(-1F, 0F, -1F, 2, 3, 2);
		UpperToePinkyR.setRotationPoint(-6.7F, 2F, -6.3F);
		UpperToePinkyR.setTextureSize(512, 256);
		UpperToePinkyR.mirror = true;
		setRotation(UpperToePinkyR, -0.8028515F, 0.3490659F, 0F);
		ModelRenderer FootBaseR = new ModelRenderer(this, 115, 131);
		FootBaseR.addBox(-6F, 0F, -9F, 11, 5, 13);
		FootBaseR.setRotationPoint(0.5F, 0F, 0.3F);
		FootBaseR.setTextureSize(512, 256);
		FootBaseR.mirror = true;
		setRotation(FootBaseR, 0F, 0.3490659F, 0F);
		ModelRenderer FootFatR = new ModelRenderer(this, 115, 112);
		FootFatR.addBox(-6F, 0F, -8F, 12, 4, 14);
		FootFatR.setRotationPoint(-0.5F, 0.5F, -1F);
		FootFatR.setTextureSize(512, 256);
		FootFatR.mirror = true;
		setRotation(FootFatR, 0F, 0.3490659F, 0F);

		RIGHTFOOT.addChild(UpperToeMiddleR);
		RIGHTFOOT.addChild(UpperToeUnoR);
		RIGHTFOOT.addChild(UpperToePinkyR);
		RIGHTFOOT.addChild(FootFatR);
		RIGHTFOOT.addChild(FootBaseR);

		LEFTFOOT = new ModelRenderer(this, "LEFTFOOT");
		LEFTFOOT.setRotationPoint(12F, 19F, 2F);
		setRotation(LEFTFOOT, 0F, 0F, 0F);
		LEFTFOOT.mirror = true;
		ModelRenderer ToeMiddleL = new ModelRenderer(this, 59, 43);
		ToeMiddleL.addBox(-1F, 0F, -1F, 2, 3, 2);
		ToeMiddleL.setRotationPoint(3.1F, 2F, -5.7F);
		ToeMiddleL.setTextureSize(512, 256);
		ToeMiddleL.mirror = true;
		setRotation(ToeMiddleL, -0.8028515F, -0.3490659F, 0F);
		ModelRenderer ToeUnoL = new ModelRenderer(this, 59, 43);
		ToeUnoL.addBox(-1F, 0F, -1F, 2, 3, 2);
		ToeUnoL.setRotationPoint(-0.8F, 2F, -6.9F);
		ToeUnoL.setTextureSize(512, 256);
		ToeUnoL.mirror = true;
		setRotation(ToeUnoL, -0.8028515F, -0.3490659F, 0F);
		ModelRenderer FootFatL = new ModelRenderer(this, 115, 112);
		FootFatL.addBox(-6F, 0F, -8F, 12, 4, 14);
		FootFatL.setRotationPoint(0.5F, 0.5F, -1F);
		FootFatL.setTextureSize(512, 256);
		FootFatL.mirror = true;
		setRotation(FootFatL, 0F, -0.3490659F, 0F);
		ModelRenderer FootBaseL = new ModelRenderer(this, 115, 131);
		FootBaseL.addBox(-5F, 0F, -9F, 11, 5, 13);
		FootBaseL.setRotationPoint(-0.5F, 0F, 0.3F);
		FootBaseL.setTextureSize(512, 256);
		FootBaseL.mirror = true;
		setRotation(FootBaseL, 0F, -0.3490659F, 0F);
		ModelRenderer ToePinkyL = new ModelRenderer(this, 59, 43);
		ToePinkyL.addBox(-1F, 0F, -1F, 2, 3, 2);
		ToePinkyL.setRotationPoint(6.8F, 2F, -4.1F);
		ToePinkyL.setTextureSize(512, 256);
		ToePinkyL.mirror = true;
		setRotation(ToePinkyL, -0.8028515F, -0.3490659F, 0F);

		LEFTFOOT.addChild(ToeMiddleL);
		LEFTFOOT.addChild(ToeUnoL);
		LEFTFOOT.addChild(ToePinkyL);
		LEFTFOOT.addChild(FootFatL);
		LEFTFOOT.addChild(FootBaseL);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		BodyBase.render(f5);
		BodyFatWide.render(f5);
		BodyFatThick.render(f5);
		BodyFatBelly.render(f5);
		BodyFatBack.render(f5);
		HEADBASE.render(f5);
		RIGHTARM.render(f5);
		LEFTARM.render(f5);
		LEFTFOOT.render(f5);
		RIGHTFOOT.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		HEADBASE.rotateAngleY = f3 / (180F / (float) Math.PI);
		HEADBASE.rotateAngleX = f4 / (180F / (float) Math.PI);
		LEFTFOOT.rotateAngleX = MathHelper.cos(f * .8F) * .25F * f1;
		RIGHTFOOT.rotateAngleX = MathHelper.cos(f * .8F + (float) Math.PI) * .25F * f1;
		LEFTARM.rotateAngleX = MathHelper.cos(f * .8F + (float) Math.PI) * .8F * f1;
		RIGHTARM.rotateAngleX = MathHelper.cos(f * .8F) * .8F * f1;
	}

}
