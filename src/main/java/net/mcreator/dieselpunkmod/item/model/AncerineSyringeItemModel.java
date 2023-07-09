package net.mcreator.dieselpunkmod.item.model;

public class AncerineSyringeItemModel extends AnimatedGeoModel<AncerineSyringeItem> {
	@Override
	public ResourceLocation getAnimationFileLocation(AncerineSyringeItem animatable) {
		return new ResourceLocation("dieselpunkmod", "animations/ancerine.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(AncerineSyringeItem animatable) {
		return new ResourceLocation("dieselpunkmod", "geo/ancerine.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(AncerineSyringeItem animatable) {
		return new ResourceLocation("dieselpunkmod", "textures/items/texture.png");
	}
}