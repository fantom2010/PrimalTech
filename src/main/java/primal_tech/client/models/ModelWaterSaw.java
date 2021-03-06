package primal_tech.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelWaterSaw extends ModelBase {
	ModelRenderer shaft1;
	ModelRenderer shaft2;
	ModelRenderer endcapright;
	ModelRenderer endcapleft;
	ModelRenderer padleshaftleft1;
	ModelRenderer padleleft1;
	ModelRenderer padleshaftleft2;
	ModelRenderer padleleft2;
	ModelRenderer padleshaftleft3;
	ModelRenderer padleleft3;
	ModelRenderer padleshaftleft4;
	ModelRenderer padleleft4;
	ModelRenderer padleshaftright1;
	ModelRenderer padleright1;
	ModelRenderer padleshaftright2;
	ModelRenderer padleright2;
	ModelRenderer padleshaftright3;
	ModelRenderer padleright3;
	ModelRenderer padleshaftright4;
	ModelRenderer padleright4;
	ModelRenderer blade1;
	ModelRenderer blade2;
	ModelRenderer blade3;
	ModelRenderer blade4;
	ModelRenderer bearingright;
	ModelRenderer bearingleft;
	ModelRenderer front;
	ModelRenderer back;
	ModelRenderer left;
	ModelRenderer right;

	public ModelWaterSaw() {
		textureWidth = 64;
		textureHeight = 32;

		shaft1 = new ModelRenderer(this, 0, 8);
		shaft1.addBox(-7F, -1F, -1F, 14, 2, 2);
		shaft1.setRotationPoint(0F, 19F, 0F);
		setRotation(shaft1, 0F, 0F, 0F);
		shaft2 = new ModelRenderer(this, 0, 8);
		shaft2.addBox(-7F, -1F, -1F, 14, 2, 2);
		shaft2.setRotationPoint(0F, 19F, 0F);
		setRotation(shaft2, 0.7853982F, 0F, 0F);
		endcapright = new ModelRenderer(this, 5, 0);
		endcapright.addBox(-8F, -1.5F, -1.466667F, 1, 3, 3);
		endcapright.setRotationPoint(0F, 19F, 0F);
		setRotation(endcapright, 0.7853982F, 0F, 0F);
		endcapleft = new ModelRenderer(this, 5, 0);
		endcapleft.addBox(7F, -1.5F, -1.466667F, 1, 3, 3);
		endcapleft.setRotationPoint(0F, 19F, 0F);
		setRotation(endcapleft, 0F, 0F, 0F);
		padleshaftleft1 = new ModelRenderer(this, 0, 0);
		padleshaftleft1.addBox(6F, 0.5F, -0.4666667F, 1, 6, 1);
		padleshaftleft1.setRotationPoint(0F, 19F, 0F);
		setRotation(padleshaftleft1, 0F, 0F, 0F);
		padleleft1 = new ModelRenderer(this, 14, 0);
		padleleft1.addBox(5F, 6F, -1F, 3, 2, 1);
		padleleft1.setRotationPoint(0F, 19F, 0F);
		setRotation(padleleft1, 0F, 0F, 0F);
		padleshaftleft2 = new ModelRenderer(this, 0, 0);
		padleshaftleft2.addBox(6F, 0.5F, -0.4666667F, 1, 6, 1);
		padleshaftleft2.setRotationPoint(0F, 19F, 0F);
		setRotation(padleshaftleft2, -1.570796F, 0F, 0F);
		padleleft2 = new ModelRenderer(this, 14, 0);
		padleleft2.addBox(5F, 6F, -1F, 3, 2, 1);
		padleleft2.setRotationPoint(0F, 19F, 0F);
		setRotation(padleleft2, -1.570796F, 0F, 0F);
		padleshaftleft3 = new ModelRenderer(this, 0, 0);
		padleshaftleft3.addBox(6F, 0.5F, -0.4666667F, 1, 6, 1);
		padleshaftleft3.setRotationPoint(0F, 19F, 0F);
		setRotation(padleshaftleft3, 1.570796F, 0F, 0F);
		padleleft3 = new ModelRenderer(this, 14, 0);
		padleleft3.addBox(5F, 6F, -1F, 3, 2, 1);
		padleleft3.setRotationPoint(0F, 19F, 0F);
		setRotation(padleleft3, 1.570796F, 0F, 0F);
		padleshaftleft4 = new ModelRenderer(this, 0, 0);
		padleshaftleft4.addBox(6F, 0.5F, -0.4666667F, 1, 6, 1);
		padleshaftleft4.setRotationPoint(0F, 19F, 0F);
		setRotation(padleshaftleft4, 3.141593F, 0F, 0F);
		padleleft4 = new ModelRenderer(this, 14, 0);
		padleleft4.addBox(5F, 6F, -1F, 3, 2, 1);
		padleleft4.setRotationPoint(0F, 19F, 0F);
		setRotation(padleleft4, 3.141593F, 0F, 0F);
		padleshaftright1 = new ModelRenderer(this, 0, 0);
		padleshaftright1.addBox(-7F, 0.5F, -0.4666667F, 1, 6, 1);
		padleshaftright1.setRotationPoint(0F, 19F, 0F);
		setRotation(padleshaftright1, 0.7853982F, 0F, 0F);
		padleright1 = new ModelRenderer(this, 14, 0);
		padleright1.addBox(-8F, 6F, -1F, 3, 2, 1);
		padleright1.setRotationPoint(0F, 19F, 0F);
		setRotation(padleright1, 0.7853982F, 0F, 0F);
		padleshaftright2 = new ModelRenderer(this, 0, 0);
		padleshaftright2.addBox(-7F, 0.5F, -0.4666667F, 1, 6, 1);
		padleshaftright2.setRotationPoint(0F, 19F, 0F);
		setRotation(padleshaftright2, -0.7853982F, 0F, 0F);
		padleright2 = new ModelRenderer(this, 14, 0);
		padleright2.addBox(-8F, 6F, -1F, 3, 2, 1);
		padleright2.setRotationPoint(0F, 19F, 0F);
		setRotation(padleright2, -0.7853982F, 0F, 0F);
		padleshaftright3 = new ModelRenderer(this, 0, 0);
		padleshaftright3.addBox(-7F, 0.5F, -0.4666667F, 1, 6, 1);
		padleshaftright3.setRotationPoint(0F, 19F, 0F);
		setRotation(padleshaftright3, 2.356194F, 0F, 0F);
		padleright3 = new ModelRenderer(this, 14, 0);
		padleright3.addBox(-8F, 6F, -1F, 3, 2, 1);
		padleright3.setRotationPoint(0F, 19F, 0F);
		setRotation(padleright3, 2.356194F, 0F, 0F);
		padleshaftright4 = new ModelRenderer(this, 0, 0);
		padleshaftright4.addBox(-7F, 0.5F, -0.4666667F, 1, 6, 1);
		padleshaftright4.setRotationPoint(0F, 19F, 0F);
		setRotation(padleshaftright4, -2.356194F, 0F, 0F);
		padleright4 = new ModelRenderer(this, 14, 0);
		padleright4.addBox(-8F, 6F, -1F, 3, 2, 1);
		padleright4.setRotationPoint(0F, 19F, 0F);
		setRotation(padleright4, -2.356194F, 0F, 0F);
		blade1 = new ModelRenderer(this, 34, 0);
		blade1.addBox(-0.5F, -4.5F, -4.5F, 1, 9, 9);
		blade1.setRotationPoint(0F, 19F, 0F);
		setRotation(blade1, 0F, 0F, 0F);
		blade2 = new ModelRenderer(this, 34, 0);
		blade2.addBox(-0.5F, -4.5F, -4.5F, 1, 9, 9);
		blade2.setRotationPoint(0F, 19F, 0F);
		setRotation(blade2, 0.7853982F, 0F, 0F);
		blade3 = new ModelRenderer(this, 34, 0);
		blade3.addBox(-0.5F, -4.5F, -4.5F, 1, 9, 9);
		blade3.setRotationPoint(0F, 19F, 0F);
		setRotation(blade3, -0.3926991F, 0F, 0F);
		blade4 = new ModelRenderer(this, 34, 0);
		blade4.addBox(-0.5F, -4.5F, -4.5F, 1, 9, 9);
		blade4.setRotationPoint(0F, 19F, 0F);
		setRotation(blade4, 0.3926991F, 0F, 0F);
		bearingright = new ModelRenderer(this, 32, 0);
		bearingright.addBox(-5F, -2F, -2F, 1, 4, 4);
		bearingright.setRotationPoint(0F, 19F, 0F);
		setRotation(bearingright, 0F, 0F, 0F);
		bearingleft = new ModelRenderer(this, 32, 0);
		bearingleft.addBox(4F, -2F, -2F, 1, 4, 4);
		bearingleft.setRotationPoint(0F, 19F, 0F);
		setRotation(bearingleft, 0F, 0F, 0F);
		front = new ModelRenderer(this, 34, 19);
		front.addBox(-4F, -3F, 6F, 8, 8, 2);
		front.setRotationPoint(0F, 19F, 0F);
		setRotation(front, 0F, 0F, 0F);
		back = new ModelRenderer(this, 34, 19);
		back.addBox(-4F, -3F, -8F, 8, 8, 2);
		back.setRotationPoint(0F, 19F, 0F);
		setRotation(back, 0F, 0F, 0F);
		left = new ModelRenderer(this, 0, 12);
		left.addBox(-4F, -3F, -6F, 3, 8, 12);
		left.setRotationPoint(0F, 19F, 0F);
		setRotation(left, 0F, 0F, 0F);
		right = new ModelRenderer(this, 0, 12);
		right.addBox(1F, -3F, -6F, 3, 8, 12);
		right.setRotationPoint(0F, 19F, 0F);
		setRotation(right, 0F, 0F, 0F);
	}

	public void render() {
		shaft1.render(0.0625F);
		shaft2.render(0.0625F);
		endcapright.render(0.0625F);
		endcapleft.render(0.0625F);
		padleshaftleft1.render(0.0625F);
		padleleft1.render(0.0625F);
		padleshaftleft2.render(0.0625F);
		padleleft2.render(0.0625F);
		padleshaftleft3.render(0.0625F);
		padleleft3.render(0.0625F);
		padleshaftleft4.render(0.0625F);
		padleleft4.render(0.0625F);
		padleshaftright1.render(0.0625F);
		padleright1.render(0.0625F);
		padleshaftright2.render(0.0625F);
		padleright2.render(0.0625F);
		padleshaftright3.render(0.0625F);
		padleright3.render(0.0625F);
		padleshaftright4.render(0.0625F);
		padleright4.render(0.0625F);
		blade1.render(0.0625F);
		blade2.render(0.0625F);
		blade3.render(0.0625F);
		blade4.render(0.0625F);
	}

	public void renderCasing() {
		bearingright.render(0.0625F);
		bearingleft.render(0.0625F);
		front.render(0.0625F);
		back.render(0.0625F);
		left.render(0.0625F);
		right.render(0.0625F);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

}
