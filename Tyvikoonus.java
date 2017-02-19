public class Tyvikoonus{
	double a, b, h, m;
	public Tyvikoonus(double p6hjaraadius, double ylemraadius, double k6rgus, double moodustaja){
		if(p6hjaraadius<=0){throw new RuntimeException("Sobimatu raadius");}
		if(ylemraadius <=0){throw new RuntimeException("Sobimatu raadius");}
		if(k6rgus <=0){throw new RuntimeException("Sobimatu k6rgus");}
		if(moodustaja <=0){throw new RuntimeException("Sobimatu moodustaja");}
		a=p6hjaraadius;
		b=ylemraadius;
		h=k6rgus;
		m=moodustaja;
	}
	
	public double p6hjapindala(){
		return 3.14*(a*a);
	}
	public double ylempindala(){
		return 3.14*(b*b);	
	}
	
	public double kylgpindala(){
		return 3.14*(a*m);
	}
	public double ruumala(){
		return 3.14*h/3*(a*a + a*b + b*b);
		
	}
	
	
}

/*

Tyvikoonuse p6hjapindalad on
12.56 ruutsentimeetrit
7.065 ruutsentimeetrit
12.56 ruutsentimeetrit
12.56 ruutsentimeetrit

Tyvikoonuse ylempindala on
12.56 ruutsentimeetrit
7.065 ruutsentimeetrit
12.56 ruutsentimeetrit
12.56 ruutsentimeetrit

Tyvikoonuse kylgpindala on
43.96 ruutsentimeetrit
20.253 ruutsentimeetrit
37.68 ruutsentimeetrit
46.472 ruutsentimeetrit

Tyvikoonuse ruumala on
43.96 kuupsentimeetrit
32.813 kuupsentimeetrit
48.408 kuupsentimeetrit
79.5466 kuupsentimeetrit
*/