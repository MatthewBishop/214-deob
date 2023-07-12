public final class Projectile extends Renderable {

	static Player localPlayer;

	

	int id;

	

	int plane;

	

	int sourceX;

	

	int sourceY;

	

	int sourceZ;

	

	int endHeight;

	

	int cycleStart;

	

	int cycleEnd;

	

	int slope;

	

	int startHeight;

	

	int targetIndex;

	boolean isMoving = false;

	double x;

	double y;

	double z;

	double speedX;

	double speedY;

	double speed;

	double speedZ;

	double accelerationZ;

	

	int yaw;

	

	int pitch;

	SequenceDefinition sequenceDefinition;

	

	int frame = 0;

	

	int frameCycle = 0;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10,
			int var11) {
		this.id = var1;
		this.plane = var2;
		this.sourceX = var3;
		this.sourceY = var4;
		this.sourceZ = var5;
		this.cycleStart = var6;
		this.cycleEnd = var7;
		this.slope = var8;
		this.startHeight = var9;
		this.targetIndex = var10;
		this.endHeight = var11;
		this.isMoving = false;
		int var12 = class53.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = WorldMapLabelSize.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) {
			var5 = (double) (var1 - this.sourceX);
			double var7 = (double) (var2 - this.sourceY);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			this.x = var5 * (double) this.startHeight / var9 + (double) this.sourceX;
			this.y = (double) this.sourceY + var7 * (double) this.startHeight / var9;
			this.z = (double) this.sourceZ;
		}

		var5 = (double) (this.cycleEnd + 1 - var4);
		this.speedX = ((double) var1 - this.x) / var5;
		this.speedY = ((double) var2 - this.y) / var5;
		this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan((double) this.slope * 0.02454369);
		}

		this.accelerationZ = ((double) var3 - this.z - this.speedZ * var5) * 2.0 / (var5 * var5);
	}

	protected final Model getModel() {
		SpotAnimationDefinition var1 = class53.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}

	final void advance(int var1) {
		this.isMoving = true;
		this.x += this.speedX * (double) var1;
		this.y += (double) var1 * this.speedY;
		this.z += (double) var1 * (double) var1 * 0.5 * this.accelerationZ + (double) var1 * this.speedZ;
		this.speedZ += (double) var1 * this.accelerationZ;
		this.yaw = (int) (Math.atan2(this.speedX, this.speedY) * 325.949) + 1024 & 2047;
		this.pitch = (int) (Math.atan2(this.speedZ, this.speed) * 325.949) & 2047;
		if (this.sequenceDefinition != null) {
			if (!this.sequenceDefinition.isCachedModelIdSet()) {
				this.frameCycle += var1;

				while (true) {
					do {
						do {
							if (this.frameCycle <= this.sequenceDefinition.frameLengths[this.frame]) {
								return;
							}

							this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
							++this.frame;
						} while (this.frame < this.sequenceDefinition.frameIds.length);

						this.frame -= this.sequenceDefinition.frameCount;
					} while (this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

					this.frame = 0;
				}
			} else {
				this.frame += var1;
				int var2 = this.sequenceDefinition.method4084();
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
				}
			}
		}

	}

	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width;
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height;
		class104.resizeInterface(var0, var1.id, var3, var4, var2);
		if (var1.children != null) {
			class104.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = (InterfaceParent) Client.interfaceParents.get((long) var1.id);
		if (var5 != null) {
			class13.method170(var5.group, var3, var4, var2);
		}

		if (var1.contentType == 1337) {
		}

	}
}
