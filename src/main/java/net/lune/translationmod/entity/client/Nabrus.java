// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
package net.lune.translationmod.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.client.model.TexturedModelData;


public class Nabrus extends EntityModel<Entity> {


	private final ModelPart tail;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart bone2;
	private final ModelPart ears;
	private final ModelPart head;
	private final ModelPart Arm2;
	private final ModelPart BeforeElbow2;
	private final ModelPart Forearm2;
	private final ModelPart Claw2;
	private final ModelPart Arm;
	private final ModelPart BeforeElbow;
	private final ModelPart Forearm;
	private final ModelPart Claw;
	private final ModelPart Shoulder;
	private final ModelPart LeftLeg;
	private final ModelPart Thigh;
	private final ModelPart Leg;
	private final ModelPart Foot;
	private final ModelPart RightLeg;
	private final ModelPart Thigh2;
	private final ModelPart Leg2;
	private final ModelPart Foot2;
	private final ModelPart Hips;
	private final ModelPart Chest;
	public Nabrus(ModelPart root) {
		this.tail = root.getChild("tail");
		this.bone = this.tail.getChild("bone");
		this.bone3 = this.bone.getChild("bone3");
		this.bone2 = this.bone3.getChild("bone2");
		this.ears = root.getChild("ears");
		this.head = root.getChild("head");
		this.Arm2 = root.getChild("Arm2");
		this.BeforeElbow2 = this.Arm2.getChild("BeforeElbow2");
		this.Forearm2 = this.BeforeElbow2.getChild("Forearm2");
		this.Claw2 = this.Forearm2.getChild("Claw2");
		this.Arm = root.getChild("Arm");
		this.BeforeElbow = this.Arm.getChild("BeforeElbow");
		this.Forearm = this.BeforeElbow.getChild("Forearm");
		this.Claw = this.Forearm.getChild("Claw");
		this.Shoulder = root.getChild("Shoulder");
		this.LeftLeg = root.getChild("LeftLeg");
		this.Thigh = this.LeftLeg.getChild("Thigh");
		this.Leg = this.Thigh.getChild("Leg");
		this.Foot = this.Leg.getChild("Foot");
		this.RightLeg = root.getChild("RightLeg");
		this.Thigh2 = this.RightLeg.getChild("Thigh2");
		this.Leg2 = this.Thigh2.getChild("Leg2");
		this.Foot2 = this.Leg2.getChild("Foot2");
		this.Hips = root.getChild("Hips");
		this.Chest = root.getChild("Chest");
		this.Nabrus = root.getChild("Nabrus");
	}
	public net.minecraft.client.model.ic static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData tail = modelPartData.addChild("tail", ModelPartBuilder.create(), ModelTransform.pivot(-1.0279F, -0.5063F, 15.774F));

		ModelPartData bone = tail.addChild("bone", ModelPartBuilder.create().uv(58, 39).cuboid(0.0F, -2.0F, -1.0F, 6.0F, 6.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, -1.0F, -8.6667F));

		ModelPartData bone3 = bone.addChild("bone3", ModelPartBuilder.create().uv(30, 34).cuboid(1.0F, -2.0F, -1.0F, 4.0F, 6.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 5.0F));

		ModelPartData bone2 = bone3.addChild("bone2", ModelPartBuilder.create().uv(28, 76).cuboid(-1.0F, -2.0F, -1.5F, 2.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(2.5391F, 1.0F, 10.6209F));

		ModelPartData ears = modelPartData.addChild("ears", ModelPartBuilder.create().uv(86, 47).cuboid(-5.0F, -10.0F, 1.0F, 5.0F, 9.0F, 2.0F, new Dilation(0.0F))
		.uv(84, 79).cuboid(-13.0F, -10.0F, 1.0F, 5.0F, 9.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(5.3F, -19.0F, 0.9F));

		ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create().uv(29, 11).cuboid(-5.6F, -3.375F, 0.0F, 11.0F, 7.0F, 6.0F, new Dilation(0.0F))
		.uv(-1, 19).cuboid(-4.5F, -5.375F, -1.0F, 9.0F, 9.0F, 8.0F, new Dilation(0.0F))
		.uv(90, 6).cuboid(-1.5F, -1.375F, -5.0F, 3.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(18, 67).cuboid(-2.5F, -0.375F, -6.0F, 5.0F, 4.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.9249F, -18.0462F, 0.4452F));

		ModelPartData Arm2 = modelPartData.addChild("Arm2", ModelPartBuilder.create(), ModelTransform.of(-1.0F, -8.0F, 7.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData BeforeElbow2 = Arm2.addChild("BeforeElbow2", ModelPartBuilder.create().uv(28, 84).cuboid(-2.3333F, -2.5F, -1.5333F, 6.0F, 5.0F, 3.0F, new Dilation(0.0F))
		.uv(94, 12).cuboid(-3.3333F, -1.5F, -2.2333F, 6.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(94, 16).cuboid(-3.3333F, -1.5F, 1.2667F, 6.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(7.6015F, -2.5366F, 3.5333F));

		ModelPartData Forearm2 = BeforeElbow2.addChild("Forearm2", ModelPartBuilder.create().uv(84, 27).cuboid(-2.4234F, -2.1147F, -1.5F, 7.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(6.09F, 0.1147F, -0.0333F));

		ModelPartData cube_r1 = Forearm2.addChild("cube_r1", ModelPartBuilder.create().uv(84, 90).cuboid(-3.0F, -1.5F, -0.5F, 5.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-0.4234F, 0.8853F, 0.0F, 1.5708F, 0.0F, -0.3927F));

		ModelPartData Claw2 = Forearm2.addChild("Claw2", ModelPartBuilder.create().uv(90, 0).cuboid(-2.5F, -1.0F, -2.0F, 5.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(7.0766F, -0.6147F, 0.1F));

		ModelPartData Arm = modelPartData.addChild("Arm", ModelPartBuilder.create(), ModelTransform.pivot(5.0F, -11.0F, 4.0F));

		ModelPartData BeforeElbow = Arm.addChild("BeforeElbow", ModelPartBuilder.create().uv(80, 39).cuboid(-14.0F, -2.0F, -2.8F, 6.0F, 5.0F, 3.0F, new Dilation(0.0F))
		.uv(24, 92).cuboid(-15.0F, -1.0F, -3.5F, 6.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(62, 93).cuboid(-15.0F, -1.0F, 0.0F, 6.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(14.0F, 0.0F, 0.8F));

		ModelPartData Forearm = BeforeElbow.addChild("Forearm", ModelPartBuilder.create().uv(64, 28).cuboid(-2.9946F, -2.1147F, 6.0943F, 7.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-6.463F, 0.6147F, -8.6622F));

		ModelPartData cube_r2 = Forearm.addChild("cube_r2", ModelPartBuilder.create().uv(86, 58).cuboid(-3.0F, -1.5F, -0.5F, 5.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-0.9946F, 0.8853F, 7.5943F, 1.5708F, 0.0F, -0.3927F));

		ModelPartData Claw = Forearm.addChild("Claw", ModelPartBuilder.create().uv(88, 33).cuboid(-7.0F, -2.0F, 0.0F, 5.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(11.0054F, 0.3853F, 5.6943F));

		ModelPartData Shoulder = modelPartData.addChild("Shoulder", ModelPartBuilder.create().uv(30, 24).cuboid(-6.0F, -2.0F, -1.0F, 12.0F, 5.0F, 5.0F, new Dilation(0.0F))
		.uv(58, 34).cuboid(-5.5F, -3.0F, -0.6F, 11.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(84, 74).cuboid(-3.5F, -4.0F, -0.6F, 6.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, -11.0F, 2.0F));

		ModelPartData LeftLeg = modelPartData.addChild("LeftLeg", ModelPartBuilder.create(), ModelTransform.pivot(0.7F, 22.0F, 0.0F));

		ModelPartData Thigh = LeftLeg.addChild("Thigh", ModelPartBuilder.create().uv(58, 50).cuboid(-0.5F, -9.0F, -2.0F, 5.0F, 14.0F, 2.0F, new Dilation(0.0F))
		.uv(82, 13).cuboid(0.0F, -9.0F, -3.0F, 4.0F, 12.0F, 2.0F, new Dilation(0.0F))
		.uv(38, 67).cuboid(0.0F, -9.0F, -1.0F, 4.0F, 15.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 36).cuboid(-1.0F, -10.0F, -1.0F, 6.0F, 13.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.5F, -9.0F, 2.5F));

		ModelPartData cube_r3 = Thigh.addChild("cube_r3", ModelPartBuilder.create().uv(40, 50).cuboid(-1.0F, -10.0F, -1.0F, 5.0F, 13.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, 4.0F, 1.5F, 0.5236F, 0.0F, 0.0F));

		ModelPartData Leg = Thigh.addChild("Leg", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 6.7F, 0.7F));

		ModelPartData cube_r4 = Leg.addChild("cube_r4", ModelPartBuilder.create().uv(70, 80).cuboid(0.0F, -6.0F, -1.0F, 4.0F, 10.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		ModelPartData Foot = Leg.addChild("Foot", ModelPartBuilder.create(), ModelTransform.pivot(1.5F, 1.9F, -5.8F));

		ModelPartData cube_r5 = Foot.addChild("cube_r5", ModelPartBuilder.create().uv(0, 84).cuboid(-2.0F, -6.0F, -1.0F, 5.0F, 9.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 2.0F, -1.5708F, 0.0F, 0.0F));

		ModelPartData cube_r6 = Foot.addChild("cube_r6", ModelPartBuilder.create().uv(0, 70).cuboid(0.0F, -9.0F, -1.0F, 5.0F, 12.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 1.4F, -0.2F, -1.5708F, 0.0F, 0.0F));

		ModelPartData cube_r7 = Foot.addChild("cube_r7", ModelPartBuilder.create().uv(76, 0).cuboid(-2.0F, -6.0F, -1.0F, 5.0F, 11.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 2.0F, -1.5708F, 0.0F, 0.0F));

		ModelPartData RightLeg = modelPartData.addChild("RightLeg", ModelPartBuilder.create(), ModelTransform.pivot(0.7F, 22.0F, 0.0F));

		ModelPartData Thigh2 = RightLeg.addChild("Thigh2", ModelPartBuilder.create().uv(62, 0).cuboid(-0.5F, -9.0F, -2.0F, 5.0F, 14.0F, 2.0F, new Dilation(0.0F))
		.uv(50, 83).cuboid(0.0F, -9.0F, -3.0F, 4.0F, 12.0F, 2.0F, new Dilation(0.0F))
		.uv(58, 66).cuboid(0.0F, -9.0F, -1.0F, 4.0F, 15.0F, 2.0F, new Dilation(0.0F))
		.uv(20, 50).cuboid(-1.0F, -10.0F, -1.0F, 6.0F, 13.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-6.5F, -9.0F, 2.5F));

		ModelPartData cube_r8 = Thigh2.addChild("cube_r8", ModelPartBuilder.create().uv(0, 53).cuboid(-1.0F, -10.0F, -1.0F, 5.0F, 13.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, 4.0F, 1.5F, 0.5236F, 0.0F, 0.0F));

		ModelPartData Leg2 = Thigh2.addChild("Leg2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 6.7F, 0.7F));

		ModelPartData cube_r9 = Leg2.addChild("cube_r9", ModelPartBuilder.create().uv(72, 50).cuboid(0.0F, -6.0F, -1.0F, 4.0F, 10.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		ModelPartData Foot2 = Leg2.addChild("Foot2", ModelPartBuilder.create(), ModelTransform.pivot(1.5F, 1.9F, -3.8F));

		ModelPartData cube_r10 = Foot2.addChild("cube_r10", ModelPartBuilder.create().uv(84, 63).cuboid(-2.0F, -6.0F, -1.0F, 5.0F, 9.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		ModelPartData cube_r11 = Foot2.addChild("cube_r11", ModelPartBuilder.create().uv(70, 66).cuboid(0.0F, -9.0F, -1.0F, 5.0F, 12.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 1.4F, -2.2F, -1.5708F, 0.0F, 0.0F));

		ModelPartData cube_r12 = Foot2.addChild("cube_r12", ModelPartBuilder.create().uv(14, 76).cuboid(-2.0F, -6.0F, -1.0F, 5.0F, 11.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		ModelPartData Hips = modelPartData.addChild("Hips", ModelPartBuilder.create().uv(64, 16).cuboid(-1.5F, -2.7F, -1.6F, 3.0F, 6.0F, 6.0F, new Dilation(0.0F))
		.uv(28, 0).cuboid(-6.0F, -5.0F, -1.0F, 12.0F, 6.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, 3.0F, 2.0F));

		ModelPartData Chest = modelPartData.addChild("Chest", ModelPartBuilder.create().uv(14, 89).cuboid(4.0F, -4.0F, -1.0F, 1.0F, 6.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-4.0F, -11.0F, -2.0F, 8.0F, 13.0F, 6.0F, new Dilation(0.0F))
		.uv(20, 36).cuboid(-5.0F, -4.0F, -1.0F, 1.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, -1.0F, 2.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		tail.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		ears.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		head.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		Arm2.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		Arm.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		Shoulder.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		LeftLeg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		RightLeg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		Hips.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		Chest.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}