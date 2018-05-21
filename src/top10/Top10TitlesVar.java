package top10;

public class Top10TitlesVar {
	
	private String movie_1, movie_2, movie_3, movie_4, movie_5,
	movie_6, movie_7, movie_8, movie_9, movie_10;
	
	Top10TitlesVar() {	
		this.topTenMovies();
	}
	
	private void topTenMovies(){
		
		this.movie_1 = "Blade Runner 2049";
		this.movie_2 = "Thor: Ragnarok";
		this.movie_3 = "Alien: Covenant";
		this.movie_4 = "Split";
		this.movie_5 = "Justice League";
		this.movie_6 = "Guardians of the Galaxy Vol. 2";
		this.movie_7 = "Logan";
		this.movie_8 = "Beauty and the Beast";
		this.movie_9 = "Wonder Woman";
		this.movie_10 = "It";
		
	}
	
	public void printMoviesVariables(){
		
		System.out.println("------------------------------------------");
		System.out.println("*         Print movies variables         *");
		System.out.println("------------------------------------------");
		
		System.out.println("Variable movie_1: " + movie_1);
		System.out.println("Variable movie_2: " + movie_2);
		System.out.println("Variable movie_3: " + movie_3);
		System.out.println("Variable movie_4: " + movie_4);
		System.out.println("Variable movie_5: " + movie_5);
		System.out.println("Variable movie_6: " + movie_6);
		System.out.println("Variable movie_7: " + movie_7);
		System.out.println("Variable movie_8: " + movie_8);
		System.out.println("Variable movie_9: " + movie_9);
		System.out.println("Variable movie_10: " + movie_10);
		
	} 
	
	////// Getters & Setters
	
	public String getMovie_1() {
		return movie_1;
	}

	public void setMovie_1(String movie_1) {
		this.movie_1 = movie_1;
	}

	public String getMovie_2() {
		return movie_2;
	}

	public void setMovie_2(String movie_2) {
		this.movie_2 = movie_2;
	}

	public String getMovie_3() {
		return movie_3;
	}

	public void setMovie_3(String movie_3) {
		this.movie_3 = movie_3;
	}

	public String getMovie_4() {
		return movie_4;
	}

	public void setMovie_4(String movie_4) {
		this.movie_4 = movie_4;
	}

	public String getMovie_5() {
		return movie_5;
	}

	public void setMovie_5(String movie_5) {
		this.movie_5 = movie_5;
	}

	public String getMovie_6() {
		return movie_6;
	}

	public void setMovie_6(String movie_6) {
		this.movie_6 = movie_6;
	}

	public String getMovie_7() {
		return movie_7;
	}

	public void setMovie_7(String movie_7) {
		this.movie_7 = movie_7;
	}

	public String getMovie_8() {
		return movie_8;
	}

	public void setMovie_8(String movie_8) {
		this.movie_8 = movie_8;
	}

	public String getMovie_9() {
		return movie_9;
	}

	public void setMovie_9(String movie_9) {
		this.movie_9 = movie_9;
	}

	public String getMovie_10() {
		return movie_10;
	}

	public void setMovie_10(String movie_10) {
		this.movie_10 = movie_10;
	}
	

}
