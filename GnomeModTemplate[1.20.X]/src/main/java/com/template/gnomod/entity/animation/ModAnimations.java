package com.template.gnomod.entity.animation;

import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.animation.Keyframe;
import net.minecraft.client.render.entity.animation.Transformation;

public class ModAnimations {

    public static final Animation BENEE6_WALK = Animation.Builder.create(0.25F).looping()
            .addBoneAnimation("left_arm",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(17.5f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.25f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("left_arm",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(-5f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.25f, AnimationHelper.createRotationalVector(7.5f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("right_arm",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(12.5f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.25f, AnimationHelper.createRotationalVector(-2.5f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("right_arm",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(-10f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.25f, AnimationHelper.createRotationalVector(10f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("left_leg",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, -4f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.25f, AnimationHelper.createTranslationalVector(0f, 4f, 3f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("left_leg",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(-30f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.25f, AnimationHelper.createRotationalVector(27.5f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("right_leg",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 2f, 1f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.25f, AnimationHelper.createTranslationalVector(0f, 0f, -2f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("right_leg",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(12.5f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.25f, AnimationHelper.createRotationalVector(-27.5f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR))).build();


    public static final Animation DEUTSCHTOMI_WALK = Animation.Builder.create(0.25F).looping()
            .addBoneAnimation("right_arm",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(-5f, 0f, -2.5f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.08343333f, AnimationHelper.createRotationalVector(5f, -0.22f, -0.01f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("left_arm",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(7.5f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.08343333f, AnimationHelper.createRotationalVector(-5f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("right_leg",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 2f, 3f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.08343333f, AnimationHelper.createTranslationalVector(0f, 1f, -1f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("right_leg",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(20f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.08343333f, AnimationHelper.createRotationalVector(-12.5f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("left_leg",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 1f, -3f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.08343333f, AnimationHelper.createTranslationalVector(0f, 2f, 2f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("left_leg",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(-20f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.08343333f, AnimationHelper.createRotationalVector(17.5f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("mouth_grp",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, -7.5f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.08343333f, AnimationHelper.createRotationalVector(-0.11f, 2.5f, -2.5f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, AnimationHelper.createRotationalVector(0.11f, -2.5f, 2.49f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.25f, AnimationHelper.createRotationalVector(0f, 2.5f, 0f),
                                    Transformation.Interpolations.LINEAR))).build();


}
