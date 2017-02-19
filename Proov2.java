public class Proov2{
	public static void main(String[] args){
		Tyvikoonus laud1=new Tyvikoonus(2, 1, 6, 7);
		Tyvikoonus laud2=new Tyvikoonus(1.5, 1, 6.6, 4.3);
		Tyvikoonus laud3=new Tyvikoonus(2, 1.5, 5, 6);
		Tyvikoonus laud4=new Tyvikoonus(2, 3, 4, 7.4);
		System.out.println(" ");
		System.out.println("Tyvikoonuse p6hjapindalad on");
		System.out.println(laud1.p6hjapindala() + " ruutsentimeetrit");
		System.out.println(laud2.p6hjapindala()+ " ruutsentimeetrit");
		System.out.println(laud3.p6hjapindala()+ " ruutsentimeetrit");
		System.out.println(laud4.p6hjapindala()+ " ruutsentimeetrit");
		System.out.println("");
		System.out.println("Tyvikoonuse ylempindala on");
		System.out.println(laud1.p6hjapindala() + " ruutsentimeetrit");
		System.out.println(laud2.p6hjapindala()+ " ruutsentimeetrit");
		System.out.println(laud3.p6hjapindala()+ " ruutsentimeetrit");
		System.out.println(laud4.p6hjapindala()+ " ruutsentimeetrit");
		System.out.println("");
		System.out.println("Tyvikoonuse kylgpindala on");
		System.out.println(laud1.kylgpindala() + " ruutsentimeetrit");
		System.out.println(laud2.kylgpindala()+ " ruutsentimeetrit");
		System.out.println(laud3.kylgpindala()+ " ruutsentimeetrit");
		System.out.println(laud4.kylgpindala()+ " ruutsentimeetrit");
		System.out.println("");
		System.out.println("Tyvikoonuse ruumala on");
		System.out.println(laud1.ruumala() + " kuupsentimeetrit");
		System.out.println(laud2.ruumala()+ " kuupsentimeetrit");
		System.out.println(laud3.ruumala()+ " kuupsentimeetrit");
		System.out.println(laud4.ruumala()+ " kuupsentimeetrit");
		
	}
}



