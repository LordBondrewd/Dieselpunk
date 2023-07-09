package net.mcreator.dieselpunkmod.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.dieselpunkmod.item.AncerineSyringeItem;

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
