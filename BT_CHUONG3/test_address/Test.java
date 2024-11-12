package test_address;

public class Test {
	public static void main(String[] args) {
		DiaChi place1 = new DiaChi("Nội", "Thanh Liệt", "Thanh Trì", "Hà Nội");
		System.out.println("thôn là:" + place1.getThon());
		System.out.println("xã là:" + place1.getXa());
		System.out.println("huyện là:" + place1.getHuyen());
		System.out.println("tỉnh là:" + place1.getTinh());
		System.out.println("Vậy địa chỉ của người này là: " + place1.toString());
	}

}
