package s408417094.tools;

public enum City{
	A(10),B(11),C(12),D(13),E(14),
	F(15),G(16),H(17),I(34),J(18),
	K(19),L(20),M(21),N(22),O(35),
	P(23),Q(24),R(25),S(26),T(27),
	U(28),V(29),W(32),X(30),Y(31),Z(33);
	
	private int convert2Num;

	private City(int convert2Num) {
		this.convert2Num = convert2Num;
	}
	
	public static City getEnum(String value) {
		if (value == null || value.length() < 1) {
            return null;
        }
        
        for (City c : values()) {
            if (c.name().equalsIgnoreCase(value)) {
                return c;
            }
        }
        
        return null;
	}

	public int getConvert2Num() {
		return convert2Num;
	}
		
}
