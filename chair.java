// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class chair<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "chair"), "main");
	private final ModelPart bb_main;

	public chair(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(16, 18).addBox(6.0F, -10.0F, -8.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 18).addBox(-8.0F, -10.0F, -8.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(8, 0).addBox(-8.0F, -10.0F, 6.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(6.0F, -10.0F, 6.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(32, 18).addBox(-8.0F, -10.0F, -6.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(6.0F, -10.0F, -6.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-8.0F, -12.0F, -8.0F, 16.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(8, 46).addBox(6.0F, -30.0F, 6.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 46).addBox(-8.0F, -30.0F, 6.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(42, 32).addBox(-6.0F, -18.0F, 6.0F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(28, 42).addBox(-6.0F, -22.0F, 6.0F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(16, 38).addBox(-6.0F, -26.0F, 6.0F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(16, 34).addBox(-6.0F, -30.0F, 6.0F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 18).addBox(-8.0F, -10.0F, -6.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(16, 20).addBox(6.0F, -10.0F, -6.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}