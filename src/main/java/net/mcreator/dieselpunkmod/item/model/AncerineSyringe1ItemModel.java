package net.mcreator.dieselpunkmod.item.model;

public class AncerineSyringe1ItemModel extends AnimatedGeoModel<AncerineSyringe1Item> {
	@Override
	public ResourceLocation getAnimationFileLocation(AncerineSyringe1Item animatable) {
		return new ResourceLocation("dieselpunkmod", "animations/ancerine.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(AncerineSyringe1Item animatable) {
		return new ResourceLocation("dieselpunkmod", "geo/ancerine.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(AncerineSyringe1Item animatable) {
		return new ResourceLocation("dieselpunkmod", "textures/items/texture.png");
	}
}