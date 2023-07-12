final class class491 implements class486 {

	public void vmethod8774(Object var1, Buffer var2) {
		this.method8781((String) var1, var2);
	}

	public Object vmethod8773(Buffer var1) {
		return var1.readStringCp1252NullTerminated();
	}

	void method8781(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1);
	}
}
