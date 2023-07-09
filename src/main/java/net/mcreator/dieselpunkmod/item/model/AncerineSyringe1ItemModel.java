package net.mcreator.dieselpunkmod.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.dieselpunkmod.item.AncerineSyringe1Item;

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
